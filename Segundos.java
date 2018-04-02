/**
* @(#) Segundos.java  1.0 24-10-2010
* Copyright (c) IES Luis Velez Guevara.
* Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
* All rights reserved.
*/

package relacion02.objetos;

import java.util.Scanner;

/** 
 * Clase Segundos. Acepta por teclado una cantidad numerica
 * en segundos y la convierte en dias, horas, minutos y segundos.
 * @author David Martin
 * @version Version 1.0
 */

public class Segundos {
	
	/** Para la entrada por teclado de segundos*/
	private int entrada;
	/** Para guardar la cantidad de dias*/
	private int dias;
	/** Para guardar la cantidad de horas*/
	private int horas;
	/** Para guardar la cantidad de minutos*/
	private int min;
	/** Para guardar la cantidad de segundos*/
	private int seg;
	
	/** 
	 * Define un objeto con los valores por parametro recibidos
	 * @param entrada variable de tipo int para indicar los segundos
	 */
	public Segundos (int entrada){
		this.entrada = entrada;
	}
	
	/** 
	 * Metodo conversion. Realiza la conversion de la entrada numerica de
	 * segundos a dias, horas, minutos y segundos.
	 * @param no recibe parametros de entrada
	 */
	public void conversion(){
		int cantidad = this.getEntrada();
		
		// Para comprobar si hay dias
		if (cantidad >= 86400){
			this.setDias(cantidad / 86400);
			cantidad = cantidad % 86400;
		}
		
		// Para comprobar si hay minutos
		if (cantidad >= 3600){
			this.setHoras(cantidad / 3600);
			cantidad = cantidad % 3600;
		}
		
		// Para comprobar los segundos
		if (cantidad >= 60){
			this.setMin(cantidad / 60);
			this.setSeg(cantidad % 60);
		}else {
			this.setSeg(cantidad);
		} //Fin if-else
	}
	
	/** 
	 * Realiza una impresion de los resultados de conversion.
	 * Lo hace imprimiendo el metodo toString.
	 * @param no recibe parametros de entrada
	 */
	public void imprimir(){
		System.out.print(this.toString());
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return this.getEntrada()+" segundos son: \n"+this.getDias()
		+" dias, "+this.getHoras()+" horas, "+this.getMin()+" minutos y "
		+this.getSeg()+" segundos";
	}
	
	// Metodos getter
	/** 
	 * Para consultar el valor de entrada
	 * @return devuelve un valor int
	 */
	public int getEntrada() {
		return entrada;
	}
	
	/** 
	 * Para consultar el valor de dias
	 * @return devuelve un valor int
	 */
	public int getDias() {
		return dias;
	}
	
	/** 
	 * Para consultar el valor de horas
	 * @return devuelve un valor int
	 */
	public int getHoras() {
		return horas;
	}
	
	
	/** 
	 * Para consultar el valor de min
	 * @return devuelve un valor int
	 */
	public int getMin() {
		return min;
	}
	
	
	/** 
	 * Para consultar el valor de seg
	 * @return devuelve un valor int
	 */
	public int getSeg() {
		return seg;
	}

	// Metodos setter
	/** 
	 * Para modificar el valor de entrada
	 * @param entrada variable de tipo int
	 */
	public void setEntrada(int entrada) {
		this.entrada = entrada;
	}
	
	/** 
	 * Para modificar el valor de dias
	 * @param dias variable de tipo int
	 */
	public void setDias(int dias) {
		this.dias = dias;
	}
	
	/** 
	 * Para modificar el valor de horas
	 * @param horas variable de tipo int
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	/** 
	 * Para modificar el valor de min
	 * @param min variable de tipo int
	 */
	public void setMin(int min) {
		this.min = min;
	}
	
	/** 
	 * Para modificar el valor de seg
	 * @param seg variable de tipo int
	 */
	public void setSeg(int seg) {
		this.seg = seg;
	}

	/** 
	 * Metodo main. Para realizar pruebas con la clase Segundos.
	 * @param args argumentos de la linea de comandos
	 */
	public static void main(String[] args) {
		// Se crea un objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		// Se pide por pantalla la cantidad de segundos
		System.out.print("Introduce cantidad en segundos: ");
		// Se crea un objeto de la clase Segundos, pasandole los segundos
		// mediante la entrada de datos con Scanner
		Segundos s1 = new Segundos(sc.nextInt());
		// Se llama al metodo para la conversion de segundos
		s1.conversion();
		// Se llama al metodo para imprimir resultados
		s1.imprimir();
	} //Fin main

} //Fin clase
