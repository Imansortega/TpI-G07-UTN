package com.tp2.incidentes.services;

import java.util.Collection;
import java.util.List;

import com.tp2.incidentes.DAO.TecnicoDbDAO;
import com.tp2.incidentes.DAO.ClienteMemDAO;
import com.tp2.incidentes.DAO.IncidenteDbDAO;
import com.tp2.incidentes.modelos.Cliente;
import com.tp2.incidentes.modelos.Incidente;

public class IncidenteDbService {
	//private Cliente miCliente = new Cliente();
	private IncidenteDbDAO miIncidenteDbDAO = new IncidenteDbDAO();

	public Incidente findOne(int id) {
		return miIncidenteDbDAO.findOne(id);
	}

	public List<Incidente> findAll() {
		return miIncidenteDbDAO.findAll();
	}

	/*
	 * public List<Cliente> clientesBaseAll() {
	 * 
	 * return miClienteDbDAO.findAll(); }
	 */
	
	public void create(Incidente entity) {
		miIncidenteDbDAO.create(entity);
	}
	
	public void update(Incidente entity) {

		miIncidenteDbDAO.update(entity);
	}
	
	public void delete(Incidente entity) {

		miIncidenteDbDAO.update(entity);
	}
	
	public void actualizarEstadoIncidente(int idIncidente, String estado) {

		miIncidenteDbDAO.actualizarEstadoIncidente(idIncidente, estado);
	}

	private void validate(Cliente cliente) {
		// TODO Details omitted
	}

}
