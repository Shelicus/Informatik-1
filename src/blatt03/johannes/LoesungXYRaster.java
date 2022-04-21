package blatt03.johannes;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse, um ein Raster zu malen
 */
public class LoesungXYRaster extends JFrame {

	/** Konstruktor. Nichts zu ändern hier */
	public LoesungXYRaster() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(604, 417);
		this.setTitle("Lösung in der Klasse " + this.getClass().getName());
		this.setVisible(true);
	}

	/** Main-Methode. Nichts zu ändern hier. */
	public static void main(String[] args) {
		new LoesungXYRaster();
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

		this.meinRaster(g); // Aufruf der selbst programmierten Methode
	}

	/**
	 * Hier bitte die Lösung, um das Raster zu zeichnen
	 * 
	 */
	public void meinRaster(Graphics g) {
		// Raster
		int x25 = this.getWidth() / 4;
		int x75 = this.getWidth() * 3 / 4;
		int y25 = this.getHeight() / 4;
		int y75 = this.getHeight() * 3 / 4;

		int deltaX = x75 - x25;
		int deltaY = y75 - y25;
//		double stepX = deltaX / 10.0;
//		double stepY = deltaY / 10.0;

		/*
		 * g.setColor(Color.RED); // Soll schwarz sein g.drawLine(x75, y25, x25,
		 * y25);//horizontal oben g.drawLine(x25, y25, x25, y75);//vertikal links
		 * g.drawLine(x75, y25, x75, y75);//vertikal rechts g.drawLine(x25, y75, x75,
		 * y75);//horizontale unten
		 */

//	   g.setColor(Color.BLACK);
//	   for(int i = 0; i < 11; i = i + 1) {
//		// Alle geraden Zahlen
//		   if(i % 2 == 0){
//			   g.setColor(Color.RED);
//			   g.drawLine((int) (x25 + i * stepX), y25, (int) (x25 +  i * stepX), y75);//vertical
//			   g.drawLine(x25, (int) y25 + i * stepY, x75, (int) y25 + i * stepY);//horizontal
//		   } else {
//			   g.setColor(Color.GRAY);
//			   g.drawLine((int) (x25 + i * stepX), y25, (int) (x25 + i * stepX), y75);//vertical
//			   g.drawLine(x25, (int) (y25 + i * stepY), x75, (int) ((int) y25 + i * stepY));//horizontal
//		   }
//		
//	   }

		// perfect raster
		for (int i = 0; i < 11; i = i + 1) {
			if/* is even */ (i % 2 == 0) {
				g.setColor(Color.BLACK);	
			} else if/*is uneven*/(i % 2 == 1) {
				g.setColor(Color.GRAY);
			}
			g.drawLine(x25 + (i * deltaX / 10), y25, x25 + (i * deltaX / 10), y75);
			g.drawLine(x25, y25 + (i * deltaY / 10), x75, y25 + (i * deltaY / 10));
		}

//	   for/*vertical lines*/(int j = x25; j < x75;(int) j = j + stepX) {
//			   g.drawLine(j, y25, j, y75);
//		   }
//	   
//	   for/*horizontal lines*/(int j = y25; j < y75; j = j + stepY) {
//		   g.drawLine(x25, j, x75, j); 
//	   }

	}
}
