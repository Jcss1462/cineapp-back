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

import com.example.demo.domain.EstadosSilla;
import com.example.demo.repository.EstadosSillaRepository;

/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org/
* www.zathuracode.org
* 
*/

@Scope("singleton")
@Service
public class EstadosSillaServiceImpl implements EstadosSillaService{

	@Autowired
	private EstadosSillaRepository estadosSillaRepository;
	
	@Autowired
	private Validator validator;
                
    @Override        		
	public void validate(EstadosSilla estadosSilla)throws ConstraintViolationException{		
		
		Set<ConstraintViolation<EstadosSilla>> constraintViolations =validator.validate(estadosSilla);
		 if (!constraintViolations.isEmpty()) {			
			throw new ConstraintViolationException(constraintViolations);
		}
		
	}

	@Override
	public List<EstadosSilla> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<EstadosSilla> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadosSilla save(EstadosSilla entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadosSilla update(EstadosSilla entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(EstadosSilla entity) throws Exception {
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
