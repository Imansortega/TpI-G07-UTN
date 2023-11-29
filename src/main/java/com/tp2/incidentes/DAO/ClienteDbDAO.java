package com.tp2.incidentes.DAO;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.tp2.incidentes.modelos.Cliente;

public class ClienteDbDAO extends AbstractJpaDAO<Cliente> {
	
	public ClienteDbDAO() {
		setClazz(Cliente.class);
	}
	
	public void actualizarRazonSocial(int idCliente, String nuevaRazonSocial) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        Query query = entityManager.createQuery("UPDATE Cliente c SET c.razonSocial = :nuevaRazonSocial WHERE c.idCliente = :idCliente");
        query.setParameter("nuevaRazonSocial", nuevaRazonSocial);
        query.setParameter("idCliente", idCliente);

        int filasActualizadas = query.executeUpdate();

        tx.commit();
    }

}
