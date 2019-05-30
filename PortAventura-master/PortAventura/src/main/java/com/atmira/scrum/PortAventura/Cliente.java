package com.atmira.Exercicis.ParcAtraccions;

public class Cliente {

	private String nom;
	private String apellidos;
	private String dni;
	private int telefono;

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

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Cliente(String nom, String apellidos, String dni, int telefono) {
		super();
		this.nom = nom;
		this.apellidos = apellidos;
		this.dni = dni;
		this.telefono = telefono;
	}

	public Cliente() {
		super();
	}

}
