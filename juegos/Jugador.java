package juegos;

public class Jugador {
	public static String espaciador = "------------------------------------------";

	protected String nombre;
	private String color;
	private int casilla;
	protected Dado d;
	private boolean vivo;

	public Jugador() {
		nombre = "anonimo";
		casilla = 0;
		d = new Dado();
		this.vivo = true;
		color = "Verde";

	}

	public Jugador(int numCaras) {
		nombre = "anonimo";
		casilla = 0;
		d = new Dado(numCaras);
		this.vivo = true;
		color = "Negro";
		
	}

	public Jugador(String nombre) {
		this.nombre = nombre;
		casilla = 0;
		d = new Dado();
		this.vivo = true;
		color = "Rojo";
	}

	public Jugador(String nombre, String color) {
		this.nombre = nombre;
		casilla = 0;
		d = new Dado();
		this.vivo = true;
		this.color = color;
		color = "Blanco";
	}

	public Jugador(String nombre, int numCaras) {
		this.nombre = nombre;
		casilla = 0;
		d = new Dado(numCaras);
		this.vivo = true;
		color = "Amarillo";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCasilla() {
		return casilla;
	}

	public void setCasilla(int casilla) {

		this.casilla = casilla;

	}

	public Dado getD() {
		return d;
	}

	public void setD(Dado d) {
		this.d = d;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void tiradaJugador() {
		d.tirarDado();
		casilla = casilla + d.getValorDado();
	}

	public int tirarDado() {
		d.tirarDado();
		return d.getValorDado();
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
}
