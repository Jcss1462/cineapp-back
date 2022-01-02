package com.example.demo.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org
* www.zathuracode.org
*
*/
public class GenerosPeliculaDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull
    @NotEmpty
    @Size(max = 45)
    private String genero;
    @NotNull
    private Integer idGenero;
    
    
	
    public GenerosPeliculaDTO() {
		super();
	}

	public GenerosPeliculaDTO(@NotNull @NotEmpty @Size(max = 45) String genero, @NotNull Integer idGenero) {
		super();
		this.genero = genero;
		this.idGenero = idGenero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(Integer idGenero) {
		this.idGenero = idGenero;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
    
    
}
