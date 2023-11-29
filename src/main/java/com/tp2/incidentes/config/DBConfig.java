package com.tp2.incidentes.config;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBConfig {

	static EntityManagerFactory factory = null;
	
	public static EntityManager getEntityManager(){
		if(factory == null)
			factory = Persistence.createEntityManagerFactory("miPersistencia");
		EntityManager manager = factory.createEntityManager();
		return manager;
	}
}