package com.tp2.incidentes;

import com.tp2.incidentes.services.ClienteDbService;
import com.tp2.incidentes.services.ClienteMemService;
import com.tp2.incidentes.modelos.Cliente;

public class Main {

	public static void main(String[] args) {
		
		// Alta clientes
		Cliente newClient = new Cliente("Lo de Pelos", 1187824334);
		Cliente newClient1 = new Cliente("Almacen de Lele", 171812102);
		
		// Instancio los servicios
		ClienteDbService miClienteDbServ = new ClienteDbService();
		ClienteMemService miClienteMemServ = new ClienteMemService();
		
		// Save y update a mem en instancia Cliente de ClientememService
		miClienteMemServ.saveCliente(newClient);
		miClienteMemServ.updateCliente(newClient);	
		miClienteMemServ.saveCliente(newClient1);
		miClienteMemServ.updateCliente(newClient1);
		
		// Save y update a Db
		//miClienteDbServ.update(newClient); 
		//miClienteDbServ.update(newClient1);
		miClienteDbServ.actualizarRazonSocial(1,"Almacen de Lelu");
		
		// Impresion contenido instancia Cliente en mem
		for (Cliente tempo : miClienteMemServ.getAllClientes()) {
			System.out.println("@ Main, Razón Social: " + tempo.getRazonSocial());
		}		
		
		// Impresion contenido Db
		for (Cliente tempo : miClienteDbServ.findAll()) {
			System.out.println("@ Main, Razón Social: " + tempo.getRazonSocial());
		}
	
	}
}



// -------------------------------------------------------
/*
 * EntityTransaction tx = em.getTransaction(); tx.begin();
 * 
 * em.persist(new Cliente(7,"Matias",888765)); tx.commit();
 */

/*
 * Cliente miCliente = new Cliente(); 
 * miCliente.setIdCliente(6);
 * miCliente.setRazonSocial("El Ukraniano Borracho"); 
 * miCliente.setCuit(123321);
 * em.getTransaction().begin(); 
 * 
 * em.merge(miCliente);
 * em.getTransaction().commit();
 */