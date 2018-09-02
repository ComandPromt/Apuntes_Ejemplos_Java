package juegos;

public class JugadorPartida extends Jugador {
	private int valordedo;
	public int victorias = 0;
	String valordedoc;
	public int vidas=3;
	
	public JugadorPartida() {
		super();
		this.valordedo = 1;
		this.victorias=0;
	}
	
	
	public JugadorPartida(int numCaras) {
		super(numCaras);
		this.valordedo = 1;
	this.victorias=0;

	}

	public JugadorPartida(String nombre) {
		super(nombre);
		this.valordedo = 1;
		this.victorias=0;
	}
	
	public JugadorPartida(String nombre,int vidas) {
		super(nombre);
		this.valordedo = 1;
		this.vidas =vidas;
		this.victorias=0;
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public void aumento(){
		victorias++;
	
	}

		 public int getVictorias() {
		return victorias;
	}

	public void setVictorias(int victorias) {
	
	}

		public String toString() {
		return "JugadorPartida [valordedo=" + valordedo + ", valordedoc="
				+ valordedoc + "]";
	}

		public void valordedo() {
			 d.tirarDado2(3);
				
				
				 switch (d.getValorDado()) {

				    case 1:

				    	setValordedo(1);
				    	valordedoc="Piedra";

			        break;

			        case 2:

			        	setValordedo(2);
			        	valordedoc="Papel";

			        break;
			        
			        case 3:

			        	setValordedo(3);
			        	
			        	valordedoc="Tijera";
			        break;

			 }		 
		
	}

	public String getValordedoc() {
			return valordedoc;
		}

		public void setValordedoc(String valordedoc) {
			this.valordedoc = valordedoc;
		}

	public void setValordedo(int valordedo) {
		this.valordedo = valordedo;
	}

	public int getValordedo() {
		return valordedo;
	}

}
