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

import com.example.demo.domain.EstadosFuncion;
import com.example.demo.repository.EstadosFuncionRepository;

/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org/
* www.zathuracode.org
* 
*/

@Scope("singleton")
@Service
public class EstadosFuncionServiceImpl implements EstadosFuncionService{

	@Autowired
	private EstadosFuncionRepository estadosFuncionRepository;
	
	@Autowired
	private Validator validator;
                
    @Override        		
	public void validate(EstadosFuncion estadosFuncion)throws ConstraintViolationException{		
		
		Set<ConstraintViolation<EstadosFuncion>> constraintViolations =validator.validate(estadosFuncion);
		 if (!constraintViolations.isEmpty()) {			
			throw new ConstraintViolationException(constraintViolations);
		}
		
	}

	@Override
	public List<EstadosFuncion> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<EstadosFuncion> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadosFuncion save(EstadosFuncion entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadosFuncion update(EstadosFuncion entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(EstadosFuncion entity) throws Exception {
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
