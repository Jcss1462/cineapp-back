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
public class PeliculasDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull
    @NotEmpty
    @Size(max = 200)
    private String direcor;
    @NotNull
    private Integer duracion;
    @NotNull
    private Integer idPelicula;
    @NotNull
    @NotEmpty
    @Size(max = 200)
    private String sinopsis;
    private Integer idClasificacion_ClasificacionesPelicula;
    private Integer idEstado_EstadosPelicula;
	
    
    
    public PeliculasDTO() {
		super();
	}


	public PeliculasDTO(@NotNull @NotEmpty @Size(max = 200) String direcor, @NotNull Integer duracion,
			@NotNull Integer idPelicula, @NotNull @NotEmpty @Size(max = 200) String sinopsis,
			Integer idClasificacion_ClasificacionesPelicula, Integer idEstado_EstadosPelicula) {
		super();
		this.direcor = direcor;
		this.duracion = duracion;
		this.idPelicula = idPelicula;
		this.sinopsis = sinopsis;
		this.idClasificacion_ClasificacionesPelicula = idClasificacion_ClasificacionesPelicula;
		this.idEstado_EstadosPelicula = idEstado_EstadosPelicula;
	}


	public String getDirecor() {
		return direcor;
	}


	public void setDirecor(String direcor) {
		this.direcor = direcor;
	}


	public Integer getDuracion() {
		return duracion;
	}


	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}


	public Integer getIdPelicula() {
		return idPelicula;
	}


	public void setIdPelicula(Integer idPelicula) {
		this.idPelicula = idPelicula;
	}


	public String getSinopsis() {
		return sinopsis;
	}


	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}


	public Integer getIdClasificacion_ClasificacionesPelicula() {
		return idClasificacion_ClasificacionesPelicula;
	}


	public void setIdClasificacion_ClasificacionesPelicula(Integer idClasificacion_ClasificacionesPelicula) {
		this.idClasificacion_ClasificacionesPelicula = idClasificacion_ClasificacionesPelicula;
	}


	public Integer getIdEstado_EstadosPelicula() {
		return idEstado_EstadosPelicula;
	}


	public void setIdEstado_EstadosPelicula(Integer idEstado_EstadosPelicula) {
		this.idEstado_EstadosPelicula = idEstado_EstadosPelicula;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}
