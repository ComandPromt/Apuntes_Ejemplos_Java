package fecha;

import java.util.*;
import java.text.*;
public class NumeroDias{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println(
		"¿Cuantos días tardarás en terminar la revisión?");
		long nDias=Long.parseLong(sc.nextLine());
		long nMSegundos=nDias*24*60*60*1000;
		Date dia= new Date(System.currentTimeMillis()+nMSegundos);
		DateFormat formateadorFecha = DateFormat.getDateInstance();
		System.out.println("La revisión se entregará el día: ");
		System.out.println(formateadorFecha.format(dia));
	}
}
