package com.atmira.scrum.PortAventura;

public class Cliente {
	// hola mu wenas
	private String nom;
	private String apellidos;
	private String dni;
	private int telefono;

	// cliente-entrada
	public Cliente(String nom, String apellidos, String dni, int telefono, String fecha) {
		super();
		Entrada entrada = new Entrada(fecha);
		this.nom = nom;
		this.apellidos = apellidos;
		this.dni = dni;
		this.telefono = telefono;
	}

	// cliente-entrada-pase
	public Cliente(String nom, String apellidos, String dni, int telefono, String fecha, String fechaPase, String hora,
			int butaca) {
		super();
		Entrada entrada = new Entrada(fechaPase);
		Pase pase = new Pase(fechaPase, hora, butaca);
		this.nom = nom;
		this.apellidos = apellidos;
		this.dni = dni;
		this.telefono = telefono;
	}

	// cliente-entrada-reversa
	public Cliente(String nom, String apellidos, String dni, int telefono, String fecha, double precio, String fechaIn,
			String fechaOut, String datosHab) {
		super();
		Entrada entrada = new Entrada(fecha);
		Reserva reserva = new Reserva(nom, apellidos, dni, telefono, fechaIn, fechaOut, datosHab);
		this.nom = nom;
		this.apellidos = apellidos;
		this.dni = dni;
		this.telefono = telefono;
	}

	// cliente-entrada-reversa-pase
	public Cliente(String nom, String apellidos, String dni, int telefono, String fecha, String fechaIn,
			String fechaOut, String datosHab, String fechaPase, String hora, int butaca) {
		super();
		Entrada entrada = new Entrada(fecha);
		Pase pase = new Pase(fechaPase, hora, butaca);
		Reserva reserva = new Reserva(nom, apellidos, dni, telefono, fechaIn, fechaOut, datosHab);
		this.nom = nom;
		this.apellidos = apellidos;
		this.dni = dni;
		this.telefono = telefono;
	}

	public Cliente(String nom, String apellidos, String dni, int telefono) {
		super();
		this.nom = nom;
		this.apellidos = apellidos;
		this.dni = dni;
		this.telefono = telefono;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
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

	public void setTelefono(int texto) {
		this.telefono = texto;
	}

	public Cliente() {
		super();
	}

}
