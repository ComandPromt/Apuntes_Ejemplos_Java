package ficheros;

public class Registro{
	private String nombre;
	private int edad;
	private double peso;
	Registro(String nom,int nEdad,double nPeso){
		nombre = nom;
		edad = nEdad;
		peso = nPeso;
	}
	public String muestraRegistro(){
		return nombre +" "+ edad+ " "+ peso;
	}
	public String dameNombre(){
		return nombre;
	}
}
