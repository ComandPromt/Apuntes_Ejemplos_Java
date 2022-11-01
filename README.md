# Java

# Minimize Sysyem Tray


## El SystemTray/Bandeja del Sistema o como también se le llama «Área de Notificación» es la sección de la barra de tareas de Windows que por lo general se encuentra en la parte inferior izquierda de la pantalla, osea donde se ve el reloj 🙂 , como su nombre indica es un área de notificación que nos informa o alerta, según sea el caso con mensajes en forma de burbujas de lo que sucede en el sistema, algunos programas como el antivirus, reproductores de audio, impresoras, etc.


## Para agregar una aplicación hecha en java en el área de notificación, la API de java cuenta con SystemTray y TrayIcon.


## Como se ve en a imagen superior, la siguiente clase llamada MySystemTray.java, nos permite agregar nuestra aplicación en el Área de Notificación fácilmente, cuando se minimiza la aplicación esta se oculta y se añade al SystemTray,  ademas esta clase implementa un menú emergente PopUp para salir de la aplicación o restaurar la ventana de la misma.


## Por lo general cuando se coloca una aplicación en el SystemTray es porque se quiere ocultar el programa pero por otro lado, se quiere seguir trabajando con el, es por eso que, está clase añade un Timer para ejecutar una acción en segundo plano, solo cuando la aplicación este minimizada, la acción del Timer se ejecutara cada 12 segundos, para este ejemplo, se utiliza algo tan trivial como una suma de dos números 🙂 pero bien podria ser que el sistema controle la descarga de un archivo o la conexión a Internet, etc, también se puede implementar eventos del ratón al TrayIcon, cuando se realiza un clic sobre el icono, muestra un mensaje del señor Stephen Wozniak 

## El código de la clase MySystemTray.java es:

~~~java
package net.jc_mouse.stray;
import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
/**
 * @see https://www.jc-mouse.net/
 * @author mouse
 */
public class MySystemTray {
    
    private JFrame parent;
    private PopupMenu popup = new PopupMenu();
    private final Image image =new ImageIcon(getClass().getResource("/net/jc_mouse/stray/resources/bolivia-flag.png")).getImage() ;
    private final TrayIcon trayIcon = new TrayIcon(image, "Mi Aplicación", popup);    
    private Timer timer;        
    
    /**
     * Constructor de clase
     * @param frame
     */
    public MySystemTray( JFrame frame)
    {
    this.parent = frame;
    //comprueba si SystemTray es soportado en el sistema
    if (SystemTray.isSupported())
    {
      //obtiene instancia SystemTray
      SystemTray systemtray = SystemTray.getSystemTray();
      trayIcon.setImageAutoSize(true);
        
      //acciones del raton sobre el icono en la barra de tareas
        MouseListener mouseListener = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent evt) {            

                //Si se presiona con el boton izquierdo en el icono
                //y la aplicacion esta minimizada se muestra una frase
                if( evt.getButton() == MouseEvent.BUTTON1 && parent.getExtendedState()==JFrame.ICONIFIED ){
                        MensajeTrayIcon("Steve Wozniak\n \"El Internet de las cosas es el futuro,\n todos los dispositivos conectados todo el tiempo\"", MessageType.WARNING);
                }            
            }

            @Override
            public void mouseEntered(MouseEvent evt) {/*nada x aqui circulen...*/}

            @Override
            public void mouseExited(MouseEvent evt) {/*nada x aqui circulen...*/}

            @Override
            public void mousePressed(MouseEvent evt) {/*nada x aqui circulen...*/}

            @Override
            public void mouseReleased(MouseEvent evt) {/*nada x aqui circulen...*/}
        };

        /* ----------------- ACCIONES DEL MENU POPUP --------------------- */
        //Salir de aplicacion
        ActionListener exitListener = (ActionEvent e) -> {
            System.exit(0);
        };
        
        //Restaurar aplicacion
        ActionListener restoreListener = (ActionEvent e) -> {
            //si esta minimizado restaura JFrame
            if(parent.getExtendedState()== JFrame.ICONIFIED){
                parent.setVisible(true);
                parent.setExtendedState( JFrame.NORMAL );
                parent.repaint();                
                if(timer!=null) timer.cancel();
            }            
        };
    
