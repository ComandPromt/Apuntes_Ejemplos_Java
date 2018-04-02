package numeros;

import java.lang.*;
import java.util.*;
public class EnterosAleatorios{
	public static void main(String args[]){
		Random aleatorios = new Random();
		System.out.println("Diez números aleatorios");
		for(int i=0;i<10;++i) 
			System.out.println(aleatorios.nextInt());
	}
}
