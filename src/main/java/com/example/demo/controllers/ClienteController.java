package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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


}
