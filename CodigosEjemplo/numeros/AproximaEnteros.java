package numeros;

import java.util.*;
public class AproximaEnteros{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Introduce una cantidad con decimales.");
		double cantidad = sc.nextDouble();
		System.out.println("Valor inicial "+cantidad);
		System.out.println("Valor absoluto " + Math.abs(cantidad));
		System.out.println("Aproximación superior entera " +
			Math.ceil(cantidad));
		System.out.println("Aproximación inferior entera " +
			Math.floor(cantidad));
		System.out.println("Aproximación más cercana " +
			Math.rint(cantidad));
		System.out.println("Aproximación por \"casting\" " +
			((int)cantidad));
	}
}
