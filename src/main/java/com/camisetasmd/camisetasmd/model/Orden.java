package com.camisetasmd.camisetasmd.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ordenes")
public class Orden {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String numero;
	private Date fechaCreacion;
	private Date fechaRecibida;
	private double total;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToOne(mappedBy = "orden")
	private DetalleOrden detalle;
	
	@OneToOne
	private Producto producto;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaRecibida() {
		return fechaRecibida;
	}
	public void setFechaRecibida(Date fechaRecibida) {
		this.fechaRecibida = fechaRecibida;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public DetalleOrden getDetalle() {
		return detalle;
	}
	public void setDetalle(DetalleOrden detalle) {
		this.detalle = detalle;
	}
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public Orden(int id, String numero, Date fechaCreacion, Date fechaRecibida, double total, Usuario usuario, DetalleOrden detalle, Producto producto) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.fechaRecibida = fechaRecibida;
		this.total = total;
		this.usuario= usuario;
		this.detalle=detalle;
		this.producto=producto;
	}
	
	public Orden() {
		
	}
	
	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion + ", fechaRecibida="
				+ fechaRecibida + ", total=" + total + "]";
	}
	
	
	
}
