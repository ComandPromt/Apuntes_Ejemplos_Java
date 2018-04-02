package excepciones;

import java.io.*;
public class Excepcion1{
	public static void main(String args[]){
		BufferedReader teclado = new BufferedReader(
						new InputStreamReader(System.in));
		boolean error=false;
		do{
			try{
				error=false;
				System.out.print("\nIntroduce un numero: ");
				String texto= teclado.readLine();
				int i = Integer.parseInt(texto);
				System.out.print("Teclea otro numero: ");
				texto= teclado.readLine();
				int j = Integer.parseInt(texto);
				System.out.printf("La división %d/%d = %d\n",i,j,i/j);
			}catch (Exception e) {
				//Muestra error producido
				System.out.println(e.getMessage());
				/*Imprime las llamadas producidas hasta el
				método que genero el error*/
				e.printStackTrace();
				error=true;
			}
		}while(error);
	}
}
