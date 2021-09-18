package co.edu.poli.poo.ciclicos;

import java.util.Scanner;

/**
 * Calcular la nota definitiva de un estudiante, 
 * teniendo en cuenta que la nota final es el promedio de las tres notas del curso
 * @author user
 *
 */

public class Notas {
	static Scanner s;
	public static void main(String args[]) {
		//Inicializar el scanner como entrada de datos
		s = new Scanner(System.in);
		
		//ENTRADAS
	    final int NUMERO_NOTAS = 3;
	    float nota;
		//SALIDAS
	    float notaDefinitiva = 0;
		//PROCESOS
	    for(int i=1; i<=NUMERO_NOTAS; i++) {
	    	System.out.println("Digite la nota "+i);
	    	nota = s.nextFloat();
	    	notaDefinitiva += nota;
	    	
	    	}
	    	notaDefinitiva = notaDefinitiva / NUMERO_NOTAS;
	    	System.out.println("LA nota definitiva es: " + notaDefinitiva);
	    }

}
