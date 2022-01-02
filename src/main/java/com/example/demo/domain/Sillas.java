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
@Table(name = "sillas", schema = "public")
public class Sillas implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_silla", unique = true, nullable = false)
	@NotNull
	private Integer idSilla;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_estado")
	@NotNull
	private EstadosSilla estadosSilla;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "numero_sala")
	@NotNull
	private Salas salas;

	@NotNull
	@NotEmpty
	@Size(max = 2)
	@Column(name = "fila", nullable = false)
	private String fila;
	@NotNull
	@Column(name = "numero", nullable = false)
	private Integer numero;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sillas")
	private List<SillasOcupadas> sillasOcupadases = new ArrayList<>();
	
	

	public Sillas() {
		super();
	}

	public Sillas(@NotNull Integer idSilla, @NotNull EstadosSilla estadosSilla, @NotNull Salas salas,
			@NotNull @NotEmpty @Size(max = 2) String fila, @NotNull Integer numero,
			List<SillasOcupadas> sillasOcupadases) {
		super();
		this.idSilla = idSilla;
		this.estadosSilla = estadosSilla;
		this.salas = salas;
		this.fila = fila;
		this.numero = numero;
		this.sillasOcupadases = sillasOcupadases;
	}

	public Integer getIdSilla() {
		return idSilla;
	}

	public void setIdSilla(Integer idSilla) {
		this.idSilla = idSilla;
	}

	public EstadosSilla getEstadosSilla() {
		return estadosSilla;
	}

	public void setEstadosSilla(EstadosSilla estadosSilla) {
		this.estadosSilla = estadosSilla;
	}

	public Salas getSalas() {
		return salas;
	}

	public void setSalas(Salas salas) {
		this.salas = salas;
	}

	public String getFila() {
		return fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public List<SillasOcupadas> getSillasOcupadases() {
		return sillasOcupadases;
	}

	public void setSillasOcupadases(List<SillasOcupadas> sillasOcupadases) {
		this.sillasOcupadases = sillasOcupadases;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}