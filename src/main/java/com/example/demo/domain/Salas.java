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
import javax.validation.constraints.NotNull;

/**
 * @author Zathura Code Generator Version 9.0 http://zathuracode.org/
 *         www.zathuracode.org
 * 
 */
@Entity
@Table(name = "salas", schema = "public")
public class Salas implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "numero_sala", unique = true, nullable = false)
	@NotNull
	private Integer numeroSala;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_estado")
	@NotNull
	private EstadosSala estadosSala;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo")
	@NotNull
	private TiposDeSala tiposDeSala;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salas")
	private List<Funciones> funcioneses = new ArrayList<>();
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salas")
	private List<Sillas> sillases = new ArrayList<>();
	
	
	
	public Salas() {
		super();
	}

	public Salas(@NotNull Integer numeroSala, @NotNull EstadosSala estadosSala, @NotNull TiposDeSala tiposDeSala,
			List<Funciones> funcioneses, List<Sillas> sillases) {
		super();
		this.numeroSala = numeroSala;
		this.estadosSala = estadosSala;
		this.tiposDeSala = tiposDeSala;
		this.funcioneses = funcioneses;
		this.sillases = sillases;
	}

	public Integer getNumeroSala() {
		return numeroSala;
	}

	public void setNumeroSala(Integer numeroSala) {
		this.numeroSala = numeroSala;
	}

	public EstadosSala getEstadosSala() {
		return estadosSala;
	}

	public void setEstadosSala(EstadosSala estadosSala) {
		this.estadosSala = estadosSala;
	}

	public TiposDeSala getTiposDeSala() {
		return tiposDeSala;
	}

	public void setTiposDeSala(TiposDeSala tiposDeSala) {
		this.tiposDeSala = tiposDeSala;
	}

	public List<Funciones> getFuncioneses() {
		return funcioneses;
	}

	public void setFuncioneses(List<Funciones> funcioneses) {
		this.funcioneses = funcioneses;
	}

	public List<Sillas> getSillases() {
		return sillases;
	}

	public void setSillases(List<Sillas> sillases) {
		this.sillases = sillases;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}