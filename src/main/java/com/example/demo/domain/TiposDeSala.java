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
@Table(name = "tipos_de_sala", schema = "public")
public class TiposDeSala implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_tipo", unique = true, nullable = false)
	@NotNull
	private Integer idTipo;

	@NotNull
	@NotEmpty
	@Size(max = 45)
	@Column(name = "tipo", nullable = false)
	private String tipo;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tiposDeSala")
	private List<Salas> salases = new ArrayList<>();
	
	

	public TiposDeSala() {
		super();
	}

	public TiposDeSala(@NotNull Integer idTipo, @NotNull @NotEmpty @Size(max = 45) String tipo, List<Salas> salases) {
		super();
		this.idTipo = idTipo;
		this.tipo = tipo;
		this.salases = salases;
	}

	public Integer getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Salas> getSalases() {
		return salases;
	}

	public void setSalases(List<Salas> salases) {
		this.salases = salases;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}