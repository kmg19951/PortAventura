package com.atmira.scrum.PortAventura;

public class Reserva {

	private String nombre;
	private String apellidos;
	private String dni;
	private int telefono;
	private String fechaIn;
	private String fechaOut;
	private String datosHab;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

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
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.telefono = telefono;
		this.fechaIn = fechaIn;
		this.fechaOut = fechaOut;
		this.datosHab = datosHab;
	}

	public Reserva() {
		super();
	}

}
