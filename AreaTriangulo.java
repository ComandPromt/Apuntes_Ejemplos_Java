/*
* @(#) AreaTriangulo.java  1.0 24-10-2010
* Copyright (c) IES Luis Velez Guevara.
* Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
* All rights reserved.
*/

package relacion02.objetos;

import java.text.DecimalFormat;
import java.util.Scanner;

/** 
 * Clase AreaTriangulo. Pide por pantalla los datos de un triangulo
 * equilatero para calcular su perimetro y su area.
 * @author David Martin
 * @version Version 1.0 24-10-2010
 */
 
public class AreaTriangulo {
	/** Para guardar el valor del lado del triangulo */
	private float lado;
	/** Para guardar el valor del area */
	private float area;
	/** Para guardar el valor del perimetro */
	private float perimetro;
	
	/** 
	 * Define un objeto con los valores por parametro recibidos
	 * @param lado variable de tipo int para indicar el valor del lado
	 */
	public AreaTriangulo (float lado){
		this.lado = lado;
	}

	/**
	 * Para calcular el area del triangulo
	 * @param no recibe parametros de entrada
	 */
	public void calculaArea (){
		float a = this.getLado();
		this.setArea((float)(Math.pow(2,a) * (Math.sqrt(a) / 4)));
	}
	
	/**
	 * Para calcular el perimetro del triangulo
	 * @param no recibe parametros de entrada 
	 */
	public void calculaPerimetro (){
		this.setPerimetro(3 * this.getLado());
	}
	
	/**
	 * Para imprimir los resultados del area y del perimetro
	 * @param no recibe parametros de entrada
	 */
	public void imprimirResultados(){
		//float a = this.getArea();
		// Formato de salida para imprimir solo dos decimales
		DecimalFormat f = new DecimalFormat("########.##" );
		// Se imprimen los resultado del area y del perimetro
		System.out.print("El perimetro del triangulo es: "
				         +(f.format(this.getPerimetro())+"\n"));
		System.out.print("El area del triangulo es: "
				         +f.format((this.getArea())));
	}
	
	// Metodos getter
	
	/**
	 * Para consultar el valor de lado
	 * @return variable de tipo float para indicar el valor de lado
	 */
	public float getLado() {
		return lado;
	}
	
	/**
	 * Para consultar el valor de area
	 * @return variable de tipo float para indicar el valor de lado
	 */
	public float getArea() {
		return area;
	}

	/**
	 * Para consultar el valor de perimetro
	 * @return variable de tipo float para indicar el valor de lado
	 */
	public float getPerimetro() {
		return perimetro;
	}

	// Metodos setter
	
	/**
	 * Para modificar el valor de lado
	 * @param lado variable de tipo float
	 */
	public void setLado(float lado) {
		this.lado = lado;
	}

	/**
	 * Para modificar el valor de area
	 * @param area variable de tipo float
	 */
	public void setArea(float area) {
		this.area = area;
	}

	/**
	 * Para modificar el valor de perimetro
	 * @param perimetro variable de tipo float
	 */
	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}

	/** 
	 * Metodo main. Para realizar pruebas con la clase AreaTriangulo.
	 * @param args argumentos de la linea de comandos
	 */
	public static void main(String[] args) {
		// Se crea un objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		// Se pide por pantalla el valor del lado del triangulo
		System.out.print("Introduce valor para triangulo equilatero: ");
		// Se crea un objeto de la clase AreaTriangulo, pasandole
		// los segundos mediante la entrada de datos con Scanner
		AreaTriangulo t1 = new AreaTriangulo(sc.nextFloat());
		t1.calculaArea();
		t1.calculaPerimetro();
		t1.imprimirResultados();
	} //Fin Main

} //Fin Clase
