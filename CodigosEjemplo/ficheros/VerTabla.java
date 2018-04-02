package ficheros;

import java.util.*;
public class VerTabla{
	public static void main(String argumentos[])
											throws Exception{
		Scanner sc = new Scanner(System.in);
		TablaBaseDatos t=new TablaBaseDatos("Datos.dir");
		System.out.print("Nombre: ");
		String nombre=sc.nextLine();
		System.out.print("Edad: ");
		int edad =sc.nextInt();
		System.out.print("Peso: ");
		double peso = sc.nextDouble();
		int nR = t.dameNumeroRegistros();
		nR++;
		t.escribeRegistro(nombre,edad,peso,nR);
		for (int i=1; i<= nR; i++){
			Registro r = t.leeRegistro(i);
			System.out.println(r.muestraRegistro());
		}
		t.cierraTabla();
	}
}
