package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("Proveedor")
public class ProveedoresController {
	
	@GetMapping({ "/Proveedores" })
	public String Proveedores(Model model) {
		model.addAttribute("titulo", "Proveedores");
		return "Proveedores";

	}

}
