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

import com.example.demo.domain.EstadosCompra;
import com.example.demo.repository.EstadosCompraRepository;

/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org/
* www.zathuracode.org
* 
*/

@Scope("singleton")
@Service
public class EstadosCompraServiceImpl implements EstadosCompraService{

	@Autowired
	private EstadosCompraRepository estadosCompraRepository;
	
	@Autowired
	private Validator validator;
                
    @Override        		
	public void validate(EstadosCompra estadosCompra)throws ConstraintViolationException{		
		
		Set<ConstraintViolation<EstadosCompra>> constraintViolations =validator.validate(estadosCompra);
		 if (!constraintViolations.isEmpty()) {			
			throw new ConstraintViolationException(constraintViolations);
		}
		
	}

	@Override
	public List<EstadosCompra> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<EstadosCompra> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadosCompra save(EstadosCompra entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadosCompra update(EstadosCompra entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(EstadosCompra entity) throws Exception {
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
