package com.atmira.scrum.PortAventura;

public class Espectaculo {
	private String tipoEspectaculo;
	private int aforo;

	public Espectaculo() {
		super();

	}

	public Espectaculo(String tipoEspectaculo, int aforo) {
		super();
		this.tipoEspectaculo = tipoEspectaculo;
		this.aforo = aforo;
	}

	public String getTipoEspectaculo() {
		return tipoEspectaculo;
	}

	public void setTipoEspectaculo(String tipoEspectaculo) {
		this.tipoEspectaculo = tipoEspectaculo;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

}