        //Se crean los Items del menu PopUp y se añaden
        MenuItem exitAppItem = new MenuItem("Salir");
        exitAppItem.addActionListener(exitListener);
        popup.add(exitAppItem);

        MenuItem restoreAppItem = new MenuItem("Restaurar");
        restoreAppItem.addActionListener(restoreListener);
        popup.add(restoreAppItem);
        
        /* ----------------- ACCIONES DEL MENU POPUP : END ---------------- */
        
        trayIcon.addMouseListener(mouseListener);

        //Añade el TrayIcon al SystemTray
        try {
            systemtray.add(trayIcon);
        } catch (AWTException e) {
            System.err.println( "Error:" + e.getMessage() );
        }
    } else {
        System.err.println( "Error: SystemTray no es soportado" );
        return;
    }

    //Cuando se minimiza JFrame, se oculta para que no aparesca en la barra de tareas
    parent.addWindowListener(new WindowAdapter(){
        @Override
        public void windowIconified(WindowEvent e){
           parent.setVisible(false);//Se oculta JFrame
           //Se inicia una tarea cuando se minimiza           
           if(timer!=null) timer.cancel();
           timer = new Timer();           
           timer.schedule(new MyTimerTask(),2000, 12000 );//Se ejecuta cada 12 segundos
        }
    });

    }

    //Muestra una burbuja con la accion que se realiza
    public void MensajeTrayIcon(String texto, MessageType tipo)
    {
        trayIcon.displayMessage("Mi Aplicación dice:", texto, tipo);        
    }
    
    /**
     * clase interna que manejara una accion en segundo plano
     */
    class MyTimerTask extends TimerTask {
        
        @Override
        public void run() {            
            actionBackground();
        }

        /**
         * accion a realizar cuando la aplicacion a sido minimizada
         */
        public void actionBackground()
        { 
            int num1 = (int) Math.floor(Math.random()*6+1);
            int num2 = (int) Math.floor(Math.random()*6+1);
            MensajeTrayIcon("Haciendo algo: " + num1 + " + " + num2 +  " = "+ (num1+num2), MessageType.INFO);                        
        }

    }
}
~~~
- OJO: En la variable de tipo IMAGE, debemos pasar un archivo de imagen que servirá como icono para mostrar cuando nuestra aplicación este minimizada. La imagen debe ser pequeña, de 16×16 0 32×32 pixeles

## Para implementar esta clase en nuestro programa, solo debemos crear una instancia nueva y pasar en el constructor a nuestro JFrame principal, es decir:

~~~java
package net.jc_mouse.stray;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
/**
 * @see https://www.jc-mouse.net/
 * @author mouse
 */
public class TestSTrayFrame extends JFrame {
    
    MySystemTray mySystemTray = new MySystemTray( this );
    
    public TestSTrayFrame(){
        initComponents();
        TestSTrayFrame.this.setLocationRelativeTo(null);
    }
    
    private void initComponents(){
        setTitle("Test SystemTray java");
        setSize(new Dimension(400,300));
        setPreferredSize(new Dimension(400,300));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);        
    }
    
     public static void main(String args[]){
        EventQueue.invokeLater(() -> {
            new TestSTrayFrame().setVisible(true);
        });
    }
}//end class
~~~

[Read JSON](https://github.com/ComandPromt/Consumo-de-archivo-json)

![Preview](https://github.com/ComandPromt/Combinacion-Numerica/raw/master/preview.png)

[Combinatoria](https://github.com/ComandPromt/Combinacion-Numerica)

## Instalar Java en Linux

~~~java

apt install default-jre default-jdk

~~~

## Cron Schedule

~~~java

Main.java

public class Main{

   public static void main(String[] args){

     Timer t = new Timer();
     
     MyTask mTask = new MyTask();
     
     // This task is scheduled to run every 10 seconds

     t.scheduleAtFixedRate(mTask, 0, 10000);
     
   }

}

MyTask.java

class MyTask extends TimerTask{

   public MyTask(){
   
     //Some stuffs
     
   }

   @Override
   
   public void run() {
   
     System.out.println("Hi see you after 10 seconds");
     
   }

}

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

# Pojo

~~~java

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
