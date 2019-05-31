package com.atmira.scrum.PortAventura;

public class Hotel {
	private int numHab;
	private String nombre;
	
	public Hotel(int numHab, String nombre) {
		super();
		this.numHab = numHab;
		this.nombre = nombre;
	}
	
	public int getNumHab() {
		return numHab;
	}
	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Hotel [numHab=" + numHab + ", nombre=" + nombre + "]";
	}
	
	 

}
