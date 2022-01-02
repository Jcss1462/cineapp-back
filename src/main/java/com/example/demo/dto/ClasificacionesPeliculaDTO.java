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
public class ClasificacionesPeliculaDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull
    @NotEmpty
    @Size(max = 45)
    private String clasificacion;
    @NotNull
    private Integer idClasificacion;
    
    
	
    public ClasificacionesPeliculaDTO() {
		super();
	}

	public ClasificacionesPeliculaDTO(@NotNull @NotEmpty @Size(max = 45) String clasificacion,
			@NotNull Integer idClasificacion) {
		super();
		this.clasificacion = clasificacion;
		this.idClasificacion = idClasificacion;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public Integer getIdClasificacion() {
		return idClasificacion;
	}

	public void setIdClasificacion(Integer idClasificacion) {
		this.idClasificacion = idClasificacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
   
    
}
