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
	
	

	public ArrayList<Habitacion> getListaDeHabitaciones() {
		return listaDeHabitaciones;
	}

	private void crearHabitaciones() {
		
		Habitacion h;
		int contador = 1;
		
		for (int i = 0; i < numHab; i++) {
			if(contador>3) {
				h = new Habitacion(6.0, i+1, false);
				listaDeHabitaciones.add(h);
				contador = 0;
				
			}else {
				h = new Habitacion(3.0, i+1, false);
				listaDeHabitaciones.add(h);
				contador = contador + 1;
			}
		
		}
	}

	
	
	

}
