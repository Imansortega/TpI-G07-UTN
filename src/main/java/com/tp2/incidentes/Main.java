package com.tp2.incidentes;

import com.tp2.incidentes.services.ClienteDbService;
import com.tp2.incidentes.services.ClienteMemService;
import com.tp2.incidentes.vistas.MenuPrincipal;
import com.tp2.incidentes.controllers.ReporteDiario;
import com.tp2.incidentes.modelos.Cliente;
import com.tp2.incidentes.vistas.*;

public class Main {

	public static void main(String[] args) {
		
		ReporteDiario elReporteDelDia = new ReporteDiario();
		elReporteDelDia.generarReporte();
		
		MenuPrincipal miMenu = new MenuPrincipal();
		miMenu.elMenu();
		
	}
}


