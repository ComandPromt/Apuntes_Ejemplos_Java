package juegos;

public class JuegoDados3 {

	public static void main(String[] args) {

		Dado d1=new Dado();
		Dado d2=new Dado(4);
		Dado d3=new Dado(1,3);
		
		int contador=0;
		
		do{
			d1.tirarDado();
			d2.tirarDado();
			d3.tirarDado();
			contador++;
			
		}while((d1.getValorDado()+d2.getValorDado()+d3.getValorDado()!=3));

		System.out.println("\n\nCongratulations, el valor de los dados es: "
				+ d1.getValorDado() + " y " + d2.getValorDado()+ " y " + d3.getValorDado());
		
		System.out.println("\nSe ha conseguido en: " + contador + " intentos");

	}

}
