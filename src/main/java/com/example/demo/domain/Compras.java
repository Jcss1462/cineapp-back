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
@Table(name = "compras", schema = "public")
public class Compras implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_compra", unique = true, nullable = false)
	@NotNull
	private Integer idCompra;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_estado")
	@NotNull
	private EstadosCompra estadosCompra;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_funcion")
	@NotNull
	private Funciones funciones;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_metodo")
	@NotNull
	private MetodosDePago metodosDePago;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "email")
	@NotNull
	private Usuarios usuarios;

	@NotNull
	@Column(name = "cantidad_de_entradas", nullable = false)
	private Integer cantidadDeEntradas;
	@NotNull
	@Column(name = "precio_total", nullable = false)
	private Long precioTotal;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "compras")
	private List<SillasOcupadas> sillasOcupadases = new ArrayList<>();
	
	
	public Compras() {
		super();
	}

	public Compras(@NotNull Integer idCompra, @NotNull EstadosCompra estadosCompra, @NotNull Funciones funciones,
			@NotNull MetodosDePago metodosDePago, @NotNull Usuarios usuarios, @NotNull Integer cantidadDeEntradas,
			@NotNull Long precioTotal, List<SillasOcupadas> sillasOcupadases) {
		super();
		this.idCompra = idCompra;
		this.estadosCompra = estadosCompra;
		this.funciones = funciones;
		this.metodosDePago = metodosDePago;
		this.usuarios = usuarios;
		this.cantidadDeEntradas = cantidadDeEntradas;
		this.precioTotal = precioTotal;
		this.sillasOcupadases = sillasOcupadases;
	}

	public Integer getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}

	public EstadosCompra getEstadosCompra() {
		return estadosCompra;
	}

	public void setEstadosCompra(EstadosCompra estadosCompra) {
		this.estadosCompra = estadosCompra;
	}

	public Funciones getFunciones() {
		return funciones;
	}

	public void setFunciones(Funciones funciones) {
		this.funciones = funciones;
	}

	public MetodosDePago getMetodosDePago() {
		return metodosDePago;
	}

	public void setMetodosDePago(MetodosDePago metodosDePago) {
		this.metodosDePago = metodosDePago;
	}

	public Usuarios getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public Integer getCantidadDeEntradas() {
		return cantidadDeEntradas;
	}

	public void setCantidadDeEntradas(Integer cantidadDeEntradas) {
		this.cantidadDeEntradas = cantidadDeEntradas;
	}

	public Long getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(Long precioTotal) {
		this.precioTotal = precioTotal;
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