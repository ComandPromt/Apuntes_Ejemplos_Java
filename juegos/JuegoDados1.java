package juegos;
import java.util.Random;

public class JuegoDados1 {

	public static void main(String[] args) {

		System.out.println("Hola Mundo");

		int d1;
		int d2;

		Random r = new Random();

		int contador = 0;

		do {
			d1 = r.nextInt(6) + 1;
			System.out.println("\nValor Dado 1 es:" + d1);
			
			d2 = r.nextInt(6) + 1;
			System.out.println("Valor Dado 2 es:" + d2);
			
			contador++;
		} while (d1 != 1 || d2 != 1);
		
		System.out.println("\n\nCongratulations, el valor de los dados es: "
				+ d1 + " y " + d2);
		
		System.out.println("\nSe ha conseguido en: " + contador + " intentos");

		
		/*
		 * do { 
		 * 
		 * d1 = r.nextInt(6)+1;
		 * System.out.println("\nValor Dado 1 es:"+d1);
		 *  
		 * d2 = r.nextInt(6)+1;
		 * System.out.println("Valor Dado 2 es:"+d2);
		 * 
		 * } while (!(d1 == 1 && d2 == 1));
		 * 
		 * System.out.println("\n\nCongratulations, el valor de los dados es: "
		 * +d1+" y "+d2);
		 * 
		 * do { 
		 * 
		 * d1 = r.nextInt(6)+1;
		 * System.out.println("\nValor Dado 1 es:"+d1); 
		 * 
		 * d2 = r.nextInt(6)+1;
		 * System.out.println("Valor Dado 2 es:"+d2);
		 * 
		 * } while ((d1+d2)!=2);
		 * 
		 * System.out.println("\n\nCongratulations, el valor de los dados es: "
		 * +d1+" y "+d2);
		 */
	}
}
