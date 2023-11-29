package com.tp2.incidentes.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.tp2.incidentes.Main;
import com.tp2.incidentes.modelos.*;
import com.tp2.incidentes.services.*;


public class PruebaController {

	public void unMetodo(Cliente unCliente) {
		
		ClienteMemService miClienteService = new ClienteMemService();
		
		miClienteService.getAllClientes();
		
		//unEmpleado.setNombre("Nahuel");
		
		//empleadoService.create(unEmpleado);
		
		


		//DireccionService direccionService = new DireccionService();
		
		//direccionService.saveDireccion(new Direccion());
				
	}
	
	
}