/*
 * @(#) Tanque.java  1.0 3-12-2014
 * Copyright (c) IES Luis Velez Guevara.
 * Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
 * All rights reserved.
 */
package ejerciciojuegotanque;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase Tanque. Un tanque en una posicion del plano
 * 
 * @author David Martin
 * @version 1.0 03-12-2014
 */

public class Tanque {

	/** Representa la coordenada X en el plano de juego */
	private int coorX;

	/** Representa la coordenada Y en el plano de juego */
	private int coorY;

	// FORMA 2: DE SOLUCIONAR EL PROBLEMA DE UNIR DISPARO CON OTRO TANQUE
	/** Representa la posición o coordenadas del tanque en el tablero o plano */
	private PuntoBidimensional posicion;

	/** Representa el nombre del tanque */
	private String nombre;

	/** Representa la vida o muerte del tanque */
	private boolean vivo;

	// FORMA 1: DE SOLUCIONAR EL PROBLEMA DE UNIR DISPARO CON OTRO TANQUE
	/** Representa la última coordenada X de disparo */
	private int disparoX;
	/** Representa la última coordenada Y de disparo */
	private int disparoY;

	/**
	 * Constructor sin parámetros de un objeto Tanque, inicializa los valores de
	 * los atributos del tanque
	 */
	public Tanque() {
		Random aleatorio = new Random();
		int x = aleatorio.nextInt(20) + 1;
		int y = aleatorio.nextInt(20) + 1;

		this.coorX = x;
		this.coorY = y;

		// FORMA 2: DE SOLUCIONAR EL PROBLEMA DE UNIR DISPARO CON OTRO TANQUE
		posicion = new PuntoBidimensional(x, y);

		// FORMA 1: DE SOLUCIONAR EL PROBLEMA DE UNIR DISPARO CON OTRO TANQUE
		// this.disparoX=0;
		// this.disparoY=0;

		this.vivo = true;
		this.nombre = "Tank";
	}

	/**
	 * Constructor con parámetros de un objeto Tanque, se inicializa los valores
	 * del tanque, con los valores pasados como parámetros
	 * 
	 * @param coorX
	 *            La coordenada X de la posición del tanque en el tablero
	 * @param coorY
	 *            La coordenada Y de la posición del tanque en el tablero
	 * @param nombre
	 *            Indica el nombre que se quiere asignar al tanque
	 */
	public Tanque(int coorX, int coorY, String nombre) {
		this.coorX = coorX;
		this.coorY = coorY;

		// FORMA 2: DE SOLUCIONAR EL PROBLEMA DE UNIR DISPARO CON OTRO TANQUE
		posicion = new PuntoBidimensional(coorX, coorY);

		// FORMA 1: DE SOLUCIONAR EL PROBLEMA DE UNIR DISPARO CON OTRO TANQUE
		// this.disparoX=0;
		// this.disparoY=0;
		this.vivo = true;
		this.nombre = nombre;
	}

	/**
	 * Devuelve la coordenada X de la posición del tanque en el tablero
	 * 
	 * @return retorna la coordenada X de la posición del tanque en el tablero
	 * 
	 */
	public int getCoorX() {
		return coorX;
	}

	/**
	 * Estable el valor pasado como parámetro al atributo coorX
	 * 
	 * @param coorX
	 *            valor de la coordenadaX que se quiere establecer
	 */
	public void setCoorX(int coorX) {
		this.coorX = coorX;
	}

	/**
	 * Devuelve la coordenada Y de la posición del tanque en el tablero
	 * 
	 * @return retorna la coordenada Y de la posición del tanque en el tablero
	 * 
	 */
	public int getCoorY() {
		return coorY;
	}

	/**
	 * Estable el valor pasado como parámetro al atributo coorY
	 * 
	 * @param coorY
	 *            valor de la coordenadaY que se quiere establecer
	 */
	public void setCoorY(int coorY) {
		this.coorY = coorY;
	}

	/**
	 * Devuelve el nombre del tanque
	 * 
	 * @return retorna un cadena con el nombre del tanque
	 * 
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del tanque
	 * 
	 * @param nombre
	 *            Hace referencia al nombre del tanque
	 * 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// FORMA 1: DE SOLUCIONAR EL PROBLEMA DE UNIR DISPARO CON OTRO TANQUE
	/**
	 * Devuelve la coordenada X de disparo del tanque en el tablero
	 * 
	 * @return retorna la coordenada X de disparo del tanque en el tablero
	 * 
	 */
	public int getDisparoX() {
		return disparoX;
	}

	/**
	 * Estable el valor pasado como parámetro al atributo disparoX
	 * 
	 * @param disparoX
	 *            valor de la coordenadaX que se quiere establecer como ultimo
	 *            disparo
	 */
	public void setDisparoX(int disparoX) {
		this.disparoX = disparoX;
	}

	/**
	 * Devuelve la coordenada Y de disparo del tanque en el tablero
	 * 
	 * @return retorna la coordenada Y de disparo del tanque en el tablero
	 * 
	 */
	public int getDisparoY() {
		return disparoY;
	}

