/**
* @(#) ConversorMoneda.java  1.0 25-10-2010
* Copyright (c) IES Luis Velez Guevara.
* Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
* All rights reserved.
*/

package relacion02.objetos;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Clase ConversorMoneda.Covierte euros a pesetas y pesetas a euros.
 * @author David Martin
 * @version Version 1.0 25-10-2010
 */
public class ConversorMoneda {
	
	/** Para guardar la opcion seleccionada */
	private int opcion;
	/** Para guardar la cantidad a convertir */
	private double cantidad;
	/** Para guardar el resultado de la conversion */
	private double resultado;

	/**
	 * Define un objeto con valores por defecto
	 * @param no recibe parametros de entrada
	 */
	public ConversorMoneda(){
		this.opcion = 0;
		this.cantidad = 0;
		this.resultado = 0;
	}
	
	/**
	 * Para imprimir el menu y seleccionar la opcion deseada
	 * @param no recibe parametros de entrada
	 */
	public void menuOpciones(){
		// Se crea un objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		// Se imprime el menu
		System.out.print("Para convertir pesetas a euros, pulse 1.\n");
		System.out.print("Para convertir euros a pesetas,pulse 2.\n");
		System.out.print("Seleccione opcion: ");
		// Se le asigna a opcion la entrada hecha con Scanner
		this.setOpcion(sc.nextInt());
			
	}
	
	/**
	 * Realiza la conversion de euros a pesetas y de pesetas a euros
	 * @param no recibe parametros de entrada
	 */
	public void conversor(){
		// Se crea un objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		
		// Para concertir de pesetas a euros
		if (this.getOpcion() == 1){
			System.out.print("Introduce cantidad en pesetas: ");
			this.setCantidad(sc.nextDouble());
			this.setResultado(this.getCantidad() / 166.386);
			
		} else {// Para convertir de euros a pesetas
			System.out.print("Introduce cantidad en euros: ");
			this.setCantidad(sc.nextDouble());
			this.setResultado(this.getCantidad() * 166.386);	
		} //Fin if-else
	}
	
	/**
	 * Para imprimir los resultados obtenidos
	 * @param no recibe parametros de entrada
	 */
	public void imprimir (){
		// Formato de salida para imprimir solo dos decimales
		DecimalFormat f = new DecimalFormat("########.##" );
		
		// Si la opcion es la 1 es de pesetas a euros, sino al contrario
		if (this.getOpcion() == 1){
			System.out.print(f.format(this.getCantidad())+" pesetas son "
					         +f.format(this.getResultado())+" euros");
		}else{
			System.out.print(f.format(this.getCantidad())+" euros son "
					         +f.format(this.getResultado())+" pesetas");
		}//Fin if-else
	}
	
	/**
	 * Para consultar el valor de opcion
	 * @return devuelve un valor de tipo int
	 */
	public int getOpcion() {
		return opcion;
	}
	
	/**
	 * Para consultar el valor de cantidad
	 * @return devuelve un valor de tipo double
	 */
	public double getCantidad() {
		return cantidad;
	}
	
	/**
	 * Para consultar el valor de resultado
	 * @return devuelve un valor de tipo double
	 */
	public double getResultado() {
		return resultado;
	}

	/**
	 * Para modificar el valor de opcion
	 * @param opcion variable de tipo int
	 */
	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}
	
	/**
	 * Para modificar el valor de cantidad
	 * @param cantidad variable de tipo double
	 */
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	/**
	 * Para modificar el valor de resultado
	 * @param resultado variable de tipo double
	 */
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	/** 
	 * Metodo main. Para hacer pruebas con la clase ConversorMoneda.
	 * @param args argumentos de la linea de comandos
	 */
	public static void main(String[] args) {
		// Se crea un objeto de tipo ConversorMoneda
		ConversorMoneda c1 = new ConversorMoneda();
		// Se carga el menu
		c1.menuOpciones();
		// Se ejecuta el conversor
		c1.conversor();
		// Se imprimen los resultados
		c1.imprimir();
	} //Fin main

} //Fin clase
