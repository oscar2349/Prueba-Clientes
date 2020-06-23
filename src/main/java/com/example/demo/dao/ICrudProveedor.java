package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Proveedor;

public interface ICrudProveedor extends CrudRepository <Proveedor,Integer> {

	
}
