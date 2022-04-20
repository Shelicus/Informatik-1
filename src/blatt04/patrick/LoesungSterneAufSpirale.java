package blatt04.patrick;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Zusatzaufgabe:
 * Klasse für das Zeichnen von Sternen entlang einer Spirale.
 * Wir leiten diesesmal von LoesungZufallsSterne ab, um die Methode
 * zeichneEinenStern wiederverwenden zu können.
 */
public class LoesungSterneAufSpirale extends LoesungZufallsSterne {

    /**
     * Konstruktor. Nichts zu ändern hier
     */
    public LoesungSterneAufSpirale() {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1024, 768);
        this.setTitle("Lösung in der Klasse " + this.getClass().getName());
        this.setVisible(true);
    }

    /**
     * Main-Methode. Nichts zu ändern hier.
     */
    public static void main(String[] args) {
        new LoesungSterneAufSpirale();
    }

    public void zeichneEinenStern(Graphics g, int midX, int midY, int r) {
        int n = 50;
        double phi;
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
            double drawX = Math.cos(phi) * r;
            double drawY = Math.sin(phi) * r;
            g.drawLine(midX, midY, midX + (int) (drawX), midY + (int) (drawY));
        }
    }

    /**
     * Bitte ab hier Lösung zum Zeichnen der Sterne auf der Spirale entwickeln.
     */
    public void paint(Graphics g) {
        for (int i = 1; i < 10; i++) {

        }
    }
}
