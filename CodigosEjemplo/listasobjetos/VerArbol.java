package listasobjetos;

import java.util.*;
public class VerArbol{
	public static void main(String args[]){
		TreeMap<String,String> lista = 
				new TreeMap<String,String>();
		lista.put("1","Lunes");
		lista.put("2","Martes");
		lista.put("5","Viernes");
		lista.put("4","Jueves");
		lista.put("7","Domingo");
		lista.put("6","S�bado");
		lista.put("3","Mi�rcoles");
		lista.put("6","S�bado");
		System.out.print("\nLa lista tiene ");
		System.out.println(lista.size()+" elementos");
		System.out.print("La semana \"ordenada y sin");
		System.out.println(" repeticiones\"");
		Collection colecci�n = lista.entrySet();
		Iterator i = colecci�n.iterator();
		while(i.hasNext())
			System.out.print(i.next().toString()+" ");
	}
}
