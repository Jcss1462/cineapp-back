package com.example.demo.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;


/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org
* www.zathuracode.org
*
*/

public class ComprasDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull
    private Integer cantidadDeEntradas;
    @NotNull
    private Integer idCompra;
    @NotNull
    private Long precioTotal;
    private Integer idEstado_EstadosCompra;
    private Integer idFuncion_Funciones;
    private Integer idMetodo_MetodosDePago;
    private String email_Usuarios;
    
    
    public ComprasDTO() {
		super();
	}

	public ComprasDTO(@NotNull Integer cantidadDeEntradas, @NotNull Integer idCompra, @NotNull Long precioTotal,
			Integer idEstado_EstadosCompra, Integer idFuncion_Funciones, Integer idMetodo_MetodosDePago,
			String email_Usuarios) {
		super();
		this.cantidadDeEntradas = cantidadDeEntradas;
		this.idCompra = idCompra;
		this.precioTotal = precioTotal;
		this.idEstado_EstadosCompra = idEstado_EstadosCompra;
		this.idFuncion_Funciones = idFuncion_Funciones;
		this.idMetodo_MetodosDePago = idMetodo_MetodosDePago;
		this.email_Usuarios = email_Usuarios;
	}
    
	public Integer getCantidadDeEntradas() {
		return cantidadDeEntradas;
	}
	public void setCantidadDeEntradas(Integer cantidadDeEntradas) {
		this.cantidadDeEntradas = cantidadDeEntradas;
	}
	public Integer getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}
	public Long getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(Long precioTotal) {
		this.precioTotal = precioTotal;
	}
	public Integer getIdEstado_EstadosCompra() {
		return idEstado_EstadosCompra;
	}
	public void setIdEstado_EstadosCompra(Integer idEstado_EstadosCompra) {
		this.idEstado_EstadosCompra = idEstado_EstadosCompra;
	}
	public Integer getIdFuncion_Funciones() {
		return idFuncion_Funciones;
	}
	public void setIdFuncion_Funciones(Integer idFuncion_Funciones) {
		this.idFuncion_Funciones = idFuncion_Funciones;
	}
	public Integer getIdMetodo_MetodosDePago() {
		return idMetodo_MetodosDePago;
	}
	public void setIdMetodo_MetodosDePago(Integer idMetodo_MetodosDePago) {
		this.idMetodo_MetodosDePago = idMetodo_MetodosDePago;
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
