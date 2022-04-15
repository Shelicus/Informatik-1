package blatt04.patrick;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse für das Zeichnen eines Sterns
 */
public class LoesungStern extends JFrame {

    /**
     * Konstruktor. Nichts zu ändern hier
     */
    public LoesungStern() {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setTitle("Lösung in der Klasse " + this.getClass().getName());
        this.setVisible(true);
    }

    /**
     * Main-Methode. Nichts zu ändern hier.
     */
    public static void main(String[] args) {
        new LoesungStern();
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


        this.meinStern(g); // Aufruf der selbst programmierten Methode
    }

    /**
     * Hier bitte die Lösung, um den Stern zu zeichnen
     */
    public void meinStern(Graphics g) {
        int r = 50;
        int n = 40;
        double phi;
        int midX = this.getWidth() / 2;
        int midY = this.getHeight() / 2;
        g.setColor(Color.blue);

        for (int i = 0; i < n; i++) {
            phi = i * (2.0 * Math.PI) / n;
            if (i % 2 == 0 && i > 0) {
                r *= 2;
                g.setColor(Color.blue);
            } else if (i % 2 == 1) {
                r /= 2;
                g.setColor(Color.magenta);
            }
            int drawX = (int) (Math.cos(phi) * r);
            int drawY = (int) (Math.sin(phi) * r);
            g.drawLine(midX, midY, midX + drawX, midY + drawY);
        }
    }
}