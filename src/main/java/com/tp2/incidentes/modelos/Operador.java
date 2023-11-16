package com.tp2.incidentes.modelos;

import java.time.Instant;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "cliente") 
public class Operador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 11)
	private int idOperador;

	@Column(length = 11)
	private int idTecnico;

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

}
