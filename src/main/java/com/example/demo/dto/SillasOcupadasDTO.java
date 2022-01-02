package com.example.demo.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;


/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org
* www.zathuracode.org
*
*/

public class SillasOcupadasDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull
    private Integer idOcupacion;
    private Integer idCompra_Compras;
    private Integer idSilla_Sillas;
    
    
	public SillasOcupadasDTO() {
		super();
	}
	
	public SillasOcupadasDTO(@NotNull Integer idOcupacion, Integer idCompra_Compras, Integer idSilla_Sillas) {
		super();
		this.idOcupacion = idOcupacion;
		this.idCompra_Compras = idCompra_Compras;
		this.idSilla_Sillas = idSilla_Sillas;
	}
	public Integer getIdOcupacion() {
		return idOcupacion;
	}
	public void setIdOcupacion(Integer idOcupacion) {
		this.idOcupacion = idOcupacion;
	}
	public Integer getIdCompra_Compras() {
		return idCompra_Compras;
	}
	public void setIdCompra_Compras(Integer idCompra_Compras) {
		this.idCompra_Compras = idCompra_Compras;
	}
	public Integer getIdSilla_Sillas() {
		return idSilla_Sillas;
	}
	public void setIdSilla_Sillas(Integer idSilla_Sillas) {
		this.idSilla_Sillas = idSilla_Sillas;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}
