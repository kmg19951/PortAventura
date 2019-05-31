package com.atmira.scrum.PortAventura;

public class Habitacion {
	
	private double precio;
	private int numero;
	private boolean disponible;
	private Reserva reserva;
	
	public Habitacion() {
		super();
	}

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

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	@Override
	public String toString() {
		return "Habitacion [precio=" + precio + ", numero=" + numero + ", disponible=" + disponible + ", reserva="
				+ reserva + "]";
	}
	
	
	
	
}
