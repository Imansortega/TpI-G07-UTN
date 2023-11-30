package com.tp2.incidentes.controllers;

import com.tp2.incidentes.modelos.Cliente;
import com.tp2.incidentes.services.ClienteDbService;

public class VerDatosCliente {

	public void datosCliente() {

		ClienteDbService miClienteDbServ = new ClienteDbService();

		// Impresion contenido Db
		for (Cliente tempo : miClienteDbServ.findAll()) {
			System.out.println("Razón Social: " + tempo.getRazonSocial()
			+ " - Cuit: " + tempo.getCuit() + " - Servicio: " + tempo.getServicioContratado());
		}

	}

}
