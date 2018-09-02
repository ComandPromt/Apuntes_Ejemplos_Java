package juegos;
import java.util.Scanner;
public class RectanguloMejorado {
	
	public static void main(String[] args) {
		
		//pedir datos por teclado
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el ancho");
		int ancho=sc.nextInt();
		
		System.out.println("Introduce el alto");
		int alto=sc.nextInt();
		
		
		
			
		int perimetro = 2 * ancho + 2 * alto;

		int area = ancho * alto;

		System.out.println("\nEl rectangulo mide: ");
		System.out.println("\n"+ ancho+ " cm de ancho");
		System.out.println(+ alto + " cm de alto");
		System.out.println("\nPerimetro: " + perimetro +" cm ");
		System.out.println("Area: " + area + " cm cuadrados");		
	}
	
	
	
	

}
