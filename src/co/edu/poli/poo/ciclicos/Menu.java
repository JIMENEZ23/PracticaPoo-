package co.edu.poli.poo.ciclicos;

import java.util.Scanner;

public class Menu {
	static Scanner s;
	public static void main(String args[]) {
		//Inicializar el scanner como entrada de datos
		s = new Scanner(System.in);
		int opcion = 0;
		
		while(opcion != 4) {
			System.out.println("Seleccione una opcion: ");
			System.out.println("1. Registrar Contacto");
			System.out.println("2. Modificar Contacto");
			System.out.println("3. Ver Contacto");
			System.out.println("4. Salir");
			
			opcion = s.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Ingreso a la opcion de registro");
				break;
			case 2:
				System.out.println("Ingreso a la opcion de mofificacion");
				break;
			case 3:
				System.out.println("Ingreso a la opcion de visualizacion");
				break;
			default:
				System.out.println("opcion no valida");
				break;
			
				
			
				}
			}
		}
		
		//ENTRADAS
		//SALIDAS
		//PROCESO

}
