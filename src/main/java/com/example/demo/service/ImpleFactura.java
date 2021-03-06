package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.Entity.Factura;
import com.example.demo.dao.ICrudFactura;

@Service
public class ImpleFactura implements IFactura {

	@Autowired
	ICrudFactura CrudFactura;

	@Override
	@Transactional
	public List<Factura> findall() {
		
		return (List<Factura>) CrudFactura.findAll();
		
	}

	@Override
	public void save(Factura Factura) {
		CrudFactura.save(Factura);
		
	}

	@Override
	public Factura findOne(Integer id) {
		return CrudFactura.findById(id).orElse(null);
	}

	
}
