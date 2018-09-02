package juegos;

public class Rectangulo {

	public static void main(String[] args) {
	
		int ancho= 15;
		
		int alto = 25;
	
			
		int perimetro = 2 * ancho + 2 * alto;

		int area = ancho * alto;

		System.out.println("El rectangulo mide: ");
		System.out.println("\n"+ ancho+ " cm de ancho");
		System.out.println(+ alto + " cm de alto");
		System.out.println("\nPerimetro: " + perimetro +" cm ");
		System.out.println("Area: " + area + " cm cuadrados");		
	}

}
