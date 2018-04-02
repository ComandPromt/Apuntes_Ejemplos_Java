package encriptacion;

import javax.crypto.*;
public class CifradorDescifrador{
	public static void main(String args[])
								throws Exception{
		Cipher cifrador;
		KeyGenerator generadorClave = 
				KeyGenerator.getInstance("DES");
		SecretKey clave = generadorClave.generateKey();
		cifrador = Cipher.getInstance("DES/ECB/PKCS5Padding");
		cifrador.init(Cipher.ENCRYPT_MODE, clave);
		byte[] textoACifrar = "F. Javier Moldes Teo".getBytes();
		System.out.println("\nTexto antes de cifrar:"); 
		for(int i=0;i<textoACifrar.length; i++){
			char c=(char)textoACifrar[i];
			System.out.print(c);
		}
		byte[] textoCifrado = cifrador.doFinal(textoACifrar);
		System.out.println("\nTexto cifrado:"); 
		for(int i=0;i<textoCifrado.length; i++){
			char c=(char)textoCifrado[i];
			System.out.print(c);
		}
		cifrador.init(Cipher.DECRYPT_MODE, clave);
		byte[] textoDesCifrado = cifrador.doFinal(textoCifrado);
		System.out.println("\nDespués de descifrar:"); 
		for(int i=0;i<textoDesCifrado.length; i++){
			char c=(char)textoDesCifrado[i];
			System.out.print(c);
		}
	}
}
