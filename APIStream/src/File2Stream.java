import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class File2Stream {
    public static void main(String[] args) {
        String archivo = "alumnosnac2.csv";

        try {
            Stream<String> contenido = Files.lines(Paths.get(archivo));
            contenido.forEach(System.out::println);
        }catch(IOException e){
            System.out.println("Error");
        }
    }
}
