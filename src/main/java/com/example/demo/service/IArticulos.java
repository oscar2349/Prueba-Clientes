package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.Articulo;
import com.example.demo.Entity.Cliente;

public interface IArticulos {
	
	public List<Articulo> findall();
	
	public Articulo findOne(Integer id);


}
