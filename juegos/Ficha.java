package juegos;
public class Ficha {

	private int idFicha;

	private int casillaFicha;

	public Ficha() {
		this.idFicha = 1;
		this.casillaFicha = 0;
	}

	public Ficha(int idFicha) {
		super();
		this.idFicha = idFicha;
		this.casillaFicha = 0;
	}

	public Ficha(int idFicha, int casillaFicha) {
		super();
		this.idFicha = idFicha;
		this.casillaFicha = casillaFicha;
	}

	
	public int getIdFicha() {
		return idFicha;
	}

	public void setIdFicha(int idFicha) {
		this.idFicha = idFicha;
	}

	public int getCasillaFicha() {
		return casillaFicha;
	}

	public void setCasillaFicha(int casillaFicha) {
		this.casillaFicha = casillaFicha;
	}
	
	

}
