package com.atmira.practicaFinal.PortAventura;

public class Tienda {
	private String nombre;
	private String horario;

	public Tienda() {
		super();
	}

	public Tienda(String nombre, String horario) {
		super();
		this.nombre = nombre;
		this.horario = horario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

}
