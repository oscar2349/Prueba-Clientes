package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.Articulo;
import com.example.demo.Entity.DetalleFactura;
import com.example.demo.Entity.Factura;

public interface IFactura {
	
	public List<Factura> findall();
	
	public Factura findOne(Integer id);
	
	public void save(Factura Factura);
	


}
