package com.atmira.scrum.PortAventura;

public class Atraccion {
	private String nombre;
	private double estatura;
	private int capacidad;
	private double duracion;	
	
	public Atraccion(String nombre, double estatura, int capacidad, double duracion) {
		super();
		this.nombre = nombre;
		this.estatura = estatura;
		this.capacidad = capacidad;
		this.duracion = duracion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "\n\t\t\t\t"+nombre + ", estatura: " + estatura + ", capacidad: " + capacidad + ", duracion: "
				+ duracion;
	}
	
	
	
}
