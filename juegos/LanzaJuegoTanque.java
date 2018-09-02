/*
 * @(#) LanzaJuegoTanque.java  1.0 3-12-2014
 * Copyright (c) IES Luis Velez Guevara.
 * Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
 * All rights reserved.
 */
package ejerciciojuegotanque;

/**
 * Clase LanzaJuegoTanque. Representa el juego de ataque mutuo entre dos tanques
 * 
 * @author David Martin
 * @version 1.0 03-12-2014
 */
public class LanzaJuegoTanque {

	/** Lanza la ejecución de la aplicación
	 *  
	 * @param args argumentos por linea de comandos
	 */
	public static void main(String[] args) {

		// Creamos los dos objetos tanque
		Tanque t1 = new Tanque();
		Tanque t2 = new Tanque(10, 10, "Pepito");

		// Imprimimos por pantalla los valores de los tanques
		System.out.println("Tanque 1" + t1.toString());
		System.out.println("Tanque 2" + t2.toString());

		// Movemos los dos tanques en una direccion
		t1.moverTanque(2);
		t2.moverTanque(7);
		
		// Movemos los dos tanques una posición de forma aleatoria
		t1.moverTanque();
		t2.moverTanque();

		// Imprimimos por pantalla los valores de los tanques
		System.out.println("Tanque 1" + t1.toString());
		System.out.println("Tanque 2" + t2.toString());

		// FORMA 1: DE SOLUCIONAR EL PROBLEMA DE UNIR DISPARO CON OTRO TANQUE
//		t1.disparaTanque();
//		if (t1.getDisparoX() == t2.getCoorX()
//				&& t1.getDisparoY() == t2.getCoorY()) {
//			System.out.println("Le hemos endiñao al tanque 2");
//			t2.setVivo(false);
//		} else {
//			System.out.println("Agüita");
//		}

		// FORMA 2: DE SOLUCIONAR EL PROBLEMA DE UNIR DISPARO CON OTRO TANQUE
//		PuntoBidimensional p = t1.disparaTanque();
//		if (p.getCoorX() == t2.getCoorX() && p.getCoorY() == t2.getCoorY()) {
//			System.out.println("Le hemos endiñao al tanque 2");
//			t2.setVivo(false);		
//		} else {
//			System.out.println("Agüita");
//		}

		// FORMA 3: DE SOLUCIONAR EL PROBLEMA DE UNIR DISPARO CON OTRO TANQUE
		do {
			t1.disparaTanque(t2);
			
			if (t2.isVivo() == true)		
				t2.disparaTanque(t1);
			
		} while (t1.isVivo() == true && t2.isVivo() == true);

		if (t1.isVivo()==true)
			System.out.println("Tanque 1 ha ganado");
		else
			System.out.println("Tanque 2 ha ganado");
	}

}
