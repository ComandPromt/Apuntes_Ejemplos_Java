package listasobjetos;

import java.util.*;
public class VerConjunto{
	public static void main(String args[]){
		HashSet<String> lista = new HashSet<String>();
		lista.add("Lunes");
		lista.add("Martes");
		lista.add("Mi�rcoles");
		lista.add("Jueves");
		lista.add("Viernes");
		lista.add("S�bado");
		lista.add("S�bado");
		lista.add("Domingo");
		System.out.print("La semana \"desordenada ");
		System.out.println("y sin repeticiones\"");
		Iterator i = lista.iterator();
		while(i.hasNext())
			System.out.print(i.next().toString()+" ");
	}
}
