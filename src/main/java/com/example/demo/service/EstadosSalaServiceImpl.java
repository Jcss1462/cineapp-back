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

import com.example.demo.domain.EstadosSala;
import com.example.demo.repository.EstadosSalaRepository;

/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org/
* www.zathuracode.org
* 
*/

@Scope("singleton")
@Service
public class EstadosSalaServiceImpl implements EstadosSalaService{

	@Autowired
	private EstadosSalaRepository estadosSalaRepository;
	
	@Autowired
	private Validator validator;
                
    @Override        		
	public void validate(EstadosSala estadosSala)throws ConstraintViolationException{		
		
		Set<ConstraintViolation<EstadosSala>> constraintViolations =validator.validate(estadosSala);
		 if (!constraintViolations.isEmpty()) {			
			throw new ConstraintViolationException(constraintViolations);
		}
		
	}

	@Override
	public List<EstadosSala> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<EstadosSala> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadosSala save(EstadosSala entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadosSala update(EstadosSala entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(EstadosSala entity) throws Exception {
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
