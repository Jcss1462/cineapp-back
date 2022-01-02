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

import com.example.demo.domain.TiposUsuario;
import com.example.demo.repository.TiposUsuarioRepository;

/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org/
* www.zathuracode.org
* 
*/

@Scope("singleton")
@Service
public class TiposUsuarioServiceImpl implements TiposUsuarioService{

	@Autowired
	private TiposUsuarioRepository tiposUsuarioRepository;
	
	@Autowired
	private Validator validator;
                
    @Override        		
	public void validate(TiposUsuario tiposUsuario)throws ConstraintViolationException{		
		
		Set<ConstraintViolation<TiposUsuario>> constraintViolations =validator.validate(tiposUsuario);
		 if (!constraintViolations.isEmpty()) {			
			throw new ConstraintViolationException(constraintViolations);
		}
		
	}

	@Override
	public List<TiposUsuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<TiposUsuario> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TiposUsuario save(TiposUsuario entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TiposUsuario update(TiposUsuario entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(TiposUsuario entity) throws Exception {
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
