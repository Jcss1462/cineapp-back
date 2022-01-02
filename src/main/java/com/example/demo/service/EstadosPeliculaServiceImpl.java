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

import com.example.demo.domain.EstadosPelicula;
import com.example.demo.repository.EstadosPeliculaRepository;

/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org/
* www.zathuracode.org
* 
*/

@Scope("singleton")
@Service
public class EstadosPeliculaServiceImpl implements EstadosPeliculaService{

	@Autowired
	private EstadosPeliculaRepository estadosPeliculaRepository;
	
	@Autowired
	private Validator validator;
                
    @Override        		
	public void validate(EstadosPelicula estadosPelicula)throws ConstraintViolationException{		
		
		Set<ConstraintViolation<EstadosPelicula>> constraintViolations =validator.validate(estadosPelicula);
		 if (!constraintViolations.isEmpty()) {			
			throw new ConstraintViolationException(constraintViolations);
		}
		
	}

	@Override
	public List<EstadosPelicula> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<EstadosPelicula> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadosPelicula save(EstadosPelicula entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadosPelicula update(EstadosPelicula entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(EstadosPelicula entity) throws Exception {
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
