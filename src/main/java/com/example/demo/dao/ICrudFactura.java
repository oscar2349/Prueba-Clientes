package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Articulo;
import com.example.demo.Entity.Factura;

public interface ICrudFactura extends CrudRepository <Factura,Integer> {
	
}
