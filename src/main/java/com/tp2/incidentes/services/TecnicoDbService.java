package com.tp2.incidentes.services;

import java.util.Collection;
import java.util.List;

import com.tp2.incidentes.DAO.TecnicoDbDAO;
import com.tp2.incidentes.modelos.Tecnico;

public class TecnicoDbService {
	private Tecnico miTecnico = new Tecnico();
	private TecnicoDbDAO miTecnicoDbDAO = new TecnicoDbDAO();

	public Tecnico findOne(int id) {
		return miTecnicoDbDAO.findOne(id);
	}

	public List<Tecnico> findAll() {
		return miTecnicoDbDAO.findAll();
	}

	/*
	 * public List<Tecnico> TecnicosBaseAll() {
	 * 
	 * return miTecnicoDbDAO.findAll(); }
	 */
	
	public void create(Tecnico entity) {
		miTecnicoDbDAO.create(entity);
	}
	
	public void update(Tecnico Tecnico) {

		miTecnicoDbDAO.update(Tecnico);
	}
	
	public void delete(Tecnico Tecnico) {

		miTecnicoDbDAO.delete(Tecnico);
	}
	
	public void actualizarApellido(int idTecnico, String apellido) {

		miTecnicoDbDAO.actualizarApellido(idTecnico, apellido);
	}

	private void validate(Tecnico Tecnico) {
		// TODO Details omitted
	}

}
