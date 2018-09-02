package juegos;
public class JugadorFrancotirador {

	public static void main(String[] args) {

		Jugador j1 = new Jugador(10);
		Jugador j2 = new Jugador("Pedro", 10);

		j1.tiradaJugador();
		j2.tiradaJugador();
	
		System.out.println(Jugador.espaciador);	
		System.out.println("Jugadores");
		System.out.println(Jugador.espaciador);
		System.out.println("Jugador 1: " +j1.getNombre());
		System.out.println("Color: " +j1.getColor());
		System.out.println("Planta: "+j1.getCasilla());
		System.out.println("\nJugador 2: " +j2.getNombre());
		System.out.println("Color: " +j2.getColor());
		System.out.println("Planta: "+j2.getCasilla());
		System.out.println(Jugador.espaciador);	
		System.out.println ("Empieza el juego,suerte");
		System.out.println(Jugador.espaciador);
						
		do {

			int posicionDisparo = j1.tirarDado();
			if (j1.isVivo()==true && posicionDisparo != j2.getCasilla()){
			System.out.println("El jugador: " + j1.getNombre());
			System.out.println("Ha disparado a la planta: " + posicionDisparo);
			
			
			System.out.println("El jugador: " + j1.getNombre()+" fallo");	
			System.out.println(Jugador.espaciador);}
			else
			if (j1.isVivo()==true && posicionDisparo == j2.getCasilla()) {
				System.out.println("El jugador: " + j1.getNombre());
				System.out.println("Ha disparado a la planta: " + posicionDisparo);
			
			j2.setVivo(false);
			
			}
			posicionDisparo = j2.tirarDado();
			
			if (j2.isVivo()==true && posicionDisparo != j1.getCasilla()){
				System.out.println("El jugador: " + j2.getNombre());
				System.out.println("Ha disparado a la planta: " + posicionDisparo);
				
				
				System.out.println("El jugador: " + j2.getNombre()+" fallo");
				System.out.println(Jugador.espaciador);}
				else
				if (j2.isVivo()==true && posicionDisparo == j1.getCasilla()) {
					System.out.println("\nEl jugador: " + j2.getNombre());
					System.out.println("Ha disparado a la planta: " + posicionDisparo);
				
					j1.setVivo(false);
				}
			

		} while (j1.isVivo()  && j2.isVivo() );

		if (j1.isVivo()==false){

			System.out.println("\nEl jugador "+j1.getNombre());
			System.out.println("Esta en la planta "+j1.getCasilla());
			System.out.println("\nBOOOOOOOM!!!!!!");
			System.out.println(Jugador.espaciador);
			System.out.println("\nEnhorabuena!!!");
			System.out.println("\nEl jugador "+ j2.getNombre()+" con color " +j2.getColor());
			System.out.println("\nde la planta "+j2.getCasilla());
			System.out.println("\nHa ganado!!!");		
			System.out.println(Jugador.espaciador);
		}
		
		else
			if(j2.isVivo()==false){
				
				System.out.println("\nEl jugador "+j2.getNombre());
				System.out.println("Esta en la planta "+j2.getCasilla());
				System.out.println("\nBOOOOOOOM!!!!!!");
				System.out.println(Jugador.espaciador);
				System.out.println("\nEnhorabuena!!!");
				System.out.println("\nEl jugador "+ j1.getNombre()+" con color " +j1.getColor());
				System.out.println("\nDe la planta "+j1.getCasilla());
				System.out.println("\nHa ganado!!!");		
				System.out.println(Jugador.espaciador);
			}
		
		
	}

}
