
public class ParametrosLineaComandos {

	public static void main(String[] args) {
		
		System.out.println("Numero de par�metros pasados por linea de comandos: "+args.length);

		for(int i=0;i<args.length;i++){
			
			System.out.println("Par�metro "+ i+ " vale: "+args[i]);
		}
		
		System.out.println("Fin de impresion");
	}

}
