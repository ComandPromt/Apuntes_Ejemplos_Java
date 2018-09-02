package juegos;
public class JuegoDados7 {
	public static void main(String[] args) {

		Dado d1 = new Dado();
		Dado d2 = new Dado();

		int contador = 0;

		for (int i = 0; i < 100; i++) {
			d1.tirarDado();
			d2.tirarDado();
			if (d1.getValorDado() + d2.getValorDado() == 7) {
				contador++;
			}
		}

		System.out.println("\nHas conseguido " + contador + "  sietes");
		if(contador>=20){
			System.out.println("Has ganado");
		}
		else{
			System.out.println("Has Perdido");
		}
	}
}
