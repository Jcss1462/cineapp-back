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
@Table(name = "estados_usuario", schema = "public")
public class EstadosUsuario implements java.io.Serializable {

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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estadosUsuario")
	private List<Usuarios> usuarioses = new ArrayList<>();
	
	
	public EstadosUsuario() {
		super();
	}

	public EstadosUsuario(@NotNull Integer idEstado, @NotNull @NotEmpty @Size(max = 45) String estado,
			List<Usuarios> usuarioses) {
		super();
		this.idEstado = idEstado;
		this.estado = estado;
		this.usuarioses = usuarioses;
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

	public List<Usuarios> getUsuarioses() {
		return usuarioses;
	}

	public void setUsuarioses(List<Usuarios> usuarioses) {
		this.usuarioses = usuarioses;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}