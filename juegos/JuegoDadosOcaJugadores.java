package juegos;
public class JuegoDadosOcaJugadores {

	public static void main(String[] args) {
	
		//Declaramos los jugadores
		
		Jugador j1=new Jugador();
		Jugador j2=new Jugador("Pedro");
		Jugador j3=new Jugador("Napalm","Amarillo");
		
		//Mostramos los jugadores
		
		System.out.println(Jugador.espaciador);	
		System.out.println("Jugadores");
		System.out.println(Jugador.espaciador);
		System.out.println("Jugador 1: " +j1.getNombre());
		System.out.println("Ficha: " +j1.getColor());
		System.out.println("\nJugador 2: " +j2.getNombre());
		System.out.println("Ficha: " +j2.getColor());
		System.out.println("\nJugador 3: " +j3.getNombre());
		System.out.println("Ficha: " +j3.getColor());
		System.out.println(Jugador.espaciador);	
		System.out.println ("Empieza el juego,suerte");
		System.out.println(Jugador.espaciador);
		
		do{
			
//Jugador 1	
			
			j1.tiradaJugador();
			
			
			if (j1.getCasilla() < 63){
			
				System.out.println("El jugador "+j1.getNombre());
				System.out.println("Ha obtenido un "+j1.getD().getValorDado());
			System.out.println("Esta en la casilla "+j1.getCasilla());
			System.out.println(Jugador.espaciador);	
			}
			
			
			if(j1.getCasilla()>63){
				int rebote = j1.getCasilla() - 63;
				
				j1.setCasilla(63 - rebote);
				System.out.println("El jugador "+j1.getNombre());
				System.out.println("Ha obtenido un "+j1.getD().getValorDado());
				System.out.println("Esta en la casilla "+j1.getCasilla());
				System.out.println(Jugador.espaciador);
			}
			
//Jugador 2					
			
			j2.tiradaJugador();
			
			
			if (j2.getCasilla() < 63){
				
				System.out.println("El jugador "+j2.getNombre());
				System.out.println("Ha obtenido un "+j2.getD().getValorDado());
			System.out.println("Esta en la casilla "+j2.getCasilla());
			System.out.println(Jugador.espaciador);
			}
			
			
			if(j2.getCasilla()>63){
				int rebote = j2.getCasilla() - 63;
				j2.setCasilla(63 - rebote);
				
				System.out.println("El jugador "+j2.getNombre());
				System.out.println("Ha obtenido un "+j2.getD().getValorDado());
				System.out.println("Esta en la casilla "+j2.getCasilla());
				System.out.println(Jugador.espaciador);
			}
	
			
//Jugador 3					
			
			j3.tiradaJugador();
			
			
			if (j3.getCasilla() < 63){
				
				System.out.println("El jugador "+j3.getNombre());
				System.out.println("Ha obtenido un "+j3.getD().getValorDado());
			System.out.println("Esta en la casilla "+j3.getCasilla());
			System.out.println(Jugador.espaciador);
			}
			
			
			if(j3.getCasilla()>63){
				int rebote = j3.getCasilla() - 63;
				j3.setCasilla(63 - rebote);
				
				System.out.println("El jugador "+j3.getNombre());
				System.out.println("Ha obtenido un "+j3.getD().getValorDado());
				System.out.println("Esta en la casilla "+j3.getCasilla());
				System.out.println(Jugador.espaciador);
			}			
			
		
		}while(j1.getCasilla()!=63 && j2.getCasilla()!=63 && j3.getCasilla()!=63);
		
		
		if (j1.getCasilla() == 63) {
			System.out.println("El jugador "+j1.getNombre()+" ha obtenido un "+j1.getD().getValorDado());
			System.out.println("Esta en la casilla "+j1.getCasilla());
			System.out.println(Jugador.espaciador);
			System.out.println("\nEnhorabuena!!!");
			System.out.println("\nEl jugador: "+ j1.getNombre()+" con ficha " +j1.getColor());
			System.out.println("\nHa ganado!!!");	
			System.out.println(Jugador.espaciador);
		}

		
		if (j2.getCasilla() == 63) {
			System.out.println("El jugador "+j2.getNombre());
			System.out.println("Ha obtenido un "+j2.getD().getValorDado());
			System.out.println("Esta en la casilla "+j2.getCasilla());
			System.out.println(Jugador.espaciador);
			System.out.println("\nEnhorabuena!!!");
			System.out.println("\nEl jugador: "+ j2.getNombre()+" con ficha " +j2.getColor());
			System.out.println("\nHa ganado!!!");		
			System.out.println(Jugador.espaciador);
		}
		
		if (j3.getCasilla() == 63) {
			System.out.println("El jugador "+j3.getNombre());
			System.out.println("Ha obtenido un "+j3.getD().getValorDado());
			System.out.println("Esta en la casilla "+j3.getCasilla());
			System.out.println(Jugador.espaciador);
			System.out.println("\nEnhorabuena!!!");
			System.out.println("\nEl jugador: "+ j3.getNombre()+" con ficha " +j3.getColor());
			System.out.println("\nHa ganado!!!");		
			System.out.println(Jugador.espaciador);
		}

	}

}
