package com.tp2.incidentes.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.tp2.incidentes.config.*;

import com.tp2.incidentes.Main;

import com.tp2.incidentes.modelos.*;

public abstract class AbstractJpaDAO< T extends Serializable > {

	   private Class< T > clazz;

	   EntityManager entityManager = DBConfig.getEntityManager();
	   
	   public final void setClazz( Class< T > clazzToSet ){
		  this.clazz = clazzToSet;
	   }

	   public T findOne( int id ){
	      return entityManager.find( clazz, id );
	   }
	   public List< T > findAll(){
		   //System.out.println( "Abstract *** ---> " + clazz.getName());
	      return entityManager.createQuery( "from " + clazz.getName() )
	       .getResultList();
	      
	   }

	   public void create( T entity ){
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
		    entityManager.persist( entity );
		    tx.commit();
	   }

	   public T update( T entity ){
		   EntityTransaction tx = entityManager.getTransaction();
		   tx.begin();
		   T entityMerged = entityManager.merge( entity );
		   //System.out.println(entityMerged);
		   tx.commit();
		   return entityMerged;
	   }

	   public void delete( T entity ){
		  EntityTransaction tx = entityManager.getTransaction();
		  tx.begin();
		  entityManager.remove( entity );
	      tx.commit();
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