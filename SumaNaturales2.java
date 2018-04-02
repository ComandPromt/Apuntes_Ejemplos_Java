/**
* @(#) SumaNaturales2.java  1.0 26-10-2010
* Copyright (c) IES Luis Velez Guevara.
* Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
* All rights reserved.
*/

package relacion02.objetos;

import java.util.Scanner;

/**
 * Para realizar la suma de los numeros naturales comprendidos entre dos
 * numeros
 * @author David Martin
 * @version Version 1.0 26-10-2010
 */
 
public class SumaNaturales2 {
	
	/** Para guardar el primer numero */
	private int num1;
	/** Para guardar el segundo numero */
	private int num2;
	/** Para guardar el resultado de la suma */
	private int suma;
	
	/**
	 * Define un objeto con valores por defecto
	 * @param no recibe parametros de entrada
	 */
	public SumaNaturales2(){
		this.num1 = 0;
		this.num2 = 0;
	}
	
	/**
	 * Para pedir los dos numeros por teclado
	 * @param no recibe parametros de entrada
	 */
	public void pedirNumeros(){
		// Se crea un objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		// Se pide el primer numero
		System.out.print("Introduce el primer numero: ");
		this.setNum1(sc.nextInt());
		// Se pide el segundo numero
		System.out.print("Introduce el segundo numero: ");
		this.setNum2(sc.nextInt());
	}
	
	/**
	 * Para calcular la suma de los numeros
	 * @param no recibe parametros de entrada
	 */
	public void calculaSuma (){
		int numero1 = this.getNum1();
		int numero2 = this.getNum2();
		for (int i = numero1; i <= numero2 ; i++) {
			this.setSuma(this.getSuma()+i);
		}//Fin for
	} //Fin calculaSuma
	
	/**
	 * Para imprimir resultados
	 * @param no recibe parametros de entrada
	 */
	public void imprimir (){
		System.out.print("La suma de los numeros comprendidos es: "
				         +this.getSuma());
	}
	
	// Metodos getter
	
	/** Para consultar el valor de num1
	 * @return devuelve un valor de tipo int
	 */
	public int getNum1() {
		return num1;
	}
	
	/** Para consultar el valor de num2
	 * @return devuelve un valor de tipo int
	 */
	public int getNum2() {
		return num2;
	}
	
	/** Para consultar el valor de suma
	 * @return devuelve un valor de tipo int
	 */	
	public int getSuma() {
		return suma;
	}
	
	// Metodos setter
	
	/** Para modificar el contenido de num1
	 * @param num1 variable de tipo int
	 */
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	/** Para modificar el contenido de num2
	 * @param num2 variable de tipo int
	 */
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	/** Para modificar el contenido de suma
	 * @param suma variable de tipo int
	 */
	public void setSuma(int suma) {
		this.suma = suma;
	}

	/** 
	 * Metodo main. Para hacer pruebas con la clase SumaNaturales2.
	 * @param args argumentos de la linea de comandos
	 */
	public static void main(String[] args) {
		// Se crea un objeto de tipo SumaNaturales2
		SumaNaturales2 sn1 = new SumaNaturales2();
		// Se piden los numeros
		sn1.pedirNumeros();
		// Se calcula la suma
		sn1.calculaSuma();
		// Se imprimen resultados
		sn1.imprimir();
	}//Fin main

}//Fin clase
