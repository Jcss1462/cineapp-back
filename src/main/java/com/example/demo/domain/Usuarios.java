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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Zathura Code Generator Version 9.0 http://zathuracode.org/
 *         www.zathuracode.org
 * 
 */
@Entity
@Table(name = "usuarios", schema = "public")
public class Usuarios implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "email", unique = true, nullable = false)
	@NotNull
	private String email;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_estado_usuario")
	@NotNull
	private EstadosUsuario estadosUsuario;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_usuario")
	@NotNull
	private TiposUsuario tiposUsuario;

	@NotNull
	@Column(name = "fecha_nacimiento", nullable = false)
	private Date fechaNacimiento;
	@NotNull
	@Column(name = "identificacion", nullable = false)
	private Integer identificacion;
	@NotNull
	@NotEmpty
	@Size(max = 45)
	@Column(name = "nombre", nullable = false)
	private String nombre;
	@NotNull
	@NotEmpty
	@Size(max = 255)
	@Column(name = "uid", nullable = false)
	private String uid;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuarios")
	private List<Compras> comprases = new ArrayList<>();
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuarios")
	private List<MetodosDePago> metodosDePagos = new ArrayList<>();
	
	
	
	public Usuarios() {
		super();
	}


	public Usuarios(@NotNull String email, @NotNull EstadosUsuario estadosUsuario, @NotNull TiposUsuario tiposUsuario,
			@NotNull Date fechaNacimiento, @NotNull Integer identificacion,
			@NotNull @NotEmpty @Size(max = 45) String nombre, @NotNull @NotEmpty @Size(max = 255) String uid,
			List<Compras> comprases, List<MetodosDePago> metodosDePagos) {
		super();
		this.email = email;
		this.estadosUsuario = estadosUsuario;
		this.tiposUsuario = tiposUsuario;
		this.fechaNacimiento = fechaNacimiento;
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.uid = uid;
		this.comprases = comprases;
		this.metodosDePagos = metodosDePagos;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public EstadosUsuario getEstadosUsuario() {
		return estadosUsuario;
	}


	public void setEstadosUsuario(EstadosUsuario estadosUsuario) {
		this.estadosUsuario = estadosUsuario;
	}


	public TiposUsuario getTiposUsuario() {
		return tiposUsuario;
	}


	public void setTiposUsuario(TiposUsuario tiposUsuario) {
		this.tiposUsuario = tiposUsuario;
	}


	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public Integer getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(Integer identificacion) {
		this.identificacion = identificacion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getUid() {
		return uid;
	}


	public void setUid(String uid) {
		this.uid = uid;
	}


	public List<Compras> getComprases() {
		return comprases;
	}


	public void setComprases(List<Compras> comprases) {
		this.comprases = comprases;
	}


	public List<MetodosDePago> getMetodosDePagos() {
		return metodosDePagos;
	}


	public void setMetodosDePagos(List<MetodosDePago> metodosDePagos) {
		this.metodosDePagos = metodosDePagos;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}