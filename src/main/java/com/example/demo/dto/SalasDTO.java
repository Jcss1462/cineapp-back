package com.example.demo.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;


/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org
* www.zathuracode.org
*
*/
public class SalasDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull
    private Integer numeroSala;
    private Integer idEstado_EstadosSala;
    private Integer idTipo_TiposDeSala;
    
    
	
    public SalasDTO() {
		super();
	}
	public SalasDTO(@NotNull Integer numeroSala, Integer idEstado_EstadosSala, Integer idTipo_TiposDeSala) {
		super();
		this.numeroSala = numeroSala;
		this.idEstado_EstadosSala = idEstado_EstadosSala;
		this.idTipo_TiposDeSala = idTipo_TiposDeSala;
	}
	public Integer getNumeroSala() {
		return numeroSala;
	}
	public void setNumeroSala(Integer numeroSala) {
		this.numeroSala = numeroSala;
	}
	public Integer getIdEstado_EstadosSala() {
		return idEstado_EstadosSala;
	}
	public void setIdEstado_EstadosSala(Integer idEstado_EstadosSala) {
		this.idEstado_EstadosSala = idEstado_EstadosSala;
	}
	public Integer getIdTipo_TiposDeSala() {
		return idTipo_TiposDeSala;
	}
	public void setIdTipo_TiposDeSala(Integer idTipo_TiposDeSala) {
		this.idTipo_TiposDeSala = idTipo_TiposDeSala;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
    
}
