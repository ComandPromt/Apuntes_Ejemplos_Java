/*
* @(#) Fecha.java  1.0 30-10-2010
* Copyright (c) IES Luis Velez Guevara.
* Avenida Tomas Bevia, s/n, Ecija (Sevilla), SPAIN.
* All rights reserved.
*/

package relacion03;

/**
 * Clase Fecha.Realiza un serie de acciones sobre una fecha numerica<BR>
 * facilitada por teclado:<BR>
 * - Metodo comprobarFecha.Comprueba que una fecha sea correcta.
 *   Para el 29 <BR>&nbsp&nbsp de febrero se comprobara,ademas,que el
 *   anyo introducido sea bisiesto.<BR>
 * - Metodo toString.Se reescribe para establecer un formato de salida.<BR>
 * - Metodo avanzaDia.Avanza un dia sobre la fecha introducida.
 * @author David Martin
 * @version Version 1.0 30-10-2010
 */
public class Fecha {
	/** Para indicar el dia de la fecha */
	private int dia;
	/** Para indicar el mes de la fecha */
	private int mes;
	/** Para indicar el anyo de la fecha */
	private int anyo;
	
	/**
	 * Inicializa el objeto con valores por defecto
	 * @param no recibe parametros de entrada
	 */
	public Fecha(){
		this.dia = 1;
		this.mes = 1;
		this.anyo = 1970;
	}
	
	/**
	 * Inicializa el objeto con los valores por parametro recibidos
	 * @param dia variable de tipo int para indicar el dia
	 * @param mes variable de tipo int para indicar el mes
	 * @param anyo variable de tipo int para indicar el anyo
	 */
	public Fecha (int dia,int mes,int anyo){
		// LLamo al constructor por defecto
		this();
		// Se comprueba la fecha y si es valida se asignan los valores
		if(compFecha(dia,mes,anyo)){
			this.dia = dia;
			this.mes = mes;
			this.anyo = anyo;
		}
	}
	
