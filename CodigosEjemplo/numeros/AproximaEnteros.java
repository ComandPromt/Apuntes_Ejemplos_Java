package numeros;

import java.util.*;
public class AproximaEnteros{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Introduce una cantidad con decimales.");
		double cantidad = sc.nextDouble();
		System.out.println("Valor inicial "+cantidad);
		System.out.println("Valor absoluto " + Math.abs(cantidad));
		System.out.println("Aproximaci�n superior entera " +
			Math.ceil(cantidad));
		System.out.println("Aproximaci�n inferior entera " +
			Math.floor(cantidad));
		System.out.println("Aproximaci�n m�s cercana " +
			Math.rint(cantidad));
		System.out.println("Aproximaci�n por \"casting\" " +
			((int)cantidad));
	}
}
