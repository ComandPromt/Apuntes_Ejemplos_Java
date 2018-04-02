/*
 * @(#) PuntoBidimensional.java  1.0 3-12-2014
 * Copyright (c) IES Luis Velez Guevara.
 * Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
 * All rights reserved.
 */

package ejerciciojuegotanque;

/**
 * Clase PuntoBidimensional. Representa un punto en el plano bidimensional
 * 
 * @author David Martin
 * @version 1.0 03-12-2014
 */
public class PuntoBidimensional {

	/** Representa la coordenada X en el plano */
	int coorX;
	/** Representa la coordenada Y en el plano */
	int coorY;

	/**
	 * Constructor sin parámetros de un punto bidimensional, se inicializa el
	 * punto al origen de coordenadas
	 */
	public PuntoBidimensional() {
		coorX = 0;
		coorY = 0;
	}

	/**
	 * Constructor con parámetros de un punto bidimensional, se inicializa la
	 * posicion a los valores pasados como parámetros
	 * 
	 * @param coorX
	 *            La coordenada X del plano para inicializar el punto
	 *            bidimensional
	 * @param coorY
	 *            La coordenada Y del plano para inicializar el punto
	 *            bidimensional
	 * 
	 */
	public PuntoBidimensional(int coorX, int coorY) {
		this.coorX = coorX;
		this.coorY = coorY;
	}

	/**
	 * Devuelve la coordenada X del punto bidimensional
	 * 
	 * @return retorna la coordenada X del punto
	 * 
	 */
	public int getCoorX() {
		return coorX;
	}

	/**
	 * Estable el valor pasado como parámetro al atributo coorX
	 * 
	 * @param coorX
	 *            valor de la coordenada X que se quiere establecer
	 */
	public void setCoorX(int coorX) {
		this.coorX = coorX;
	}

	/**
	 * Devuelve la coordenada Y del punto bidimensional
	 * 
	 * @return retorna la coordenada Y del punto
	 * 
	 */
	public int getCoorY() {
		return coorY;
	}

	/**
	 * Estable el valor pasado como parámetro al atributo coorY
	 * 
	 * @param coorY
	 *            valor de la coordenada Y que se quiere establecer
	 */
	public void setCoorY(int coorY) {
		this.coorY = coorY;
	}

	/**
	 * Devuelve una cadena con los valores actuales de los atributos
	 * 
	 * @return cadena de caracteres que indica los valores del objeto
	 */
	public String toString() {
		return "PuntoBidimensional [coorX=" + coorX + ", coorY=" + coorY + "]";
	}

}
