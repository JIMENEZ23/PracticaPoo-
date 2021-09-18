package co.edu.poli.poo.actividad;

import java.util.Scanner;

public class Calificacion {
	static Scanner s;

	public static void main(String args[]) {
		// Inicializar el scanner como entrada de datos
		s = new Scanner(System.in);

		// entradas
		final float NOTAS_PARCIALES = 55;
		final float EXAMEN_FINAL = 30;
		final float TRABAJO_FINAL = 15;
		float notaParcial;
		float examenFinal;
		float trabajoFinal;
		// salidas
		float parcialDef;
		float porcentajeExa;
		float porcentajeFinal;
		float notaFinal;

		// procesos
		System.out.println("Digite su nota parcial: ");
		notaParcial = s.nextFloat();
		parcialDef = (notaParcial * NOTAS_PARCIALES) / 100;

		System.out.println("Digite su nota de exmamen final: ");
		examenFinal = s.nextFloat();
		porcentajeExa = (examenFinal * EXAMEN_FINAL) / 100;

		System.out.println("Digite su nota de trabajo final: ");
		trabajoFinal = s.nextFloat();
		porcentajeFinal = (trabajoFinal * TRABAJO_FINAL) / 100;

		notaFinal = parcialDef + porcentajeExa + porcentajeFinal;
		System.out.println("Su nota definitvia es: " + notaFinal);

	}
}
