package listasobjetos;

import java.util.*;
public class HashPredefinida{
	public static short muestraMenu(){
		Scanner sc =new Scanner(System.in);
		System.out.println("1.Insertar 2.Borrar 3.Listar 4.Fin");
		System.out.print("Opción: ");
		return sc.nextShort();
	}
	public static Persona3 solicitaDatosPersona(){
		Scanner sc =new Scanner(System.in);
		System.out.print("DNI: ");
		String dNI=sc.nextLine();
		System.out.print("Nombre: ");
		String nombre=sc.nextLine();
		System.out.print("Apellido: ");
		String apellido=sc.nextLine();
		return new Persona3(dNI,nombre,apellido);
	}
	public static void main (String args[]){
		short opción=0; 
		Hashtable<DNI,Persona3> tabla=
			new Hashtable<DNI,Persona3>();
		Scanner sc =new Scanner(System.in);
		do{
			opción =muestraMenu();
			switch (opción){
			case 1:
				Persona3 p=solicitaDatosPersona();
				if (p!=null){
					DNI clave= new DNI(p.dameDNI());
					if (tabla.put(clave,p)!= null)
						System.out.println(
						"Error al insertar: "+p.muestraPersona());
				}
				break;
			case 2:
				System.out.print(
					"Introduzca el DNI de la persona a borrar: ");
				String sDNI=sc.nextLine();
				DNI clave= new DNI(sDNI);
				if (tabla.remove(clave)==null)
					System.out.println (
						"No existe persona con DNI: "+sDNI);
				break;
			case 3:
				Enumeration lista = tabla.elements();
				while(lista.hasMoreElements())
					System.out.println(
					((Persona3)lista.nextElement()).muestraPersona());
			}
		}while(opción!=4);
		System.out.println("Fin del programa");
	}
}
class DNI{
	private String sDNI=null;
	public DNI (String sDNI){
		this.sDNI=sDNI;
	}
	public int hashCode(){
		int valor=0;
		int nDigitos=sDNI.length();
		for (int i=0; i<3;i++){
			int temp;
			if(i<nDigitos)
				temp=(int)sDNI.charAt(i);
			else
				temp=0;
			valor=valor+temp*10;
		}
		return valor;
	}
	public boolean equals(Object Obj){
		DNI aux=(DNI)Obj;
		return sDNI.equals(aux.sDNI);
	}
}
