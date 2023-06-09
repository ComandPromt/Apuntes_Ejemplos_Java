import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class EjercicioAlumno3 {
    public static void main(String[] args) {

        //Introducir los datos de búsqueda
        String campo = leerConsola("Campo de búsqueda: 1-ID, 2-Nombre, 3-Apellido, 4-Email, 5-Teléfono");
        int campoNum = Integer.parseInt(campo);
        String busca = leerConsola("Buscamos ");

        //Busqueda en objetos Alumno
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
            
            switch (campoNum) {
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
                default:
                    System.out.println("Campo no válido");

            }

        }catch(Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }
}
