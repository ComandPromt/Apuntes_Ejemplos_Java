package ficheros;

import java.io.*;
public class ListaFicheros{
	public static void main(String args[]){
		File canal =new File("D:\\DFSI\\");
		File [ ] lista = canal.listFiles();
		for(int i = 0; i < lista.length;i++)
			System.out.println(lista[i]);
	}
}
