package com.tp2.incidentes.DAO;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.tp2.incidentes.modelos.Incidente;

public class IncidenteDbDAO extends AbstractJpaDAO<Incidente> {
	
	public IncidenteDbDAO() {
		setClazz(Incidente.class);
	}
	
	public void actualizarEstadoIncidente(int idIncidente, String estado) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        Query query = entityManager.createQuery("UPDATE Cliente c SET c.estado = :estado WHERE c.idIncidente = :idIncidente");
        query.setParameter("estado", estado);
        query.setParameter("idIncidente", idIncidente);

        int filasActualizadas = query.executeUpdate();

        tx.commit();
    }

}
