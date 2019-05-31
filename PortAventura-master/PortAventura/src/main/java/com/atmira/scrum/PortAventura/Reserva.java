package com.atmira.scrum.PortAventura;

public class Reserva extends Cliente {

	private String fechaIn;
	private String fechaOut;
	private String datosHab;

	public String getFechaIn() {
		return fechaIn;
	}

	public void setFechaIn(String fechaIn) {
		this.fechaIn = fechaIn;
	}

	public String getFechaOut() {
		return fechaOut;
	}

	public void setFechaOut(String fechaOut) {
		this.fechaOut = fechaOut;
	}

	public String getDatosHab() {
		return datosHab;
	}

	public void setDatosHab(String datosHab) {
		this.datosHab = datosHab;
	}

	public Reserva(String nombre, String apellidos, String dni, int telefono, String fechaIn, String fechaOut,
			String datosHab) {
		this.fechaIn = fechaIn;
		this.fechaOut = fechaOut;
		this.datosHab = datosHab;
	}

	public Reserva() {
	}

}
