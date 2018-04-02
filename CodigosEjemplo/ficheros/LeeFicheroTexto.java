package ficheros;

import java.io.*;
public class LeeFicheroTexto{
	public static void main(String args[]){
		String texto="";
		try{
			FileReader flE=new FileReader("Agenda.txt");
			BufferedReader fE=new BufferedReader(flE);
			while(texto != null){
				texto = fE.readLine();
				if(texto != null){
					int posi=texto.indexOf(",");
					String nombre=texto.substring(0,posi);
					String teléfono=texto.substring(posi+1);
					System.out.print("Nombre: "+nombre);
					System.out.println(" Teléfono: "+ teléfono);
				}
			}
			fE.close();
		}catch(IOException e){
			System.out.println("Error en el fichero");
		}
	}
}
