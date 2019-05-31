package com.atmira.scrum.PortAventura;

import java.util.ArrayList;

public class Simulacion {

	public static void main(String[] args) {

		Parque parque1 = new Parque();
		ArrayList<Zona> lista = new ArrayList<Zona>();
		Zona zona1 = new Zona();
		Zona zona12 = new Zona();
		zona1.setNombre("ChineTown");
		zona1.setColor("Red");
		zona1.setDescripcion("Musical City");
		lista.add(zona1);
		lista.add(zona12);
		parque1.setListaDeZonas(lista);
		parque1.escribirInfoParque();
		System.out.println(parque1.getListaDeZonas());
	}

}
