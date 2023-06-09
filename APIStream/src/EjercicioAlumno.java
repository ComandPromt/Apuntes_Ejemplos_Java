import java.util.Arrays;
import java.util.stream.Stream;

public class EjercicioAlumno {
    //Crear un Stream a partir de algunos alumnos del archivo alumnosnac2.csv
    //Filtrar los resultados por diferentes cosas:
    //nombre
    //apellido
    //id
    public static void main(String[] args) {
        String[] alumnosBase = {"CJN001;África;REINOSO FRANCO;africa@eoi.es;606500401",
        "CJN002;Alejandro;Cazalla Cimadom;alejandro@eoi.es;606500402",
        "CJN003;Alejandro;Gallego Domínguez;alejandro@eoi.es;606500403",
        "CJN004;Alfonso Jesús;Anillo Romero;alfonso.jesús@eoi.es;606500404"};

        String busqueda = "Al";
        int campo = 2;

        Stream<String[]> alumnos = Arrays.stream(alumnosBase)
                .map(n -> n.split(";"))
                .filter(nom -> nom[campo].toUpperCase().contains(busqueda.toUpperCase()));

        alumnos.forEach(alum -> System.out.println("Alumno -> " + alum[1] + " " + alum[2] + " " + alum[3]));

    }
}
