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

import com.example.demo.domain.EstadosMetodoDePago;
import com.example.demo.repository.EstadosMetodoDePagoRepository;

/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org/
* www.zathuracode.org
* 
*/

@Scope("singleton")
@Service
public class EstadosMetodoDePagoServiceImpl implements EstadosMetodoDePagoService{

	@Autowired
	private EstadosMetodoDePagoRepository estadosMetodoDePagoRepository;
	
	@Autowired
	private Validator validator;
                
    @Override        		
	public void validate(EstadosMetodoDePago estadosMetodoDePago)throws ConstraintViolationException{		
		
		Set<ConstraintViolation<EstadosMetodoDePago>> constraintViolations =validator.validate(estadosMetodoDePago);
		 if (!constraintViolations.isEmpty()) {			
			throw new ConstraintViolationException(constraintViolations);
		}
		
	}

	@Override
	public List<EstadosMetodoDePago> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<EstadosMetodoDePago> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadosMetodoDePago save(EstadosMetodoDePago entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadosMetodoDePago update(EstadosMetodoDePago entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(EstadosMetodoDePago entity) throws Exception {
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
