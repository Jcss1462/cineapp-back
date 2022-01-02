package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;


/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org
* www.zathuracode.org
*
*/
public class FuncionesDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull
    private Date fecha;
    @NotNull
    private Date hora;
    @NotNull
    private Integer idFuncion;
    @NotNull
    private Long precioPorBoleta;
    private Integer idEstado_EstadosFuncion;
    private Integer idPelicula_Peliculas;
    private Integer numeroSala_Salas;
    
    public FuncionesDTO() {
		super();
	}

	public FuncionesDTO(@NotNull Date fecha, @NotNull Date hora, @NotNull Integer idFuncion,
			@NotNull Long precioPorBoleta, Integer idEstado_EstadosFuncion, Integer idPelicula_Peliculas,
			Integer numeroSala_Salas) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.idFuncion = idFuncion;
		this.precioPorBoleta = precioPorBoleta;
		this.idEstado_EstadosFuncion = idEstado_EstadosFuncion;
		this.idPelicula_Peliculas = idPelicula_Peliculas;
		this.numeroSala_Salas = numeroSala_Salas;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public Integer getIdFuncion() {
		return idFuncion;
	}

	public void setIdFuncion(Integer idFuncion) {
		this.idFuncion = idFuncion;
	}

	public Long getPrecioPorBoleta() {
		return precioPorBoleta;
	}

	public void setPrecioPorBoleta(Long precioPorBoleta) {
		this.precioPorBoleta = precioPorBoleta;
	}

	public Integer getIdEstado_EstadosFuncion() {
		return idEstado_EstadosFuncion;
	}

	public void setIdEstado_EstadosFuncion(Integer idEstado_EstadosFuncion) {
		this.idEstado_EstadosFuncion = idEstado_EstadosFuncion;
	}

	public Integer getIdPelicula_Peliculas() {
		return idPelicula_Peliculas;
	}

	public void setIdPelicula_Peliculas(Integer idPelicula_Peliculas) {
		this.idPelicula_Peliculas = idPelicula_Peliculas;
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
