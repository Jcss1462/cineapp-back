package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Zathura Code Generator Version 9.0 http://zathuracode.org/
 *         www.zathuracode.org
 * 
 */
@Entity
@Table(name = "generos_pelicula", schema = "public")
public class GenerosPelicula implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_genero", unique = true, nullable = false)
	@NotNull
	private Integer idGenero;

	@NotNull
	@NotEmpty
	@Size(max = 45)
	@Column(name = "genero", nullable = false)
	private String genero;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "generosPelicula")
	private List<GenerosHasPeliculas> generosHasPeliculases = new ArrayList<>();
	
	

	public GenerosPelicula() {
		super();
	}

	public GenerosPelicula(@NotNull Integer idGenero, @NotNull @NotEmpty @Size(max = 45) String genero,
			List<GenerosHasPeliculas> generosHasPeliculases) {
		super();
		this.idGenero = idGenero;
		this.genero = genero;
		this.generosHasPeliculases = generosHasPeliculases;
	}

	public Integer getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(Integer idGenero) {
		this.idGenero = idGenero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<GenerosHasPeliculas> getGenerosHasPeliculases() {
		return generosHasPeliculases;
	}

	public void setGenerosHasPeliculases(List<GenerosHasPeliculas> generosHasPeliculases) {
		this.generosHasPeliculases = generosHasPeliculases;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}