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
@Table(name = "clasificaciones_pelicula", schema = "public")
public class ClasificacionesPelicula implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_clasificacion", unique = true, nullable = false)
	@NotNull
	private Integer idClasificacion;

	@NotNull
	@NotEmpty
	@Size(max = 45)
	@Column(name = "clasificacion", nullable = false)
	private String clasificacion;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clasificacionesPelicula")
	private List<Peliculas> peliculases = new ArrayList<>();
	
	
	

	public ClasificacionesPelicula() {
		super();
	}

	public ClasificacionesPelicula(@NotNull Integer idClasificacion,
			@NotNull @NotEmpty @Size(max = 45) String clasificacion, List<Peliculas> peliculases) {
		super();
		this.idClasificacion = idClasificacion;
		this.clasificacion = clasificacion;
		this.peliculases = peliculases;
	}

	public Integer getIdClasificacion() {
		return idClasificacion;
	}

	public void setIdClasificacion(Integer idClasificacion) {
		this.idClasificacion = idClasificacion;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public List<Peliculas> getPeliculases() {
		return peliculases;
	}

	public void setPeliculases(List<Peliculas> peliculases) {
		this.peliculases = peliculases;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}