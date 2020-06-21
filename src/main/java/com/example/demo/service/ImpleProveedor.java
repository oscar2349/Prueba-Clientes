package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.Entity.Articulo;
import com.example.demo.Entity.Proveedor;
import com.example.demo.dao.ICrudArticulos;
import com.example.demo.dao.ICrudProveedor;

@Service
public class ImpleProveedor implements IProveedor {

	@Autowired
	ICrudProveedor CrudProveedor;

	@Override
	@Transactional
	public List<Proveedor> findall() {
		
		return (List<Proveedor>) CrudProveedor.findAll();
		
		
	}

	
}
