package fecha;

import java.util.*;
import java.text.*;
public class VerFecha3{
	public static void main(String args[]){
		Date hoy = new Date();
		System.out.println("FECHA CON FORMATO AMERICANO");
		String fechaL=DateFormat.getDateInstance(
			DateFormat.SHORT, Locale.US).format(hoy);
		System.out.println("Fecha corta: "+fechaL);
		fechaL= DateFormat.getDateInstance(
			DateFormat.MEDIUM, Locale.US).format(hoy);
		System.out.println("Fecha media: "+fechaL);
		fechaL= DateFormat.getDateInstance(
			DateFormat.LONG, Locale.US).format(hoy);
		System.out.println("Fecha larga: "+fechaL);
		fechaL=DateFormat.getDateInstance(
			DateFormat.FULL, Locale.US).format(hoy);
		System.out.println("Fecha completa: "+fechaL);
		System.out.println("FECHA CON FORMATO ESPAÑOL");
		Locale fEspañol=new Locale(
			"es", "ES","Traditional_WIN");
		fechaL = DateFormat.getDateInstance(
			DateFormat.SHORT, fEspañol).format(hoy);
		System.out.println("Fecha corta: "+fechaL);
		fechaL= DateFormat.getDateInstance(
			DateFormat.MEDIUM, fEspañol).format(hoy);
		System.out.println("Fecha media: "+fechaL);
		fechaL= DateFormat.getDateInstance(
		DateFormat.LONG, fEspañol).format(hoy);
		System.out.println("Fecha larga: "+fechaL);
		fechaL = DateFormat.getDateInstance(
			DateFormat.FULL, fEspañol).format(hoy);
		System.out.println("Fecha completa: "+fechaL);
		DateFormat formato = new SimpleDateFormat(
			"EEE d MMM yy", fEspañol);
		fechaL = formato.format(hoy);
		System.out.println("Fecha formato libre "+fechaL);
	}
}
