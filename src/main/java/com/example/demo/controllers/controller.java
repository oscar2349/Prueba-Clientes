package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.service.IFactura_Prueba;


@Controller
@SessionAttributes("Cliente")
public class controller {
	
	@Autowired
	IFactura_Prueba FacturaPrueba;
	
	@GetMapping({ "/", "/listado" })
	public String Listar(Model model) {
		model.addAttribute("titulo", "Listado de Productos");
		model.addAttribute("Listado", FacturaPrueba.findall());
			
		return "listado";

	}

	
	
}
