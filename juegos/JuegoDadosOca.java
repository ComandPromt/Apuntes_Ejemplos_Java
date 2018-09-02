package juegos;
public class JuegoDadosOca {

	public static void main(String[] args) {

		Dado d1 = new Dado();
		Dado d2 = new Dado();
		int contador = 0;
		int casillaA = 0;
		int casillaB = 0;

		do {
			d1.tirarDado();
			casillaA = casillaA + d1.getValorDado();
			contador++;
			if (casillaA > 63) {
				int rebote = casillaA - 63;
				casillaA = 63 - rebote;
			}
			System.out.println("Jugador 1: Has sacado un " + d1.getValorDado()
					+ " y estas en la casilla: " + casillaA);

			d2.tirarDado();
			casillaB = casillaB + d2.getValorDado();
			if (casillaB > 63) {
				int rebote = casillaB - 63;
				casillaB = 63 - rebote;
			}
			System.out.println("Jugador 2: Has sacado un " + d2.getValorDado()
					+ " y estas en la casilla2: " + casillaB);

		} while ((casillaA != 63) && (casillaB != 63));

		if (casillaA == 63) {
			System.out.println("\nJugador 1,has ganado");
		}

		if (casillaB == 63) {
			System.out.println("\nJugador 2,has ganado");
		}

		System.out.println("Lo has conseguido en " + contador + " intentos");
	}
}
