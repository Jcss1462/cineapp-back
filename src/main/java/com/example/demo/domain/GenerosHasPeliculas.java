package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author Zathura Code Generator Version 9.0 http://zathuracode.org
 *         www.zathuracode.org
 *
 */
@Entity
@Table(name = "generos_has_peliculas", schema = "public")
public class GenerosHasPeliculas implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_genero_has_pelicula", unique = true, nullable = false)
	@NotNull
	private Integer idGeneroHasPelicula;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_genero")
	@NotNull
	private GenerosPelicula generosPelicula;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pelicula")
	@NotNull
	private Peliculas peliculas;
	
	
	
	
	public GenerosHasPeliculas() {
		super();
	}


	public GenerosHasPeliculas(@NotNull Integer idGeneroHasPelicula, @NotNull GenerosPelicula generosPelicula,
			@NotNull Peliculas peliculas) {
		super();
		this.idGeneroHasPelicula = idGeneroHasPelicula;
		this.generosPelicula = generosPelicula;
		this.peliculas = peliculas;
	}


	public Integer getIdGeneroHasPelicula() {
		return idGeneroHasPelicula;
	}


	public void setIdGeneroHasPelicula(Integer idGeneroHasPelicula) {
		this.idGeneroHasPelicula = idGeneroHasPelicula;
	}


	public GenerosPelicula getGenerosPelicula() {
		return generosPelicula;
	}


	public void setGenerosPelicula(GenerosPelicula generosPelicula) {
		this.generosPelicula = generosPelicula;
	}


	public Peliculas getPeliculas() {
		return peliculas;
	}


	public void setPeliculas(Peliculas peliculas) {
		this.peliculas = peliculas;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
