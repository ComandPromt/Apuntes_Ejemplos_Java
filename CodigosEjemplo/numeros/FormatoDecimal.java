package numeros;

import java.util.*;
import java.text.*;
public class FormatoDecimal{
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in); 
		Locale fEspañol = new Locale("es", "ES","Traditional_WIN");
		sc.useLocale(fEspañol);
		DecimalFormat fE = new DecimalFormat("########.##");
		System.out.println("Cantidad en Pts en formato español.");
		double ptas=sc.nextDouble();
		double euros=ptas/166.386;
		System.out.println(fE.format(ptas) +
			 " pesetas =" + fE.format(euros)+" €"); 
		Locale fAmericano = new Locale(
			"en", "US","Traditional_WIN");
		sc.useLocale(fAmericano);
		DecimalFormatSymbols dFSAmericano= new
				DecimalFormatSymbols(fAmericano);
		DecimalFormat fA = new 
			DecimalFormat("########.##",dFSAmericano);
		System.out.println("Cantidad en Pts en formato americano");
		ptas=sc.nextDouble();
		euros=ptas/166.386;
		System.out.println(fA.format(ptas) + 
			" pesetas =" + fA.format(euros)+" €"); 
		
	}
}
