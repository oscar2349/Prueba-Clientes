package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Entity.DetalleFactura;
import com.example.demo.Entity.Factura;
import com.example.demo.dao.ICrudDetalleFactura;
import com.example.demo.dao.ICrudFactura;

@Service
public class ImpleDetalleFactura implements IDetalleFactura {

	@Autowired
	ICrudDetalleFactura CrudDetalleFactura;

	@Override
	@Transactional
	public List<DetalleFactura> findall() {

		return (List<DetalleFactura>) CrudDetalleFactura.findAll();

	}

	@Override
	public DetalleFactura findbyId(Integer id) {

		return CrudDetalleFactura.findById(id).orElse(null);
	}

}
