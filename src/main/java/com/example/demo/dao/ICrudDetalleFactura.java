package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Articulo;
import com.example.demo.Entity.DetalleFactura;

public interface ICrudDetalleFactura extends CrudRepository <DetalleFactura,Integer> {
	
}
