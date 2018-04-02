package fecha;

import java.lang.*;
import java.util.*;
public class VerFecha{
	public static void main(String args[]){
		String diasS[] = {"domingo","lunes",
			"martes","miércoles","jueves",
			"viernes","sábado"};
		String mesA[] = {"enero","febrero","marzo",
			"abril","mayo","junio","julio","agosto",
			"septiembre","octubre","noviembre","diciembre"};
		Date hoy = new Date();
		GregorianCalendar calenG = 
						new GregorianCalendar();
		calenG.setTime(hoy);
		System.out.print("Hoy es ");
		System.out.print(diasS[calenG.get(Calendar.DAY_OF_WEEK)-1]);
		System.out.print(" "+calenG.get(Calendar.DAY_OF_MONTH));
		System.out.print("-"+mesA[calenG.get(Calendar.MONTH)]);
		System.out.print("-"+calenG.get(Calendar.YEAR));
		System.out.print(" a las "+(calenG.get(Calendar.HOUR)));
		System.out.print(":"+calenG.get(Calendar.MINUTE));
		System.out.println(":"+calenG.get(Calendar.SECOND));
	}
}
