package listasobjetos;

public class Persona3{
	private String nombre;
	private String apellido1;
	private String dNI;
	public Persona3 (String dNI, String nombre, 
		String apellido1){
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.dNI=dNI;
	}
	public String dameDNI(){
		return dNI;
	}
	public String muestraPersona(){
		return nombre+','+apellido1+','+" DNI: "+dNI;
	}
}
