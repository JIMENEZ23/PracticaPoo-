package co.edu.poli.poo.actividad;

/**
 * Calcular el total que una persona debe pagar en un almacén de llantas, 
 * si el precio de cada llanta es de $80000
 *  si se compran menos de 5 llantas y de $70000 si se compran 5 o mas.
 */

import java.util.Scanner;

public class Llanta {
	static Scanner s;

	public static void main(String args[]) {

		// Inicializar el scanner como entrada de datos
		s = new Scanner(System.in);

		// entradas
		final int LLANTA_UNO = 80000;
		final int LLANTA_DOS = 70000;

		// salidas
		int precioTotal = 0;
		// proceso
		int numLlantas;
		System.out.println("Ingrese el numero de llantas a comprar: ");
		numLlantas = s.nextInt();

		if (numLlantas < 5) {
			precioTotal = LLANTA_UNO * numLlantas;

		}
		if (numLlantas >= 5) {
			precioTotal = LLANTA_DOS * numLlantas;
		}
		System.out.println("El precio a pagar es: " + precioTotal);
	}
}
