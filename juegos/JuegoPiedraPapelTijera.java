package juegos;
public class JuegoPiedraPapelTijera {

	public static void main(String[] args) {

		JugadorPartida j1 = new JugadorPartida();
		JugadorPartida j2 = new JugadorPartida("Pedro",3);

		do{
		
			j1.valordedo();
			System.out.println(Jugador.espaciador);
			System.out.println("El jugador "+j1.getNombre()+" ha sacado: "+j1.getValordedoc());
			
			j2.valordedo();
			System.out.println("El jugador "+j2.getNombre()+" ha sacado: "+j2.getValordedoc());
			
			if (j1.getValordedo()==3 && j2.getValordedo()==1){
				
				System.out.println("\nEnorabuena "+j2.getNombre()+" has ganado la ronda");
				
				j2.aumento();
				
				System.out.println("\nVictorias: "+j2.getVictorias());
			
			}
				else
						if (j2.getValordedo()==3 && j1.getValordedo()==1){
							
							System.out.println("\nEnorabuena "+j1.getNombre()+" has ganado la ronda");
							j1.aumento();
							System.out.println("\nVictorias: "+j1.getVictorias());
			
						}
						else
							if (j1.getValordedo()> j2.getValordedo()){
							
								System.out.println("\nEnorabuena "+j1.getNombre()+" has ganado la ronda");
								j1.aumento();
								System.out.println("\nVictorias: "+j1.getVictorias());
					
								}
							else
								if (j2.getValordedo()> j1.getValordedo()){
									
									System.out.println("\nEnorabuena "+j2.getNombre()+" has ganado la ronda");
									j2.aumento();
									System.out.println("\nVictorias: "+j2.getVictorias());
													
									}
			
	
		}
			
			while (j1.getVictorias() <j1.getVidas() && j2.getVictorias() <j2.getVidas());
		
		  if (j1.getVictorias()==3){
			  System.out.println(Jugador.espaciador);
			  System.out.println("Enorabuena "+j1.getNombre()+" has ganado!!!");
			  System.out.println(Jugador.espaciador);
		  }
		  
		  if (j2.getVictorias()==3){
			  System.out.println(Jugador.espaciador);
			  System.out.println("Enorabuena "+j2.getNombre()+" has ganado!!!");
		   	System.out.println(Jugador.espaciador);
		  }
		
	}

}