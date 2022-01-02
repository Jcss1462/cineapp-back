package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "peliculas", schema = "public")
public class Peliculas implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_pelicula", unique = true, nullable = false)
	@NotNull
	private Integer idPelicula;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_clasificacion")
	@NotNull
	private ClasificacionesPelicula clasificacionesPelicula;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_estado")
	@NotNull
	private EstadosPelicula estadosPelicula;

	@NotNull
	@NotEmpty
	@Size(max = 200)
	@Column(name = "direcor", nullable = false)
	private String direcor;
	@NotNull
	@Column(name = "duracion", nullable = false)
	private Integer duracion;
	@NotNull
	@NotEmpty
	@Size(max = 200)
	@Column(name = "sinopsis", nullable = false)
	private String sinopsis;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "peliculas")
	private List<Funciones> funcioneses = new ArrayList<>();
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "peliculas")
	private List<GenerosHasPeliculas> generosHasPeliculases = new ArrayList<>();
	
	
	
	
	public Peliculas() {
		super();
	}

	public Peliculas(@NotNull Integer idPelicula, @NotNull ClasificacionesPelicula clasificacionesPelicula,
			@NotNull EstadosPelicula estadosPelicula, @NotNull @NotEmpty @Size(max = 200) String direcor,
			@NotNull Integer duracion, @NotNull @NotEmpty @Size(max = 200) String sinopsis, List<Funciones> funcioneses,
			List<GenerosHasPeliculas> generosHasPeliculases) {
		super();
		this.idPelicula = idPelicula;
		this.clasificacionesPelicula = clasificacionesPelicula;
		this.estadosPelicula = estadosPelicula;
		this.direcor = direcor;
		this.duracion = duracion;
		this.sinopsis = sinopsis;
		this.funcioneses = funcioneses;
		this.generosHasPeliculases = generosHasPeliculases;
	}

	public Integer getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(Integer idPelicula) {
		this.idPelicula = idPelicula;
	}

	public ClasificacionesPelicula getClasificacionesPelicula() {
		return clasificacionesPelicula;
	}

	public void setClasificacionesPelicula(ClasificacionesPelicula clasificacionesPelicula) {
		this.clasificacionesPelicula = clasificacionesPelicula;
	}

	public EstadosPelicula getEstadosPelicula() {
		return estadosPelicula;
	}

	public void setEstadosPelicula(EstadosPelicula estadosPelicula) {
		this.estadosPelicula = estadosPelicula;
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

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public List<Funciones> getFuncioneses() {
		return funcioneses;
	}

	public void setFuncioneses(List<Funciones> funcioneses) {
		this.funcioneses = funcioneses;
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