package com.tp2.incidentes.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rrhh")
public class Rrhh {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 11)
	private int idRrhh;

	@Column(length = 11)
	private int idOperador;

	@Column(length = 11)
	private int idTecnico;
	
	@Column(length = 20)
	private int icidentesResueltos;
	
	@Column(length = 20)
	private int incidentesPendientesDeResolucion;

	@Column(length = 1)
	private boolean estado;

	public int getIdRrhh() {
		return idRrhh;
	}

	public void setIdRrhh(int idRrhh) {
		this.idRrhh = idRrhh;
	}

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

	public int getIcidentesResueltos() {
		return icidentesResueltos;
	}

	public void setIcidentesResueltos(int icidentesResueltos) {
		this.icidentesResueltos = icidentesResueltos;
	}

	public int getIncidentesPendientesDeResolucion() {
		return incidentesPendientesDeResolucion;
	}

	public void setIncidentesPendientesDeResolucion(int incidentesPendientesDeResolucion) {
		this.incidentesPendientesDeResolucion = incidentesPendientesDeResolucion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	

}
