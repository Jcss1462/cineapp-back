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

public class SillasDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull
    @NotEmpty
    @Size(max = 2)
    private String fila;
    @NotNull
    private Integer idSilla;
    @NotNull
    private Integer numero;
    private Integer idEstado_EstadosSilla;
    private Integer numeroSala_Salas;
    
    
	
    public SillasDTO() {
		super();
	}

	public SillasDTO(@NotNull @NotEmpty @Size(max = 2) String fila, @NotNull Integer idSilla, @NotNull Integer numero,
			Integer idEstado_EstadosSilla, Integer numeroSala_Salas) {
		super();
		this.fila = fila;
		this.idSilla = idSilla;
		this.numero = numero;
		this.idEstado_EstadosSilla = idEstado_EstadosSilla;
		this.numeroSala_Salas = numeroSala_Salas;
	}

	public String getFila() {
		return fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

	public Integer getIdSilla() {
		return idSilla;
	}

	public void setIdSilla(Integer idSilla) {
		this.idSilla = idSilla;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getIdEstado_EstadosSilla() {
		return idEstado_EstadosSilla;
	}

	public void setIdEstado_EstadosSilla(Integer idEstado_EstadosSilla) {
		this.idEstado_EstadosSilla = idEstado_EstadosSilla;
	}

	public Integer getNumeroSala_Salas() {
		return numeroSala_Salas;
	}

	public void setNumeroSala_Salas(Integer numeroSala_Salas) {
		this.numeroSala_Salas = numeroSala_Salas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
   
    
}
