package fecha;

import java.util.*;
import java.text.*;
public class VerFecha2{
	public static void main(String args[]){
		Date hoy = new Date();
		DateFormat formateadorFecha =
			DateFormat.getDateInstance();
		String fechaLocal=formateadorFecha.format(hoy);
		System.out.println(fechaLocal);
	}
}
