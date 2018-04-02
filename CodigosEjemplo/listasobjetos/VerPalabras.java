package listasobjetos;

import java.util.*;
public class VerPalabras{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Escriba una frase");
			String frase = sc.nextLine();
			StringTokenizer cadena = new 
			StringTokenizer(frase);
			int nPalabras = cadena.countTokens();
			System.out.println(nPalabras+" palabras");
			while (cadena.hasMoreTokens())
				System.out.print(cadena.nextToken()+"+");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
