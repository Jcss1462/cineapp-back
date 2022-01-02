package com.example.demo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author Zathura Code Generator Version 9.0 http://zathuracode.org/
 *         www.zathuracode.org
 * 
 */
@Entity
@Table(name = "funciones", schema = "public")
public class Funciones implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_funcion", unique = true, nullable = false)
	@NotNull
	private Integer idFuncion;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_estado")
	@NotNull
	private EstadosFuncion estadosFuncion;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pelicula")
	@NotNull
	private Peliculas peliculas;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "numero_sala")
	@NotNull
	private Salas salas;

	@NotNull
	@Column(name = "fecha", nullable = false)
	private Date fecha;
	@NotNull
	@Column(name = "hora", nullable = false)
	private Date hora;
	@NotNull
	@Column(name = "precio_por_boleta", nullable = false)
	private Long precioPorBoleta;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "funciones")
	private List<Compras> comprases = new ArrayList<>();
	
	

	public Funciones() {
		super();
	}

	public Funciones(@NotNull Integer idFuncion, @NotNull EstadosFuncion estadosFuncion, @NotNull Peliculas peliculas,
			@NotNull Salas salas, @NotNull Date fecha, @NotNull Date hora, @NotNull Long precioPorBoleta,
			List<Compras> comprases) {
		super();
		this.idFuncion = idFuncion;
		this.estadosFuncion = estadosFuncion;
		this.peliculas = peliculas;
		this.salas = salas;
		this.fecha = fecha;
		this.hora = hora;
		this.precioPorBoleta = precioPorBoleta;
		this.comprases = comprases;
	}

	public Integer getIdFuncion() {
		return idFuncion;
	}

	public void setIdFuncion(Integer idFuncion) {
		this.idFuncion = idFuncion;
	}

	public EstadosFuncion getEstadosFuncion() {
		return estadosFuncion;
	}

	public void setEstadosFuncion(EstadosFuncion estadosFuncion) {
		this.estadosFuncion = estadosFuncion;
	}

	public Peliculas getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(Peliculas peliculas) {
		this.peliculas = peliculas;
	}

	public Salas getSalas() {
		return salas;
	}

	public void setSalas(Salas salas) {
		this.salas = salas;
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

	public Long getPrecioPorBoleta() {
		return precioPorBoleta;
	}

	public void setPrecioPorBoleta(Long precioPorBoleta) {
		this.precioPorBoleta = precioPorBoleta;
	}

	public List<Compras> getComprases() {
		return comprases;
	}

	public void setComprases(List<Compras> comprases) {
		this.comprases = comprases;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}