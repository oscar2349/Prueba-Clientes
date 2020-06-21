package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.Entity.Articulo;
import com.example.demo.dao.ICrudArticulos;

@Service
public class ImpleArticulos implements IArticulos {

	@Autowired
	ICrudArticulos CrudArticulo;

	@Override
	@Transactional
	public List<Articulo> findall() {
		
		return (List<Articulo>) CrudArticulo.findAll();
		
		
	}

	
}
