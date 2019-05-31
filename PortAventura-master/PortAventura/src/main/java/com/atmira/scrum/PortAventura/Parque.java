package com.atmira.scrum.PortAventura;

import java.util.ArrayList;

public class Parque {

	private final String nombre = "Cecilio Aventura";
	private ArrayList<Zona> listaDeZonas;
	private Zona zona1;
	private Zona zona2;
	private Zona zona3;
	private Zona zona4;

	public Parque() {
		
		listaDeZonas = new ArrayList<Zona>();
				
		// descripciones
		String descripcionZona1 = "Ambientado en la cultura mediterranea";
		String descripcionZona2 = "Ambientado en la cultura polinesica";
		String descripcionZona3 = "Ambientado en la cultura china";
		String descripcionZona4 = "Ambientado en la cultura del antiguo oeste Americano";

		// colores
		String color1 = "Azul";
		String color2 = "Verde";
		String color3 = "Rojo";
		String color4 = "Marron";

		// hoteles
		Hotel hotel1 = new Hotel(300, "Mediterraneo");
		Hotel hotel2 = new Hotel(300, "Polinesia");
		Hotel hotel3 = new Hotel(300, "China");
		Hotel hotel4 = new Hotel(300, "Far West");

		// espectaculos
		Espectaculo espectaculo1_1 = new Espectaculo("Espectaculo1", 250);
		Espectaculo espectaculo1_2 = new Espectaculo("Espectaculo2", 250);
		ArrayList<Espectaculo> listaDeEspectaculos1 = new ArrayList<Espectaculo>();
		listaDeEspectaculos1.add(espectaculo1_1);
		listaDeEspectaculos1.add(espectaculo1_2);
		
		Espectaculo espectaculo2_1 = new Espectaculo("Espectaculo1", 250);
		Espectaculo espectaculo2_2 = new Espectaculo("Espectaculo2", 250);
		Espectaculo espectaculo2_3 = new Espectaculo("Espectaculo3", 250);
		ArrayList<Espectaculo> listaDeEspectaculos2 = new ArrayList<Espectaculo>();
		listaDeEspectaculos2.add(espectaculo2_1);
		listaDeEspectaculos2.add(espectaculo2_2);
		listaDeEspectaculos2.add(espectaculo2_3);

		Espectaculo espectaculo3_1 = new Espectaculo("Espectaculo1", 250);
		Espectaculo espectaculo3_2 = new Espectaculo("Espectaculo2", 250);
		Espectaculo espectaculo3_3 = new Espectaculo("Espectaculo3", 250);
		Espectaculo espectaculo3_4 = new Espectaculo("Espectaculo4", 250);
		ArrayList<Espectaculo> listaDeEspectaculos3 = new ArrayList<Espectaculo>();
		listaDeEspectaculos3.add(espectaculo3_1);
		listaDeEspectaculos3.add(espectaculo3_2);
		listaDeEspectaculos3.add(espectaculo3_3);
		listaDeEspectaculos3.add(espectaculo3_4);

		Espectaculo espectaculo4_1 = new Espectaculo("Espectaculo1", 250);
		Espectaculo espectaculo4_2 = new Espectaculo("Espectaculo2", 250);
		ArrayList<Espectaculo> listaDeEspectaculos4 = new ArrayList<Espectaculo>();
		listaDeEspectaculos4.add(espectaculo4_1);
		listaDeEspectaculos4.add(espectaculo4_2);

		// tiendas
		Tienda tienda1_1 = new Tienda("Tienda 1", "10:30-21:30");
		Tienda tienda1_2 = new Tienda("Tienda 2", "10:30-21:30");
		Tienda tienda1_3 = new Tienda("Tienda 3", "10:30-21:30");
		Tienda tienda1_4 = new Tienda("Tienda 4", "10:30-21:30");
		ArrayList<Tienda> listaDeTienda1 = new ArrayList<Tienda>();
		listaDeTienda1.add(tienda1_1);
		listaDeTienda1.add(tienda1_2);
		listaDeTienda1.add(tienda1_3);
		listaDeTienda1.add(tienda1_4);	
		
		Tienda tienda2_1 = new Tienda("Tienda 1", "10:30-21:30");
		Tienda tienda2_2 = new Tienda("Tienda 2", "10:30-21:30");
		ArrayList<Tienda> listaDeTienda2 = new ArrayList<Tienda>();
		listaDeTienda2.add(tienda2_1);
		listaDeTienda2.add(tienda2_2);

		Tienda tienda3_1 = new Tienda("Tienda 1", "10:30-21:30");
		Tienda tienda3_2 = new Tienda("Tienda 2", "10:30-21:30");
		ArrayList<Tienda> listaDeTienda3 = new ArrayList<Tienda>();
		listaDeTienda3.add(tienda3_1);
		listaDeTienda3.add(tienda3_2);

		Tienda tienda4_1 = new Tienda("Tienda 1", "10:30-21:30");
		Tienda tienda4_2 = new Tienda("Tienda 2", "10:30-21:30");
		ArrayList<Tienda> listaDeTienda4 = new ArrayList<Tienda>();
		listaDeTienda4.add(tienda4_1);
		listaDeTienda4.add(tienda4_2);

		// restaurantes
		Restaurante restaurante1_1 = new Restaurante("Restaurante 1", "10:30-21:30", 20);
		Restaurante restaurante1_2 = new Restaurante("Restaurante 2", "10:30-21:30", 25);
		ArrayList<Restaurante> listaDeRestaurante1 = new ArrayList<Restaurante>();
		listaDeRestaurante1.add(restaurante1_1);
		listaDeRestaurante1.add(restaurante1_2);

		Restaurante restaurante2_1 = new Restaurante("Restaurante 1", "10:30-21:30", 15);
		Restaurante restaurante2_2 = new Restaurante("Restaurante 2", "10:30-21:30", 30);
		ArrayList<Restaurante> listaDeRestaurante2 = new ArrayList<Restaurante>();
		listaDeRestaurante2.add(restaurante2_1);
		listaDeRestaurante2.add(restaurante2_2);

		Restaurante restaurante3_1 = new Restaurante("Restaurante 1", "10:30-21:30", 45);
		Restaurante restaurante3_2 = new Restaurante("Restaurante 2", "10:30-21:30", 20);
		ArrayList<Restaurante> listaDeRestaurante3 = new ArrayList<Restaurante>();
		listaDeRestaurante3.add(restaurante3_1);
		listaDeRestaurante3.add(restaurante3_2);

		Restaurante restaurante4_1 = new Restaurante("Restaurante 1", "10:30-21:30", 22);
		Restaurante restaurante4_2 = new Restaurante("Restaurante 2", "10:30-21:30", 31);
		ArrayList<Restaurante> listaDeRestaurante4 = new ArrayList<Restaurante>();
		listaDeRestaurante4.add(restaurante4_1);
		listaDeRestaurante4.add(restaurante4_2);

		// atracciones
		Atraccion atraccion1_1 = new Atraccion("Atraccion 1", 120, 23, 20);
		Atraccion atraccion1_2 = new Atraccion("Atraccion 2", 120, 23, 20);
		ArrayList<Atraccion> listaDeAtraccion1 = new ArrayList<Atraccion>();
		listaDeAtraccion1.add(atraccion1_1);
		listaDeAtraccion1.add(atraccion1_2);
		
		Atraccion atraccion2_1 = new Atraccion("Atraccion 1", 120, 23, 20);
		Atraccion atraccion2_2 = new Atraccion("Atraccion 2", 120, 23, 20);
		ArrayList<Atraccion> listaDeAtraccion2 = new ArrayList<Atraccion>();
		listaDeAtraccion2.add(atraccion2_1);
		listaDeAtraccion2.add(atraccion2_2);
		
		Atraccion atraccion3_1 = new Atraccion("Atraccion 1", 120, 23, 20);
		Atraccion atraccion3_2 = new Atraccion("Atraccion 2", 120, 23, 20);
		ArrayList<Atraccion> listaDeAtraccion3 = new ArrayList<Atraccion>();
		listaDeAtraccion3.add(atraccion3_1);
		listaDeAtraccion3.add(atraccion3_2);

		Atraccion atraccion4_1 = new Atraccion("Atraccion 1", 120, 23, 20);
		Atraccion atraccion4_2 = new Atraccion("Atraccion 2", 120, 23, 20);
		ArrayList<Atraccion> listaDeAtraccion4 = new ArrayList<Atraccion>();
		listaDeAtraccion4.add(atraccion4_1);
		listaDeAtraccion4.add(atraccion4_2);

		// zonas
		this.zona1 = new Zona("Mediterraneo", descripcionZona1, color1, hotel1, listaDeEspectaculos1, listaDeTienda1,
				listaDeRestaurante1, listaDeAtraccion1);
		this.zona2 = new Zona("Polinesia", descripcionZona2, color2, hotel2, listaDeEspectaculos2, listaDeTienda2,
				listaDeRestaurante2, listaDeAtraccion2);
		this.zona3 = new Zona("China", descripcionZona3, color3, hotel3, listaDeEspectaculos3, listaDeTienda3,
				listaDeRestaurante3, listaDeAtraccion3);
		this.zona4 = new Zona("Far West", descripcionZona4, color4, hotel4, listaDeEspectaculos4, listaDeTienda4,
				listaDeRestaurante4, listaDeAtraccion4);
	
		// lista de zonas
		listaDeZonas.add(zona1);
		listaDeZonas.add(zona2);
		listaDeZonas.add(zona3);
		listaDeZonas.add(zona4);
	
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Zona> getListaDeZonas() {
		return listaDeZonas;
	}

	public void setListaDeZonas(ArrayList<Zona> listaDeZonas) {
		this.listaDeZonas = listaDeZonas;
	}

	@Override
	public String toString() {
		return "Parque: " + nombre + "\n\tZonas: " + listaDeZonas+"\n\t";
	}

}
