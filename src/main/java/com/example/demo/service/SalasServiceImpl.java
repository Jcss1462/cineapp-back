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

import com.example.demo.domain.Salas;
import com.example.demo.repository.SalasRepository;

/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org/
* www.zathuracode.org
* 
*/

@Scope("singleton")
@Service
public class SalasServiceImpl implements SalasService{

	@Autowired
	private SalasRepository salasRepository;
	
	@Autowired
	private Validator validator;
                
    @Override        		
	public void validate(Salas salas)throws ConstraintViolationException{		
		
		Set<ConstraintViolation<Salas>> constraintViolations =validator.validate(salas);
		 if (!constraintViolations.isEmpty()) {			
			throw new ConstraintViolationException(constraintViolations);
		}
		
	}

	@Override
	public List<Salas> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Salas> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Salas save(Salas entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Salas update(Salas entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Salas entity) throws Exception {
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
