package listasobjetos;

public class Persona2{
	private String nombre;
	private String tel�fono;
	private int edad;
	public void ponNombre(String nombre){
		this.nombre=nombre;
	}
	public String dameNombre(){return nombre;}
	public void ponTel�fono(String tel�fono){
		this.tel�fono=tel�fono;
	}
	public String dameTel�fono(){return tel�fono;}
	public void ponEdad(int edad){this.edad=edad;}
	public int dameEdad(){return edad;}
	public String muestraPersona(){
		return nombre+ " "+ tel�fono + " " + edad;
	}
}
