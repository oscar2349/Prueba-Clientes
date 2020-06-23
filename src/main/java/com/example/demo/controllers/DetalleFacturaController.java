package com.example.demo.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.service.ICliente;
import com.example.demo.service.IDetalleFactura;



@Controller
@SessionAttributes("DetalleFactura")
public class DetalleFacturaController {
	
	@Autowired
	IDetalleFactura DetalleFactura;
	
	@GetMapping({ "/DetalleFacturas" })
	public String DetalleFacturas(Model model) {
		model.addAttribute("titulo", "Detalle Facturas");
		model.addAttribute("Listado", DetalleFactura.findall());
		return "DetalleFactura";

	}
	
	@GetMapping({ "/DetalleFacturas/{id}"})
	public String Detalle(@PathVariable(value = "id") Integer id, Map<String, Object> model) {
		model.put("titulo", "Detalle");
		model.put("Listado", DetalleFactura.findbyId(id));
		return "DetalleFactura";
	}

}
