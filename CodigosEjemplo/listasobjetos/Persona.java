package listasobjetos;

public class Persona {
	
	private String nombre;
	
	private String dNI;
	
	Persona(String nom,String dNI1){
		nombre=nom;
		dNI=dNI1;
	}
	
	public String muestraPersona(){
		return "Nombre: "+nombre+"\t"+"DNI: "+dNI+"\n";
	}
	
	public String dameDNI(){
		return dNI;
	}
}
