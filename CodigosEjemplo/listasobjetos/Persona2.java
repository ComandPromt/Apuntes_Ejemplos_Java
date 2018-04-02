package listasobjetos;

public class Persona2{
	private String nombre;
	private String teléfono;
	private int edad;
	public void ponNombre(String nombre){
		this.nombre=nombre;
	}
	public String dameNombre(){return nombre;}
	public void ponTeléfono(String teléfono){
		this.teléfono=teléfono;
	}
	public String dameTeléfono(){return teléfono;}
	public void ponEdad(int edad){this.edad=edad;}
	public int dameEdad(){return edad;}
	public String muestraPersona(){
		return nombre+ " "+ teléfono + " " + edad;
	}
}
