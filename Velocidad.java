/*
* @(#) Velocidad.java  1.0 1-11-2010
* Copyright (c) IES Luis Velez Guevara.
* Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
* All rights reserved.
*/

package relacion03;

/**
 * Clase Velocidad.Realiza las siguientes funciones:<BR>
 * - Registra la velocidad actual de un vehiculo.<BR>
 * - Activa una alarma cuando se sobrepasa un maximo de velocidad.<BR>
 * - Registra la mayor velocidad alcanzada por el vehiculo.<BR>
 * - Metodos para incrementar y decrementar la velocidad.<BR>
 * - Metodo para desactivar la alarma cuando sea posible.
 * @author David Martin
 * @version Version 1.0 1-11-2010
 */
public class Velocidad {
	
	/** Para guardar la velocidad maxima.Sobrepasandola se activa la alarma */
	private final int maxima = 120;
	
	/** Para guardar la velocidad actual del vehiculo */
	private int velActual;
	
	/** Para guardar el historico de velocidad maxima */
	private int histVel;
	
	/** Para establecer la alarma y su estado */
	private boolean alarma;
	
	/**
	 * Inicializa el objeto con valores por defecto
	 * @param no recibe parametros de entrada
	 */
	public Velocidad() {
		this.velActual = 0;
		this.histVel = 0;
		this.alarma = false;
	}
	
	/**
	 * Inicializa el objeto con los valores por parametro recibidos
	 * @param velocidad variable de tipo int para indicar la velocidad
	 */
	public Velocidad(int velocidad) {
		this.histVel = 0;
		this.alarma = false;
		/* Si la velocidad introducida es mayor que la maxima permitidad
		 * se establece la maxima como velocidad actual y se activa la alarma.
		 */
		if (velocidad > this.maxima){
			this.velActual = maxima;
			this.alarma = true;
		// En caso contrario se asigna a la velocidad actual.
		} else {
			this.velActual = velocidad;
		}
		/* Si la velocidad introducida es mayor que el historico de velocidad
		 * guardado, se asigna a este la velocidad introducida.
		 */
		if (this.velActual > this.histVel){
			this.histVel = this.velActual;
		}
	}

	/**
	 * Para incrementar la velocidad actual del vehiculo
	 * @param velocidad variable de tipo int para incrementar velActual
	 */
	public void incrementar(int velocidad) {
		// Si la velocidad es negativa se pasa a positiva
		if (velocidad < 0){
			velocidad = velocidad * (-1);
		}
		/* Si la suma de la velocidad actual mas la velocidad introducida
		 * es mayor que la velocidad maxima permitida, se establece como
		 * velocidad actual la maxima permitida.Ademas,se activa la alarma.
		 */
		if ((this.getVelActual() + velocidad) > this.getMaxima()){
			this.setVelActual(this.getMaxima());
			this.setAlarma(true);
		/* En caso contrario, se suma a la velocidad actual la velocidad
		 * introducida
		 */
		} else {
			this.setVelActual(this.getVelActual() + velocidad);
		}
		/* Si la velocidad actual es mayor que el historico de velocidad
		 * se asigna al historico la velocidad actual.
		 */
		if (this.getVelActual() > this.getHistVel()){
			this.setHistVel(this.getVelActual());
		}
	}
	
	/**
	 * Para decrementar la velocidad actual del vehiculo
	 * @param velocidad variable de tipo int para decrementar velActual
	 */
	public void decrementar(int velocidad) {
		// Si la velocidad es negativa se pasa a positiva
		if (velocidad < 0){
			velocidad = velocidad * (-1);
		}
		/* Si la velocidad introducida es mayor que la velocidad actual,
		 * la velocidad actual pasa a ser 0.
		 */
		if (velocidad > this.getVelActual()){
			this.setVelActual(0);
		// En caso contrario, se resta a velActual la velocidad inroducida
		} else {
			this.setVelActual(this.getVelActual() - velocidad);
		}
	}

