package com.atmira.scrum.PortAventura;

import java.util.ArrayList;

public class Hotel {
	//Welcome
	private int numHab;
	private String nombre;
	private ArrayList<Habitacion> listaDeHabitaciones = new ArrayList<Habitacion>();
	
	public Hotel(int numHab, String nombre) {
		super();
		this.numHab = numHab;
		this.nombre = nombre;
		crearHabitaciones();
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

	private void crearHabitaciones() {
		//Habitacion 
		for(int i=0;i<numHab;i++) {
			
		}
		
	}

	
	@Override
	public String toString() {
		return "Hotel [numHab=" + numHab + ", nombre=" + nombre + "]";
	}
	
	 

}
