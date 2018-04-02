/**
* @(#) LetraDNI.java  1.0 25-10-2010
* Copyright (c) IES Luis Velez Guevara.
* Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
* All rights reserved.
*/

package relacion02.objetos;


import java.util.Scanner;
/**
*	Clase LetraDNI 
*
* @version      version 1.0 27-10-2010
* @author       David Martin
*/

public class LetraDNI {

	/**
	 * Constante de tipo String que contiene la cadena de letras disponibles para un DNI.
	 */
	 public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	 /**
	  * Metodo main. Lanza el ejercicio LetraDNI
	  */
	public static void main(String[] args) {

		
		boolean correcto=true;
		
		do{
			System.out.println ("Indique su DNI para obtener la letra correspondiente");
			
			int digitos=pideEntero();
			
			if ((digitos < 0)||(digitos > 99999999)){
				System.out.println ("El DNI introducido no es correcto\n\n");
				correcto=false;
			}else{
				String NIF = NIF (digitos);
				System.out.println ("NIF: "+NIF);
				correcto=true;
			}//Fin if-else
			
		}while (!correcto); //Fin do-while
		
	} //Fin main
	

	/**
	   * Metodo NIF. Devuelve un NIF completo a partir de un DNI. Es decir, añade la letra del NIF
	   * 
	   * @param dni: dni al que se quiere añadir la letra del NIF
	   * @return NIF completo.
	   */
	public static String NIF(int dni) {
		    
		return String.valueOf(dni) +"-"+ LETRAS.charAt(dni % 23);
		  
	}
	
	/**
	 * Metodo pideEntero(). Se obtiene un numero Entero.
	 * 
	 * @param no recibe parametros de entrada.
	 * @return valor: numero entero solicitado.
	 */
	public static int pideEntero (){
		
		int valor = 0;
		boolean error = false;
		Scanner sc = new Scanner (System.in);
		
		do{
			
			try{
				if (error){
					sc.nextLine();
					error = false;
				}
				valor = sc.nextInt();
				
			}catch (Exception e){
				error = true;
				System.out.println ("Error en la entrada");
			}//Fin catch
			
		}while (error);//Fin do-while
		
		return valor;
	} //Fin metodo pideEntero
} //Fin clase
