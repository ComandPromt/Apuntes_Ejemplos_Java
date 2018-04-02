/*
* @(#) CompraZapatillas.java  1.0 05-10-2010
* Copyright (c) IES Luis Velez Guevara.
* Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
* All rights reserved.
*/
package Relacion1;

/** Clase CompraZapatillas. Muestra el precio de unas zapatillas
 *  por pantalla, aplicando un 15% de descuento
 * @author David Martin
 * @version 1.0 05-10-2010
 */
public class CompraZapatillas {

	/** Metodo main. Para mostrar informacion por pantalla y realizar calculos.
	 * @param args argumentos de la linea de comandos.
	 */
	public static void main(String[] args) {
		
		System.out.print("Precio de unas zapatillas aplicando"
						 +" el 15% de descuento:\n");
		// Resto a 85 el descuento a aplicar
		System.out.print(85 -(85*0.15)+" Euros");
	} // Fin Main

} //Fin Clase 
