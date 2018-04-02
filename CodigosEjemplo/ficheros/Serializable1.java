package ficheros;

import java.io.*;
import java.util.*;
public class Serializable1{
	public static void main(String argumentos[]){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.print("Nombre vulgar: ");
			String texto=sc.nextLine();
			Arbol p = new Arbol(texto);
			System.out.print("Nombre cientifico: ");
			texto=sc.nextLine();
			p.ponNombreCientifico(texto);
			System.out.print("Altura media: ");
			double altura = sc.nextDouble();
			p.ponAlturaMedia(altura);
			FileOutputStream f=new FileOutputStream("tmp");
			ObjectOutputStream fis=new ObjectOutputStream(f);
			fis.writeObject(p);
			fis.close();
			FileInputStream fe = new FileInputStream("tmp");
			ObjectInputStream fie=new ObjectInputStream(fe);
			Arbol q = (Arbol)fie.readObject();
			System.out.println(q.muestraArbol());
			fie.close();
		}catch ( Exception e){
			System.out.println(e.getMessage());
		}
	}
}
