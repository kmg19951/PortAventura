package com.atmira.scrum.PortAventura;

public class Pase {
	private String fecha;
	private String hora;
	private static int butaca;

	public Pase() {
		super();
	}

	public Pase(String fecha, String hora, int butaca, Espectaculo espectaculo) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		if (butacasDisponibles(espectaculo.getAforo())) {
			this.butaca += butaca;
		}

	}

	public boolean butacasDisponibles(int aforo) {
		if (butaca < aforo) {
			System.out.println("Aun quedan " + (aforo - butaca) + "sitios libres");
			return false;
		} else {
			System.out.println("Aforo completo");
			return true;
		}

	}

	public void cuantasButacas() {
		System.out.println("Hay " + butaca + " ocupadas");
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
