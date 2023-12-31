package com.tp2.incidentes.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.tp2.incidentes.config.*;


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
	   
	}