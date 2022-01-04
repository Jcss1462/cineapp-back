package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.MetodosDePago;


/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org
* www.zathuracode.org
*
*/
public interface MetodosDePagoService extends GenericService<MetodosDePago, Integer> {
	
	public List<MetodosDePago> misMetodosDePago(String email) throws Exception;

}
