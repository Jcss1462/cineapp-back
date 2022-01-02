package com.example.demo.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;


/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org
* www.zathuracode.org
*
*/

public class GenerosHasPeliculasDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull
    private Integer idGeneroHasPelicula;
    private Integer idGenero_GenerosPelicula;
    private Integer idPelicula_Peliculas;
    
    public GenerosHasPeliculasDTO() {
		super();
	}

	public GenerosHasPeliculasDTO(@NotNull Integer idGeneroHasPelicula, Integer idGenero_GenerosPelicula,
			Integer idPelicula_Peliculas) {
		super();
		this.idGeneroHasPelicula = idGeneroHasPelicula;
		this.idGenero_GenerosPelicula = idGenero_GenerosPelicula;
		this.idPelicula_Peliculas = idPelicula_Peliculas;
	}

	public Integer getIdGeneroHasPelicula() {
		return idGeneroHasPelicula;
	}

	public void setIdGeneroHasPelicula(Integer idGeneroHasPelicula) {
		this.idGeneroHasPelicula = idGeneroHasPelicula;
	}

	public Integer getIdGenero_GenerosPelicula() {
		return idGenero_GenerosPelicula;
	}

	public void setIdGenero_GenerosPelicula(Integer idGenero_GenerosPelicula) {
		this.idGenero_GenerosPelicula = idGenero_GenerosPelicula;
	}

	public Integer getIdPelicula_Peliculas() {
		return idPelicula_Peliculas;
	}

	public void setIdPelicula_Peliculas(Integer idPelicula_Peliculas) {
		this.idPelicula_Peliculas = idPelicula_Peliculas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
    
    
}
