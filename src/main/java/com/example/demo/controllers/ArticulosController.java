package com.example.demo.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.service.IArticulos;
import com.example.demo.service.ICliente;

@Controller
@SessionAttributes("Articulo")

public class ArticulosController {
	
	@Autowired
	IArticulos Articulos;
	
	@GetMapping({ "/Articulos" })
	public String Articulos(Model model) {
		model.addAttribute("titulo", "Listado de Articulos");
		model.addAttribute("Listado", Articulos.findall());
		return "Articulos";

	}
	
	@GetMapping({ "/Articulos/{id}"})
	public String Proveedores(@PathVariable(value = "id") Integer id, Map<String, Object> model) {
		model.put("titulo", "Articulos");
		model.put("Listado", Articulos.findOne(id));
		return "Proveedores";
	}


}
