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

	@GetMapping({ "/listadoClientes" })
	public String Listar(Model model) {
		model.addAttribute("titulo", "Listado de Clientes");
		model.addAttribute("Listado", FacturaPrueba.findall());

		return "listado";

	}

	@GetMapping({ "/Articulos" })
	public String Articulos(Model model) {
		model.addAttribute("titulo", "Listado de Articulos");
		return "Articulos";

	}

	@GetMapping({ "/DetalleFacturas" })
	public String DetalleFacturas(Model model) {
		model.addAttribute("titulo", "Detalle Facturas");
		return "DetalleFactura";

	}

	@GetMapping({ "/Factura" })
	public String Facturas(Model model) {
		model.addAttribute("titulo", "Factura");
		return "Factura";

	}

	@GetMapping({ "/Proveedores" })
	public String Proveedores(Model model) {
		model.addAttribute("titulo", "Proveedores");
		return "Proveedores";

	}

}
