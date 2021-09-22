package co.edu.poli.poo.programas;

import java.util.ArrayList;
import java.util.Scanner;


public class Parqueadero {
	static Scanner s;

    static ArrayList<Integer> consolidado;
	public static void main(String arg[]) {
		s = new Scanner(System.in);
		int valorPagar = 0;
		consolidado = new ArrayList<Integer>();
		// Entradas
		
		final int TCARRO = 60;
		final int TMOTO = 30;
		final int TBICICLETA = 10;
		int minutosParqueo = 0;
		int opcionRealizar = 0;
		int opcionCobro = 0;
		int totalFacturado = 0;
		//Salidas
		
		// Proceso
		while (opcionRealizar != 4) {
			opcionRealizar = menuPrincipal();
			if (opcionRealizar == 1) {
				opcionCobro = opcionVehiculo();
				
				switch (opcionCobro) {

				case 1:
					System.out.println("Ingrese los minutos en el parqueadero: ");
					minutosParqueo = s.nextInt();
					valorPagar = minutosParqueo * TCARRO;
					break;

				case 2:
					System.out.println("Ingrese los minutos en el parqueadero: ");
					minutosParqueo = s.nextInt();
					valorPagar = minutosParqueo * TMOTO;
					break;

				case 3:
					System.out.println("Ingrese los minutos en el parqueadero: ");
					minutosParqueo = s.nextInt();
					valorPagar = minutosParqueo * TBICICLETA;
					break;
					

				default:
					System.out.println("Opcion no valida");
					break;
				}
				
				consolidado.add(valorPagar);
				System.out.println("El valor a pagar es: " + valorPagar);
				opcionRealizar = menuPrincipal();
				
				
			}
			
			if (opcionRealizar == 2)
				
				System.out.println("El total facturado fue: " + totalFacturado);
			}
				

		}
	

	public static int menuPrincipal() {
		int opcion = 0;
		while (opcion < 1 || opcion > 3) {
			System.out.println("Elija la opcion a realizar: ");
			System.out.println("1.Facturar parqueo");
			System.out.println("2.Total faturado");
			System.out.println("3.Menu principal");
			System.out.println("4.Salir");
			opcion = s.nextInt();

		}
		return opcion;

	}

	public static int opcionVehiculo() {
		int opcion = 0;
		while (opcion < 1 || opcion > 3) {
			System.out.println("Elija el tipo de vehiculo: ");
			System.out.println("1.Carro");
			System.out.println("2.Moto");
			System.out.println("3.Bicicleta");
			opcion = s.nextInt();

		}
		return opcion;
	}

}
