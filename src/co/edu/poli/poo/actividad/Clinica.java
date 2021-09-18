package co.edu.poli.poo.actividad;

import java.util.Scanner;

public class Clinica {
	static Scanner s;

	public static void main(String args[]) {
		// Inicializar el scanner como entrada de datos
		s = new Scanner(System.in);

		// entradas
		final int GINECOLOGIA = 40;
		final int TRAUMATOLOGIA = 30;
		final int PEDIATRIA = 30;
		int presupuesto;

		// salidas
		int dineroGinecologia;
		int dineroTraumatologia;
		int dineroPediatria;
		// proceso
		System.out.println("Digite el presupuesto: ");
		presupuesto = s.nextInt();
		dineroGinecologia = (presupuesto * GINECOLOGIA) / 100;
		dineroTraumatologia = (presupuesto * TRAUMATOLOGIA) / 100;
		dineroPediatria = (presupuesto * PEDIATRIA) / 100;
		System.out.println("Ginecologia: " + dineroGinecologia);
		System.out.println("Traumatologia: " + dineroTraumatologia);
		System.out.println("Pediatria: " + dineroPediatria);

	}

}
