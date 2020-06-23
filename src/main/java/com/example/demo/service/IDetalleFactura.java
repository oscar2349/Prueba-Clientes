package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.Articulo;
import com.example.demo.Entity.DetalleFactura;
import com.example.demo.Entity.Proveedor;

public interface IDetalleFactura {
	
	public List<DetalleFactura> findall();
	
	DetalleFactura findbyId(Integer id);


}
