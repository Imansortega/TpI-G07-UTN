package com.tp2.incidentes.modelos;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

import com.tp2.incidentes.modelos.*;
import com.tp2.incidentes.tempo.*;

@Entity
@Table(name = "incidentes")
public class Incidente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 11)
	private int idIncidente;
	
	@Column(length = 11)
	private int idTecnico;
	
	@Column(length = 11)
	private int idCliente;
	
	@Column(length = 60)
	private String tipoIncidente;

	@Column(length = 120)
	private String descripcionIncidente;
	
	@Column(length = 60)
	private Date fechaApertura;
	
	@Column(length = 60)
	private Date fechaCierre;
	
	@Column(length = 1)
	private boolean estado;

	public int getIdIncidente() {
		return idIncidente;
	}

	public void setIdIncidente(int idIncidente) {
		this.idIncidente = idIncidente;
	}

	public int getIdTecnico() {
		return idTecnico;
	}

	public void setIdTecnico(int idTecnico) {
		this.idTecnico = idTecnico;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getTipoIncidente() {
		return tipoIncidente;
	}

	public void setTipoIncidente(String tipoIncidente) {
		this.tipoIncidente = tipoIncidente;
	}

	public String getDescripcionIncidente() {
		return descripcionIncidente;
	}

	public void setDescripcionIncidente(String descripcionIncidente) {
		this.descripcionIncidente = descripcionIncidente;
	}

	public Date getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public Date getFechaCierre() {
		return fechaCierre;
	}

	public void setFechaCierre(Date fechaCierre) {
		this.fechaCierre = fechaCierre;
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
	
	// Asigna un técnico al incidente.
	public void asignarTecnico(Tecnico tecnico) {	
	
	} 
	
	// Obtiene el tiempo estimado de resolución para el incidente. Se hace automático o desde el operador si el incidente es COMPLEJO
	public int obtenerTiempoEstimadoResolucion() {
		
		return 0;
	} 
	
	// Genera una notificación al cliente cuando se marca el incidente como resuelto.
	public void generarNotificacionCliente() {
		
	} 
	
	// Obtiene el estado actual del incidente.
	public EstadoIncidente obtenerEstado() {
		
		return null;
	} 
	
	// Obtiene el técnico asignado al incidente.
	public Tecnico obtenerTecnicoAsignado() {
		
		return null;
	} 
	
	// Agrega una descripcion relacionado al incidente.
	public void agregarIncidenteRelacionado(Incidente incidente) {
		
	} 
	
	// Obtiene la lista de problemas
	public List<Problema> obtenerProblemasRelacionados() {
		
		return null;
	}
	
	// Obtiene el cliente asociado al incidente.
	public Cliente obtenerCliente() {
		return null;
		
	} 
	
	// cambia el estado del incidente de ASIGNADO / ENPROGRESO  /   A  RESUELTO  Marca el incidente como resuelto e incluye consideraciones o notas sobre la resolución.
	public void MarcarComoResuelto (){
		
	} 

}
