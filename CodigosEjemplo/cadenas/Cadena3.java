/**
 * 
 */
package cadenas;

import java.util.StringTokenizer;


/**
 * @author i72maped
 *
 */
public class Cadena3 {
	
	private StringTokenizer st;
	

	public StringTokenizer getSt() {
		return st;
	}


	public void setSt(StringTokenizer st) {
		this.st = st;
	}


	public Cadena3(String cadenita) {
		super();
		st = new StringTokenizer(cadenita);
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Cadena3 ejemplo=new Cadena3("Hola a todo el mundo de Ecija. Campeones");
		
		StringTokenizer tokenizer1 = ejemplo.getSt();
		
		int i=1;
		
		while(tokenizer1.hasMoreTokens()){
			String aux=tokenizer1.nextToken();
			aux=aux.toUpperCase();
			System.out.println("Token "+i+": "+aux);
			i++;
		}
		
		System.out.println("\n");
		
		StringTokenizer tokenizer2=new StringTokenizer("Hola a todo el mundo de Ecija.Campeones", ".");

		i=1;
		
		while(tokenizer2.hasMoreTokens()){
			String aux=tokenizer2.nextToken();
			aux=aux.toUpperCase();
			System.out.println("Token "+i+": "+aux);
			i++;
		}

	}

}
