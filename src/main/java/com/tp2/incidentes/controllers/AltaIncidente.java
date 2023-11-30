package com.tp2.incidentes.controllers;

import com.tp2.incidentes.modelos.Incidente;
//import com.tp2.incidentes.services.ClienteDbService;
import com.tp2.incidentes.services.IncidenteDbService;

public class AltaIncidente {

	public void altaDeUnIncidente(Incidente incidente) {		
		IncidenteDbService darAltaIncidente = new IncidenteDbService();
		darAltaIncidente.update(incidente);
		
	}
}
