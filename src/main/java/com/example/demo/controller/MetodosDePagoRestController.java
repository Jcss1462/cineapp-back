package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.MetodosDePago;
import com.example.demo.dto.MetodosDePagoDTO;
import com.example.demo.mapper.MetodosDePagoMapper;
import com.example.demo.service.MetodosDePagoService;

/**
 * @author Zathura Code Generator Version 9.0 http://zathuracode.org
 *         www.zathuracode.org
 *
 */
@RestController
@RequestMapping("/api/v1/metodosDePago")
@CrossOrigin(origins = "*")
public class MetodosDePagoRestController {

	private final static Logger log = LoggerFactory.getLogger(MetodosDePagoRestController.class);

	@Autowired
	private MetodosDePagoService metodosDePagoService;
	@Autowired
	private MetodosDePagoMapper metodosDePagoMapper;

	@GetMapping(value = "misMetodos/{email}")
	public ResponseEntity<?> misMetodos(@PathVariable("email") String email) throws Exception {
		log.debug("Request to misMetodos() MetodosDePago");
		List<MetodosDePago> metodosDePago = metodosDePagoService.misMetodosDePago(email);
		List<MetodosDePagoDTO> metodosDePagoDto = metodosDePagoMapper
				.listMetodosDePagoToListMetodosDePagoDTO(metodosDePago);
		return ResponseEntity.ok().body(metodosDePagoDto);
	}

	@PostMapping(value = "/crearMetodo")
	public ResponseEntity<?> crearMetodo(@Valid @RequestBody MetodosDePagoDTO metodosDePagoDTO) throws Exception {
		log.debug("Request to save MetodosDePago: {}", metodosDePagoDTO);
		
		//coloco valores por defecto
		metodosDePagoDTO.setIdEstado_EstadosMetodoDePago(1);
		
		MetodosDePago metodosDePago = metodosDePagoMapper.metodosDePagoDTOToMetodosDePago(metodosDePagoDTO);
		metodosDePago = metodosDePagoService.save(metodosDePago);
		return ResponseEntity.ok().body(metodosDePagoMapper.metodosDePagoToMetodosDePagoDTO(metodosDePago));
	}

	@DeleteMapping(value = "/eliminar/{idMetodo}")
	public ResponseEntity<?> delete(@PathVariable("idMetodo") Integer idMetodo) throws Exception {
		// borro
		metodosDePagoService.deleteById(idMetodo);
		return ResponseEntity.ok().build();
	}

}
