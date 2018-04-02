package excepciones;

import java.util.*;
public class VerPersona2{
	public static void main(String argumentos[]){
		boolean error=false;
		Scanner sc = new Scanner(System.in);
		Persona2 p = new Persona2();
		do{
			error=false;
			System.out.print("Introduce la edad: ");
			try{
				int edad=sc.nextInt();
				p.ponEdad(edad);
				System.out.println(p.toString());
			}catch(Exception e){
				System.out.println(e.getMessage());
				error=true;
			}
		}while(error);
	}
}
