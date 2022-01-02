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

import com.example.demo.domain.Funciones;
import com.example.demo.repository.FuncionesRepository;

/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org/
* www.zathuracode.org
* 
*/

@Scope("singleton")
@Service
public class FuncionesServiceImpl implements FuncionesService{

	@Autowired
	private FuncionesRepository funcionesRepository;
	
	@Autowired
	private Validator validator;
                
    @Override        		
	public void validate(Funciones funciones)throws ConstraintViolationException{		
		
		Set<ConstraintViolation<Funciones>> constraintViolations =validator.validate(funciones);
		 if (!constraintViolations.isEmpty()) {			
			throw new ConstraintViolationException(constraintViolations);
		}
		
	}

	@Override
	public List<Funciones> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Funciones> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Funciones save(Funciones entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Funciones update(Funciones entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Funciones entity) throws Exception {
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
