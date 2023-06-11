import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        // Agregar elementos
        numeros.add(3);
        numeros.add(5);
        numeros.add(7);
        numeros.add(9);
        numeros.add(3);
        numeros.add(2);
        numeros.add(4);

        System.out.println("numeros.size() = " + numeros.size());

        // Recorrer ArrayList
//        for(int i = 0; i < numeros.size(); i++){
//            System.out.println("numeros[" + i + "] = " + numeros.get(i));
//        }
//        System.out.println("----------------------------------");
//        for(Integer valor : numeros){
//            System.out.println("valor = " + valor);
//        }
        recorrer(numeros);

        // Agregar un elemento en un índice determinado (inserta)
        numeros.add(2,11);
        System.out.println("numeros.size() = " + numeros.size());
        recorrer(numeros);

        // Modificar un valor de un elemento en un índice determinado
        numeros.set(1,23);
        recorrer(numeros);

        // Eliminar un elemento determinado
        numeros.remove(2);
        System.out.println("numeros.size() = " + numeros.size());
        recorrer(numeros);

        // Buscar un elemento
        System.out.println("numeros.indexOf(3) = " + numeros.indexOf(3));
        System.out.println("numeros.indexOf(3) = " + numeros.lastIndexOf(3));
        System.out.println("numeros.indexOf(3) = " + numeros.indexOf(57));

        // Ordenar
        numeros.add(10);
        numeros.add(1);
        Collections.sort(numeros);
        recorrer(numeros);

        // Contiene un elemento
        System.out.println("numeros.contains(7) = " + numeros.contains(7));
        System.out.println("numeros.contains(57) = " + numeros.contains(57));

        rerorreIterator(numeros);
        
        // Está vacío?
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty());
        numeros.clear();
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty());

    }

    public static void recorrer(ArrayList<Integer> num){
        for(int i = 0; i < num.size(); i++){
            System.out.println("num[" + i + "] = " + num.get(i));
        }
        System.out.println("----------------------------------");
    }

    public static void rerorreIterator(ArrayList<Integer> num){
        System.out.println("-----------ITERATOR---------------");
        // iterator
        Iterator<Integer> iter = num.iterator();

        while(iter.hasNext()){
            System.out.println("iter.next() = " + iter.next());
        }
        System.out.println("----------------------------------");
    }
}
