package com.atmira.scrum.PortAventura;

import java.util.ArrayList;

public class Parque {
	
	private final String nombre = "Cecilio Aventura";
	private ArrayList<Zona> listaDeZonas;

	public Parque(String nombre, ArrayList<Zona> listaDeZonas) {
		this.listaDeZonas = new ArrayList<Zona>();
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Zona> getListaDeZonas() {
		return listaDeZonas;
	}

	public void setListaDeZonas(ArrayList<Zona> listaDeZonas) {
		this.listaDeZonas = listaDeZonas;
	}

	@Override
	public String toString() {
		return "Parque [listaDeZonas=" + listaDeZonas + ", nombre=" + nombre + "]";
	}

}
