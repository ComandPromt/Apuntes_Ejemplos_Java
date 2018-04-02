package excepciones;

import java.io.*;
public class Repaso{
	public static void main(String args[]){
		String nombre="";
		int numero;
		boolean tiene=false;
		BufferedReader teclado = new BufferedReader(
						new InputStreamReader(System.in));
		/*Solicita un numero y no termina hasta que el
		numero sea mayor de 10 y menor de 30*/
		try{
			do{
				System.out.print("Teclea un numero mayor");
				System.out.print(" de 10 y menor de 30: ");
				nombre = teclado.readLine();
				numero = Integer.parseInt(nombre);
			} while (numero <= 10 || numero >=30);
			if(numero % 5 == 0){
				System.out.print("El numero "+ numero);
				System.out.println(" es divisible por 5" );
			}else{
				System.out.print("El numero "+ numero );
				System.out.println(" no es divisible por 5");
			}
			System.out.print("Escribe tu nombre: ");
			nombre= teclado.readLine();
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		System.out.print("Tu nombre tiene ");
		System.out.println(nombre.length()+" caracteres");
		System.out.print("Empieza por la letra ");
		System.out.println(nombre.charAt(0));
		System.out.print("Termina por la letra ");
		System.out.println(nombre.charAt(nombre.length()-1));
		for(numero=0;numero<nombre.length();numero++){
			if (nombre.charAt(numero) == 'ñ' ||
				nombre.charAt(numero) == 'Ñ'){
				tiene= true;
			}
		}
		System.out.print("Tu nombre en mayúsculas es: ");
		System.out.println(nombre.toUpperCase());
		System.out.print("Tu nombre en minúsculas es: ");
		System.out.println(nombre.toLowerCase());
		if(tiene)
			System.out.println("Tu nombre tiene ñ");
		else
			System.out.println("Tu nombre no tiene Ñ");
	}
}
