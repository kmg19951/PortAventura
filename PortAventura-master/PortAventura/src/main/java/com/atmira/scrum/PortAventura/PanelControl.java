package com.atmira.scrum.PortAventura;

import java.util.ArrayList;
import java.util.Scanner;

public class PanelControl {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int acciones = 0;
		System.out.println("Bienvenido a la pantalla de administracion del Parque Port Aventura.");
		System.out.println("Acciones:");
		System.out.println("1.Dar de alta cliente.");
		System.out.println("2.Hacer reserva para cliente.");
		System.out.println("3.");
		System.out.println("-99.Salir.");
		// System.out.println();
		System.out.println("Que quieres hacer:");
		acciones = in.nextInt();

		if (acciones == 1) {

			crearCliente();

		} else if (acciones == 2) {

			MetodoFichero.escribirInfCliente(acciones, null);
		}
		in.close();
	}

	private static void crearCliente() {

		Cliente cliente = new Cliente();
		Scanner in = new Scanner(System.in);

		String texto;
		Integer numero;

		System.out.print("Nombre del cliente:");
		texto = in.nextLine();
		cliente.setNombre(texto);

		System.out.print("Apellido del cliente:");
		texto = in.nextLine();
		cliente.setApellido(texto);

		System.out.print("DNI del cliente:");
		texto = in.nextLine();
		cliente.setDni(texto);

		System.out.print("Telefono del cliente:");
		texto = in.nextLine();
		cliente.setTelefono(texto);

		System.out.print("Numero de entradas del cliente:");
		numero = in.nextInt();
		if (numero == 0) {
			System.out.println("El cliente tiene que tener como minimo una entrada");
			System.out.println("Dime las entradas que deseea o caancela la creacion del cliente(-99 o 0):");
			numero = in.nextInt();
		} else if (numero >= 0) {
			crearEntradas(numero, cliente);
			MetodoFichero.escribirInfCliente(1, cliente);
		}

		if (numero == (-99) || numero == 0) {
			cliente = new Cliente();
			System.out.println("Operacion terminada.");
		}

		in.close();
	}

	private static void crearEntradas(Integer numero, Cliente cliente) {

		Entrada entrada = new Entrada();
		ArrayList<Entrada> entradas = new ArrayList<Entrada>();
		for (int i = 0; i < numero; i++) {
			entrada = new Entrada("d" + i, 2.0, cliente);
			entradas.add(entrada);
		}

		cliente.setListaDeEntradas(entradas);

	}

}
