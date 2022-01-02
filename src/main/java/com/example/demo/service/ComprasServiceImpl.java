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

import com.example.demo.domain.Compras;
import com.example.demo.repository.ComprasRepository;

/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org/
* www.zathuracode.org
* 
*/

@Scope("singleton")
@Service
public class ComprasServiceImpl implements ComprasService{

	@Autowired
	private ComprasRepository comprasRepository;
	
	@Autowired
	private Validator validator;
                
    @Override        		
	public void validate(Compras compras)throws ConstraintViolationException{		
		
		Set<ConstraintViolation<Compras>> constraintViolations =validator.validate(compras);
		 if (!constraintViolations.isEmpty()) {			
			throw new ConstraintViolationException(constraintViolations);
		}
		
	}

	@Override
	public List<Compras> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Compras> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compras save(Compras entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compras update(Compras entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Compras entity) throws Exception {
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
