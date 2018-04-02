package ficheros;

import java.io.*;
import java.util.*;
public class GeneraFicheroTexto{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String nombre;
		try{
			FileWriter flS=new FileWriter("Agenda.txt");
			BufferedWriter fS=new BufferedWriter(flS);
			do{
				System.out.print("Introduce un nombre: ");
				nombre = sc.nextLine(); 
				if(nombre.length()>0){
					System.out.print("Teléfono:");
					String teléfono = sc.nextLine(); 
					fS.write(nombre+","+teléfono);
					fS.newLine();
				}
			}while(nombre.length()>0);
			fS.close();
		}catch(IOException e){
			System.out.println("Error en el fichero");
		}
	}
}
