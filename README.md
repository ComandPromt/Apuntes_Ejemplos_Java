# Java

## Instalar Java en Linux

~~~java

apt install default-jre default-jdk

~~~

## Functions

~~~java

	public static String aumentarDia(int valor) {

		Calendar calendar = Calendar.getInstance();
	
		calendar.setTime(new Date());

		int calendarTime = Calendar.DAY_OF_MONTH;

		int temp = calendar.get(calendarTime);

		calendar.set(calendarTime, temp + valor);

		Date newDate = calendar.getTime();

		return newDate.toString();

	}

	public static int calcularPorcentaje(int valor, int total) {

		float resultado = (valor * 100) / total;

		int salida;

		NumberFormat numberFormat = NumberFormat.getInstance();

		numberFormat.setMaximumFractionDigits(0);

		numberFormat.setRoundingMode(RoundingMode.DOWN);

		salida = Integer.parseInt(numberFormat.format(resultado));

		return salida;

	}

	double truncateDouble(double number, int numDigits) {
	
		double result = number;
		
		String arg = "" + number;
		
		int idx = arg.indexOf('.');
		
		if (idx != -1) {
		
			if (arg.length() > idx + numDigits) {
			
				arg = arg.substring(0, idx + numDigits + 1);
				
				result = Double.parseDouble(arg);
				
			}
		}
		
		return result;
		
	}
	
	double convertirASegundos(String duracionVideo) {

		double horas, minutos, segundos;

		try {

			horas = Double.parseDouble(duracionVideo.substring(0, duracionVideo.indexOf(":")));

			if (horas > 0) {
				horas *= 3600f;
			}

			minutos = Double.parseDouble(
					duracionVideo.substring(duracionVideo.indexOf(":") + 1, duracionVideo.lastIndexOf(":")));

			if (minutos > 0) {
				minutos *= 60f;
			}

			segundos = Double
					.parseDouble(duracionVideo.substring(duracionVideo.lastIndexOf(":") + 1, duracionVideo.length()));
		}

		catch (Exception e) {
		
			horas = 0;
			
			minutos = 0;
			
			segundos = 0;
			
		}

		return horas + minutos + segundos;
		
	}

	public static String calcularTiempo(long segundos) {

		int minutos = 0;

		int horas = 0;

		if (segundos == 60) {
		
			minutos = 1;
			
			segundos = 0;
			
		}

		minutos = (int) (segundos / 60);

		int calculoSegundos = 0;

		calculoSegundos = 60 * minutos;

		segundos -= calculoSegundos;

		if (minutos == 60) {
		
			horas = 1;
			
			minutos = 0;
			
			segundos = 0;
			
		}

		if (minutos > 60) {

			if (minutos % 60 == 0) {
			
				horas = minutos / 60;
				
				minutos = 0;
				
				segundos = 0;
				
			}

			else {

				int contador = 0;

				int horaProxima = 120;

				int siguienteHora = 0;

				while (contador == 0) {

					if (minutos < horaProxima) {
					
						contador = horaProxima;
						
					}

					else {

						siguienteHora = horaProxima + 60;

						if (minutos > horaProxima && minutos < siguienteHora) {
						
							contador = siguienteHora;
							
						}

						horaProxima = siguienteHora;

					}
				}

				horas = minutos / 60;

				minutos = 60 - (horaProxima - minutos);

			}

		}

		String ceroHoras = "";

		String ceroMinutos = "";

		String ceroSegundos = "";

		if (horas <= 9) {
		
			ceroHoras = "0";
			
		}

		if (minutos <= 9) {
		
			ceroMinutos = "0";
			
		}

		if (segundos <= 9) {
		
			ceroSegundos = "0";
			
		}

		return ceroHoras + horas + " : " + ceroMinutos + minutos + " : " + ceroSegundos + segundos;

	}
	
	public static String extraerExtension(String nombreArchivo) {

		String extension = "";

		if (nombreArchivo.length() >= 3) {

			extension = nombreArchivo.substring(nombreArchivo.lastIndexOf(".") + 1, nombreArchivo.length());

			extension = extension.toLowerCase();

			if (extension.endsWith(".ts")) {
			
				extension = "ts";
				
			}

		}

		return extension;
		
	}
	
	public static LinkedList<String> directorio(String ruta, String extension, boolean filtro, boolean carpeta) {

		LinkedList<String> lista = new LinkedList<String>();

		try {

			File f = new File(ruta);

			if (f.exists()) {

				File[] ficheros = f.listFiles();

				String fichero = "";

				String extensionArchivo;

				File folder;

				for (int x = 0; x < ficheros.length; x++) {

					fichero = ficheros[x].getName();

					folder = new File(ruta + fichero);

					extensionArchivo = extraerExtension(fichero);

					if (filtro) {

						if (folder.isFile()) {

							if ((extension.equals("images") && (extensionArchivo.equals("jpg")

									|| extensionArchivo.equals("png")))

									|| extension.equals(".") || extension.equals(extensionArchivo)) {

								if (carpeta) {

									lista.add(ruta + fichero);

								}

								else {

									lista.add(fichero);

								}

							}

						}

					}

					else {

						if (carpeta) {
						
							lista.add(ruta + fichero);
							
						}

						else {

							if (folder.isDirectory()) {

								if (!fichero.isEmpty()) {
								
									lista.add(fichero);
									
								}

							}

						}

					}

				}

			}
		}

		catch (Exception e) {

		}

		Collections.sort(lista);

		return lista;

	}
	
~~~

#Pojo

~~~java

package ComboFonts;

import java.awt.Dimension;

import java.awt.event.ActionEvent;

import java.io.IOException;

import javax.swing.GroupLayout;

import javax.swing.GroupLayout.Alignment;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.event.ChangeEvent;

@SuppressWarnings("all")

public class Main extends javax.swing.JFrame {

	public Main() throws IOException {

		setAlwaysOnTop(true);

		setTitle("Test");

		setType(Type.NORMAL);

		initComponents();

		this.setVisible(true);

	}

	public static void main(String[] args) {

		try {
			new Main().setVisible(true);
			
		}
		
		catch (Exception e) {

		}
		
	}

	public void initComponents() throws IOException {

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

		setResizable(false);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 526, Short.MAX_VALUE)
		);
		
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 404, Short.MAX_VALUE)
		);

		getContentPane().setLayout(layout);

		setSize(new Dimension(532, 433));

		setLocationRelativeTo(null);

	}

	public void actionPerformed(ActionEvent arg0) {

	}

	public void stateChanged(ChangeEvent e) {

	}

}

~~~
