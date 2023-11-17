package com.tp2.incidentes.modelos;

import java.util.List;

import javax.persistence.*;

import com.tp2.incidentes.modelos.*;

@Entity
@Table(name = "cliente") 
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 11)
	private int idCliente;

	@Column(length = 60)
	private String razonSocial;

	@Column(length = 11)
	private int cuit;

	@Column(length = 60)
	private String servicioContratado;

	@Column(length = 60)
	private String direccion;

	@Column(length = 20)
	private String telefono;

	@Column(length = 60)
	private String email;

	@Column(length = 1)
	private boolean estado;
	
	public int getIdCliente() {
		return idCliente;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public int getCuit() {
		return cuit;
	}

	public String getServicioContratado() {
		return servicioContratado;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getEmail() {
		return email;
	}

	public boolean isEstado() {
		return estado;
	}

	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	public void setServicioContratado(String servicioContratado) {
		this.servicioContratado = servicioContratado;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	/*
	 * METODOS
	*/
	
	// Obtiene la lista de servicios contratados por el cliente.
	public List<Servicio> obtenerServiciosContratados() {
		
	} 
	
	// Permite al cliente reportar un nuevo incidente.
	public void reportarIncidente(Servicio servicio,  tipoincidente tempo, String descripcion) {
		
	} 
	
	// Obtiene la lista de incidentes reportados por el cliente.
	public List<Incidente> obtenerIncidentesReportados() {
		
		return null;
	} 
	
	// Permite al operador actualizar sus datos registrados.
	public void actualizarDatos(String nuevaRazonSocial, String nuevoCuit) {
		
	} 
	
	// Devuelve una cadena con detalles importantes del cliente para mostrar o registrar.
	public String obtenerDetalles() {
		
		return null;
	} 
	
	// Permite al operador agregar un nuevo servicio contratado.
	public void agregarServicioContratado(Servicio nuevoServicio) {
		
	} 
	
	// Permite al operador eliminar un servicio contratado.
	public void eliminarServicioContratado(Servicio servicio) {
		
	} 
	
	// Obtiene el estado de los incidentes reportados por el cliente (por ejemplo, si alguno está pendiente, resuelto, etc.).
	public EstadoCliente obtenerEstadoIncidentes() {
		
	} 
	
	// Obtiene la lista de notificaciones enviadas al cliente.
	public List<Notificacion> obtenerNotificaciones() {
		
	} 
	
	// Obtiene el último incidente reportado por el cliente.
	public Incidente obtenerUltimoIncidenteReportado() {
		
	} 
	
}
