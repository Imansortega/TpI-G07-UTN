package com.tp2.incidentes.controllers;

import com.tp2.incidentes.modelos.Tecnico;
import com.tp2.incidentes.services.TecnicoDbService;

public class VerDatosTecnico {

	public void datosTecnico() {

		TecnicoDbService miTecnicoDbServ = new TecnicoDbService();

		// Impresion contenido Db
		for (Tecnico tempo : miTecnicoDbServ.findAll()) {
			System.out.println("idTecnico: " + tempo.getIdTecnico()
			+ " - Apellido: " + tempo.getApellido());
		}

	}

}
