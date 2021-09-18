package co.edu.poli.poo.condicionales;

/**
 * Un obrero necesita calcular su salario semanal, 
 * el cual se obtiene de la siguiente manera: Si trabaja 40 horas o menos se le paga $16 por hora
 *  Si trabaja mas de 40 horas se le paga $16
por cada una de las primeras 40 horas y $20 por cada hora extra
 */

import java.util.Scanner;

public class SalarioSemanal {
	static Scanner s;
	public static void main(String args[]) {
		//Inicializar el scanner como entrada de datos
		s = new Scanner(System.in);
		
	    //entradas
		final int VALOR_HORA_NORMAL = 16;
		final int VALOR_HORA_EXTRA = 20; 
		final int LIMITE_HORAS = 40;
		int horasTrabajadas;
		//salidas
		int valorPagar;
		//procesos
		int horasExtras;
		System.out.println("Digite el numero de horas trabajadas: ");
		horasTrabajadas = s.nextInt();
		
		if(horasTrabajadas > LIMITE_HORAS){
			horasExtras = horasTrabajadas - LIMITE_HORAS;
			valorPagar = (LIMITE_HORAS * VALOR_HORA_NORMAL) + (horasExtras * VALOR_HORA_EXTRA);
			
			}else {
				valorPagar = horasTrabajadas *VALOR_HORA_NORMAL;
			}
			System.out.println("Valor a pagar:" + valorPagar);
		}
		
		

}
