/**
* @(#) Calificaciones.java  1.0 26-10-2010
* Copyright (c) IES Luis Velez Guevara.
* Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
* All rights reserved.
*/

package relacion02.objetos;

import java.util.Scanner;

/**
 * Clase Calificaciones. Lee una calificacion numerica y la transforma
 * en calificacion alfabetica.
 * @author David Martin
 * @version Version 1.0 26-10-2010
 */
public class Calificaciones {
	/** Para la entrada numerica */
	private double num;
	/** Para guardar la calificacion correspondiente */
	private String nota;
	
	/**
	 * Define un objeto con valores por defecto
	 * @param no recibe parametros de entrada
	 */
	public Calificaciones(){
		this.num = 0;
		this.nota = "";
	}
	
	/**
	 * Para pedir la calificacion numerica
	 * @param no recibe parametros de entrada
	 */
	public void pedirNumero(){
		// Se crea un objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		// Se pide la nota numerica
		System.out.print("Introduce la calificacion numerica: ");
		this.setNum(sc.nextDouble());
	}
	
	/**
	 * Convierte una calificacion numerica en alfabetica
	 * @param no recibe parametros de entrada
	 */
	public void convertir(){
		/* Calificaciones:
		 * Muy deficiente: 0-2. Deficiente: 3. Insuficiente: 4. 
		 * Suficiente: 5. Bien: 6. Notable: 7-8. Sobresaliente: 9-10.
		 */
		
		// Se asigna a la variable a el valor introducido
		double a = this.getNum();

		if (a >= 0 && a < 3){
			this.setNota("Muy deficiente");
		} else if (a >= 3 && a < 4){
			this.setNota("Deficiente");
		} else if (a >= 4 && a < 5){
			this.setNota("Insuficiente");
		} else if (a >= 5 && a < 6){
			this.setNota("Suficiente");
		} else if (a >= 6 && a < 7){
			this.setNota("Bien");
		} else if (a >= 7 && a < 9){
			this.setNota("Notable");
		} else if (a >= 8 && a <= 10){
			this.setNota("Sobresaliente");
		} else if (a < 0 || a > 10){
			this.setNota("valor no valido");
		} //Fin if
	} //Fin metodo convertir
	
	/**
	 * Para imprimir el resultado de la conversion
	 * @param no recibe parametros de entrada
	 */
	public void imprimir(){
		System.out.print("Un "+this.getNum()+" es un "
				         +this.getNota());
	}
	
	// Metodos getter
	
	/** Para consultar el contenido de num
	 * @return devuelve un valor de tipo double
	 */
	public double getNum() {
		return num;
	}
	
	/** Para consultar el contenido de nota
	 * @return devuelve un valor de tipo String
	 */
	public String getNota() {
		return nota;
	}
	
	
	// Metodos setter
	
	/** Para modificar el contenido de num
	 * @param num variable de tipo double
	 */
	public void setNum(double num) {
		this.num = num;
	}
	
	/** Para modificar el contenido de nota
	 * @param nota variable de tipo String
	 */
	public void setNota(String nota) {
		this.nota = nota;
	}

	/** 
	 * Metodo main. Para hacer pruebas con la clase Calificaciones.
	 * @param args argumentos de la linea de comandos
	 */
	public static void main(String[] args) {
		// Se crea un objeto de la clase Calificaciones
		Calificaciones caf1 = new Calificaciones();
		// Se pide el numero correspondiente a la calificacion
		caf1.pedirNumero();
		// Se convierte a calificacion alfabetica
		caf1.convertir();
		// Se imprime el resultado
		caf1.imprimir();

	}//Fin main

}//Fin Clase 
