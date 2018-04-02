package listasobjetos;

import java.util.*;
public class VerLista{
	public static void main(String args[]){
		LinkedList<String> lista = new LinkedList<String>();
		lista.add("Martes");
		lista.add("Miercoles");
		lista.add(1,"Jueves");
		System.out.print(lista.get(2).toString()+" ");
		
		String a= lista.remove(1);

		lista.add("Viernes");
		lista.addFirst("Domingo");
		lista.add("Sabado");
		lista.addLast("Sabado");
		int pos= lista.indexOf("Sabado");
		System.out.println("\nLa semana \"ideal\"");
		ListIterator i = lista.listIterator(0);
		while(i.hasNext())
			System.out.print(i.next().toString()+" ");
			
		System.out.print("Elemento borrado anteriormente" +a.toString()+" ");
		System.out.print("La primera posicion de Sabado es" +pos+" ");
	}
}
