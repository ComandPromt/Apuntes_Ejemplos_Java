/*
* @(#) Multiplos3.java  1.0 07-10-2010
* Copyright (c) IES Luis Velez Guevara.
* Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
* All rights reserved.
*/
package Relacion1;

/** Clase Multiplos3. Imprime los multiplos de 3 comprendidos
 *  entre 100 y 1000. Cuenta la cantidad total de multiplos.
 * @author David Martin
 * @version Version 1.0 07-10-2010
 */
public class Multiplos3 {

	/** Metodo main. Para imprimir valores numericos.
	 * @param args argumentos de la linea de comandos
	 */
	public static void main(String[] args) {
		/* Se declara una variable a de tipo entera.
		 * En ella se guarda la cantidad de numeros 
		 * multiplos de 3. */
		int a=0;
		/* Se lanza un for que comprende el rango de busqueda de 
		 * numeros multiplos de 3 */
		for (int i=100;i<=1000;i++){
			// Si el modulo de la division entre i y
			// 3 es igual a 0, la i se imprime
			if(i % 3==0){
				System.out.print(i+"\n");
				// Se incrementa la a.
				a++;
			} // Fin if
		} // Fin for
		// Se imprime la cantidad total de multiplos de 3
		System.out.print("La cantidad total de multiplos de 3 es: "+a);
	} //Fin main

} //Fin Clase
