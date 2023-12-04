package com.tp2.incidentes.controllers;

import java.util.Scanner;

import com.tp2.incidentes.modelos.Incidente;
//import com.tp2.incidentes.services.ClienteDbService;
import com.tp2.incidentes.services.IncidenteDbService;

public class AltaIncidente {

	public void altaDeUnIncidente(Incidente incidente) {
		IncidenteDbService darAltaIncidente = new IncidenteDbService();
		darAltaIncidente.update(incidente);

	}

	public Incidente escanearIncidente(Scanner scanner) {
		Incidente escanIncidente = new Incidente();

		System.out.print("Ingrese el idIncidente: ");    
		escanIncidente.setIdIncidente(scanner.nextInt());
		scanner.nextLine();
		
		System.out.print("Ingrese el nombre de Tecnico: ");
		escanIncidente.setIdTecnico(scanner.nextInt());
		scanner.nextLine();
		
		System.out.print("Ingrese el idCliente: ");
		escanIncidente.setIdCliente(scanner.nextInt());
		scanner.nextLine();
		
		System.out.print("Ingrese el tipo de Incidente: ");
		escanIncidente.setTipoIncidente(scanner.nextLine());
		scanner.nextLine();
		
		System.out.print("Ingrese la descripcion del incidente: ");
		escanIncidente.setDescripcionIncidente(scanner.nextLine());
		scanner.nextLine();
		
		System.out.print("Fecha apertura \"YYYY-MM-DD\": ");
		escanIncidente.setFechaApertura(scanner.nextLine());
		scanner.nextLine();
		
		
		System.out.print("Fecha cierre \"YYYY-MM-DD\": ");
		escanIncidente.setFechaCierre(scanner.nextLine());
		scanner.nextLine();
		
		System.out.print("Estado del incidente: ");
		boolean tmp = Boolean.parseBoolean(scanner.nextLine());
		escanIncidente.setEstado(tmp);
		scanner.nextLine();
		
		
		System.out.print(escanIncidente.toString());

		return escanIncidente;
	}
}
