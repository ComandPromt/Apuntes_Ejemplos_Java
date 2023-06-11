import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<Integer>();

        // Agregar
        numeros.add(4);
        numeros.add(5);
        numeros.add(12);
        numeros.add(7);
        numeros.add(9);
        System.out.println(numeros.add(4));
        System.out.println(numeros.add(14));
        recorrer(numeros);

        // Eliminar
        numeros.remove(7);
        recorrer(numeros);
        rerorreIterator(numeros);

        // Borrar todo
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty());
        numeros.clear();
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty());
    }

    public static void recorrer(HashSet<Integer> num){
        for(Integer valor : num){
            System.out.println("valor = " + valor);
        }
        System.out.println("-----------------------------------");
    }

    public static void rerorreIterator(HashSet<Integer> num){
        System.out.println("-----------ITERATOR---------------");
        // iterator
        Iterator<Integer> iter = num.iterator();

        while(iter.hasNext()){
            System.out.println("iter.next() = " + iter.next());
        }
        System.out.println("----------------------------------");
    }
}
