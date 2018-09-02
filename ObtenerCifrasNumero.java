import java.util.Scanner;

public class ObtenerCifrasNumero {

	public static int sumaCifras(int numero){
			
		String aux = "";

		// Devuelve la longitud de la cadena
		int longitud = aux.length();

		//System.out.println("La Longitud de la cadena aux es: " + longitud);

		// Convertir el numero a cadena
		aux = aux + numero;

		// Devuelve la longitud de la cadena
		longitud = aux.length();

		//System.out.println("La Longitud de la cadena aux es: " + longitud);
		
		int suma = 0;

		// Bucle para recorrer la cadena caracter a caracter
		for (int i = 0; i < longitud; i++) {
			String caracter = aux.substring(i, i + 1);
			//System.out.println("Caracter: " + caracter);
			int cifra = Integer.parseInt(caracter);
			suma=suma+cifra;
		}
		
		return suma;
	}
	
	
	public static boolean multiploDeTres(int numero){
		
		int suma=sumaCifras(numero);
		boolean aux=false;
		if(suma%3==0)
			aux=true;
		
		
		return aux; 
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un número entero: \n");
		int num=sc.nextInt();
		
		
		
		boolean aux=ObtenerCifrasNumero.multiploDeTres(num);
		if(aux)
			System.out.println("Es Multiplo");
		else
			System.out.println("NO Es Multiplo");

		
		
		for(int i=100;i<1000;i++){
			if(ObtenerCifrasNumero.multiploDeTres(i)){
				System.out.println("El numero: "+ i + " es Multiplo");
			}
		}
		
		
	}

}
