package com.atmira.scrum.PortAventura;

import java.util.ArrayList;

public class Zona {

	private String nombre;
	private String descripcion;
	private String color;
	private Hotel hotel;
	private ArrayList<Espectaculo> listaDeEspectaculos = new ArrayList<Espectaculo>();
	private ArrayList<Tienda> listaDeTienda = new ArrayList<Tienda>();
	private ArrayList<Restaurante> listaDeRestaurante = new ArrayList<Restaurante>();
	private ArrayList<Atraccion> listaDeAtraccion = new ArrayList<Atraccion>();

	// Constructores
	public Zona() {
		super();
	}

	public Zona(String nombre, String descripcion, String color, Hotel hotel,
			ArrayList<Espectaculo> listaDeEspectaculos, ArrayList<Tienda> listaDeTienda,
			ArrayList<Restaurante> listaDeRestaurante, ArrayList<Atraccion> listaDeAtraccion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.color = color;
		this.hotel = hotel;
		this.listaDeEspectaculos = listaDeEspectaculos;
		this.listaDeTienda = listaDeTienda;
		this.listaDeRestaurante = listaDeRestaurante;
		this.listaDeAtraccion = listaDeAtraccion;
	}

	// Getter and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public ArrayList<Espectaculo> getListaDeEspectaculos() {
		return listaDeEspectaculos;
	}

	public void setListaDeEspectaculos(ArrayList<Espectaculo> listaDeEspectaculos) {
		this.listaDeEspectaculos = listaDeEspectaculos;
	}

	public ArrayList<Tienda> getListaDeTienda() {
		return listaDeTienda;
	}

	public void setListaDeTienda(ArrayList<Tienda> listaDeTienda) {
		this.listaDeTienda = listaDeTienda;
	}

	public ArrayList<Restaurante> getListaDeRestaurante() {
		return listaDeRestaurante;
	}

	public void setListaDeRestaurante(ArrayList<Restaurante> listaDeRestaurante) {
		this.listaDeRestaurante = listaDeRestaurante;
	}

	public ArrayList<Atraccion> getListaDeAtraccion() {
		return listaDeAtraccion;
	}

	public void setListaDeAtraccion(ArrayList<Atraccion> listaDeAtraccion) {
		this.listaDeAtraccion = listaDeAtraccion;
	}

	@Override
	public String toString() {
		return "Zona [color=" + color + ", descripcion=" + descripcion + ", hotel=" + hotel + ", listaDeAtraccion="
				+ listaDeAtraccion + ", listaDeEspectaculos=" + listaDeEspectaculos + ", listaDeRestaurante="
				+ listaDeRestaurante + ", listaDeTienda=" + listaDeTienda + ", nombre=" + nombre + "]";
	}

}
