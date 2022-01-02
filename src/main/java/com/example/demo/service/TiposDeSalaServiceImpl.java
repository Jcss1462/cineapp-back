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

import com.example.demo.domain.TiposDeSala;
import com.example.demo.repository.TiposDeSalaRepository;

/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org/
* www.zathuracode.org
* 
*/

@Scope("singleton")
@Service
public class TiposDeSalaServiceImpl implements TiposDeSalaService{

	@Autowired
	private TiposDeSalaRepository tiposDeSalaRepository;
	
	@Autowired
	private Validator validator;
                
    @Override        		
	public void validate(TiposDeSala tiposDeSala)throws ConstraintViolationException{		
		
		Set<ConstraintViolation<TiposDeSala>> constraintViolations =validator.validate(tiposDeSala);
		 if (!constraintViolations.isEmpty()) {			
			throw new ConstraintViolationException(constraintViolations);
		}
		
	}

	@Override
	public List<TiposDeSala> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<TiposDeSala> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TiposDeSala save(TiposDeSala entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TiposDeSala update(TiposDeSala entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(TiposDeSala entity) throws Exception {
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
