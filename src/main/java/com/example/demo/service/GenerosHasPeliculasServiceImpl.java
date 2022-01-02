package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.demo.domain.GenerosHasPeliculas;
import com.example.demo.repository.GenerosHasPeliculasRepository;


/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org
* www.zathuracode.org
*
*/
@Scope("singleton")
@Service
public class GenerosHasPeliculasServiceImpl implements GenerosHasPeliculasService {
    
	@Autowired
    private GenerosHasPeliculasRepository generosHasPeliculasRepository;
    @Autowired
    private Validator validator;

    @Override
    public void validate(GenerosHasPeliculas generosHasPeliculas)
        throws ConstraintViolationException {
        Set<ConstraintViolation<GenerosHasPeliculas>> constraintViolations = validator.validate(generosHasPeliculas);

        if (!constraintViolations.isEmpty()) {
            throw new ConstraintViolationException(constraintViolations);
        }
    }

	@Override
	public List<GenerosHasPeliculas> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<GenerosHasPeliculas> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GenerosHasPeliculas save(GenerosHasPeliculas entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GenerosHasPeliculas update(GenerosHasPeliculas entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(GenerosHasPeliculas entity) throws Exception {
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
