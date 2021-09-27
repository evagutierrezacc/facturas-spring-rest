package com.empresa.microservicios.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.microservicios.models.Factura;

@RestController
@RequestMapping("/facturas")
public class FacturaController {

	@PostMapping
	public String crearFactura(@RequestBody Factura factura) {
		
		//recuperar los datos de la factura
		
		System.out.println(factura.getConcepto());
		
		// Insertar la factura en la base de datos
		
		
		
		return "todo OK";
		
	}
	@GetMapping("/facturaId")
	public Factura recuperarFactura(@PathVariable String facturaId) {
		
		System.out.println(facturaId);
		
		
		//esto crea un nuevo objeto de la clase factura vacio
		
		Factura f = new Factura();
		f.setConcepto("Servicio");
		f.setImporte(2343);
		f.setCif("kjd73o");
		
		return f;
		
		
		
	}
	
	@DeleteMapping("/facturaId")
	public Factura borrarFactura(@PathVariable String facturaId) {
		
		System.out.println(facturaId);
		
		return "la operación se ha realizado con éxito";
	
}
}

