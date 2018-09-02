package juegos;

public class JugadorParchis extends Jugador {
	
	private String color;
	
	private Ficha f1;
	
	private Ficha f2;
	
	private Ficha f3;
	
	private Ficha f4;
	
	public JugadorParchis(){
		super();
		this.color="Rojo";
		this.f1=new Ficha();
		this.f2=new Ficha(2);
		this.f3=new Ficha(3);
		this.f4=new Ficha(4);
		
	}
	
	public JugadorParchis(String color){
		super();
		this.color=color;
		
		if(color.compareToIgnoreCase("Rojo")==0){ // color=="Rojo"
			super.setCasilla(39);
		}
		else if(color.compareToIgnoreCase("Amarillo")==0){
			super.setCasilla(5);
		}
		else if(color.compareToIgnoreCase("Azul")==0){
			super.setCasilla(22);
		}
		else if(color.compareToIgnoreCase("Verde")==0){
			super.setCasilla(56);
		}
		
			
		this.f1=new Ficha();
		this.f2=new Ficha(2);
		this.f3=new Ficha(3);
		this.f4=new Ficha(4);
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Ficha getF1() {
		return f1;
	}

	public void setF1(Ficha f1) {
		this.f1 = f1;
	}

	public Ficha getF2() {
		return f2;
	}

	public void setF2(Ficha f2) {
		this.f2 = f2;
	}

	public Ficha getF3() {
		return f3;
	}

	public void setF3(Ficha f3) {
		this.f3 = f3;
	}

	public Ficha getF4() {
		return f4;
	}

	public void setF4(Ficha f4) {
		this.f4 = f4;
	}
	
	
	

	
}
