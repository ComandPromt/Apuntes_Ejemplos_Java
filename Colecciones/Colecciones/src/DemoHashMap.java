import java.util.HashMap;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> listin = new HashMap<>();

        // Agregar
        listin.put(609609609,"Pepe");
        listin.put(629629629,"Berta");
        listin.put(609654112,"Ana");
        listin.put(658765489,"Juan");
        listin.put(907585858,"Fermín");
        recorrer(listin);
        
        // acceder con la clave
        System.out.println(listin.get(609609609));

        // buscar
        System.out.println("listin.containsKey(609609609) = " + listin.containsKey(609609609));
        System.out.println("listin.containsValue(\"Juan\") = " + listin.containsValue("Juan"));

        // lista de valores
        System.out.println("listin.values() = " + listin.values());

        // borrar
        listin.remove(609609609);
        recorrer(listin);

        // modificar
        listin.replace(658765489,"José");
        listin.replace(658765489,"José","Juan");
        recorrer(listin);
        recorrer2(listin);
    }

    public static void recorrer(HashMap<Integer,String> mapa){
        for(Integer clave:mapa.keySet()){
            System.out.println("mapa.get(" + clave +") = " + mapa.get(clave));
        }
        System.out.println("--------------------------");
    }

    public static void recorrer2(HashMap<Integer,String> mapa){
        mapa.forEach((telefono,nombre) -> {
            System.out.println("telefono = " + telefono + " nombre = " + nombre);
        });
    }
}
