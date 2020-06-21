package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("Factura")
public class FacturaController {
	
	@GetMapping({ "/Factura" })
	public String Facturas(Model model) {
		model.addAttribute("titulo", "Factura");
		return "Factura";

	}

}
