package com.example.demo.Entity;

import java.sql.Date;

public class Ingreso {

	int numeroFactura;
	int numeroCliente;

	int idProveedor;
	int numeroArticulo;
	int detalle;
	
	public int getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	public int getNumeroCliente() {
		return numeroCliente;
	}
	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public int getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}
	public int getNumeroArticulo() {
		return numeroArticulo;
	}
	public void setNumeroArticulo(int numeroArticulo) {
		this.numeroArticulo = numeroArticulo;
	}
	public int getDetalle() {
		return detalle;
	}
	public void setDetalle(int detalle) {
		this.detalle = detalle;
	}

	
	
	
	
	
}
