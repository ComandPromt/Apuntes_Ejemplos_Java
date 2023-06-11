import javax.swing.*;
import java.util.HashMap;

public class EjercicioHashMap {
    public static void main(String[] args) {
        // Partiendo de una estructura/lista email -> nombre
        // crear un método de búsqueda que localice el email a partir del nombre
        // y otro que localice el nombre a partir del email

        // Leer nombre (String)
        String nombre;
        nombre = JOptionPane.showInputDialog(null,"Introduce datos");

        HashMap<String,String> emails = new HashMap<>();
        emails.put("juan@eoi.es","Juan");
        emails.put("alicia@eoi.es","Alicia");
        emails.put("aitor@eoi.es","Aitor");
        emails.put("fran@eoi.es","Aitor");
        emails.put("teresa@eoi.es","Teresa");

        // si nombre contiene "@" es un email -> buscas por email
        // si no lo contiene buscas por nombre
    }
}
