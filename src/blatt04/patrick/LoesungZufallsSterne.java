package blatt04.patrick;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse für das zufällige Zeichnen von Sternen
 */
public class LoesungZufallsSterne extends JFrame {

    /**
     * Konstruktor. Nichts zu ändern hier
     */
    public LoesungZufallsSterne() {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1024, 768);
        this.setTitle("Lösung in der Klasse " + this.getClass().getName());
        this.setVisible(true);
    }

    /**
     * Paint-Methode. Nichts zu ändern hier. Diese Methode
     * wird beim Öffnen des Fensters automatisch aufgerufen.
     * Die Methode wird auch aufgerufen, wenn die Größe des Fensters
     * verändert wird.
     *
     * @param g Grafik, auf die gezeichnet wird.
     */
    public void paint(Graphics g) {
        /* Löschen des Fensterinhalts (wichtig bei erneutem Zeichnen): */
        g.clearRect(0, 0, this.getWidth(), this.getHeight());


        this.meineZufallsSterne(g); // Aufruf der selbst programmierten Methode
    }

    /**
     * Main-Methode. Nichts zu ändern hier.
     */
    public static void main(String[] args) {
        new LoesungZufallsSterne();
    }

    /**
     * 1. Teilaufgabe: Methode, um einen Stern zu zeichnen.
     *
     * @param g    Grafikbereich, auf dem gezeichnet wird
     * @param midX x-Koordinate des Mittelpunkts des Sterns
     * @param midY y-Koordinate des Mittelpunkts des Sterns
     * @param r    Radius des Sterns
     */
    public void zeichneEinenStern(Graphics g, int midX, int midY, int r) {
        int n = 50;
        double phi;
        g.setColor(Color.blue);

        for (int i = 0; i < n; i++) {
            phi = i * (2.0 * Math.PI) / n;
            if (i % 2 == 0 && i > 0) {
                r *= 2;
                g.setColor(Color.blue);
            } else if(i % 2 == 1) {
                r /= 2;
                g.setColor(Color.magenta);
            }
            double drawX = Math.cos(phi) * r;
            double drawY = Math.sin(phi) * r;
            g.drawLine(midX, midY, midX + (int) (drawX), midY + (int) (drawY));
        }
    }

    /**
     * 2. Teilaufgabe: Sterne zufällig platzieren mit zufälligem Radius
     */

    public void meineZufallsSterne(Graphics g) {
        for (int i = 0; i <= 60; i++) {
            int randomX = (int) (Math.random() * this.getWidth());
            int randomY = (int) (Math.random() * this.getHeight());
            int randomR = (int) (Math.random() * 100);
            //this.zeichneEinenStern(g, randomX, randomY, 100);
            this.zeichneEinenStern(g, randomX, randomY, randomR);

        }
    }
}
