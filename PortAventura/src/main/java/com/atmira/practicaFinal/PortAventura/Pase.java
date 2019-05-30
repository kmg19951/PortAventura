package com.atmira.practicaFinal.PortAventura;

public class Pase {
	private String fecha;
	private String hora;
	private int butaca;

	public Pase() {
		super();
	}

	public Pase(String fecha, String hora, int butaca) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.butaca = butaca;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getButaca() {
		return butaca;
	}

	public void setButaca(int butaca) {
		this.butaca = butaca;
	}

}
