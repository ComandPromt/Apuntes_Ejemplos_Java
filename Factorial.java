/**
* @(#) Factorial.java  1.0 26-10-2010
* Copyright (c) IES Luis Velez Guevara.
* Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
* All rights reserved.
*/

package relacion02.objetos;

import java.util.Scanner;

/**
 * Clase Factorial.Para calcular el factorial de un numero.
 * @author David Martin
 * @version Version 1.0 26-10-2010
 */
public class Factorial {
	
	/** Para guardar el numero a introducir */
	int num;
	/** Para guardar el factorial de numero introducido*/
	int factorial;
	
	/**
	 * Define un objeto con valores por defecto
	 * @param no recibe parametros de entrada
	 */
	public Factorial (){
		this.num = 0;
		this.factorial = 1; // Se le asigna 1, ya que 0 daria como resultado 0
	}
	
	/**
	 * Para pedir el numero del que se calcula el factorial
	 * @param no recibe parametros de entrada
	 */
	public void pedirNumero (){
		// Se crea un objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		// Se pide el numero
		System.out.print("Introduce numero: ");
		// Se asigna a num
		this.setNum(sc.nextInt());
	}
	
	/**
	 * Para calcular el factorial del numero introducido
	 * @param no recibe parametros de entrada
	 */
	public void calcularFactorial(){
		int fac=1;
		// Mediante un for se calcula el factorial
		for (int i =this.getNum() ; i >=1 ; i--) {
			factorial=factorial*i;
		}
		
		this.setFactorial(fac);
	}
	
	/**
	 * Imprime el resultado del factorial
	 * @param no recibe parametros de entrada
	 */
	public void imprimirResultado(){
		System.out.print("El factorial de "+this.getNum()+" es "
				         +this.getFactorial());
	}
	
	
	/**
	 * Para consultar el valor de num
	 * @return devuelve un valor int
	 */
	public int getNum() {
		return num;
	}
	/**
	 * Para consultar el valor de factorial
	 * @return devuelve un valor int
	 */
	public int getFactorial() {
		return factorial;
	}

	/**
	 * Para modificar el contenido de num
	 * @param num variable de tipo int
	 */
	public void setNum(int num) {
		this.num = num;
	}
	/**
	 * Para modificar el contenido de factorial
	 * @param factorial variable de tipo int
	 */
	public void setFactorial(int factorial) {
		this.factorial = factorial;
	}

	/** 
	 * Metodo main. Para hacer pruebas con la clase Factorial.
	 * @param args argumentos de la linea de comandos
	 */
	public static void main(String[] args) {
		// Se crea un objeto de la clase Factorial
		Factorial f1 = new Factorial();
		// Se pide un numero
		f1.pedirNumero();
		// Se calcula el factorial de ese numero
		f1.calcularFactorial();
		// Se imprime el resultado
		f1.imprimirResultado();
	} //Fin main

}//Fin clase
