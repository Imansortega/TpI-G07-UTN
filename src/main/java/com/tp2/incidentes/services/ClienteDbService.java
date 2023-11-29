package com.tp2.incidentes.services;

import java.util.Collection;
import java.util.List;

import com.tp2.incidentes.DAO.ClienteDbDAO;
import com.tp2.incidentes.DAO.ClienteMemDAO;
import com.tp2.incidentes.modelos.Cliente;

public class ClienteDbService {
	private Cliente miCliente = new Cliente();
	private ClienteDbDAO miClienteDbDAO = new ClienteDbDAO();

	public Cliente findOne(int id) {
		return miClienteDbDAO.findOne(id);
	}

	public List<Cliente> findAll() {
		return miClienteDbDAO.findAll();
	}

	/*
	 * public List<Cliente> clientesBaseAll() {
	 * 
	 * return miClienteDbDAO.findAll(); }
	 */
	
	public void create(Cliente entity) {
		miClienteDbDAO.create(entity);
	}
	
	public void update(Cliente cliente) {

		miClienteDbDAO.update(cliente);
	}
	
	public void delete(Cliente cliente) {

		miClienteDbDAO.update(cliente);
	}
	
	public void actualizarRazonSocial(int idCliente, String nuevaRazonSocial) {

		miClienteDbDAO.actualizarRazonSocial(idCliente, nuevaRazonSocial);
	}

	private void validate(Cliente cliente) {
		// TODO Details omitted
	}

}
