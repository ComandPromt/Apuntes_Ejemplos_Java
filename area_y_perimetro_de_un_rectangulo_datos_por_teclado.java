/*
 * @(#) CompraZapatillas.java  1.0 05-10-2010
 * Copyright (c) IES Luis Velez Guevara.
 * Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
 * All rights reserved.
 */

import java.util.Scanner;

/**
 * Clase RectanguloMejorado. Calcula el area y perimetro de un rectangulo con entrada de
 * datos por teclado
 * 
 * @author David Martin
 * @version 1.0 18-11-2014
 */

public class RectanguloMejorado {

	/**
	 * Metodo principal para la ejecuci—n del programa.
	 * 
	 * @param args
	 *            argumentos por linea de comandos
	 */
	public static void main(String[] args) {

		// Variable para almacenar el alto del rectangulo
		int alto;
		// Variable para almacenar el ancho del rectangulo
		int ancho ;
		
		
		// Se realiza la entrada de datos por teclado
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el ancho\t");
		ancho=sc.nextInt();
		System.out.println("Introduce el alto");
		alto=sc.nextInt();

		// Presentamos los datos y resultados
		System.out.println("El ancho mide: " + ancho + " cm.");

		System.out.println("El alto mide: " + alto + " cm.");

		System.out.println("El ‡rea es: " + (ancho * alto) + " cm2");

		System.out
				.println("El per’metro es: " + (2 * ancho + 2 * alto) + " cm");
	}

}
