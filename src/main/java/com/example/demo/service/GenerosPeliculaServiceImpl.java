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

import com.example.demo.domain.GenerosPelicula;
import com.example.demo.repository.GenerosPeliculaRepository;

/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org/
* www.zathuracode.org
* 
*/

@Scope("singleton")
@Service
public class GenerosPeliculaServiceImpl implements GenerosPeliculaService{

	@Autowired
	private GenerosPeliculaRepository generosPeliculaRepository;
	
	@Autowired
	private Validator validator;
                
    @Override        		
	public void validate(GenerosPelicula generosPelicula)throws ConstraintViolationException{		
		
		Set<ConstraintViolation<GenerosPelicula>> constraintViolations =validator.validate(generosPelicula);
		 if (!constraintViolations.isEmpty()) {			
			throw new ConstraintViolationException(constraintViolations);
		}
		
	}

	@Override
	public List<GenerosPelicula> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<GenerosPelicula> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GenerosPelicula save(GenerosPelicula entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GenerosPelicula update(GenerosPelicula entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(GenerosPelicula entity) throws Exception {
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
