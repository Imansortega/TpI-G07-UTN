package com.tp2.incidentes.modelos;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "empleado") // Le decimos al proveedor JPA como se guarda esta entidad en la bbdd
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;
    private String apellidos;
    private String nombre;
    private Date fechanacimiento;
	public int getId() {
		return this.id;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public Date getFechaNacimiento() {
		return this.fechanacimiento;
	}
}
