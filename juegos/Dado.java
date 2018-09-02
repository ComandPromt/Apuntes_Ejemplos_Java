/**
 Dado.java contiene la clase Dado, para simular un dado.
 */

package juegos;

import java.util.Random;


/**
 * La clase dado, representa un dado genérico con un numero de caras
 * configurable. Genera valores pseudoaleatorios.
 * 
 * @author ComandPromt
 * @version v1.0 Fecha: 10-11-2016
 */


public class Dado {

	/** Representa el valor actual del dado. El valor de la cara superior */

	private int valorDado;

	/** Representa el numero de caras del dado */
	private int numCaras;

	/** Generador de elementos pseudoaleatorios */
	private static Random r;

	/**
	 * Constructor por defecto. Genera un dado de 6 caras y valor inicial 1
	 */

	
	public Dado() {
		valorDado = 1;
		numCaras = 6;
		r = new Random();
	}

	/**
	 * Construcctor para definir el numero de caras del dado. Ademas inicializa
	 * el valor del dado a uno.
	 * 
	 * @param numCaras
	 *            Numero de caras que se desea establecer
	 */

	
	public Dado(int numCaras) {
		super();
		this.valorDado = 1;
		this.numCaras = numCaras;
		r = new Random();
	}

	/**
	 * Construcctor para definir el numero de caras e inicializar el valor del
	 * dado segun los valores pasador por parametro
	 * 
	 * @param valorDado Valor actual deL dado
	 * @param numCaras  Numero de caras que se desea establecer
	 */

	
	public Dado(int valorDado, int numCaras) {
		super(); //Llamamos al constructor de la clase padre
		this.valorDado = valorDado;
		this.numCaras = numCaras;
		r = new Random();
	}

		
	/**Devuelve el valor actual del dado
	 * 
	 * @return el valor actual del dado
	 */
	
	
	public int getValorDado() {
		return valorDado;
	}

			
	/**
	 * Devuelve el numero de caras
	 
	 * @return el numero de caras
	 */
	
	
	public int getNumCaras() {
		return numCaras;
	}

	
	/**
	 * Establece el numero de caras del dado
	 * @param numCaras Numero de caras
	 */
	
	
	public void setNumCaras(int numCaras) {
		this.numCaras = numCaras;
	}

	
	/**
	 * Genera un valor pseudoaleatorio, y lo asigna al valor actual del dado
	 * @return valorDado devuelve el valor del dado
	 */
	
	
	public int tirarDado() {
		
		/*Genera un valor aleatorio entre 0 y el numero de caras no inclusive, y se le suma uno para generar
		 * valores entre uno y el numero de caras inclusive
		 */
		
		valorDado = r.nextInt(numCaras) + 1;

		return valorDado;
	}

	/**
	 * Genera un valor pseudoaleatorio asignando un numero de caras, y lo asigna al valor actual del dado
	 * @return valorDado devuelve el valor del dado
	 */
	
	public int tirarDado2(int numCaras) {
		valorDado = r.nextInt(numCaras) + 1;

		return valorDado;
	}

} //Fin clase Dado
