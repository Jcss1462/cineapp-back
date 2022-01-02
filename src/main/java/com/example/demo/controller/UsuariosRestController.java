package com.example.demo.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Usuarios;
import com.example.demo.dto.UsuariosDTO;
import com.example.demo.mapper.UsuariosMapper;
import com.example.demo.service.UsuariosService;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author Zathura Code Generator Version 9.0 http://zathuracode.org
 *         www.zathuracode.org
 *
 */
@RestController
@RequestMapping("/api/v1/usuarios")
@CrossOrigin(origins = "*")
public class UsuariosRestController {

	private final static Logger log = LoggerFactory.getLogger(UsuariosRestController.class);

	@Autowired
	private UsuariosService usuariosService;
	@Autowired
	private UsuariosMapper usuariosMapper;

	@GetMapping(value = "/findById/{email}")
	public ResponseEntity<?> findById(@PathVariable("email") String email) throws Exception {
		log.debug("Request to findById() Usuarios");

		Usuarios usuarios = (usuariosService.findById(email).isPresent() == true)
				? usuariosService.findById(email).get()
				: null;

		return ResponseEntity.ok().body(usuariosMapper.usuariosToUsuariosDTO(usuarios));
	}

	@GetMapping(value = "/findAll")
	public ResponseEntity<?> findAll() throws Exception {
		log.debug("Request to findAll() Usuarios");

		return ResponseEntity.ok().body(usuariosMapper.listUsuariosToListUsuariosDTO(usuariosService.findAll()));
	}

	@PostMapping(value = "/save")
	public ResponseEntity<?> save(@Valid @RequestBody UsuariosDTO usuariosDTO) throws Exception {
		log.debug("Request to save Usuarios: {}", usuariosDTO);

		Usuarios usuarios = usuariosMapper.usuariosDTOToUsuarios(usuariosDTO);
		usuarios = usuariosService.save(usuarios);

		return ResponseEntity.ok().body(usuariosMapper.usuariosToUsuariosDTO(usuarios));
	}

	@PutMapping(value = "/update")
	public ResponseEntity<?> update(@Valid @RequestBody UsuariosDTO usuariosDTO) throws Exception {
		log.debug("Request to update Usuarios: {}", usuariosDTO);
		log.debug("Request to update Usuarios: {}", usuariosDTO);
	
		Usuarios usuarios = usuariosMapper.usuariosDTOToUsuarios(usuariosDTO);
		usuarios = usuariosService.update(usuarios);

		return ResponseEntity.ok().body(usuariosMapper.usuariosToUsuariosDTO(usuarios));
	}

}
