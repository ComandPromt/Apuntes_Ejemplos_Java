package excepciones;

import java.util.*;
public class VerMiError{
	public static void main(String args[]){
		boolean error=false;
		int nu=0;
		Scanner sc = new Scanner(System.in);
		do{
			error=false;
			try{
				System.out.print("Introduce un numero");
				System.out.print(" entero positivo: ");
				nu = sc.nextInt();
				Validar.esValido(nu > 0);
			}catch (MiError e){
				System.out.println(e.getMessage());
				error=true;
			}catch (Exception e){
				System.out.println(e.getMessage());
				error=true;
			}
		}while(error);
		System.out.println("Admitido el valor "+nu);
	}
}
