import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class EjercicioAlumno2 {
    public static void main(String[] args) {
        /*Crear un Stream a partir de algunos alumnos del archivo alumnosnac2.csv
        Filtrar los resultados por diferentes cosas:
        nombre
        apellido
        id*/

        //1 - Crear un método que lea los datos de todos los alumnos del archivo
        //    nos devuelve una matriz de strings en la que cada elemento es una línea del archivo
        //2 - Convertir el resultado en un Stream de objetos tipo Alumno
        //3 - Crear un método que lea por consola el campo por el que queremos buscar
        //    y lo que queremos buscar
        //4 - Ejecutar la búsqueda



        //Introducir los datos de búsqueda
        String campo = leerConsola("Campo de búsqueda: 1-ID, 2-Nombre, 3-Apellido, 4-Email, 5-Teléfono");
        int campoNum = Integer.parseInt(campo);
        String busca = leerConsola("Buscamos ");

        //Busqueda por líneas (String)
        /*Stream<String> alumnos = Arrays.stream(leerCsv("alumnosnac2.csv"));
        alumnos.filter(n -> n.toUpperCase().contains(busca.toUpperCase())).forEach(System.out::println);
        System.out.println("--------------------------------");*/

        //Busqueda por campos
        /*Stream<String[]> alumnos1 = Arrays.stream(leerCsv("alumnosnac2.csv"))
                .map(n -> n.split(";"))
                .filter(n -> n[campoNum-1].contains(busca));
        alumnos1.forEach(n -> System.out.println(n[campoNum-1]));
        System.out.println("--------------------------------");*/

        //Busqueda en objetos Alumno
        buscarAlumnos("alumnosnac2.csv",campoNum,busca);



    }

    public static String[] leerCsv(String archivo){

        List<String> contenido = new ArrayList<>();

        try{
            File miArchivo = new File(archivo);
            Scanner leer = new Scanner(miArchivo);
            //contenido.add(leer.nextLine()); //Eliminar la primera línea

            while (leer.hasNextLine()) {
                //Guardar en array
                contenido.add(leer.nextLine());
            }
        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado");
        }
        return contenido.toArray(new String[contenido.size()]);
    }

    public static String leerConsola(String mensaje){
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        return entrada.nextLine();
    }

    public static void buscarAlumnos(String archivo, int campoNum, String busca){

        Stream<Alumno> alumno = Arrays.stream(leerCsv(archivo))
                .map(n -> n.split(";"))
                .map(n -> new Alumno(n[0],n[1],n[2],n[3],n[4]));
                /*.map(n -> {
                    String aux = n.split(";");
                    Alumno alum  = new Alumno(n[0],n[1],n[2],n[3],n[4]);
                    return alum;
                });*/

        switch(campoNum){
            case 1:
                alumno.filter(n -> n.getId().equals(busca)).forEach(System.out::println);
                break;
            case 2:
                alumno.filter(n -> n.getNombre().contains(busca)).forEach(System.out::println);
                break;
            case 3:
                alumno.filter(n -> n.getApellidos().contains(busca)).forEach(System.out::println);
                break;
            case 4:
                alumno.filter(n -> n.getEmail().contains(busca)).forEach(System.out::println);
                break;
            case 5:
                alumno.filter(n -> n.getTelefono().contains(busca)).forEach(System.out::println);
                break;
            default :
                System.out.println("Campo no válido");

        }
    }
}
