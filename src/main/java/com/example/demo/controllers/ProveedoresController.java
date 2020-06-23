package com.example.demo.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.example.demo.service.IProveedor;

@Controller
@SessionAttributes("Proveedor")
public class ProveedoresController {
	
	@Autowired
	IProveedor IProveedor;
	
	@GetMapping({ "/Proveedores/{id}"})
	public String Proveedores(@PathVariable(value = "id") Integer id, Map<String, Object> model) {
		model.put("titulo", "Proveedores");
		//model.addAttribute("Listado", IProveedor.findall());
		model.put("Listado", IProveedor.findbyId(id));
		return "Proveedores";
	}
	
	@GetMapping({ "/Proveedores"})
	public String Proveedores(Map<String, Object> model) {
		model.put("titulo", "Proveedores");
		model.put("Listado", IProveedor.findall());
		return "Proveedores";
	}

}
