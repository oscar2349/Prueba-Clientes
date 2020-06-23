package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.Cliente;
import com.example.demo.Entity.Factura;

public interface ICliente {
	
	public List<Cliente> findall();
	
	public Cliente findOne(Integer id);
	
	public void save(Cliente cliente);


}
