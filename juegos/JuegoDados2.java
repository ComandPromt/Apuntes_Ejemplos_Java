package juegos;

public class JuegoDados2 {

	public static void main(String[] args) {
		
		Dado d1=new Dado();
		Dado d2=new Dado();
		
		int contador=0;
		
		do{
			d1.tirarDado();
			d2.tirarDado();
			contador++;
			
		}while((d1.getValorDado()+d2.getValorDado()!=2));

		System.out.println("\n\nCongratulations, el valor de los dados es: "
				+ d1.getValorDado() + " y " + d2.getValorDado());
		
		System.out.println("\nSe ha conseguido en: " + contador + " intentos");

		
	}

}
