import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjercicioAlumno4 {
    public static void main(String[] args) {

        //Introducir los datos de búsqueda
        String campo = leerConsola("Campo de búsqueda: 1-ID, 2-Nombre, 3-Apellido, 4-Email, 5-Teléfono");
        int campoNum = Integer.parseInt(campo);
        String busca = leerConsola("Buscamos ");

        //Busqueda en objetos Alumno y escribirlos en un archivo
        buscarAlumnos("alumnosnac2.csv",campoNum,busca);
    }
    public static String leerConsola(String mensaje){
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        return entrada.nextLine();
    }
    public static void buscarAlumnos(String archivo, int campoNum, String busca){

        try {
            Stream<Alumno> alumno = Files.lines(Paths.get(archivo))
                    .map(n -> n.split(";"))
                    .map(n -> new Alumno(n[0], n[1], n[2], n[3], n[4]));

            List<Alumno> lista = new ArrayList<>();
            switch (campoNum) {
                case 1:
                    lista = alumno.filter(n -> n.getId().equals(busca)).collect(Collectors.toList());
                    break;
                case 2:
                    lista = alumno.filter(n -> n.getNombre().contains(busca)).collect(Collectors.toList());
                    break;
                case 3:
                    lista = alumno.filter(n -> n.getApellidos().contains(busca)).collect(Collectors.toList());
                    break;
                case 4:
                    lista = alumno.filter(n -> n.getEmail().contains(busca)).collect(Collectors.toList());
                    break;
                case 5:
                    lista = alumno.filter(n -> n.getTelefono().contains(busca)).collect(Collectors.toList());
                    break;
                default:
                    System.out.println("Campo no válido");

            }
            escribeEnCSV("salida.csv","id;Nombre ;Apellidos ;Correo electrónico ;Telefono");
            lista.forEach(n -> {
                escribeEnCSV("salida.csv",n.toLinea());

            });

        }catch(Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }

    public static void escribeEnCSV(String archivo, String linea){
        try{

            FileWriter escribir = new FileWriter(archivo,true);
            escribir.write(linea + "\r");
            escribir.close();
            System.out.println("Escritura terminada");

        }catch(IOException e){
            System.out.println("Ha ocurrido un error de escritura");
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }

}