	/**
	 * Para desactivar la alarma y establecer a 0 el historico de velocidad
	 * @param no recibe parametros de entrada
	 */
	public void borrarAlarma() {
		/* Si la velocidad actual es igual a 0, se asigna a alarma false y 
		 * se asigna a histVel el valor de 0
		 */
		if (this.getVelActual() == 0) {
			this.setAlarma(false);
			this.setHistVel(0);
		}
	}
	
	// Metodos getter
	/**
	 * Para consultar el contenido de maxima
	 * @return devuelve un valor de tipo int
	 */
	public int getMaxima() {
		return maxima;
	}
	
	/**
	 * Para consultar el contenido de velActual
	 * @return devuelve un valor de tipo int
	 */	
	public int getVelActual() {
		return velActual;
	}
	
	/**
	 * Para consultar el contenido de histVel
	 * @return devuelve un valor de tipo int
	 */	
	public int getHistVel() {
		return histVel;
	}
	/**
	 * Para consultar el contenido de alarma
	 * @return devuelve true si esta activada y false si no lo esta
	 */	
	public boolean isAlarma() {
		return alarma;
	}
	
	// Metodos setter
	/**
	 * Para modificar el contenido de velActual
	 * @param velActual variable de tipo int
	 */
	public void setVelActual(int velActual) {
		this.velActual = velActual;
	}
	
	/**
	 * Para modificar el contenido de histVel
	 * @param histVel variable de tipo int
	 */	
	public void setHistVel(int histVel) {
		this.histVel = histVel;
	}
	
	/**
	 * Para modificar el contenido de alarma
	 * @param alarma variable de tipo boolean
	 */		
	public void setAlarma(boolean alarma) {
		this.alarma = alarma;
	}
	
	/** 
	 * Metodo main. Para hacer pruebas con la clase Velocidad.
	 * @param args argumentos de la linea de comandos
	 */
	public static void main(String[] args) {
		// Se crea un objeto de tipo velocidad
		Velocidad v1 = new Velocidad (50);
		// Se consulta la velocidad actual
		System.out.print("La velocidad en este momento es: "
				         + v1.getVelActual());
		// Se consulta el historico maximo de velocidad
		System.out.print("\nLa velocidad maxima alcanzada es: "
				         + v1.getHistVel());
		// Se consulta el estado de la alarma
		System.out.print("\nEl estado actual de la alarma es: "
				         + v1.isAlarma());
		// Se incrementa la velocidad actual
		v1.incrementar(20);
		// Se consulta la velocidad actual
		System.out.print("\nLa velocidad en este momento es: "
				         + v1.getVelActual());
		// Se decrementa la velocidad actual
		v1.decrementar(30);
		// Se consulta la velocidad actual
		System.out.print("\nLa velocidad en este momento es: "
				         + v1.getVelActual());
		// Se incrementa la velocidad actual
		v1.incrementar(100);
		// Se consulta la velocidad actual
		System.out.print("\nLa velocidad en este momento es: "
				         + v1.getVelActual());
		// Se consulta el estado de la alarma
		System.out.print("\nEl estado actual de la alarma es: "
				         + v1.isAlarma());
		// Se consulta el historico maximo de velocidad
		System.out.print("\nLa velocidad maxima alcanzada es: "
				         + v1.getHistVel());
		// Se decrementa la velocidad actual
		v1.decrementar(300);
		// Se consulta la velocidad actual
		System.out.print("\nLa velocidad en este momento es: "
				         + v1.getVelActual());
		// Se llama al metodo que borra la alarma
		v1.borrarAlarma();
		// Se consulta el estado de la alarma
		System.out.print("\nEl estado actual de la alarma es: "
				         + v1.isAlarma());
		// Se consulta el historico maximo de velocidad
		System.out.print("\nLa velocidad maxima alcanzada es: "
				         + v1.getHistVel());
	} //Fin main

} //Fin clase
