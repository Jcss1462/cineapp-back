package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author Zathura Code Generator Version 9.0 http://zathuracode.org
 *         www.zathuracode.org
 *
 */
@Entity
@Table(name = "sillas_ocupadas", schema = "public")
public class SillasOcupadas implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_ocupacion", unique = true, nullable = false)
	@NotNull
	private Integer idOcupacion;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_compra")
	@NotNull
	private Compras compras;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_silla")
	@NotNull
	private Sillas sillas;
	
	
	
	
	public SillasOcupadas() {
		super();
	}

	public SillasOcupadas(@NotNull Integer idOcupacion, @NotNull Compras compras, @NotNull Sillas sillas) {
		super();
		this.idOcupacion = idOcupacion;
		this.compras = compras;
		this.sillas = sillas;
	}

	public Integer getIdOcupacion() {
		return idOcupacion;
	}

	public void setIdOcupacion(Integer idOcupacion) {
		this.idOcupacion = idOcupacion;
	}

	public Compras getCompras() {
		return compras;
	}

	public void setCompras(Compras compras) {
		this.compras = compras;
	}

	public Sillas getSillas() {
		return sillas;
	}

	public void setSillas(Sillas sillas) {
		this.sillas = sillas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
