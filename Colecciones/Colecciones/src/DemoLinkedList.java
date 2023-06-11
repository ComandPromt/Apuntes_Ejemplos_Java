import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<Integer>();

        // Agregar Elementos
        numeros.add(3);
        numeros.add(5);
        numeros.add(1);
        numeros.add(12);

        recorrer(numeros);

        numeros.add(2,23);

        recorrer(numeros);

        // Especificos de LinkedList
        numeros.addFirst(56);
        numeros.addLast(48);
        recorrer(numeros);

        // Ordenar
        Collections.sort(numeros);
        recorrer(numeros);

        // Eliminar
        numeros.remove(3);
        recorrer(numeros);
        numeros.removeFirst();
        numeros.removeLast();
        recorrer(numeros);
        
        // Buscar
        System.out.println("numeros.indexOf(5) = " + numeros.indexOf(5));
        System.out.println("numeros.indexOf(80) = " + numeros.indexOf(80));
        System.out.println("numeros.lastIndexOf(5) = " + numeros.lastIndexOf(5));
        System.out.println("numeros.contains(50) = " + numeros.contains(50));
        System.out.println("numeros.contains(5) = " + numeros.contains(5));

        rerorreIterator(numeros);
    }

    public static void recorrer(LinkedList<Integer> num){
        for(int i = 0; i < num.size(); i++){
            System.out.println("num[" + i + "] = " + num.get(i));
        }
        System.out.println("----------------------------------");
    }

    public static void rerorreIterator(LinkedList<Integer> num){
        System.out.println("-----------ITERATOR---------------");
        // iterator
        Iterator<Integer> iter = num.iterator();

        while(iter.hasNext()){
            System.out.println("iter.next() = " + iter.next());
        }
        System.out.println("----------------------------------");
    }
}
