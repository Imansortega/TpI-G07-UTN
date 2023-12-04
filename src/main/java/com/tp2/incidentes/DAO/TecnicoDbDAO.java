package com.tp2.incidentes.DAO;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.tp2.incidentes.modelos.Tecnico;

public class TecnicoDbDAO extends AbstractJpaDAO<Tecnico> {
	
	public TecnicoDbDAO() {
		setClazz(Tecnico.class);
	}
	
	public void actualizarApellido(int idTecnico, String apellido) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        Query query = entityManager.createQuery("UPDATE Tecnico c SET c.razonSocial = :nuevaRazonSocial WHERE c.idTecnico = :idTecnico");
        query.setParameter("nuevaRazonSocial", apellido);
        query.setParameter("idTecnico", idTecnico);

        int filasActualizadas = query.executeUpdate();

        tx.commit();
    }

}
