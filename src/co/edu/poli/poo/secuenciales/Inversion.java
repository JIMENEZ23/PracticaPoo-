package co.edu.poli.poo.secuenciales;

import java.util.Scanner;

/**
 * Suponga que una persona desea invertir su capital en un banco
 * y desea saber cuanto dinero ganar�
 * despu�s de un mes si el banco paga a raz�n de 2% mensual
 * @author user
 * @
 */
public class Inversion {
	//objeto que permite capturar informacion a traves del teclado
	static Scanner s;
	public static void main(String args[]) {
		//Inicializar el scanner como entrada de datos
		s = new Scanner(System.in);
		
		//Entradas
		final int PORC_INTERES = 2;
		int capital;
		
		//Salidas
		int valorGanado;
		
		//Procesos
		System.out.println("Digite el valor del capital: ");
		capital = s.nextInt();
		
		valorGanado = capital * PORC_INTERES / 100;
		
		System.out.println("Valor ganado:" + valorGanado);
	}

}
