package excepciones;

public class Validar{
	public static void esValido(boolean valido)	throws MiError{
		if(!valido) throw new MiError();
	}
	public static void esValido(boolean valido, 
							String mensaje) throws MiError{
		if (!valido) throw new MiError(mensaje);
	}
}
