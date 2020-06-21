package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Cliente;

public interface ICrudCliente extends CrudRepository <Cliente,Integer> {
	

}
