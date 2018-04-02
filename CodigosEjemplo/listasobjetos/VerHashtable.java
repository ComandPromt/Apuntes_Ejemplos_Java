package listasobjetos;

import java.util.*;
import java.io.*;

public class VerHashtable {
   public static void main(String args[]){
     String atributo=null, valor; 
     Hashtable<String,String> tabla = new Hashtable<String,String>(100,0.75f);
     BufferedReader teclado = new BufferedReader(
	                new InputStreamReader(System.in));
	 System.out.println("Escribe parejas de datos");
     do{
	   try{
	     System.out.println("Atributo(* finaliza)");
         atributo=teclado.readLine();
	     if(atributo.charAt(0) != '*'){
		   System.out.println("Valor: ");
           valor=teclado.readLine();
           tabla.put(atributo,valor);  
         }
       }catch(Exception e){
	      System.out.println(e.getMessage());
	   } 
     }while (atributo.charAt(0) != '*');

     System.out.println("Tabla inicial: "+tabla);
     Enumeration lista = tabla.keys();
     System.out.println("Atributos: ");
     while (lista.hasMoreElements())
	   System.out.print(lista.nextElement()+", ");
      
	 System.out.println("\nValores: ");
     lista = tabla.elements();
     while (lista.hasMoreElements())
	   System.out.print(lista.nextElement()+", ");
	 System.out.println("\nEscribe un atributo");	
	 try{
       atributo=teclado.readLine();
	   System.out.print( atributo+ "=");
	   System.out.println(tabla.get(atributo));
	   System.out.println("Escribe el atributo a borrar");	
       atributo=teclado.readLine();
	   tabla.remove(atributo);
	   System.out.println("Tabla final: "+tabla);
     }catch(Exception e){
	   System.out.println(e.getMessage());
	 } 
   }
}
