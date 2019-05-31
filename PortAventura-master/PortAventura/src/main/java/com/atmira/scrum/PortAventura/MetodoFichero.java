package com.atmira.scrum.PortAventura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MetodoFichero {

	private static final String FICHERO_INFO_CLIENTES = "InformacionParque/InfoClientes.txt";

	public static void main(String[] args) {

	}

	public static void escribirInfParque(int numero) {

		if (numero == 1) {
			try {
				FileWriter fichero = new FileWriter(FICHERO_INFO_CLIENTES);
				BufferedWriter escribirFichero = new BufferedWriter(fichero);
				escribirFichero.write("Nombre:");
				escribirFichero.newLine();

				escribirFichero.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void escribirInfCliente(int numero, Cliente cliente) {

		if (numero == 1) {
			try {
				FileWriter fichero = new FileWriter(FICHERO_INFO_CLIENTES);
				BufferedWriter escribirFichero = new BufferedWriter(fichero);
				escribirFichero.write("Nombre:" + cliente.getNombre());
				escribirFichero.newLine();
				escribirFichero.write("Apellido:" + cliente.getApellido());
				escribirFichero.newLine();
				escribirFichero.write("DNI:" + cliente.getDni());
				escribirFichero.newLine();
				escribirFichero.write("Telefono:" + cliente.getTelefono());
				escribirFichero.newLine();

				escribirFichero.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
