/**
* @(#) Bisiesto.java  1.0 27-10-2010
* Copyright (c) IES Luis Velez Guevara.
* Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
* All rights reserved.
*/

package relacion02.objetos;

import java.util.Scanner;

/**
 * Clase Bisiesto.Pide un anyo y nos dice si es bisiesto o no.
 * @author David Martin
 * @version Version 1.0 27-10-2010
 */
 
public class Bisiesto {
	/** Para guardar el anyo introducido */
	int anyo;
	/** Para determinar si es o no bisiesto */
	boolean bis;
	
	/**
	 * Define un objeto con valores por defecto
	 * @param no recibe parametros de entrada
	 */
	public Bisiesto (){
		this.anyo = 0;
		this.bis = true;
	}
	
	/**
	 * Para pedir el anyo por teclado
	 * @param no recibe parametros de entrada
	 */
	public void pedirAnyo(){
		// Se crea un objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		// Se pide el anyo y se asigna
		System.out.print("Introduce anyo: ");
		this.setAnyo(sc.nextInt());
	}
	
	/**
	 * Para averiguar si el anyo es bisiesto
	 * @param no recibe parametros de entrada
	 */
	public void calcularBis(){
		// Si no es divisible entre 4 no es bisiesto
		if ((this.getAnyo() % 4) != 0){
			this.setBis(false);
		} else {
			/* Si no es asi, se comprueba si 
			 * lo es entre 100, siendo bisiesto
			 * si se cumple
			 */
			if ((this.getAnyo() % 100) != 0){
					this.setBis(true);
	        } else {
	        		// Si es divisible entre 100, ser
	        		// bisiesto si es divisible entre 400
	        		if ((this.getAnyo() % 400) == 0){
	        			this.setBis(true);
	        		} else {
	        			this.setBis(false);
	        		} //Fin if
	        	}//Fin if
	        }//Fin if
	} //Fin calcularBis
	
	/**
	 * Para imprimir resultados
	 * @param no recibe parametros de entrada
	 */
	public void imprimirResultados(){
		if (this.isBis()== true){
			System.out.print("El ano "+this.getAnyo()+" es bisiesto");
		} else {
				System.out.print("El ano "+this.getAnyo()+" no es bisiesto");
	    }//Fin if
	}
	
	/**
	 * Para consultar el contenido de anyo
	 * @return devuelve un valor de tipo int
	 */
	public int getAnyo() {
		return anyo;
	}
	/**
	 * Para consultar el contenido de bis
	 * @return devuelve un valor de tipo boolean
	 */
	public boolean isBis() {
		return bis;
	}

	/**
	 * Para modificar el contenido de anyo
	 * @param anyo variable de tipo int
	 */
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	/**
	 * Para modificar el contenido de bis
	 * @param bis variable de tipo boolean
	 */
	public void setBis(boolean bis) {
		this.bis = bis;
	}

	/** 
	 * Metodo main. Para hacer pruebas con la clase Bisiesto.
	 * @param args argumentos de la linea de comandos
	 */
	public static void main(String[] args) {
		// Se crea un objeto de la clase Bisiesto
		Bisiesto b1 = new Bisiesto();
		// Se pide el anyo
		b1.pedirAnyo();
		// Se averigua si es o no 
		b1.calcularBis();
		// Se imprime el resultado
		b1.imprimirResultados();

	}//Fin main

}//Fin clase
