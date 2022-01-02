package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org
* www.zathuracode.org
*
*/
public class MetodosDePagoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull
    private Integer cvv;
    @NotNull
    private Date fechaExpiracion;
    @NotNull
    private Integer idMetodo;
    @NotNull
    @NotEmpty
    @Size(max = 45)
    private String nombreTarjetahabiente;
    @NotNull
    private Integer numeroTarjeta;
    private Integer idEstado_EstadosMetodoDePago;
    private String email_Usuarios;
    
    
	
    public MetodosDePagoDTO() {
		super();
	}

	public MetodosDePagoDTO(@NotNull Integer cvv, @NotNull Date fechaExpiracion, @NotNull Integer idMetodo,
			@NotNull @NotEmpty @Size(max = 45) String nombreTarjetahabiente, @NotNull Integer numeroTarjeta,
			Integer idEstado_EstadosMetodoDePago, String email_Usuarios) {
		super();
		this.cvv = cvv;
		this.fechaExpiracion = fechaExpiracion;
		this.idMetodo = idMetodo;
		this.nombreTarjetahabiente = nombreTarjetahabiente;
		this.numeroTarjeta = numeroTarjeta;
		this.idEstado_EstadosMetodoDePago = idEstado_EstadosMetodoDePago;
		this.email_Usuarios = email_Usuarios;
	}

	public Integer getCvv() {
		return cvv;
	}

	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	public Integer getIdMetodo() {
		return idMetodo;
	}

	public void setIdMetodo(Integer idMetodo) {
		this.idMetodo = idMetodo;
	}

	public String getNombreTarjetahabiente() {
		return nombreTarjetahabiente;
	}

	public void setNombreTarjetahabiente(String nombreTarjetahabiente) {
		this.nombreTarjetahabiente = nombreTarjetahabiente;
	}

	public Integer getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(Integer numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public Integer getIdEstado_EstadosMetodoDePago() {
		return idEstado_EstadosMetodoDePago;
	}

	public void setIdEstado_EstadosMetodoDePago(Integer idEstado_EstadosMetodoDePago) {
		this.idEstado_EstadosMetodoDePago = idEstado_EstadosMetodoDePago;
	}

	public String getEmail_Usuarios() {
		return email_Usuarios;
	}

	public void setEmail_Usuarios(String email_Usuarios) {
		this.email_Usuarios = email_Usuarios;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
     
    
    
    
    
}
