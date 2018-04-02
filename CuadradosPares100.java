/*
* @(#) CuadradosPares100.java  1.0 07-10-2010
* Copyright (c) IES Luis Velez Guevara.
* Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
* All rights reserved.
*/
package Relacion1;

/** Clase CuadradosPares100. Imprime los cuadrados de los numeros
 *  pares comprendidos entre 1 y 100. Ademas, imprime la suma de
 *  los mismos.
 * @author David Martin
 * @version Version 1.0 07-10-2010
 */
public class CuadradosPares100 {

	/** Metodo main. Para imprimir valores numericos.
	 * @param args argumentos de la linea de comandos
	 */
	public static void main(String[] args) {
		// Para guardar la suma de los cuadrados de los numeros 
		int a=0;
		// Para imprimir los cuadrados de los numeros pares
		System.out.print("Los cuadrados de los numeros pares"
				         +" comprendidos entre 1 y el 100 son:\n");
		// Se usa el metodo Pow de la libreria Math
		for (int i=1;i<=100;i++){
			if (i % 2==0){
				System.out.print((int)Math.pow(i,2)+"\n");
				a=a+(int)Math.pow(i,2);
			} // Fin If
		} // Fin For 
		System.out.print("La suma de los cuadrados de los numeros"
				         +" pares del 1 al 10 es: "+a);
	} // Fin Main

} // Fin Clase
