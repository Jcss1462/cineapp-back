package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org
* www.zathuracode.org
*
*/
public class UsuariosDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull
    @NotEmpty
    @Size(max = 100)
    private String email;
    @NotNull
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fechaNacimiento;
    @NotNull
    private Integer identificacion;
    @NotNull
    @NotEmpty
    @Size(max = 45)
    private String nombre;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String uid;
    private Integer idEstado_EstadosUsuario;
    private Integer idTipo_TiposUsuario;
    
    
    public UsuariosDTO() {
		super();
	}

	public UsuariosDTO(@NotNull @NotEmpty @Size(max = 100) String email, @NotNull Date fechaNacimiento,
			@NotNull Integer identificacion, @NotNull @NotEmpty @Size(max = 45) String nombre,
			@NotNull @NotEmpty @Size(max = 255) String uid, Integer idEstado_EstadosUsuario,
			Integer idTipo_TiposUsuario) {
		super();
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.uid = uid;
		this.idEstado_EstadosUsuario = idEstado_EstadosUsuario;
		this.idTipo_TiposUsuario = idTipo_TiposUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Integer getIdEstado_EstadosUsuario() {
		return idEstado_EstadosUsuario;
	}

	public void setIdEstado_EstadosUsuario(Integer idEstado_EstadosUsuario) {
		this.idEstado_EstadosUsuario = idEstado_EstadosUsuario;
	}

	public Integer getIdTipo_TiposUsuario() {
		return idTipo_TiposUsuario;
	}

	public void setIdTipo_TiposUsuario(Integer idTipo_TiposUsuario) {
		this.idTipo_TiposUsuario = idTipo_TiposUsuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
    
    
}
