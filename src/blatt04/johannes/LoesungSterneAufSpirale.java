package blatt04.johannes;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Zusatzaufgabe: Klasse für das Zeichnen von Sternen entlang einer Spirale. Wir
 * leiten diesesmal von LoesungZufallsSterne ab, um die Methode
 * zeichneEinenStern wiederverwenden zu können.
 */
public class LoesungSterneAufSpirale extends LoesungZufallsSterne {

	/** Konstruktor. Nichts zu ändern hier */
	public LoesungSterneAufSpirale() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1024, 768);
		this.setTitle("Lösung in der Klasse " + this.getClass().getName());
		this.setVisible(true);
	}

	/** Main-Methode. Nichts zu ändern hier. */
	public static void main(String[] args) {
		new LoesungSterneAufSpirale();
	}

	/**
	 * Bitte ab hier Lösung zum Zeichnen der Sterne auf der Spirale entwickeln.
	 */
	public void paint(Graphics g) {
		// Clear the rectangle
		g.clearRect(0, 0, this.getWidth(), this.getHeight());

		this.createStars(g);
	}

	public void createStars(Graphics g) {
		int midWidth = this.getWidth() / 2;
		int midHeight = this.getHeight() / 2;
		final int numberOfStars = 8;
		int radius;
		double value = Math.PI / numberOfStars;
		double rate;
		int ix;
		int iy;
		
		//this.drawStars(g, midWidth, midHeight, radius); // test case!!!
	   for (int i = 1; i <= numberOfStars; i = i + 1) {
		   value = value * (i);
		   rate = i * Math.sin(value) * 20;
		   ix = (int) (rate + midWidth);//It only cast once
		   iy = (int) (rate + midHeight);
		   radius = (int) (rate + 50);
		   this.drawStars(g, ix, iy, radius);
	   }
	
	}

	public void drawStars(Graphics g, int midX, int midY, int r) {
	 	   final int NUMBER_OF_POINTS = 64;
	 	   int fullRadius = r;
	 	   int halfRadius = fullRadius / 2;
	 	   int X_START = midX;
	 	   int Y_START = midY;
	 	   int radius;
	 	   
	 	   for (int i = 0; i < NUMBER_OF_POINTS; i = i + 1) {
	 		   double phi = i * (2 * Math.PI) / NUMBER_OF_POINTS;
	 		   
	 		   if /*uneven number of lines*/ (i % 2 == 1) {
	 			   radius = halfRadius;
	 			   g.setColor(Color.MAGENTA);   
	 		   } else /*even number of lines*/ {
	 			   radius = fullRadius;
	 			   g.setColor(Color.BLUE);   
	 		   }
	 		   
	 		   double xCorrdinate = radius * Math.cos(phi);
	 		   double yCorrdinate = radius * Math.sin(phi);
	 		   
	 		   g.drawLine(X_START, Y_START, X_START + (int)xCorrdinate, Y_START + (int)yCorrdinate);
	 	   }
	}
}
	
