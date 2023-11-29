package com.tp2.incidentes.services;

import java.util.Collection;
import java.util.List;

import com.tp2.incidentes.DAO.ClienteMemDAO;
import com.tp2.incidentes.DAO.ClienteDbDAO;
import com.tp2.incidentes.modelos.Cliente;

public class ClienteMemService {
	
	private Cliente miCliente = new Cliente();

	private ClienteMemDAO miclienteDAO = new ClienteMemDAO();
	

	public void save() {
		miclienteDAO.save(miCliente);
		Cliente cliente = new Cliente();
	}

	public Collection<Cliente> getAllClientes() {
		return miclienteDAO.getAll();
	}

	public int saveCliente(Cliente cliente) {
		//System.out.println(cliente.getRazonSocial() + " @ ClienteService, saveClient");
		validate(cliente);
		return miclienteDAO.save(cliente);
	}

	public void updateCliente(Cliente cliente) {

		miclienteDAO.update(cliente);
	}

	private void validate(Cliente cliente) {
		// TODO Details omitted
	}

	public Cliente getCliente() {
		return miCliente;
	}
	
}
