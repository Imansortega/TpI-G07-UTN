package com.tp2.incidentes.modelos;

import java.util.List;

import javax.persistence.*;

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

	// Obtiene la lista de incidentes actualmente asignados al técnico.
	public List<Incidente> obtenerIncidentesAsignados() {
		return null;
	}

	/*
	 * public void marcarIncidenteComoResuelto(Incidente incidente, String
	 * comentarios){} //Marca un incidente como resuelto y proporciona comentarios
	 * sobre la resolución.
	 * 
	 * public void configurarMedioNotificacionPreferido(MedioNotificacion medio){}
	 * //Configura el medio de notificación preferido (por ejemplo, Email o
	 * WhatsApp) para el técnico.
	 * 
	 * public Estadisticas obtenerEstadisticasDesempeno(int dias){} //Obtiene
	 * estadísticas de desempeño del técnico para los últimos N días.
	 * 
	 * public List<Especialidad> obtenerEspecialidades(){} //Obtiene la lista de
	 * especialidades que tiene el técnico.
	 * 
	 * public void configurarTiempoEstimadoPorDefecto(TipoProblema tipoProblema, int
	 * tiempoEstimado){} //Configura el tiempo estimado de resolución por defecto
	 * para un tipo de problema específico.
	 * 
	 * public int obtenerTiempoEstimadoProblema(TipoProblema tipoProblema){}
	 * //Obtiene el tiempo estimado de resolución configurado para un tipo de
	 * problema específico.
	 * 
	 * public List<Notificacion> obtenerNotificacionesPendientes(){} //Obtiene la
	 * lista de notificaciones pendientes para el técnico.
	 * 
	 * public void registrarDisponibilidad(HorarioDisponibilidad horario){}
	 * //Registra la disponibilidad del técnico para asignación de incidentes.
	 */}
