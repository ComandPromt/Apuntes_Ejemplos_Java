/*
* @(#) Pares100.java  1.0 07-10-2010
* Copyright (c) IES Luis Velez Guevara.
* Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
* All rights reserved.
*/
package Relacion1;

/** Clase Naturales1. Imprime los numeros pares del 100 al 1
 *  de forma ascendente y descendente.
 * @author David Martin
 * @version Version 1.0 07-10-2010
 */
public class Pares100 {

	/** Metodo main. Para imprimir valores numericos.
	 * @param args argumentos de la linea de comandos
	 */
	public static void main(String[] args) {
		
		/* Mediante un bucle for se imprimen los numeros
		 * pares comprendidos entre el 1 y el 100
		 */
		System.out.print("Numeros pares del 1 al 100\n");
		for (int i=2;i<=100;i=i+2){
			System.out.print(i+"\n");
		} //Fin for
		 
		/* Mediante un bucle for se imprimen los numeros
		 * pares comprendidos entre el 100 y el 1
		 */
		System.out.print("Numeros pares del 100 al 1\n");
		for (int i=100;i>=2;i=i-2){
			System.out.print(i+"\n");
		}//Fin for
		
		// Otra forma usando el modulo de una division
		System.out.print("Numeros pares del 1 al 100.\n"
				         +"Usando modulo de division.\n");
		
		for (int i=0;i<=100;i++){
			if (i !=0){
				if(i % 2 == 0){
					System.out.print(i+"\n");
				}//Fin if
			}//Fin if	
		}//Fin for
		
		
		System.out.print("Numeros pares del 100 al 1.\n"
				         +"Usando modulo de division.\n");
		for (int i=100;i>=0;i--){
			if (i !=0){
				if(i % 2 == 0){
					System.out.print(i+"\n");
				}//Fin if
			}//Fin if	
		}//Fin for
		
	}//Fin main

}//Fin clase
