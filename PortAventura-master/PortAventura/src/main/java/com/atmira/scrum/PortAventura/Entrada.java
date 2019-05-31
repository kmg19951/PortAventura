package com.atmira.scrum.PortAventura;

public class Entrada {

	private String fecha;
	private double precio;

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Entrada(String fecha, double precio) {
		super();
		this.fecha = fecha;
		this.precio = precio;
	}

	public Entrada() {
		super();
	}

}
