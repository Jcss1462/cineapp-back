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

import com.example.demo.domain.Sillas;
import com.example.demo.repository.SillasRepository;

/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org/
* www.zathuracode.org
* 
*/

@Scope("singleton")
@Service
public class SillasServiceImpl implements SillasService{

	@Autowired
	private SillasRepository sillasRepository;
	
	@Autowired
	private Validator validator;
                
    @Override        		
	public void validate(Sillas sillas)throws ConstraintViolationException{		
		
		Set<ConstraintViolation<Sillas>> constraintViolations =validator.validate(sillas);
		 if (!constraintViolations.isEmpty()) {			
			throw new ConstraintViolationException(constraintViolations);
		}
		
	}

	@Override
	public List<Sillas> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Sillas> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sillas save(Sillas entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sillas update(Sillas entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Sillas entity) throws Exception {
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
