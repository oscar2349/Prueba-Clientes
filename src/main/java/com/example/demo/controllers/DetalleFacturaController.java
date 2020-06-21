package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;



@Controller
@SessionAttributes("DetalleFactura")
public class DetalleFacturaController {
	
	@GetMapping({ "/DetalleFacturas" })
	public String DetalleFacturas(Model model) {
		model.addAttribute("titulo", "Detalle Facturas");
		return "DetalleFactura";

	}

}
