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

import com.example.demo.domain.MetodosDePago;
import com.example.demo.repository.MetodosDePagoRepository;

/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org/
* www.zathuracode.org
* 
*/

@Scope("singleton")
@Service
public class MetodosDePagoServiceImpl implements MetodosDePagoService{

	@Autowired
	private MetodosDePagoRepository metodosDePagoRepository;
	
	@Autowired
	private Validator validator;
                
    @Override        		
	public void validate(MetodosDePago metodosDePago)throws ConstraintViolationException{		
		
		Set<ConstraintViolation<MetodosDePago>> constraintViolations =validator.validate(metodosDePago);
		 if (!constraintViolations.isEmpty()) {			
			throw new ConstraintViolationException(constraintViolations);
		}
		
	}

	@Override
	public List<MetodosDePago> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<MetodosDePago> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MetodosDePago save(MetodosDePago entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MetodosDePago update(MetodosDePago entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(MetodosDePago entity) throws Exception {
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
