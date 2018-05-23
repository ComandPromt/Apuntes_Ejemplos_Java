import java.io.IOException;
import java.util.Scanner;

public class RectanguloMejorado {


	public static void main(String[] args) throws IOException {
		// Variable para almacenar el alto del rectangulo
		int alto;
		// Variable para almacenar el ancho del rectangulo
		int ancho ;
		
		// Se realiza la entrada de datos por teclado
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el ancho\t");
		ancho=sc.nextInt();
		System.out.println("Introduce el alto");
		alto=sc.nextInt();

		// Presentamos los datos y resultados
		System.out.println("El ancho mide: " + ancho + " cm.");

		System.out.println("El alto mide: " + alto + " cm.");

		System.out.println("El area es: " + (ancho * alto) + " cm2");

		System.out
				.println("El perimetro es: " + (2 * ancho + 2 * alto) + " cm");
	}
}
