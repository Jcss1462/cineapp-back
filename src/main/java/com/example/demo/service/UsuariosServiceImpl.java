package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Usuarios;
import com.example.demo.repository.UsuariosRepository;

/**
 * @author Zathura Code Generator Version 9.0 http://zathuracode.org/
 *         www.zathuracode.org
 * 
 */

@Scope("singleton")
@Service
public class UsuariosServiceImpl implements UsuariosService {

	@Autowired
	private UsuariosRepository usuariosRepository;

	@Autowired
	private Validator validator;

	@Override
	public void validate(Usuarios usuarios) throws ConstraintViolationException {

		Set<ConstraintViolation<Usuarios>> constraintViolations = validator.validate(usuarios);
		if (!constraintViolations.isEmpty()) {
			throw new ConstraintViolationException(constraintViolations);
		}

	}

	@Override
	public List<Usuarios> findAll() {
		// TODO Auto-generated method stub
		return usuariosRepository.findAll();
	}

	@Override
	public Optional<Usuarios> findById(String id) throws Exception {

		if (id == null || id.isBlank()) {
			throw new Exception("Id vacio");
		}
		if (!usuariosRepository.existsById(id)) {

			throw new Exception("El usuario con id: " + id + " no existe");
		}
		Optional<Usuarios> usuarioOptional = usuariosRepository.findById(id);
		// TODO Auto-generated method stub
		return usuarioOptional;
	}

	@Override
	public Usuarios save(Usuarios entity) throws Exception {
		// valido
		validate(entity);

		// TODO Auto-generated method stub
		return usuariosRepository.save(entity);
	}

	@Override
	public Usuarios update(Usuarios entity) throws Exception {
		
		// si es nulo o esta en blanco
		if (entity.getEmail() == null) {
			throw new Exception("El email es obligatorio");
		}

		// valido
		validate(entity);

		// si no existe lanza el error
		if (usuariosRepository.existsById(entity.getEmail()) == false) {
			throw new Exception("La venta con id:" + entity.getEmail() + " no existe");
		}

		return usuariosRepository.save(entity);
	}

	@Override
	public void delete(Usuarios entity) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(String id) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

}
