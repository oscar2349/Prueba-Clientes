package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.service.IArticulos;
import com.example.demo.service.ICliente;
import com.example.demo.service.IFactura;
import com.example.demo.service.IProveedor;
import com.example.demo.Entity.*;

@Controller
@SessionAttributes("Factura")
public class FacturaController {

	@Autowired
	IFactura Factura;

	@Autowired
	ICliente ICliente;
	
	@Autowired
	IProveedor Iproveedor;
	
	@Autowired
	IArticulos IArticulos;
		

	@GetMapping({ "/Factura" })
	public String Facturas(Model model) {
		model.addAttribute("titulo", "Factura");
		model.addAttribute("Listado",Factura.findall());
		return "Factura";

	}

	/* ====================Metodo Crear================== */
	@GetMapping(value = "/Factura/Crear")
	public String crear(Map<String, Object> model) {

		Ingreso ingreso = new Ingreso();
		model.put("Ingreso", ingreso);
		model.put("titulo", "Factura");
		return "form";
	}

	/* ====================Metodo Guardar================== */
	
	@RequestMapping(value = "/crear/factura", method = RequestMethod.POST)
	
	public String guardar(Ingreso Ingreso, Model model) {
		Factura factura = new Factura();
		factura.setNumeroFactura(123);
		
		Cliente cliente = ICliente.findOne(1);
		Articulo articulo = new Articulo();
		
				
		Proveedor proveedor= Iproveedor.findbyId(1);
		
		articulo.setProveedorcifProveedor(proveedor);
		articulo.setCaracteristicas("Vaso mesa");
		articulo.setCodArticulo(1);
		articulo.setNombreArticulo("Decoracion");
		
		List<Articulo> listarticulos= new ArrayList<>();
		listarticulos.add(articulo);
			
		
		
		DetalleFactura detallefactura= new DetalleFactura();
		
	
		
		detallefactura.setArticulocodArticulo(articulo);
		detallefactura.setFacturanumeroFactura(factura);
		detallefactura.setPorcentajeGanancia("200");
		detallefactura.setCantidad("400");
		List<DetalleFactura>Listdetalle= new ArrayList();
		Listdetalle.add(detallefactura);
	
		factura.setClienteCifCliente(cliente);
		factura.setFechaFactura(new Date());
		factura.setDetalleFacturaList(Listdetalle);
		
	
		
		Factura.save(factura);
		
		
		return "redirect:../";

	}

}
