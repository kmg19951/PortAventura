package com.atmira.scrum.PortAventura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Parque {

	private final static String FICHERO_INFO_PARQUE_NUEVO = "InformacionParque/InfoParque.txt";
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

	public void escribirInfoParque() {

		if (this.nombre != null && !("".equals((this.nombre).trim()))) {
			try {
				FileWriter fichero = new FileWriter(FICHERO_INFO_PARQUE_NUEVO);
				BufferedWriter escribirFichero = new BufferedWriter(fichero);
				escribirFichero.write("Nombre:" + this.nombre);
				escribirFichero.newLine();
				if (this.listaDeZonas.size() > 0) {
					escribirFichero.write("Lista de zonas:");
					for (Zona zona : getListaDeZonas()) {
						escribirFichero.newLine();
						escribirFichero.write("Nombre zona:" + zona.getNombre());
						escribirFichero.newLine();
						escribirFichero.write("Descripcion zona:" + zona.getDescripcion());
						escribirFichero.newLine();
						escribirFichero.write("Color zona:" + zona.getColor());
						escribirFichero.newLine();
						// escribirFichero.write("Hotel
						// zona:"+zona.getHotel().getNombre());

					}
				}

				escribirFichero.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
