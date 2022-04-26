package blatt04.johannes;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse für das zufällige Zeichnen von Sternen
 */
public class LoesungZufallsSterne extends JFrame {

    /** Konstruktor. Nichts zu ändern hier */
    public LoesungZufallsSterne(){
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1024,768);
        this.setTitle("Lösung in der Klasse " + this.getClass().getName()); 
        this.setVisible(true);
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
    	
    	
    	this.meineZufallsSterne(g); // Aufruf der selbst programmierten Methode
    }

    /** Main-Methode. Nichts zu ändern hier. */
    public static void main(String[] args){
    	new LoesungZufallsSterne();
    }
   
	/** 
	 * Bitte ab hier Lösung zum Zeichnen der zufälligen Sterne entwickeln.
	 */
    /**
     * 1. Teilaufgabe: Methode, um einen Stern zu zeichnen.
     * 
     * @param g	Grafikbereich, auf dem gezeichnet wird
     * @param midX	x-Koordinate des Mittelpunkts des Sterns
     * @param midY y-Koordinate des Mittelpunkts des Sterns
     * @param r Radius des Sterns
     */
    public void zeichneEinenStern(Graphics g, int midX, int midY, int r){
    	// TODO Einen Stern mit gegebenen Parametern zeichnen
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
    
    /**
     * 2. Teilaufgabe: Sterne zufällig platzieren mit zufälligem Radius
     */
   
   public void meineZufallsSterne(Graphics g){
   	// TODO 60 Sterne zufällig groß und zufällig verteilt zeichnen
	   this.zeichneEinenStern(g, 200, 300, 50); // test case!!!
	   for (int i = 0; i < 60; i = i + 1) {
		   double dx = Math.random() * this.getWidth();
		   double dy = (int)(Math.random() * this.getHeight()); // (int) einklammern!
		   int ix = (int) dx;
		   int iy = (int) dy;
 		   //int iR = (int) Math.random();
		   
		   this.zeichneEinenStern(g, ix, iy, 50);
		   
	   }
	   
   } 
}
