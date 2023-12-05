
import java.awt.*;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class TableroJuego extends JPanel {
	Pelota pelota = new Pelota(0, 0);
	Raqueta r1 = new Raqueta(10, 200);
	Raqueta r2 = new Raqueta(794 - 10 - Raqueta.ANCHO, 200);

	public TableroJuego() {
		setBackground(Color.BLACK);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.WHITE);
		dibujar(g2);
		actualizar();
	}

	public void dibujar(Graphics2D g) {
		g.fill(pelota.getPelota());
		g.fill(r1.getRaqueta());
		g.fill(r2.getRaqueta());
		
	}

	public void actualizar() {
		pelota.mover(getBounds(),colision(r1.getRaqueta()),colision(r2.getRaqueta()));
		r1.moverR1(getBounds());
		r2.moverR2(getBounds());
		
	}
		private boolean colision(Rectangle2D r) {
			return pelota.getPelota().intersects(r);
		}
	
	public void iterarJuego() {
		while (true) {

			try {
				repaint();
				Thread.sleep(6);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
