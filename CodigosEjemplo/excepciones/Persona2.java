package excepciones;

public class Persona2{
	private int edad;
	public void ponEdad(int edadNueva)throws Exception{
		if (edadNueva < 0 || edadNueva > 100 )
			throw (new Exception("Edad no valida"));
			edad=edadNueva;
		}
	public String toString(){
		return "Edad: "+ edad;
	}
}
