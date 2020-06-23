package com.example.demo.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.service.ICliente;



@Controller
@SessionAttributes("Cliente")
public class ClienteController {

	@Autowired
	ICliente FacturaPrueba;

	@GetMapping({ "/listadoClientes" })
	public String Listar(Model model) {
		model.addAttribute("titulo", "Listado de Clientes");
		model.addAttribute("Listado", FacturaPrueba.findall());
		return "listado";

	}
	
	@GetMapping({ "/listadoClientes/{id}"})
	public String Proveedores(@PathVariable(value = "id") Integer id, Map<String, Object> model) {
		model.put("titulo", "Clientes");
		model.put("Listado", FacturaPrueba.findOne(id));
		return "listado";
	}
	


}
