package com.atmira.scrum.PortAventura;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	
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
        
        //quin domini del catala
    }

	private static void escogerAccion(int accion) {
		Aplicaciones a = new Aplicaciones();
		switch (accion) {
		case 1:
			  a.consultarInfoParque();
			break;
			
		case 2:
			  a.modificarParque();
			break;
			
		case 3:
			  a.consultarInfoParque();
			break;
			
		case 4:
			  a.crearCliente();
			break;
			
		case 5:
			  a.modificarParque();
			break;	
			
		case 6:
			  a.eliminarCliente();
			break;
			
		case 7:
			  a.consultarInfoCliente();
			break;	
			
		case 8:
			  a.listarClientes();
			break;
			
		case 9:
			  a.reservarHabitacion();
			break;	
			
		default:
			break;
		}
		
	}
}
