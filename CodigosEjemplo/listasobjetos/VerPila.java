package listasobjetos;

import java.util.*;
public class VerPila {
	public static void main(String args[]){
		Stack<String> pila = new Stack<String>();
		if(pila.empty())
			System.out.println("La pila esta vacía");
		pila.push("primero");
		pila.push("segundo");
		pila.push("tercero");
		pila.push("cuarto");
		pila.push("quinto");
		System.out.print("La pila tiene ");
		System.out.println(pila.size()+ " elementos"); 
		System.out.print("El primero en salir es: ");
		System.out.println(pila.peek().toString());
		while(!pila.empty())
			System.out.print(pila.pop().toString()+" ");
	}
}
