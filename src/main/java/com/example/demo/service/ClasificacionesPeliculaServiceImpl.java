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

import com.example.demo.domain.ClasificacionesPelicula;
import com.example.demo.repository.ClasificacionesPeliculaRepository;

/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org/
* www.zathuracode.org
* 
*/

@Scope("singleton")
@Service
public class ClasificacionesPeliculaServiceImpl implements ClasificacionesPeliculaService{

	@Autowired
	private ClasificacionesPeliculaRepository clasificacionesPeliculaRepository;
	
	@Autowired
	private Validator validator;
                
    @Override        		
	public void validate(ClasificacionesPelicula clasificacionesPelicula)throws ConstraintViolationException{		
		
		Set<ConstraintViolation<ClasificacionesPelicula>> constraintViolations =validator.validate(clasificacionesPelicula);
		 if (!constraintViolations.isEmpty()) {			
			throw new ConstraintViolationException(constraintViolations);
		}
		
	}

	@Override
	public List<ClasificacionesPelicula> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<ClasificacionesPelicula> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClasificacionesPelicula save(ClasificacionesPelicula entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClasificacionesPelicula update(ClasificacionesPelicula entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(ClasificacionesPelicula entity) throws Exception {
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
