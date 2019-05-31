package com.atmira.scrum.PortAventura;

import java.util.ArrayList;
import java.util.Scanner;
import com.atmira.scrum.PortAventura.Aplicaciones.aplicaciones;

public class App 
{
    public static void main( String[] args )
    {
    
    	Hotel num = new Hotel(5, "Paradise" );
    	Hotel num2 = new Hotel(10, "Paradise");
    	
    	for (Habitacion habitacion : num.getListaDeHabitaciones()) {
			System.out.println(habitacion);
		}
    	
    	
    	for (Habitacion habitacion : num2.getListaDeHabitaciones()) {
			System.out.println(habitacion);
		}
    	
    	Scanner in = new Scanner(System.in);
    	int accion = 0;
    	
        System.out.println("/*************************");
        System.out.println("*Administracion de Parque*");
        System.out.println("/*************************/");
        
        System.out.println("Menu:");
        System.out.println("1.Consultar informacion del parque.");
        System.out.println("2.Modificar parque.");
        System.out.println("3.Eliminar parque.");
        System.out.println("4.Crear cliente.");
        System.out.println("5.Modificar cliente.");
        System.out.println("6.Eliminar cliente");
        System.out.println("7.Consultar informacion cliente");
        System.out.println("8.Listar clientes");
        System.out.println("9.Reservar habitacion.");
        System.out.println("10.Comprar entradas.");
        System.out.println("-99.Salir.");
        System.out.print("Accion a realizar:");
        
        accion = in.nextInt();
        
        escogerAccion(accion);
        
        in.close();
        
    }

	private static void escogerAccion(int accion) {
		
		switch (accion) {
		case 1:
			  aplicaciones.consultarInfoParque();
			break;
			
		case 2:
			  aplicaciones.modificarParque();
			break;
			
		case 3:
			  aplicaciones.consultarInfoParque();
			break;
			
		case 4:
			  aplicaciones.crearCliente();
			break;
			
		case 5:
			  aplicaciones.modificarParque();
			break;	
			
		case 6:
			  aplicaciones.eliminarCliente();
			break;
			
		case 7:
			  aplicaciones.consultarInfoCliente();
			break;	
			
		case 8:
			  aplicaciones.listarClientes();
			break;
			
		case 9:
			  aplicaciones.reservarHabitacion();
			break;	
			
		default:
			break;
		}
		
	}
}
