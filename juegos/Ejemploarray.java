package juegos;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
import java.util.Scanner;




public class Ejemploarray {

	public static void main(String[] a) {
		
		
		
		int [] tx=new int [1];
		int [] ty=new int [1];
		
		Scanner sc=new Scanner(System.in);
		
		String coordenadas="0:0";
		for(int i=0;i<tx.length;i++){
			
			System.out.println("\nIntroduce el valor de la x:");
			int valor=sc.nextInt();
			tx[i]=valor;
			System.out.println("\nIntroduce el valor de la y:");
			int valory=sc.nextInt();
			ty[i]=valory;
			
			coordenadas=valor+":"+valory;
			
		}
		
		System.out.println("\nLas coordenadas son: "+coordenadas);
			
		
		
	}

}
