/*
* @(#) Fraccion.java  1.0 31-10-2010
* Copyright (c) IES Luis Velez Guevara.
* Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
* All rights reserved.
*/

package relacion03;

import java.text.DecimalFormat;

/**
 * Clase Fraccion.Define como atributos un numerador y un denominador,<BR>
 * a partir de los cuales se realizan una serie de comprobaciones y 
 * acciones.
 * @author David Martin
 * @version Version 1.0 31-10-2010
 */
public class Fraccion {
	/** Para guardar el valor del numerador */
	private int num;
	/** Para guardar el valor del denominador */
	private int den;
	
	/**
	 * Inicializa el objeto con valores por defecto
	 * @param no recibe parametros de entrada
	 */
	public Fraccion (){
		this.num = 1;
		this.den = 1;
	}
	
	/**
	 * Inicializa el objeto con los valores por parametro recibidos
	 * @param num variable de tipo int para indicar el numerador
	 * @param den variable de tipo int para indicar el denominador
	 */
	public Fraccion (int num, int den){
		// LLamo al constructor por defecto
		this();
		// Si el denominador es negativo, se pasa el signo - al numerador
		// Si ambos son negativos pasan a ser positivos
		if (den < 0){
			num = num * (-1);
			den = den * (-1);
		}
		this.num = num;
		this.den = den;
	}
	
	/**
	 * Para calcular la equivalencia en valor real.<BR>
	 * Al usar la clase DecimalFormat para limitar los decimales a
	 * dos,<BR>hay que devolver un String, al ser este el formato en el
	 * que<BR> trabaja dicha clase.
	 * @return devuelve un valor de tipo String
	 */
	public String equivalencia(){
		DecimalFormat f = new DecimalFormat("########.##");
		return f.format((double) this.getNum() / this.getDen());
	}
	
	/**
	 * Para asignar valores al numerador y al denominador
	 * @param num variable de tipo int para indicar el numerador
	 * @param den variable de tipo int para indicar el denominador
	 */
	public void asignaValores (int num,int den){
		
		// Variable para guardar el mcd
		int mcd2;
		
		// Variable que indica si el numerador es negativo
		boolean numNegativo = false;
		
		/* Si el denominador es negativo, se pasa el signo - al numerador
		 * Igualmente, si ambos son negativos pasan a ser positivos
		 */
		if (den < 0){
			num = num * (-1);
			den = den * (-1);
		}
		
		/* Se comprueba si el denominador es negativo.Si es asi, se
		 * pasa a positivo.La variable numNegativo pasa a true.
		 */
		if (num < 0){
			num = num * (-1);
			numNegativo = true;
		}
		
		/* Si el denominador es distinto de 0 se reduce la fraccion.
		 * En caso contrario, no se realiza ninguna accion.
		 */
		if (den != 0){
			// Se calcula el mcd de ambos y se asigna a la variable mcd
			mcd2 = mcd(num,den);
			// Si el mcd es distinto de 1 se reduce la fraccion
			if (mcd2 != 1){
				num = num / mcd2;
				den = den / mcd2;
			}
			// Si numNegativo es igual a true se reasigna el - al numerador
			if (numNegativo){
				num = num * (-1);
			}
			// Se asignan los valores de num y den a los atributos del objeto
			this.setNum(num);
			this.setDen(den);
		}//Fin if
	}
	
	/**
	 * Para calcular la suma de dos fracciones
	 * @param f1 variable de tipo Fraccion para realizar la suma
	 * @return devuelve un objeto de tipo Fraccion
	 */
	public Fraccion suma(Fraccion f1){
		// Para devolver la fraccion resultante
		Fraccion f2 = new Fraccion();
		
		// Para guardar el m.c.m de ambos denominadores
		int mcm2 = mcm(this.getDen(),f1.getDen());
		
		/* Se asigna el denominador a f2, que es resultado de llamar
		 * a mcm con los denominadores de this y de f1
		 */
		f2.setDen(mcm2);
		
		/* Se asigna el numerador a f2. Para ello:
		 * - Se multiplica el numerador de this por el resultado de dividir
		 *   el mcm entre el denominador de this
		 * - Se multiplica el numerador de f1 por el resultado de dividir
		 *   el mcm entre el denominador de f1
		 * - Se suman ambas operaciones asignandolas al numerador de f2
		 */
		f2.setNum ( (this.getNum() * (mcm2 / this.getDen())) 
				   + (f1.getNum() * (mcm2 / f1.getDen())) );
				   
		// Se reduce la fraccion, si es posible
		f2.asignaValores(f2.getNum(),f2.getDen());
		return f2;
	}
	
