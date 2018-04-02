/*
 * @(#) JugadorPartida.java  1.0 18-11-2014
 * Copyright (c) IES Luis Velez Guevara.
 * Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
 * All rights reserved.
 */

import java.util.Random;

/**
 * Clase JugadorPartida. Representa un jugador de Piedra-Papel-Tijera
 * 
 * @author David Martin
 * @version 1.0 18-11-2014
 */

public class JugadorPartida {

	/**
	 * Representa un valor numerico asociado a la tirada de piedra (0), papel
	 * (1) o tijera (2)
	 */
	private int tirada;

	/**
	 * Representa el numero de victorias alamcenadas por el jugador en cada
	 * juego
	 */
	private int numVictorias;

	/** Representa el nombre asignado a cada jugador */
	private String nombre;

	/**
	 * Representa el componente aleatorio que tendrán los jugadores en la
	 * partida
	 */
	private static Random aleatorio;

	/**
	 * Constructor por defecto para la clase Jugador partida, donde se
	 * inicializan a cero los valores numéricos y se crean los objetos
	 * correspondientes
	 * 
	 */
	public JugadorPartida() {
		this.tirada = 0;
		this.numVictorias = 0;
		this.nombre = "Automatico";
		aleatorio = new Random();
	}

	/**
	 * Constructor con tres parametros para la clase Jugador partida, donde se
	 * inicializan de los atributos con los parámetros y se crean los objetos
	 * correspondientes
	 * @param tirada valor de la ultima tirada
	 * @param numVictorias numero de victorias almacenadas
	 * @param nombre nombre del jugador
	 */
	public JugadorPartida(int tirada, int numVictorias, String nombre) {

		this.tirada = tirada;
		this.numVictorias = numVictorias;
		this.nombre = nombre;
		aleatorio = new Random();
	}

	/** Devuelve el valor de la ultima tirada
	 * @return valor de la ultima tirada
	 */
	public int getTirada() {
		return tirada;
	}

	/** Se establece el valor que se quiere que tenga la ultima tirada
	 * @param tirada valor de la ultima tirada
	 */
	public void setTirada(int tirada) {
		this.tirada = tirada;
	}

	/** Devuelve el numero de victorias que lleva el jugador hasta el momento
	 * @return numero de victorias que lleva el jugador hasta el momento
	 */
	public int getNumVictorias() {
		return numVictorias;
	}

	/** Establece el numero de victorias que lleva el jugador hasta el momento
	 * @param numVictorias numero de victorias que lleva el jugador hasta el momento
	 */
	public void setNumVictorias(int numVictorias) {
		this.numVictorias = numVictorias;
	}

	
	/** Devuelve el nombre del jugador
	 * @return el nombre del jugador
	 */
	public String getNombre() {
		return nombre;
	}

	/** Establece el nombre del jugador
	 * @param nombre el nombre del jugador
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String toString() {
		String aux="JugadorPartida [numVictorias="
		+ numVictorias + ", nombre=" + nombre;
		switch(tirada){
		case 0:
			aux=aux+" tirada: piedra]";
			break;
		case 1:
			aux=aux+" tirada: papel]";
			break;
		case 2:
			aux=aux+" tirada: tijera]";
			break;
		}
		return aux;
	}
	
	
	/** Realiza una nueva tirada de manos.
	 * @return el valor de la tirada realizada
	 */
	public int sacarDedos(){
		
		tirada=aleatorio.nextInt(3);
		
		return tirada;
		
	}
	
	/** Metodo para quitar una victoria al jugador pasado como parámetro
	 * @param jugador objeto jugador al que se le quiere quitar una victoria
	 */
	public void quitarVictoria(JugadorPartida jugador){
	
		jugador.setNumVictorias(jugador.getNumVictorias()-1);
		
	}

}
