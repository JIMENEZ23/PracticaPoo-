package co.edu.poli.poo.actividad;

import java.util.Scanner;

/**
 * En un almacén se hace un 25% de descuento a los clientes cuya compra supere los $100000
 *  ¿ Cual será la cantidad que pagara una persona por su compra?
 * @author user
 *
 */

public class Almacen {
	static Scanner s;

	public static void main(String args[]) {
		// Inicializar el scanner como entrada de datos
		s = new Scanner(System.in);
	
		
		//entradas
		final int DESCUENTO = 25;
		final int COMPRA_MINIMA = 100000;
		int valorCompra;
	
		
		//salidas
		int totalPago;
		
		//proceso
		int valorDes = 0;
		System.out.println("Valor de la compra: ");
		valorCompra = s.nextInt();
		
		if(valorCompra > COMPRA_MINIMA) {
			valorDes = (valorCompra * DESCUENTO) / 100;
			totalPago = valorCompra - valorDes;
			
			
		}else {
			totalPago = valorCompra;
			
		}
		System.out.println("El valor total de su compra es: "+ totalPago);
		
		
	
	
	
	}
}
