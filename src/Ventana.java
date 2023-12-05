import javax.swing.*;

/**
 * 
 */
public class Ventana extends JFrame {

	private static final long serialVersionUID = -3523072607701926565L;
	private final int ANCHO = 800, ALTO = 500;
	private TableroJuego lamina;
	private Hilo hilo;

	public Ventana() {
		setTitle("Pong");
		setSize(ANCHO, ALTO); // dimension
		setLocationRelativeTo(null);
		setResizable(false);// que no se modifeque el tamaño
		lamina = new TableroJuego();
		add(lamina);
		addKeyListener(new EventoTeclado());
		setVisible(true);// pone visible la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hilo = new Hilo(lamina);
		hilo.start();
		// lamina.iterarJuego();

	}

}
