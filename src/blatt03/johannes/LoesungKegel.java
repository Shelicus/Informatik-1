package blatt03.johannes;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse, um ein Raster zu malen
 */
public class LoesungKegel extends JFrame {

	/** Konstruktor. Nichts zu ändern hier */
	public LoesungKegel() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(610, 417);
		this.setTitle("Lösung in der Klasse " + this.getClass().getName());
		this.setVisible(true);
	}

	/** Main-Methode. Nichts zu ändern hier. */
	public static void main(String[] args) {
		new LoesungKegel();
	}

	/**
	 * Paint-Methode. Nichts zu ändern hier. Diese Methode wird beim Öffnen des
	 * Fensters automatisch aufgerufen. Die Methode wird auch aufgerufen, wenn die
	 * Größe des Fensters verändert wird.
	 * 
	 * @param g Grafik, auf die gezeichnet wird.
	 */
	public void paint(Graphics g) {
		/* Löschen des Fensterinhalts (wichtig bei erneutem Zeichnen): */
		g.clearRect(0, 0, this.getWidth(), this.getHeight());

		this.meinKegel(g); // Aufruf der selbst programmierten Methode
	}

	/**
	 * Hier bitte die Lösung, um den Kegel zu zeichnen
	 * 
	 * draws a black cone and fills it with forty gray lines
	 */
	public void meinKegel(Graphics g) {
		// TODO
		int x25 = this.getWidth() / 4;
		int x75 = this.getWidth() * 3 / 4;
		int y25 = this.getHeight() / 4;
		int y75 = this.getHeight() * 3 / 4;

		int deltaX = x75 - x25;
		int deltaY = y75 - y25;
		
		//draw a cone in black
		g.setColor(Color.BLACK);
		//upper and lower cone line
		g.drawLine(x25, y25, x75, y25);
		g.drawLine(x25, y75, x75, y75);
		
		//draws the right and left cone side lines
//		g.drawLine(x25, y25, x75, y75);
//		g.drawLine(x25, y75, x75, y25);
	
		//fill it with gray lines
		for (int i = 0; i < 42; i = i + 1) {
			if /*draws the right and left cone side*/ (i == 0 | i == 41) {
				g.setColor(Color.BLACK);
			} else {
				g.setColor(Color.GRAY);
			}
			g.drawLine(x25 + (i * deltaX / 41), y25, x75 - (i * deltaX / 41), y75);
		}

	}
}