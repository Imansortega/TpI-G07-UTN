package com.tp2.incidentes.modelos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.tp2.incidentes.modelos.*;
import com.tp2.incidentes.tempo.*;

@Entity
@Table(name = "tecnico") 
public class Tecnico implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 11)
	private int idTecnico;

	@Column(length = 11)
	private int idIncidente;

	@Column(length = 60)
	private String nombre;

	@Column(length = 100)
	private String apellido;

	@Column(length = 11)
	private int numeroLegajo;

	@Column(length = 100)
	private String especialidad;

	@Column(length = 60)
	private String resolucion;

	@Column(length = 1)
	private boolean estado;

	public int getIdTecnico() {
		return idTecnico;
	}

	public void setIdTecnico(int idTecnico) {
		this.idTecnico = idTecnico;
	}

	public int getIdIncidente() {
		return idIncidente;
	}

	public void setIdIncidente(int idIncidente) {
		this.idIncidente = idIncidente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumeroLegajo() {
		return numeroLegajo;
	}

	public void setNumeroLegajo(int numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	/*
	 * METODOS
	*/
	
	// Obtiene la lista de incidentes actualmente asignados al técnico.
	public List<Incidente> obtenerIncidentesAsignados() {
		
		return null;
	} 
	
	// Marca un incidente como resuelto y proporciona comentarios sobre la resolución.
	public void marcarIncidenteComoResuelto(Incidente incidente, String comentarios) {} 
	
	// Configura el medio de notificación preferido (por ejemplo, Email o WhatsApp) para el técnico.
	public void configurarMedioNotificacionPreferido(MedioNotificacion medio) {
		
	} 
	
	// Obtiene estadísticas de desempeño del técnico para los últimos N días.
	public Estadisticas obtenerEstadisticasDesempeno(int dias) {
		
		return null;
	} 
	
	// Obtiene la lista de especialidades que tiene el técnico.
	public List<Especialidad> obtenerEspecialidades() {
		
		return null;
	} 
	
	// Configura el tiempo estimado de resolución por defecto para un tipo de problema específico.
	public void configurarTiempoEstimadoPorDefecto(TipoProblema tipoProblema, int tiempoEstimado) {
		
	} 

	// Obtiene el tiempo estimado de resolución configurado para un tipo de problema específico.
	public int obtenerTiempoEstimadoProblema(TipoProblema tipoProblema) {
		
		return 0 ;
	} 

	// Obtiene la lista de notificaciones pendientes para el técnico.
	public List<Notificacion> obtenerNotificacionesPendientes() {
		
		return null;
	} 

	// Registra la disponibilidad del técnico para asignación de incidentes.
	public void registrarDisponibilidad(HorarioDisponibilidad horario) {
		
	} 
	
}
