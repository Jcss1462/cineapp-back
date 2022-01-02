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

import com.example.demo.domain.Peliculas;
import com.example.demo.repository.PeliculasRepository;

/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org/
* www.zathuracode.org
* 
*/

@Scope("singleton")
@Service

public class PeliculasServiceImpl implements PeliculasService{

	@Autowired
	private PeliculasRepository peliculasRepository;
	
	@Autowired
	private Validator validator;
                
    @Override        		
	public void validate(Peliculas peliculas)throws ConstraintViolationException{		
		
		Set<ConstraintViolation<Peliculas>> constraintViolations =validator.validate(peliculas);
		 if (!constraintViolations.isEmpty()) {			
			throw new ConstraintViolationException(constraintViolations);
		}
		
	}

	@Override
	public List<Peliculas> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Peliculas> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Peliculas save(Peliculas entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Peliculas update(Peliculas entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Peliculas entity) throws Exception {
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
