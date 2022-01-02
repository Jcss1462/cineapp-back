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
public class TiposUsuarioDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull
    private Integer idTipo;
    @NotNull
    @NotEmpty
    @Size(max = 45)
    private String tipo;
    
   
    public TiposUsuarioDTO() {
		super();
	}


	public TiposUsuarioDTO(@NotNull Integer idTipo, @NotNull @NotEmpty @Size(max = 45) String tipo) {
		super();
		this.idTipo = idTipo;
		this.tipo = tipo;
	}


	public Integer getIdTipo() {
		return idTipo;
	}


	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
       
    
}