	/**
	 * Estable el valor pasado como parámetro al atributo disparoY
	 * 
	 * @param disparoY
	 *            valor de la coordenadaY que se quiere establecer como ultimo
	 *            disparo
	 */
	public void setDisparoY(int disparoY) {
		this.disparoY = disparoY;
	}

	/**
	 * Devuelve un objeto de tipo PuntoBidimensional que indica la posición del
	 * tanque en el tablero
	 * 
	 * @return retorna un objeto PuntoBidimensional con la pocisión del tanque
	 * 
	 */
	public PuntoBidimensional getPosicion() {
		return posicion;
	}

	/**
	 * Estable la nueva posición del tanque con la posición (PuntoBidimensional)
	 * pasada como parámetro
	 * 
	 * @param posicion
	 *            posicion en el tablero del tanque
	 */
	public void setPosicion(PuntoBidimensional posicion) {
		this.posicion = posicion;
	}

	/**
	 * Devuelve si el tanque está vivo o no
	 * 
	 * @return retorna true si el tanque está vivo o false si está muerto
	 * 
	 */
	public boolean isVivo() {
		return vivo;
	}

	/**
	 * Asigna true o false a la vida del tanque indicar si vive o muere
	 * respectivamente
	 * 
	 * @param vivo
	 *            valor de vida o muerte del tanque
	 */
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	/**
	 * Devuelve una cadena con los valores actuales de los atributos
	 * 
	 * @return cadena de caracteres que indica los valores del objeto
	 */
	public String toString() {
		return "Tanque [coorX=" + coorX + ", coorY=" + coorY + ", nombre="
				+ nombre + "]";
	}

	// FORMA 1: DE SOLUCIONAR EL PROBLEMA DE UNIR DISPARO CON OTRO TANQUE
	/**
	 * Solicita por teclado las dos coordenadas de disparo del tanque
	 */
	public void disparaTanque() {

		Scanner sc = new Scanner(System.in);
		// FORMA 1: DE SOLUCIONAR EL PROBLEMA DE UNIR DISPARO CON OTRO TANQUE
		// do {
		// System.out.println("Introduce Coordenada X de disparo");
		// this.disparoX = sc.nextInt();
		// } while (this.disparoX > 20 || this.disparoX < 1);
		//
		// do {
		// System.out.println("Introduce Coordenada Y de disparo");
		// this.disparoY = sc.nextInt();
		// } while (this.disparoY > 20 || this.disparoY < 1);

		int disparoX;
		do {
			System.out.println("Introduce Coordenada X de disparo");
			disparoX = sc.nextInt();
		} while (disparoX > 20 || disparoX < 1);

		int disparoY;
		do {
			System.out.println("Introduce Coordenada Y de disparo");
			disparoY = sc.nextInt();
		} while (disparoY > 20 || disparoY < 1);

	}

	// FORMA 2: DE SOLUCIONAR EL PROBLEMA DE UNIR DISPARO CON OTRO TANQUE
	// /**
	// * Solicita por teclado la posición de disparo del tanque y la devuelve
	// como
	// * objeto PuntoBidimensional
	// *
	// * @return posicion de disparo
	// */
	// public PuntoBidimensional disparaTanque() {
	//
	// Scanner sc = new Scanner(System.in);
	//
	// int disparoX;
	// do {
	// System.out.println("Introduce Coordenada X de disparo");
	// disparoX = sc.nextInt();
	// } while (disparoX > 20 || disparoX < 1);
	//
	// int disparoY;
	// do {
	// System.out.println("Introduce Coordenada Y de disparo");
	// disparoY = sc.nextInt();
	// } while (disparoY > 20 || disparoY < 1);
	//
	//
	//
	// PuntoBidimensional posiciondisparo = new PuntoBidimensional(disparoX,
	// disparoY);
	//
	// return posiciondisparo;
	//
	// }

	// FORMA 3: DE SOLUCIONAR EL PROBLEMA DE UNIR DISPARO CON OTRO TANQUE
	/**
	 * Solicita por teclado dos coordenadas de disparo, y comprueba si se ha
	 * alcanzado al objeto Tanque pasado como parámetro. En caso de ser
	 * alcanzado, se mata a dicho tanque (se le pone el atributo vivo a falso)
	 * 
	 * @param objetivo
	 *            el objeto tanque al que se le desea disparar
	 * 
	 * @return posicion a la que se ha disparado
	 * 
	 */
	public PuntoBidimensional disparaTanque(Tanque objetivo) {

		System.out.println("Turno de disparo del tanque: " + this.nombre);
		Scanner sc = new Scanner(System.in);
		int disparoX;
		do {
			System.out.println("Introduce Coordenada X de disparo");
			disparoX = sc.nextInt();
		} while (disparoX > 20 || disparoX < 1);

		int disparoY;
		do {
			System.out.println("Introduce Coordenada Y de disparo");
			disparoY = sc.nextInt();
		} while (disparoY > 20 || disparoY < 1);

		if (disparoX == objetivo.getCoorX() && disparoY == objetivo.getCoorY()) {
			System.out.println("Le hemos endiñao al otro tanque");
			objetivo.setVivo(false);
		} else {
			System.out.println("Agüita");
		}

		PuntoBidimensional posiciondisparo = new PuntoBidimensional(disparoX,
				disparoY);

		return posiciondisparo;

	}

