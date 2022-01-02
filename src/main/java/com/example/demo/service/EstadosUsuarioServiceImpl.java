package  com.example.demo.service;


import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.demo.domain.EstadosUsuario;
import com.example.demo.repository.EstadosUsuarioRepository;

/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org/
* www.zathuracode.org
* 
*/

@Scope("singleton")
@Service
public class EstadosUsuarioServiceImpl implements EstadosUsuarioService{

	@Autowired
	private EstadosUsuarioRepository estadosUsuarioRepository;
	
	@Autowired
	private Validator validator;
                
    @Override        		
	public void validate(EstadosUsuario estadosUsuario)throws ConstraintViolationException{		
		
		Set<ConstraintViolation<EstadosUsuario>> constraintViolations =validator.validate(estadosUsuario);
		 if (!constraintViolations.isEmpty()) {			
			throw new ConstraintViolationException(constraintViolations);
		}
		
	}

	@Override
	public List<EstadosUsuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<EstadosUsuario> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadosUsuario save(EstadosUsuario entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadosUsuario update(EstadosUsuario entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(EstadosUsuario entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
