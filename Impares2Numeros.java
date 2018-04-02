/**
* @(#) SumaNaturales2.java  1.0 26-10-2010
* Copyright (c) IES Luis Velez Guevara.
* Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
* All rights reserved.
*/

package relacion02.objetos;

import java.util.*;

/**
 * 
 * La clase Impares2Numeros representa los numero impares entre dos enteros
 * 
 * @author David Martin
 * @version Version 1.0 26-10-2010
 */
 
 
public class Impares2Numeros {
	/** entero inicial */
	private int primero;

	/** entero final */
	private int ultimo;
	
	
	/**
	 * Constructor por defecto
	 */
	public Impares2Numeros() {
		primero = 0;
		ultimo = 0;
		}
		
	
	/**
	 * Constructor en el que pasamos el primer y ultimo numero
	 * @param primero	entero en el que se inicia la cuenta
	 * @param ultimo	entero en el que terminara la cuenta
	 */
	public Impares2Numeros(int primero, int ultimo) {
		if (primero > ultimo) {
			this.primero = ultimo;
			this.ultimo = primero;
		} else {
			this.primero = primero;
			this.ultimo = ultimo;
		}
	}
	
	
	
	/**
	 * Metodo de obtencion
	 * @return primer elemento
	 */
	public int getPrimero() {
		return primero;
	}


	/**
	 * Metodo de establecimiento de primero
	 * @param primer elemento
	 */
	public void setPrimero(int primero) {
		this.primero = primero;
	}


	/**
	 * Metodo de obtencion
	 * @return ultimo elemento
	 */
	public int getUltimo() {
		return ultimo;
	}


	/**
	 * Metodo de establecimiento de ultimo
	 * @param ultimo elemento
	 */
	public void setUltimo(int ultimo) {
		this.ultimo = ultimo;
	}

	/**
	 * Metodo que imprime la serie de numeros impares comprendidos entre primero y ultimo
	 * 		  e indica el total de impares impresos.
	 * @return	cadena que contiene el listado de impares y el total.
	 */
	public String imprimirImpares () {
		/*
		 * Antes de iniciar el proceso de impresion ordenaremos los elementos
		 * aunque solo para uso interno de este metodo
		 */
		int inicio;		//inicio representara el primero elemento impar
		int fin;		//fin representa el ultimo entero posible
		
		if (primero < ultimo) {
			inicio = primero;
			fin = ultimo;
		} else {
			inicio = ultimo;
			fin = primero;
		} //Fin if-else
		
		String cadena = "";
		int contador = 0;		//contador será el numero total de numeros impares
		if (inicio%2==0) {		//caso de que primero sea par comenzaremos a imprimir desde el siguiente
			inicio++;
		}
		
		for (int i=inicio; i<=fin;i+=2) {
			cadena += i + "\n";
			contador ++;
		} //Fin for
		
		cadena += "\n NUMERO TOTAL DE IMPARES: " + contador;	// imprimimos el total de impares
		return cadena;
	}
		
	
	/**
	 * 
	 * Metodo que lanza el ejercicio 9
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Impares2Numeros impares = new Impares2Numeros ();
		int entrada;		//variable utilizada para la lectura por teclado
		Scanner sc = new Scanner(System.in);
		
		//Solicitud de datos a usuario
		
		System.out.println ("\tVAMOS A IMPRIMIR LOS NUMEROS IMPARES DOS NUMEROS" + "\n");
		System.out.print ("Introduce el primer elemento: ");
		entrada = sc.nextInt();
		impares.setPrimero(entrada);
		
		System.out.print ("Introduce el segundo elemento: ");
		entrada = sc.nextInt();
		impares.setUltimo(entrada);
		
		// impresion de resultados por salida estandar

		System.out.println("Los numeros impares entre el " + impares.getPrimero()
							+ " y " + impares.getUltimo() + " son:");
		System.out.println (impares.imprimirImpares());
		
	} //Fin main

}//Fin clase