	/**
	 * Mueve el tanque a otra posición dependiendo de la dirección que se le
	 * pase como parámetro
	 * 
	 * @param direccion
	 *            dirección en la que se desea mover el tanque
	 */
	public void moverTanque(int direccion) {
		int nuevaX;
		int nuevaY;
		switch (direccion) {

		case 1:
			nuevaX = getCoorX() - 1;
			nuevaY = getCoorY() + 1;
			if (nuevaX > 0 && nuevaX < 21 && nuevaY > 0 && nuevaY < 21) {
				setCoorX(nuevaX);
				setCoorY(nuevaY); // coorY++;
			}
			break;
		case 2:

			nuevaY = getCoorY() + 1;
			if (nuevaY > 0 && nuevaY < 21) {
				setCoorY(nuevaY); // coorY++;
			}

			break;

		case 3:
			nuevaX = getCoorX() + 1;
			nuevaY = getCoorY() + 1;
			if (nuevaX > 0 && nuevaX < 21 && nuevaY > 0 && nuevaY < 21) {
				setCoorX(nuevaX);
				setCoorY(nuevaY);
			}
			break;
		case 4:
			nuevaX = getCoorX() - 1;
			if (nuevaX > 0 && nuevaX < 21) {
				setCoorX(nuevaX);
			}
			break;

		case 5:
			nuevaX = getCoorX() + 1;

			if (nuevaX > 0 && nuevaX < 21) {
				setCoorX(nuevaX);
			}
			break;
		case 6:
			nuevaX = getCoorX() - 1;
			nuevaY = getCoorY() - 1;
			if (nuevaX > 0 && nuevaX < 21 && nuevaY > 0 && nuevaY < 21) {
				setCoorX(nuevaX);
				setCoorY(nuevaY);
			}
			break;

		case 7:

			nuevaY = getCoorY() - 1;
			if (nuevaY > 0 && nuevaY < 21) {
				setCoorY(getCoorY() - 1);
			}
			break;
		case 8:
			nuevaX = getCoorX() - 1;
			nuevaY = getCoorY() + 1;
			if (nuevaX > 0 && nuevaX < 21 && nuevaY > 0 && nuevaY < 21) {
				setCoorX(nuevaX);
				setCoorY(nuevaY);
			}
			break;
		default:
			System.out.println("Dirección Errónea");
			break;
		}
	}

	/**
	 * Mueve el tanque a otra posición aleatoria, desplazando solo una unidad
	 * 
	 */
	public void moverTanque() {

		Random aleatorio = new Random();
		int direccion = aleatorio.nextInt(8) + 1;
		int nuevaX;
		int nuevaY;
		switch (direccion) {

		case 1:
			nuevaX = getCoorX() - 1;
			nuevaY = getCoorY() + 1;
			if (nuevaX > 0 && nuevaX < 21 && nuevaY > 0 && nuevaY < 21) {
				setCoorX(nuevaX);
				setCoorY(nuevaY); // coorY++;
			}
			break;
		case 2:

			nuevaY = getCoorY() + 1;
			if (nuevaY > 0 && nuevaY < 21) {
				setCoorY(nuevaY); // coorY++;
			}

			break;

		case 3:
			nuevaX = getCoorX() + 1;
			nuevaY = getCoorY() + 1;
			if (nuevaX > 0 && nuevaX < 21 && nuevaY > 0 && nuevaY < 21) {
				setCoorX(nuevaX);
				setCoorY(nuevaY);
			}
			break;
		case 4:
			nuevaX = getCoorX() - 1;
			if (nuevaX > 0 && nuevaX < 21) {
				setCoorX(nuevaX);
			}
			break;

		case 5:
			nuevaX = getCoorX() + 1;

			if (nuevaX > 0 && nuevaX < 21) {
				setCoorX(nuevaX);
			}
			break;
		case 6:
			nuevaX = getCoorX() - 1;
			nuevaY = getCoorY() - 1;
			if (nuevaX > 0 && nuevaX < 21 && nuevaY > 0 && nuevaY < 21) {
				setCoorX(nuevaX);
				setCoorY(nuevaY);
			}
			break;

		case 7:

			nuevaY = getCoorY() - 1;
			if (nuevaY > 0 && nuevaY < 21) {
				setCoorY(getCoorY() - 1);
			}
			break;
		case 8:
			nuevaX = getCoorX() - 1;
			nuevaY = getCoorY() + 1;
			if (nuevaX > 0 && nuevaX < 21 && nuevaY > 0 && nuevaY < 21) {
				setCoorX(nuevaX);
				setCoorY(nuevaY);
			}
			break;
		default:
			System.out.println("Dirección Errónea");
			break;
		}
	}
}
