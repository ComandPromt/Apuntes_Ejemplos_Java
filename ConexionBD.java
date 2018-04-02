
import java.sql.*;

import javax.swing.JOptionPane;

/**
 * <p>
 * Title: ConexionBD.java
 * </p>
 * <p>
 * Description: Clase que maneja la conexion a la base de datos y proporciona
 * los metodos para conectarse y desconectarse de la base de datos.
 * </p>
 * 
 * @author David Martin
 */
public class ConexionBD {

	// ************************************************************
	// ******************** ATRIBUTOS PRIVADOS ********************
	// ************************************************************

	// Conector de la base de datos. Es una variable global
	static public Connection conexion;

	/*
	 * Variable pública que controlará cuando se han conectado correctamente a
	 * la bd. Es una variable global
	 */
	static public boolean conexionEstablecida = false;

	// ************************************************************
	// ********************* MÉTODOS PÚBLICOS *********************
	// ************************************************************

	/**
	 * Constructor de la clase. No recibe ningún parámetro
	 */
	public ConexionBD() {

	}

	/**
	 * Método estático global que establece la conexion con la base de datos
	 */
	public void establecerConexion(String user, String pass) {

		// Abrimos un bloque de captura de excepciones, necesario al trabajar
		// con SQL.
		try {
			// Registramos el driver necesario.
			DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
			// Se establece la conexión con la BD
			conexion = DriverManager.getConnection(
					"jdbc:mysql://localhost:8889/pruebajava", user, pass);
			// Modificamos la variable global que nos indica que estamos
			// conectados.
			conexionEstablecida = true;
		} catch (SQLException e) {
			// Mostramos un diálogo mostrando la causa por la que no se ha
			// podido llevar a cabo la conexión.
			JOptionPane.showMessageDialog(
					null,
					"No se puede conectar a la BD. El error devuelto es: "
							+ e.getMessage(), "Error de Información",
					JOptionPane.ERROR_MESSAGE);
			// Ponemos a falso la variable que indica que la conexión se ha
			// establecido.
			conexionEstablecida = false;
		}
	}

	/**
	 * Método estático global que cierra la conexion con la base de datos
	 */
	public void cerrarConexion() {
		try {
			// Cerramos la conexión y ponemos la variable global a falso.
			conexion.close();
			conexionEstablecida = false;

		} catch (SQLException e) {

			// Si no se puede cerrar la bd mostramos el error producido.
			JOptionPane.showMessageDialog(
					null,
					"No se ha podido cerrar la BD. El error devuelto es: "
							+ e.getMessage(), "Error de Desconexion",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public ResultSet bbddListado(String consulta) {
		ResultSet rs;
		rs = null;
		String id = "";
		String nombre = "";
		String apellidos = "";
		try {
			Statement s = ConexionBD.conexion.createStatement();
			// hacemos la consulta y el resultado lo almacenamos en un registro
			// ResultSet
			rs = s.executeQuery(consulta);
			// Fijar el cursor al principio del resultado
			rs.first();
			id = rs.getString("id_persona");
			nombre = rs.getString("nombre");
			apellidos = rs.getString("apellidos");
			
			System.out.println("Datos: "+id+" "+nombre+" "+apellidos);

		
			while (rs.next()) {
				id = rs.getString("id_persona");
				nombre = rs.getString("nombre");
				apellidos = rs.getString("apellidos");
				
				System.out.println("Datos: "+id+" "+nombre+" "+apellidos);
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,
					"Error al tomar datos de la consulta: \n" + consulta,
					"Formulario Visualizacion", JOptionPane.ERROR_MESSAGE);
		}

		return rs;
	}

	public static void main(String args[]) {
		ConexionBD cbd = new ConexionBD();
		cbd.establecerConexion("root", "root");
		cbd.bbddListado("Select * from persona;");

	}

}
