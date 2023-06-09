import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {

        //Crear directamente desde datos (Stream.of)
        Stream<String> nombres = Stream.of("María","Juan","José","Marta");
        nombres.forEach(System.out::println); //Solo se puede recorrer una vez
        System.out.println("-------------------------------------");

        //Crear desde array
        String[] arrayNombres = {"María","Juan","José","Marta"};
        Stream<String> nombres1 = Arrays.stream(arrayNombres);
        nombres1.forEach(System.out::println);
        System.out.println("-------------------------------------");

        //Crear desde Collection (ArraysList, Hashmap, etc)
        List<String> lista = new ArrayList<>();
        lista.add("María");
        lista.add("Marta");
        lista.add("Juan");
        lista.add("José");
        Stream<String> nombres2 = lista.stream();
        nombres2.forEach(System.out::println);
        System.out.println("-------------------------------------");

        //Crear con Stream builder
        Stream<String> nombres3 = Stream.<String>builder()
                .add("María")
                .add("Marta")
                .add("Juan")
                .add("José")
                .build();
        nombres3.forEach(System.out::println);
        System.out.println("-------------------------------------");

        //Operador map
        Stream<String> nombres4 = Stream.of("María","Juan","José","Marta")
                //.peek(nom -> System.out.println("1 - nom = " + nom)) //Inspección
                .map(nom -> nom.toLowerCase())
                //.peek(nom -> System.out.println("2 - nom = " + nom)) //Inspección
                .map(nom -> nom.toUpperCase())
                .map(nom -> nom.replace("A","O"))
                ;
        //nombres4.forEach(System.out::println);
        //Convertir en lista
        List<String> lista1 = nombres4.collect(Collectors.toList());
        lista1.forEach(System.out::println);
        lista1.forEach(System.out::println);
        System.out.println("-------------------------------------");


        //Objetos en Stream
        Stream<Usuario> usuarios = Stream.of("María; Pérez; mari@mari.es",
                        "José;García;jose@joseto.es",
                        "Marta; Milano; martita@mar.es",
                        "Sara; Jiménez; sarita@ea.es")
                .map(linea ->{
                    String[] atributos = linea.split(";");
                    Usuario usuario = new Usuario(atributos[0],atributos[1],atributos[2]);
                    return usuario;
                })
                .map(usuario -> {
                    String nombre = usuario.getNombre().toUpperCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });
        //usuarios.forEach(u -> System.out.println(u.toString()));
        //A colección
        List<Usuario> listaUsuarios = usuarios.collect(Collectors.toList());
        listaUsuarios.forEach(u -> System.out.println(u.toString())); // = a System.out::println
        System.out.println("-------------------------------------");

        //Operador intermedio filter
        Stream<String> nombres5 = Stream.of("María","Juan","José","Marta")
                //.filter(nom -> nom.equals("Juan"))
                .filter(nom -> nom.contains("a") && nom.contains("M"))
                .filter(nom -> nom.contains("t"));
        nombres5.forEach(System.out::println);
        System.out.println("-------------------------------------");

        //anyMatch y allMatch
        boolean  nombres6 = Stream.of("María","Juan","José","Marta")
                .map(n -> n.toUpperCase())
                .anyMatch(n -> n.contains("A"));
        System.out.println("nombres6 = " + nombres6);

        //Todos los elementos cumplen la condición
        boolean  nombres7 = Stream.of("María","Juan","José","Marta")
                .map(n -> n.toUpperCase())
                .allMatch(n -> n.contains("A"));
        System.out.println("nombres7 = " + nombres7);
        System.out.println("-------------------------------------");

        //operador terminal distinct
        Stream<String> nombres8 = Stream.of("María","Juan","Josefa","Marta", "María","Juan","Juan")
                .distinct();
        nombres8.forEach(System.out::println);
        System.out.println("-------------------------------------");

        //Operador terminal reduce()
        Stream<String> nombres9 = Stream.of("María","Juan","Josefa","Marta", "María","Juan","Juan")
                .distinct();
        String resultado1 = nombres9.reduce("concatenado = ",(a,b) -> a + " " + b);
        System.out.println(resultado1);
        System.out.println("-------------------------------------");

        //Operador terminal reduce() con números
        Stream<Integer> numeros = Stream.of(1,2,3,4,5,6);
        //int resultadoInt = numeros.reduce(0,(a,b) -> a + b);
        int resultadoInt = numeros.reduce(1,(a,b) -> a * b);
        System.out.println(resultadoInt);
        System.out.println("-------------------------------------");

        //Operador terminal sum()
        IntStream numeros1 = IntStream.of(1,2,3,4,5,6);
        System.out.println("numeros1.sum() = " + numeros1.sum());
        System.out.println("-------------------------------------");

        //Rangos numéricos
        //IntStream numeros2 = IntStream.range(5,20) //5 al 19
        IntStream numeros2 = IntStream.rangeClosed(5,20) //5 al 20
                .peek(System.out::println);
        System.out.println(numeros2.sum());
        System.out.println("-------------------------------------");

        //Estadísticas
        IntStream numeros3 = IntStream.rangeClosed(5,20); //5 al 20

        IntSummaryStatistics estadisticas = numeros3.summaryStatistics();
        System.out.println("estadisticas.getMax() = " + estadisticas.getMax());
        System.out.println("estadisticas.getMin() = " + estadisticas.getMin());
        System.out.println("estadisticas.getSum() = " + estadisticas.getSum());
        System.out.println("estadisticas.getAverage() = " + estadisticas.getAverage());
        System.out.println("estadisticas.getCount() = " + estadisticas.getCount());
        System.out.println("estadisticas.toString() = " + estadisticas.toString());

    }
}
