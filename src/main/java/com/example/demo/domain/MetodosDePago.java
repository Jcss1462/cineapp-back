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
@Table(name = "metodos_de_pago", schema = "public")
public class MetodosDePago implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_metodo", unique = true, nullable = false)
	@NotNull
	private Integer idMetodo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_estado")
	@NotNull
	private EstadosMetodoDePago estadosMetodoDePago;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "email")
	@NotNull
	private Usuarios usuarios;

	@NotNull
	@Column(name = "cvv", nullable = false)
	private Integer cvv;
	@NotNull
	@Column(name = "fecha_expiracion", nullable = false)
	private Date fechaExpiracion;
	@NotNull
	@NotEmpty
	@Size(max = 45)
	@Column(name = "nombre_tarjetahabiente", nullable = false)
	private String nombreTarjetahabiente;
	@NotNull
	@Column(name = "numero_tarjeta", nullable = false)
	private Integer numeroTarjeta;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "metodosDePago")
	private List<Compras> comprases = new ArrayList<>();
	
	

	public MetodosDePago() {
		super();
	}

	public MetodosDePago(@NotNull Integer idMetodo, @NotNull EstadosMetodoDePago estadosMetodoDePago,
			@NotNull Usuarios usuarios, @NotNull Integer cvv, @NotNull Date fechaExpiracion,
			@NotNull @NotEmpty @Size(max = 45) String nombreTarjetahabiente, @NotNull Integer numeroTarjeta,
			List<Compras> comprases) {
		super();
		this.idMetodo = idMetodo;
		this.estadosMetodoDePago = estadosMetodoDePago;
		this.usuarios = usuarios;
		this.cvv = cvv;
		this.fechaExpiracion = fechaExpiracion;
		this.nombreTarjetahabiente = nombreTarjetahabiente;
		this.numeroTarjeta = numeroTarjeta;
		this.comprases = comprases;
	}

	public Integer getIdMetodo() {
		return idMetodo;
	}

	public void setIdMetodo(Integer idMetodo) {
		this.idMetodo = idMetodo;
	}

	public EstadosMetodoDePago getEstadosMetodoDePago() {
		return estadosMetodoDePago;
	}

	public void setEstadosMetodoDePago(EstadosMetodoDePago estadosMetodoDePago) {
		this.estadosMetodoDePago = estadosMetodoDePago;
	}

	public Usuarios getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
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

	public List<Compras> getComprases() {
		return comprases;
	}

	public void setComprases(List<Compras> comprases) {
		this.comprases = comprases;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}