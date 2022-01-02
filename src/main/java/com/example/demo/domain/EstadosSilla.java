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
@Table(name = "estados_silla", schema = "public")
public class EstadosSilla implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_estado", unique = true, nullable = false)
	@NotNull
	private Integer idEstado;

	@NotNull
	@NotEmpty
	@Size(max = 45)
	@Column(name = "estado", nullable = false)
	private String estado;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estadosSilla")
	private List<Sillas> sillases = new ArrayList<>();
	
	

	public EstadosSilla() {
		super();
	}

	public EstadosSilla(@NotNull Integer idEstado, @NotNull @NotEmpty @Size(max = 45) String estado,
			List<Sillas> sillases) {
		super();
		this.idEstado = idEstado;
		this.estado = estado;
		this.sillases = sillases;
	}

	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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