/*
 * @(#) JuegoPiedraPapelTijera.java  1.0 18-11-2014
 * Copyright (c) IES Luis Velez Guevara.
 * Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
 * All rights reserved.
 */

/**
 * Clase JuegoPiedraPapelTijera. Representa el juego Piedra-Papel-Tijera entre
 * dos jugadores, al mejor de 10 asaltos
 * 
 * @author David Martin
 * @version 1.0 18-11-2014
 */

public class JuegoPiedraPapelTijera {

	/**
	 * Metodo principal para la ejecuci—n del programa.
	 * 
	 * @param args
	 *            argumentos por linea de comandos
	 */
	public static void main(String[] args) {

		// Creamos los objetos JugadorPartida para el juego
		JugadorPartida j1 = new JugadorPartida();
		JugadorPartida j2 = new JugadorPartida(0, 0, "David");

		// Bucle para ver quien es el primero en conseguir 10 victorias
		do {
			// Sacan dedos ambos jugadores
			j1.sacarDedos();
			j2.sacarDedos();

			// Imprimo para comprobar las tiradas (no hace falta)
			System.out.println("\n" + j1.toString());
			System.out.println(j2.toString());

			/*
			 * Compruebo si hay empate Si los valores de las tiradas son IGUALES
			 * hay empate y no se hace nada, se ejecutaria de nuevo el bucle y
			 * se vuelve a tirar Si los valores son DISTINTOS no hay empate, y
			 * por tanto hay que comprobar el ganador dentro de la condicion
			 */
			if (j1.getTirada() != j2.getTirada()) {

				/*
				 * Compruebo si el jugador 1 gana al jugador 2, para ello como:
				 * Piedra=0 Papel=1 Tijera=2 Puedo hacer la resta entre los
				 * resultados obtenidos: Si la diferencia entre la tirada del
				 * jugador 1 y el jugador 2 es de un punto o de -2 puntos, eso
				 * quiere decir que gana el jugador 1. En cualquier otro caso,
				 * si no hay empate y no gana el jugador 1, es que
				 * obligatoriamente debe ganar el jugador 2
				 */
				if (j1.getTirada() - j2.getTirada() == 1
						|| j1.getTirada() - j2.getTirada() == -2) {

					j1.setNumVictorias(j1.getNumVictorias() + 1);
				} else { // Sino gana jugador1 y no hay empate, gana jugador2
					j2.setNumVictorias(j2.getNumVictorias() + 1);
				}

			}

		} while (j1.getNumVictorias() < 10 && j2.getNumVictorias() < 10);

		// Compruebo quien ha sido el ganador
		System.out.println("\n\nEl ganador es: ");

		if (j1.getNumVictorias() == 10)
			System.out.println(j1.toString());
		else
			System.out.println(j2.toString());

		// Para probar el metodo quitar victorias
		System.out.println("\nEl jugador " + j1.getNombre() + " tiene "
				+ j1.getNumVictorias());
		System.out.println("El jugador " + j2.getNombre() + " tiene "
				+ j2.getNumVictorias());
		j1.quitarVictoria(j2);
		System.out.println("\nEl jugador " + j1.getNombre()
				+ " despues de quitar victorias tiene " + j1.getNumVictorias());
		System.out.println("El jugador " + j2.getNombre()
				+ " despues de quitar victorias tiene " + j2.getNumVictorias());

	}

}
