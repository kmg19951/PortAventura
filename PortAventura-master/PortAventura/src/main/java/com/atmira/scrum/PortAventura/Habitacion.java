package com.atmira.scrum.PortAventura;

public class Habitacion {
	private double precio;
	private int numero;
	private boolean disponible;
	
	
	public Habitacion(double precio, int numero, boolean disponible) {
		super();
		this.precio = precio;
		this.numero = numero;
		this.disponible = disponible;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	
}
