package listasobjetos;

import java.util.*;
public class AgendaVector{
	public static void main(String argumentos[]){
		String texto="";
		Scanner sc = new Scanner(System.in);
		Vector<Persona2> lista = new Vector<Persona2>();
		do{
			try{
				System.out.println("Escribe los datos de una persona");
				System.out.print("Nombre (* para terminar): ");
				texto=sc.nextLine();
				if( texto.charAt(0) != '*'){
					Persona2 p= new Persona2();
					p.ponNombre(texto);
					System.out.print("Teléfono: ");
					texto=sc.nextLine();
					p.ponTeléfono(texto);
					System.out.print("Edad: ");
					int edad = Integer.parseInt(sc.nextLine());
					p.ponEdad(edad);
					lista.addElement(p);
				}
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}while(texto.charAt(0) != '*');
		System.out.print("La agenda tiene: ");
		System.out.println(lista.size()+" personas"); 
		for(Persona2 p:lista)
			System.out.println(p.muestraPersona());
		System.out.print("Nombre a borrar: ");
		texto=sc.nextLine();
	for(Persona2 p:lista)
		if((p.dameNombre()).equals(texto)){
			lista.removeElement(p); 
			break;
		}
		System.out.println("La agenda tiene: "+lista.size()+" personas"); 
		for(Persona2 p:lista)
		System.out.println(p.muestraPersona());
	}
}
