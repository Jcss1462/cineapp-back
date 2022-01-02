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

public class EstadosPeliculaDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull
    @NotEmpty
    @Size(max = 45)
    private String estado;
    @NotNull
    private Integer idEstado;
    
   
	
    public EstadosPeliculaDTO() {
		super();
	}

	public EstadosPeliculaDTO(@NotNull @NotEmpty @Size(max = 45) String estado, @NotNull Integer idEstado) {
		super();
		this.estado = estado;
		this.idEstado = idEstado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
    
    
}
