package com.atmira.scrum.PortAventura;

import java.util.ArrayList;

public class Parque {

	private String nombre = "Port Aventura";
	private ArrayList<Zona> listaDeZonas = new ArrayList<Zona>();

	// Constructores
	public Parque() {
		super();
	}

	public Parque(String nombre, ArrayList<Zona> listaDeZonas) {
		super();
		this.nombre = nombre;
		this.listaDeZonas = listaDeZonas;
	}

	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
