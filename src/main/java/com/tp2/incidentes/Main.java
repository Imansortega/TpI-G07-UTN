package com.tp2.incidentes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;
import com.tp2.incidentes.modelos.Empleado;
import com.tp2.incidentes.modelos.Tecnico;
import com.tp2.incidentes.modelos.Cliente;

public class Main {

	public static void main(String[] args) {
		// Crear el EntityManagerFactory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miPersistencia");

		// Crear el EntityManager
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		// Ejemplo de consulta
		List<Empleado> empleados = em.createQuery("FROM Empleado", Empleado.class).getResultList();
		for (Empleado empleado : empleados) {
			System.out.println("ID: " + empleado.getId() + ", Apellidos: " + empleado.getApellidos() + ", Nombre: "
					+ empleado.getNombre() + ", Fecha de Nacimiento: " + empleado.getFechaNacimiento());
		}
		System.out.println("******************************************");

		// Consulta JPQL para obtener el nombre de los empleados con nombre "Ignacio"
		String jpql = "SELECT e.nombre FROM Empleado e WHERE e.nombre = :nombre";
		TypedQuery<String> query = em.createQuery(jpql, String.class);
		query.setParameter("nombre", "Ignacio");
		List<String> nombres = query.getResultList();

		System.out.println("Empleados con nombre 'Ignacio':");
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		System.out.println("******************************************");

		// Consulta JPQL para obtener un empleado por ID
		int idBuscado = 4;
		String jpql1 = "SELECT e FROM Empleado e WHERE e.id = :id";
		TypedQuery<Empleado> query1 = em.createQuery(jpql1, Empleado.class);
		query1.setParameter("id", idBuscado);
		List<Empleado> empleados1 = query1.getResultList();

		System.out.println("Empleados con ID " + idBuscado + ":");
		for (Empleado empleado : empleados1) {
			System.out.println("ID: " + empleado.getId() + ", Apellidos: " + empleado.getApellidos() + ", Nombre: "
					+ empleado.getNombre() + ", Fecha de Nacimiento: " + empleado.getFechaNacimiento());
		}
		System.out.println("******************************************");

		// Consulta JPQL para obtener un empleado por ID en clientes !!!
		int idBuscado1 = 1;
		String jpql2 = "SELECT e FROM Cliente e WHERE e.id = :idCliente";
		TypedQuery<Cliente> query2 = em.createQuery(jpql2, Cliente.class);
		query2.setParameter("idCliente", idBuscado1);
		List<Cliente> empleados2 = query2.getResultList();

		System.out.println("Empleados con ID " + idBuscado1 + ":");
		for (Cliente empleado : empleados2) {
			System.out.println("ID: " + empleado.getIdCliente() + ", Apellidos: " + empleado.getRazonSocial()
					+ ", Nombre: " + empleado.isEstado() + ", Fecha de Nacimiento: " + empleado.getTelefono());
		}
		System.out.println("******************************************");
		
		List<Tecnico> empleados3 = em.createQuery("FROM Tecnico", Tecnico.class).getResultList();
		for (Tecnico empleado : empleados3) {
			System.out.println("ID: " + empleado.getIdTecnico() + ", Apellidos: " + empleado.getApellido() + ", Nombre: "
					+ empleado.getNombre() + ", Fecha de Nacimiento: ");
		}

		em.getTransaction().commit();

		// Cerrar el EntityManager y el EntityManagerFactory
		em.close();
		emf.close();
	}
}
