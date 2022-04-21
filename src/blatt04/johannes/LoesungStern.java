package blatt04.johannes;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse für das Zeichnen eines Sterns
 */
public class LoesungStern extends JFrame {

    /** Konstruktor. Nichts zu ändern hier */
    public LoesungStern(){
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600,400);
        this.setTitle("Lösung in der Klasse " + this.getClass().getName()); 
        this.setVisible(true);
    }

    /** Main-Methode. Nichts zu ändern hier. */
    public static void main(String[] args){
    	new LoesungStern();
    }
   
    /** Paint-Methode. Nichts zu ändern hier. Diese Methode 
     *  wird beim Öffnen des Fensters automatisch aufgerufen. 
     *  Die Methode wird auch aufgerufen, wenn die Größe des Fensters
     *  verändert wird. 
     *  @param g Grafik, auf die gezeichnet wird.
     *  */
    public void paint(Graphics g){
    	/* Löschen des Fensterinhalts (wichtig bei erneutem Zeichnen): */
    	g.clearRect(0, 0, this.getWidth(), this.getHeight());
    	
    	
    	this.meinStern(g); // Aufruf der selbst programmierten Methode
    }
	/** 
	 * Hier bitte die Lösung, um den Stern zu zeichnen
	 * 
	 */
   public void meinStern(Graphics g){
	   // TODO implement
	   final int NUMBER_OF_POINTS = 64;
	   final int RADIUS = 100;
	   final int HALF_RADIUS = RADIUS / 2;
	   final int X_START = this.getWidth() / 2;
	   final int Y_START = this.getHeight() / 2;
	   int radius;
	   
	   for (int i = 0; i < NUMBER_OF_POINTS; i = i + 1) {
		   double phi = i * (2 * Math.PI) / NUMBER_OF_POINTS;
		   
		   
		   if /*uneven number of lines*/ (i % 2 == 1) {
			   radius = HALF_RADIUS;
			   g.setColor(Color.MAGENTA);   
		   } else /*even number of lines*/ {
			   radius = RADIUS;
			   g.setColor(Color.BLUE);   
		   }
		   
		   double xCorrdinate = radius * Math.cos(phi);
		   double yCorrdinate = radius * Math.sin(phi);
		   
		   g.drawLine(X_START, Y_START, X_START + (int)xCorrdinate, Y_START + (int)yCorrdinate);
	   }
	   
   } 
}