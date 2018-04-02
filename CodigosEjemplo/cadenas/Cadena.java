package cadenas;

public class Cadena{
	public static void main(String args[]){
		String nombre;
		nombre = "David";
		System.out.print("El nombre " + nombre +
		" tiene " +nombre.length() + " caracteres \n");
		System.out.print("El nombre " + nombre +
		" tiene la letra 'a' en la posicion " +
		nombre.indexOf("a") + "\n");
		System.out.println("Empieza por: "+ 
		nombre.substring(0,4));
		System.out.println("Termina por: "+
		nombre.substring(4));
	}
}