	/**
	 * Para comprobar que la fecha introducida sea correcta
	 * @param no recibe parametros de entrada
	 * @return devuelve un valor de tipo boolean
	 */
	public boolean compFecha(int dia,int mes,int anyo){
		/* Meses con 28/29 dias: Febrero
		 * Meses con 30 dias: Abril,Junio,Septiembre,Noviembre
		 * Meses con 31 dias: Enero,Marzo,Mayo,Julio,Agosto,Octubre,Diciembre
		 */
		
		// Para el valor a devolver por el metodo
		boolean a = false;
		
		switch (mes){
		// Para los meses de 31 dias
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			// Si el dia esta comprendido entre el rango es valido
			if (dia >= 1 && dia <= 31 ){
				a = true;
			// Si no no es valido
			} else {
				a = false;
			}
			break;
		// Para los meses de 30 dias	
		case 4:case 6:case 9:case 11:
			// Si el dia esta comprendido entre el rango es valido
			if (dia >= 1 && dia <= 30 ){
				a = true;
			// Si no no es valido
			} else {
				a = false;
			}
			break;
		// Para el mes de Febrero	
		case 2:
			// Si el dia esta comprendido entre el rango es valido
			if (dia >= 1 && dia <= 29 ){
				a = true;
				// Para el dia 29, se comprueba si el anyo es bisiesto
				if (dia == 29){
					if (bisiesto(anyo)){
						a = true;
					} else {
						a = false;
					}
				}
			// Si no no es valido
			} else {
				a = false;
			}
				
		} // Fin Switch
		return a;
	} //Fin compFecha
	
	
	/**
	 * Para comprobar que un anyo sea o no bisiesto
	 * @param anyo variable de tipo int para indicar el anyo
	 * @return devuelve un valor de tipo boolean
	 */
	private boolean bisiesto(int anyo){
		// Si es divisible entre 4 pero no es divisible entre 100 es bisiesto
		if (anyo % 4 == 0 && anyo % 100 != 0 ){
			return true;
		} else {
		// Si es divisible entre 100,es bisiesto si es divisible entre 400 
			if (anyo % 400 == 0){
				return true;
			} else {
				return false;
			} //Fin if-else
		}//Fin if-else
	}//Fin metodo bisiesto
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		// Para guardar el valor del mes
		String month = "";
		// Si la fecha es valida se imprime
		if(compFecha(this.getDia(),
				this.getMes(),this.getAnyo())){
			switch (this.getMes()){
			// Para la conversion del mes
			case 1: month="Enero"; break;
			case 2: month="Febrero"; break;
			case 3: month="Marzo"; break;
			case 4: month="Abril"; break;
			case 5: month="Mayo"; break;
			case 6: month="Junio"; break;
			case 7: month="Julio"; break;
			case 8: month="Agosto"; break;
			case 9: month="Septiembre"; break;
			case 10: month="Octubre"; break;
			case 11: month="Noviembre"; break;
			case 12: month="Diciembre"; break;
			}
			
			return this.getDia()+" de "+month+" de "+this.getAnyo();
		// Si no es valida, se indica	
		} else {
			return "La fecha introducida no es valida";
		}//Fin if-else
	}//Fin metodo toString
	
	
	/**
	 * Para avanzar un dia sobre la fecha introducida
	 * @param no recibe parametros de entrada
	 */
	public void avanzaDia(){
		// Si la fecha es valida se avanza un dia
		if(compFecha(this.getDia(),
				this.getMes(),this.getAnyo())){
			switch (this.getMes()){
			// Para los meses de 31 dias
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
				// Para los dias del 1 al 30
				if (this.getDia() >= 1 && this.getDia() < 31 ){
					this.setDia(getDia() + 1);
				// Para el dia 31	
				} else {
					this.setDia(1);
					// Si es diciembre se pasa a enero
					if(this.getMes() == 12){
						this.setMes(1);
						// Ademas se avanza el anyo
						this.setAnyo(this.getAnyo() + 1);
					// Si no,el mes se incrementa en 1
					} else {
						this.setMes(this.getMes() + 1);
					}
				}
				break;
			// Para los meses de 30 dias	
			case 4:case 6:case 9:case 11:
				// Para los dias del 1 al 29
				if (this.getDia() >= 1 && this.getDia() < 30 ){
					this.setDia(getDia() + 1);
				// Para el dia 30
				} else {
					this.setDia(1);
					this.setMes(this.getMes() + 1);
				}
				break;
			// Para el mes de Febrero	
			case 2:
				// Para los dias del 1 al 27
				if (this.getDia() >= 1 && this.getDia() < 28 ){
					this.setDia(getDia() + 1);
					
				// Para los dias 28 y 29
				} else {
					// Para el dia 28
					if(this.getDia() == 28){
						// Si el anyo es bisiesto se avanza un dia
						if (bisiesto(this.getAnyo())){
							this.setDia(this.getDia() + 1);
						// Si no, se pasa a 1 y se avanza el mes
						} else {
							this.setDia(1);
							this.setMes(this.getMes() + 1);
						}
					// Para el dia 29
					} else {
						this.setDia(1);
						this.setMes(this.getMes() + 1);
					}//Fin if-else
				}	//Fin if-else
			} // Fin Switch
		} // Fin if
	}//Fin metodo avanzaDia
	
	
	// Metodos getter
	/**
	 * Para consultar el contenido de dia
	 * @return devuelve un valor de tipo int
	 */
	public int getDia() {
		return dia;
	}
	
	
	/**
	 * Para consultar el contenido de mes
	 * @return devuelve un valor de tipo int
	 */
	public int getMes() {
		return mes;
	}
	
	
	/**
	 * Para consultar el contenido de anyo
	 * @return devuelve un valor de tipo int
	 */
	public int getAnyo() {
		return anyo;
	}

	// Metodos setter
	/**
	 * Para modificar el contenido de dia
	 * @param dia variable de tipo int
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	
	/**
	 * Para modificar el contenido de mes
	 * @param mes variable de tipo int
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	
	/**
	 * Para modificar el contenido de anyo
	 * @param anyo variable de tipo int
	 */
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	/** Para modificar una fecha (valores de dia, mes y anyo)
	 * @param dia variable de tipo int para indicar el dia
	 * @param mes variable de tipo int para indicar el mes
	 * @param anyo variable de tipo int para indicar el anyo
	 */
	public void setFecha(int dia,int mes,int anyo){
		if (compFecha(dia,mes,anyo)){
			this.setDia(dia);
			this.setMes(mes);
			this.setAnyo(anyo);
		}
	}
	
	/** 
	 * Metodo main. Para hacer pruebas con la clase Fecha.
	 * @param args argumentos de la linea de comandos
	 */
	public static void main(String[] args) {
		// Se crea un objeto de tipo fecha, usando constructor por parametros
		Fecha b1 = new Fecha (31,13,2000);
		// Al imprimirlo comprobamos que la fecha es correcta
		System.out.print(b1+"\n");
		// Ahora vamos a cambiar la fecha
		b1.setFecha(31,2,2002);
		// Se imprime...
		System.out.print(b1+"\n");
		// ...la fecha anterior, ya que al ser la fecha 31-2-2002 no valida,
		// permanece la que se introdujo al crear el objeto
		
		// Usando el metodo comprobar fecha, se comprueba su funcionamiento
		System.out.print("Fecha 29-2-2000 : "+b1.compFecha(28,2,2000)+"\n");
		System.out.print("Fecha 30-2-2000 : "+b1.compFecha(30,2,2000)+"\n");
		System.out.print("Fecha 12-13-2000 : "+b1.compFecha(12,13,2000)+"\n");
		System.out.print("Fecha 29-2-1996 : "+b1.compFecha(28,2,2000)+"\n");
		
		// Ahora se intenta imprimir una fecha no valida, con la creacion de b2
		Fecha b2 = new Fecha (34,12,2000);
		System.out.print(b2+"\n");
		// En realidad, la fecha no se establece como tal,ya que el constructor
		// por defecto asigna un 0 a cada atributo del objeto, lo que igualmente
		// no es valido para el toString.He aqui sus valores:
		System.out.print("Dia: "+b2.getDia()+" Mes: "+b2.getMes()
						 +" Anyo: "+b2.getAnyo()+"\n");
		// Se comprueba el metodo avanza dia. Para ello usamos el objeto b2
		b2.setFecha(31,12,2000);
		System.out.print(b2+" avanza un dia y pasa a ");
		b2.avanzaDia();
		System.out.print(b2+"\n");
		
		b2.setFecha(28,2,2000);
		System.out.print(b2+" avanza un dia y pasa a ");
		b2.avanzaDia();
		System.out.print(b2+"\n");
		
		b2.setFecha(29,2,2000);
		System.out.print(b2+" avanza un dia y pasa a ");
		b2.avanzaDia();
		System.out.print(b2+"\n");
		
		b2.setFecha(31,1,2000);
		System.out.print(b2+" avanza un dia y pasa a ");
		b2.avanzaDia();
		System.out.print(b2+"\n");
		
	} //Fin main
	
}//Fin clase
