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
		System.out.println("FECHA CON FORMATO ESPA�OL");
		Locale fEspa�ol=new Locale(
			"es", "ES","Traditional_WIN");
		fechaL = DateFormat.getDateInstance(
			DateFormat.SHORT, fEspa�ol).format(hoy);
		System.out.println("Fecha corta: "+fechaL);
		fechaL= DateFormat.getDateInstance(
			DateFormat.MEDIUM, fEspa�ol).format(hoy);
		System.out.println("Fecha media: "+fechaL);
		fechaL= DateFormat.getDateInstance(
		DateFormat.LONG, fEspa�ol).format(hoy);
		System.out.println("Fecha larga: "+fechaL);
		fechaL = DateFormat.getDateInstance(
			DateFormat.FULL, fEspa�ol).format(hoy);
		System.out.println("Fecha completa: "+fechaL);
		DateFormat formato = new SimpleDateFormat(
			"EEE d MMM yy", fEspa�ol);
		fechaL = formato.format(hoy);
		System.out.println("Fecha formato libre "+fechaL);
	}
}
