package excepciones;

import java.io.*;
public class Excepcion2{
	public static void main(String args[]){
		BufferedReader teclado = new BufferedReader(
						new InputStreamReader(System.in));
		boolean error=false;
		do{
			try{
				error=false;
				System.out.print("\nTeclea un numero: ");
				String texto= teclado.readLine();
				int i = Integer.parseInt(texto);
				System.out.print("Teclea otro numero: ");
				texto= teclado.readLine();
				int j = Integer.parseInt(texto);
			System.out.printf("La divisi�n %d/%d = %d\n",i,j,i/j);
			}catch (NumberFormatException e){
				System.out.println("Error: en la conversi�n");
				error=true;
			}catch (IOException e) {
				System.out.println("Error en la lectura");
				error=true;
			}catch (ArithmeticException e){
				System.out.println("\nDivisi�n por cero");
				error=true;
			}catch (Exception e){
				System.out.println("Excepci�n desconocida");
				error=true;
			}
		}while(error);
	}
}