	/**
	 * Para calcular la resta de dos fracciones
	 * @param f1 variable de tipo Fraccion para realizar la resta
	 * @return devuelve un objeto de tipo Fraccion
	 */	
	public Fraccion resta(Fraccion f1){
		// Para devolver la fraccion resultante
		Fraccion f2 = new Fraccion();
		
		// Para guardar el m.c.m de ambos denominadores
		int mcm2 = mcm(this.getDen(),f1.getDen());
		
		/* Se asigna el denominador a f2, que es resultado de llamar
		 * a mcm con los denominadores de this y de f1
		 */
		f2.setDen(mcm2);
		
		/* Se asigna el numerador a f2. Para ello:
		 * - Se multiplica el numerador de this por el resultado de dividir
		 *   el mcm entre el denominador de this
		 * - Se multiplica el numerador de f1 por el resultado de dividir
		 *   el mcm entre el denominador de f1
		 * - Se restan ambas operaciones asignandolas al numerador de f2
		 */
		f2.setNum ( (this.getNum() * (mcm2 / this.getDen())) 
				   - (f1.getNum() * (mcm2 / f1.getDen())) );
		// Se reduce la fraccion, si es posible
		f2.asignaValores(f2.getNum(),f2.getDen());
		return f2;
	}
	
	/**
	 * Para calcular la multiplicacion de dos fracciones
	 * @param f1 variable de tipo Fraccion para realizar la multiplicacion
	 * @return devuelve un objeto de tipo Fraccion
	 */		
	public Fraccion mult(Fraccion f1){
		// Para devolver la fraccion resultante
		Fraccion f2 = new Fraccion();
		
		/* Se multiplica el numerador de this por el numerador de f1
		 * y se asigna el resultado al numerador de f2
		 */
		f2.setNum(this.getNum() * f1.getNum());
		
		/* Se multiplica el denominador de this por el denominador de f1
		 * y se asigna el resultado al denominador de f2
		 */
		f2.setDen(this.getDen() * f1.getDen());
		
		// Se reduce la fraccion, si es posible
		f2.asignaValores(f2.getNum(),f2.getDen());
		return f2;
	}
	
	/**
	 * Para calcular la division de dos fracciones
	 * @param f1 variable de tipo Fraccion para realizar la division
	 * @return devuelve un objeto de tipo Fraccion
	 */		
	public Fraccion divis(Fraccion f1){
		// Para devolver la fraccion resultante
		Fraccion f2 = new Fraccion();
		
		/* Se multiplica el numerador de this por el denominador de f1
		 * y se asigna el resultado al numerador de f2
		 */
		f2.setNum(this.getNum() * f1.getDen());
		
		/* Se multiplica el denominador de this por el numerador de f1
		 * y se asigna el resultado al denominador de f2
		 */
		f2.setDen(this.getDen() * f1.getNum());
		
		// Se reduce la fraccion, si es posible
		f2.asignaValores(f2.getNum(),f2.getDen());
		return f2;
	}	
	/**
	 * Para calcular el m.c.d de dos numeros.
	 * @param num variable de tipo int para indicar el valor del numerador
	 * @param den variable de tipo int para indicar el valor del denominador
	 * @return devuelve un valor de tipo int
	 */
	private int mcd (int num,int den){
		/* Para guardar el valor del mcd.Se incializa a 1.
		 * Este valor se mantiene cuando no existe un mcd real.
		 */
		int mcd = 1;
		
		// Para guardar el menor de los dos numeros
		int menor;
		if (num < den){
			menor = num;
		} else {
			menor = den;
		}
		
		/* Este for comprende desde el 2 hasta el menor de los dos numeros.
		 * Si la i es divisor de ambos se guarda en mcd. Este valor se
		 * va reasignando cada vez que se encuentra un divisor comun a
		 * ambos.El ultimo valor asignado corresponde al mcd real.
		 */
		for (int i=2 ; i <= menor; i++){
			if (num % i == 0 && den % i == 0){
				mcd = i;
			}
		}
		
		return mcd;
	} //Fin mcd

