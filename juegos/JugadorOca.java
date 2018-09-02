package juegos;
public class JugadorOca extends Jugador {


	public void setCasilla(int casilla){
		if (casilla <64 && casilla >0)
		{super.setCasilla(casilla);}
	}	
}
