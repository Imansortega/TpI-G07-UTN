package com.tp2.incidentes;

import com.tp2.incidentes.services.ClienteDbService;
import com.tp2.incidentes.services.ClienteMemService;
import com.tp2.incidentes.modelos.Cliente;

public class Main {

	public static void main(String[] args) {
		
		// Alta clientes
		Cliente newClient = new Cliente("Lo de Pelos", 1187824334);
		Cliente newClient1 = new Cliente("Almacen de Pepito", 1718147102);
		
		// Instancio los servicios
		ClienteDbService miClienteDbServ = new ClienteDbService();
		ClienteMemService miClienteMemServ = new ClienteMemService();
		
		// Save y update a mem en instancia Cliente de ClientememService
		miClienteMemServ.saveCliente(newClient);
		miClienteMemServ.updateCliente(newClient);	
		miClienteMemServ.saveCliente(newClient1);
		miClienteMemServ.updateCliente(newClient1);
		
		// Save y update a Db. Usar para crear nuevos registros solamente
		//miClienteDbServ.update(newClient); 
		//miClienteDbServ.update(newClient1);
		
		// Este lo pueden usar para actualizar la Razón Social
		miClienteDbServ.actualizarRazonSocial(22,"Piripipi Guazú");
		
		// Impresion contenido instancia Cliente en mem
		for (Cliente tempo : miClienteMemServ.getAllClientes()) {
			System.out.println("@ Main, Razón Social: " + tempo.getRazonSocial());
		}		
		
		System.out.println("#######################################");
		
		// Impresion contenido Db
		for (Cliente tempo : miClienteDbServ.findAll()) {
			System.out.println("@ Main, Razón Social: " + tempo.getRazonSocial());
		}
	
	}
}
