package com.atmira.scrum.PortAventura;

public class Butaca {
	private boolean ocupada = false;

	public Butaca() {
		super();
	}

	public Butaca(boolean ocupada) {
		super();
		this.ocupada = ocupada;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

}
