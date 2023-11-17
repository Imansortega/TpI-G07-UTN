package com.tp2.incidentes.modelos;

import java.time.Instant;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import com.tp2.incidentes.modelos.*;

@Entity
@Table(name = "cliente") 
public class Operador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 11)
	private int idOperador;

	@Column(length = 11)
	int idTecnico;

	@Column(length = 11)
	private int idIncidente;

	@Column(length = 60)
	private Instant tiempoEstimadoResolucion;

	@Column(length = 60)
	private Instant ampliacionTiempoResolucion;

	@Column(length = 1)
	private boolean estado;

	public int getIdOperador() {
		return idOperador;
	}

	public void setIdOperador(int idOperador) {
		this.idOperador = idOperador;
	}

	public int getIdTecnico() { return idTecnico; }
	 
	public void setIdTecnico(int idTecnico) {
		this.idTecnico = idTecnico;
	}

	public int getIdIncidente() {
		return idIncidente;
	}

	public void setIdIncidente(int idIncidente) {
		this.idIncidente = idIncidente;
	}

	public Instant getTiempoEstimadoResolucion() {
		return tiempoEstimadoResolucion;
	}

	public void setTiempoEstimadoResolucion(Instant  tiempoEstimadoResolucion) {
		this.tiempoEstimadoResolucion = tiempoEstimadoResolucion;
	}

	public Instant getAmpliacionTiempoResolucion() {
		return ampliacionTiempoResolucion;
	}

	public void setAmpliacionTiempoResolucion(Instant ampliacionTiempoResolucion) {
		this.ampliacionTiempoResolucion = ampliacionTiempoResolucion;
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
	
	// Asigna un técnico al incidente registrado.
	void asignarTecnicoAIncidente(Incidente incidente, Tecnico tecnico) {
		
	} 
	
	// Obtiene una lista de técnicos disponibles para resolver un incidente específico.
	public List<Tecnico> obtenerTecnicosDisponibles(Servicio servicio, TipoProblema tipoProblema) {
		
	} 
	
	// Envia una notificación al cliente sobre el estado de su incidente.
	public void enviarNotificacionCliente(Cliente cliente, String mensaje) {
		
	} 
	
	// Permite al operador agregar un colchón de horas a la estimación de resolución de un incidente.
	public void agregarColchonHorasResolucion(Incidente incidente, int horasAdicionales) {
		
	} 
	
	// Genera y presenta reportes diarios de incidentes asignados a cada técnico.
	public void generarReportesDiariosIncidentesAsignados() {
		
	} 

	// Configura la estimación de resolución por defecto para un tipo de problema específico.
	public void configurarEstimacionResolucionPorDefecto(TipoProblema tipoProblema, int horasEstimadas) {
		
	} 
	
	// Obtiene un listado de clientes registrados en el sistema.
	public List<Cliente> obtenerListadoClientes() {
		
		return null;
	} 
	
	// Obtiene un listado de incidentes reportados por un cliente específico.
	public List<Incidente> obtenerIncidentesPorCliente(Cliente cliente) {
		
		return null;
	} 
	
	// Permite al operador registrar altas, bajas o modificaciones de técnicos en el sistema.
	public void gestionarAltaBajaModificacionTecnico(Tecnico tecnico, Operacion operacion) {
		
	} 

}
