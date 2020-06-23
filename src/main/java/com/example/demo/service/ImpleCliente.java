package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.Entity.Cliente;
import com.example.demo.dao.ICrudCliente;

@Service
public class ImpleCliente implements ICliente {

	@Autowired
	ICrudCliente CrudCliente;

	@Override
	@Transactional
	public List<Cliente> findall() {

		return (List<Cliente>) CrudCliente.findAll();
	}

	@Override
	public Cliente findOne(Integer id) {
		return CrudCliente.findById(id).orElse(null);
	}

	@Override
	public void save(Cliente cliente) {
		CrudCliente.save(cliente);
	}

}
