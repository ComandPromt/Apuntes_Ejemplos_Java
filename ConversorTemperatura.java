/**
* @(#) ConversorTemperatura.java  1.0 26-10-2010
* Copyright (c) IES Luis Velez Guevara.
* Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
* All rights reserved.
*/
package relacion02.objetos;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Clase ConversorTemperatura. Convierte la temperatura de grados Fahrenheit
 * a grados Celsius y viceversa.
 * @author ConversorTemperatura
 * @version Version 1.0 26-10-2010
 */
public class ConversorTemperatura {
	
	/** Para guardar la opcion seleccionada */
	private int opcion;
	/** Para guardar la temperatura a convertir */
	private double medida;
	/** Para guardar la conversion */
	private double conversion;
	
	/**
	 * Define un objeto con valores por defecto
	 * @param no recibe parametros de entrada
	 */
	public ConversorTemperatura (){
		this.opcion = 0;
		this.medida = 0;
		this.conversion = 0;
	}
	
	/**
	 * Para seleccionar la opcion e introducir la temperatura a convertir
	 * @param no recibe parametros de entrada
	 */
	public void imprimeMenu(){
		// Se crea un objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		// Se pide opcion a ejecutar
		System.out.print("Convertir Fahrenheit a Celsius.Pulsar 1.\n");
		System.out.print("Convertir Celsius a Fahrenheit.Pulsar 2. \n");
		System.out.print("Introduce opcion y pulsar intro: ");
		this.setOpcion(sc.nextInt());
		// Segun la opcion introducida se piden Fahrenheit o Celsius
		if (this.getOpcion() == 1){
			System.out.print("Introduce temperatura en Fahrenheit: ");
		} else {
			System.out.print("Introduce temperatura en Celsius: ");
		}
		this.setMedida(sc.nextDouble());	
	}
	
	/**
	 * Realiza una conversion en funcion de la opcion seleccionada
	 * @param no recibe parametros de entrada
	 */
	public void realizaConversion(){
		if (this.getOpcion() == 1){
			this.setConversion(((this.medida - 32) * 5 ) / 9);
		} else {
			this.setConversion(((9 * this.medida) / 5 ) + 32);
		} //Fin if-else
	}
		
	/**
	 * Se imprime la conversion realizada
	 * @param no recibe parametros de entrada
	 */
	public void imprimirResultados (){
		// Formato de salida para imprimir solo dos decimales
		DecimalFormat f = new DecimalFormat("########.##" );
		
		if (this.getOpcion() == 1){
			System.out.print(f.format(this.getMedida())
					         +" grados Fahrenheit son "+f.format
					         (this.getConversion())+" Celsius");
		} else {
			System.out.print(f.format(this.getMedida())
			         +" grados Celsius son "+f.format
			         (this.getConversion())+" Fahrenheit");
		}//Fin if-else
	}
	
	// Metodos getter
	/**
	 * Para consultar el valor de opcion
	 * @return devuelve un valor de tipo int
	 */
	public int getOpcion() {
		return opcion;
	}
	/**
	 * Para consultar el valor de medida
	 * @return devuelve un valor de tipo double
	 */
	public double getMedida() {
		return medida;
	}
	/**
	 * Para consultar el valor de conversion
	 * @return devuelve un valor de tipo double
	 */
	public double getConversion() {
		return conversion;
	}

	// Metodos setter
	/**
	 * Para modificar el valor de opcion
	 * @param opcion variable de tipo int
	 */
	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}
	
	/**
	 * Para modificar el valor de medida
	 * @param medida variable de tipo double
	 */
	public void setMedida(double medida) {
		this.medida = medida;
	}
	
	/**
	 * Para modificar el valor de conversion
	 * @param conversion variable de tipo double
	 */	
	public void setConversion(double conversion) {
		this.conversion = conversion;
	}

	/** 
	 * Metodo main. Para hacer pruebas con la clase ConversorTemperatura.
	 * @param args argumentos de la linea de comandos
	 */
	public static void main(String[] args) {
		// Se crea un objeto de tipo ConversorTemperatura
		ConversorTemperatura con = new ConversorTemperatura();
		// Se imprime el menu para entrar datos
		con.imprimeMenu();
		// Se covierte la cantidad
		con.realizaConversion();
		// Se imprimen resultados
		con.imprimirResultados();
	} //Fin main

} //Fin clase
