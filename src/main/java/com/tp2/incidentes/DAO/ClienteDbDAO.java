package com.tp2.incidentes.DAO;

import com.tp2.incidentes.modelos.Cliente;

public class ClienteDbDAO extends AbstractJpaDAO<Cliente> {
	
	public ClienteDbDAO() {
		setClazz(Cliente.class);
	}

}
