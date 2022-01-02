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

import com.example.demo.domain.SillasOcupadas;
import com.example.demo.repository.SillasOcupadasRepository;


/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org
* www.zathuracode.org
*
*/
@Scope("singleton")
@Service
public class SillasOcupadasServiceImpl implements SillasOcupadasService {
    @Autowired
    private SillasOcupadasRepository sillasOcupadasRepository;
    @Autowired
    private Validator validator;

    @Override
    public void validate(SillasOcupadas sillasOcupadas)
        throws ConstraintViolationException {
        Set<ConstraintViolation<SillasOcupadas>> constraintViolations = validator.validate(sillasOcupadas);

        if (!constraintViolations.isEmpty()) {
            throw new ConstraintViolationException(constraintViolations);
        }
    }

	@Override
	public List<SillasOcupadas> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<SillasOcupadas> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SillasOcupadas save(SillasOcupadas entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SillasOcupadas update(SillasOcupadas entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(SillasOcupadas entity) throws Exception {
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