	/**
	 * Para calcular el m.c.m de dos numeros
	 * @param den1 variable de tipo int para indicar el primer denominador
	 * @param den2 variable de tipo int para indicar el segundo denominador
	 * @return devuelve un valor de tipo int
	 */
	private int mcm (int den1,int den2){
		/* Si el mcd de ambos denominadores no existe,se multiplican ambos,
		 * con lo que se obtiene el m.c.m
		 */
		if (mcd(den1,den2) == 1){
			return den1 * den2;
		/* En caso contrario, el m.c.m se obtiene tras multiplicar ambos
		 * denominadores y dividir el resultado por el m.c.d de ambos
		 */
		} else {
			return (den1 * den2) / mcd(den1,den2);
		}
	}
	
	// Metodos getter
	/**
	 * Para consultar el contenido de num
	 * @return devuelve un valor de tipo int
	 */
	public int getNum() {
		return num;
	}

	/**
	 * Para consultar el contenido de den
	 * @return devuelve un valor de tipo int
	 */
	public int getDen() {
		return den;
	}

	// Metodos setter
	/**
	 * Para modificar el contenido de num
	 * @param num variable de tipo int
	 */
	public void setNum(int num) {
		this.num = num;
	}
	
	/**
	 * Para modificar el contenido de den
	 * @param den variable de tipo int
	 */
	public void setDen(int den) {
		this.den = den;
	}

	/** 
	 * Metodo main. Para hacer pruebas con la clase Fraccion.
	 * @param args argumentos de la linea de comandos
	 */
	public static void main(String[] args) {
		// Se crea un objeto de tipo Fraccion
		Fraccion f = new Fraccion(1,-2);
		// Se llama al metodo de consulta del numerador
		System.out.print("Numerador: "+f.getNum());
		// Se llama al metodo de consulta del denominador
		System.out.print("\nDenominador: "+f.getDen());
		// Se llama al metodo de equivalencia en valor real
		System.out.print("\nEquivalencia en valor real: "+f.equivalencia());
		// Se llama al metodo asignacion
		f.asignaValores(6,8);
		// Se imprimen numerador y denominador
		System.out.print("\nValores tras metodo asignaValores:");
		System.out.print("\nNumerador: "+f.getNum());
		System.out.print("\nDenominador: "+f.getDen());
		// Se crea dos nuevas fracciones
		Fraccion f1 = new Fraccion(9,4);
		Fraccion f2 = new Fraccion(3,8);
		// Y la referencia a una tercera
		Fraccion f3;
		
		// Se suma f1 con f2.El resultado se guarda en f3.
		f3 = f1.suma(f2);
		System.out.print("\nResultados de suma:");
		System.out.print("\nNumerador: "+f3.getNum());
		System.out.print("\nDenominador: "+f3.getDen());
		// Se resta a f1 la fraccion f2.El resultado se guarda en f3.
		f3 = f1.resta(f2);
		System.out.print("\nResultados de resta:");
		System.out.print("\nNumerador: "+f3.getNum());
		System.out.print("\nDenominador: "+f3.getDen());
		// Se multiplica f1 por f2.El resultado se guarda en f3.
		f3 = f1.mult(f2);
		System.out.print("\nResultados de multiplicacion:");
		System.out.print("\nNumerador: "+f3.getNum());
		System.out.print("\nDenominador: "+f3.getDen());
		
		// Se divide f1 entre f2.El resultado se guarda en f3.
		f3 = f1.divis(f2);
		System.out.print("\nResultados de division:");
		System.out.print("\nNumerador: "+f3.getNum());
		System.out.print("\nDenominador: "+f3.getDen()+"\n");
	} //Fin main

} //Fin clase
