package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.domain.MetodosDePago;


/**
 * @author Zathura Code Generator Version 9.0 http://zathuracode.org
 *         www.zathuracode.org
 *
 */
public interface MetodosDePagoRepository extends JpaRepository<MetodosDePago, Integer> {

	// modo manual
	@Query("SELECT mp FROM MetodosDePago mp WHERE mp.usuarios.email=:email")
	public List<MetodosDePago> misMetodosDePago(String email);

}
