package excepciones;

public class MiError extends RuntimeException{
	public MiError(){
		super("¡Ya me ha fallado!");
	}
	public MiError(String mensaje){
		super(mensaje);
	}
}
