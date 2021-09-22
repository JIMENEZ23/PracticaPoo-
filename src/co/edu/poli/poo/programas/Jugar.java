package co.edu.poli.poo.programas;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import co.edu.poli.poo.archivos.Archivos;

public class Jugar {
	
	static Scanner s;
	static Archivos archivos;
	 static List<String> palabras;
	 static Tableros tablero;

	public static void main(String args[]) {
		// Inicializar el scanner como entrada de datos
		s = new Scanner(System.in);
		archivos = new Archivos();
		tablero = new Tableros();
		
		//Objeto para generar un numero aleatorio
		
		Random r = new  Random();
		//variables de control
		int aleatorio, vidas , aciertos;
		boolean terminarJuego,  existeLetra;
		//variables para gestionar la palabra adivinar
		String  palabraAdivinar, palabraArmada;
		//variables para gestionar letras
		char[] palabraPorLetras, espacios;
		char letra;
		
		int opcionJuego, opcionCategoria;
		String palabraNueva;

		opcionJuego = menuJuego();
		while (opcionJuego != 4) {
			if (opcionJuego == 1) {
				System.out.println("Elije una categoria: ");
				opcionCategoria = menuPalabras();
				System.out.println("Digitela nueva palabra: ");
				palabraNueva = s.next();
				// convierte las palabras a mayusculas
				palabraNueva = palabraNueva.toUpperCase();

				switch (opcionCategoria) {
				case 1:
					archivos.escribirArchivo(Constantes.RUTA_ARCHIVOS, Constantes.ARCHIVO_PAISES, palabraNueva);
					break;
				case 2:
					archivos.escribirArchivo(Constantes.RUTA_ARCHIVOS, Constantes.ARCHIVO_EQUIPOS, palabraNueva);
					break;
				case 3:
					archivos.escribirArchivo(Constantes.RUTA_ARCHIVOS, Constantes.ARCHIVO_CAPITALES, palabraNueva);
					break;
				default:
					System.out.println("Opcion no valida");
					break;

				}

			}
			if(opcionJuego == 2) {
				System.out.println("Elije una categoria: ");
				opcionCategoria = menuPalabras();
				switch(opcionCategoria) {
				case 1:
					palabras = archivos.leerArchivo(Constantes.RUTA_ARCHIVOS,Constantes.ARCHIVO_PAISES);
					break;
				case 2:
					palabras = archivos.leerArchivo(Constantes.RUTA_ARCHIVOS,Constantes.ARCHIVO_EQUIPOS);
					break;
				case 3:
					palabras = archivos.leerArchivo(Constantes.RUTA_ARCHIVOS,Constantes.ARCHIVO_CAPITALES);
					break;
				default:
					System.out.println("opcion no valida");
					break;
					
				}
				aleatorio = r.nextInt(palabras.size());
				//Elegir la palabra a Adivinar
				palabraAdivinar = palabras.get(aleatorio);
				palabraPorLetras = new char[palabraAdivinar.length()];
				espacios = new char[palabraAdivinar.length()];
				//Recorrer la apalabra a adivinar y llenar los arreglos
				for(int i = 0; i<palabraAdivinar.length(); i++) {
					palabraPorLetras[i] = palabraAdivinar.charAt(i);
					espacios[i] = '_';
				}
				//Iniciar variables de control
				vidas = 7;
				aciertos = 0;
				palabraArmada = "";
				terminarJuego = false;
				existeLetra = false;
				
				//solicitar letras
				do {
					existeLetra = false;
					if(aciertos == palabraPorLetras.length) {
						terminarJuego = true;
						System.out.println("GANASTE!!!");
						System.out.println("palabraAdivinar");
						
					}else {
						tablero.dibujarTablero(vidas);
						palabraArmada = "";
						for(int i=0; i<espacios.length; i++) {
							palabraArmada += espacios[i]+" ";
							
						}
						System.out.println(palabraArmada);
						//solicitar letras
						System.out.println("Digite una letra: ");
						letra = s.next().toUpperCase().charAt(0);
						//verificar si la letra coincide con una letra de la palabra a adivinar
						for(int i=0; i<palabraPorLetras.length; i++) {
							if(letra == palabraPorLetras[i]) {
								//Si coincide..
								//valido si la letra no fue adivinada antes
								if(letra != espacios[i]) {
									aciertos++;
									existeLetra = true;
									espacios[i] = letra;
								}else {
									System.out.println("letra ya digitada");								}
								
							}
						}
						//No hay coincidencia
						if(!existeLetra) {
							vidas--;
							if(vidas == 0) {
								terminarJuego = true;
								tablero.dibujarTablero(vidas);
								System.out.println("perdiste!! INTENTALO DE NUEVO");
								
									
							}
						}
					}
				}while(!terminarJuego);
			}
		}
		opcionJuego = menuJuego();
	}

	public static int menuPalabras() {
		int opcion = 0;
		while (opcion < 1 || opcion > 3) {

			System.out.println("1. Paises");
			System.out.println("2. Equipos");
			System.out.println("3. Capitales");
			opcion = s.nextInt();

		}
		return opcion;

	}

	public static int menuJuego() {
		int opcion = 0;
		while (opcion < 1 || opcion > 4) {
			System.out.println("Elija una opcion: ");
			System.out.println("1. Administrar palabras");
			System.out.println("2. Jugar");
			System.out.println("3. Creditos");
			System.out.println("4. Salir");
			opcion = s.nextInt();
		}
		return opcion;
	}
}
