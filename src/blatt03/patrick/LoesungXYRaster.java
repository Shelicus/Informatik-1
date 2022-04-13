package blatt03.patrick;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse, um ein Raster zu malen
 */
public class LoesungXYRaster extends JFrame {

    /**
     * Konstruktor. Nichts zu ändern hier
     */
    public LoesungXYRaster() {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(604, 417);
        this.setTitle("Lösung in der Klasse " + this.getClass().getName());
        this.setVisible(true);
    }

    /**
     * Main-Methode. Nichts zu ändern hier.
     */
    public static void main(String[] args) {
        new LoesungXYRaster();
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


        this.meinRaster(g); // Aufruf der selbst programmierten Methode
    }

    /**
     * Hier bitte die Lösung, um das Raster zu zeichnen
     */
    public void meinRaster(Graphics g) {
        int x25 = this.getWidth() / 4;        // x-Koordinate bei 25% der Fensterbreite (von links)
        int x75 = this.getWidth() * 3 / 4;  // x-Koordinate bei 75% der Fensterbreite (von links)
        int y25 = this.getHeight() / 4;        // y-Koordinate bei 25% der Fensterbreite (von oben)
        int y75 = this.getHeight() * 3 / 4; // y-Koordinate bei 75% der Fensterbreite (von oben)
        double x50 = this.getWidth() / 2.0 /10;
        double y50 = this.getHeight() / 2.0 / 10;
        boolean grau = false;
        for (int i = 0; i <= 10; i++) {
            int drawX = (x25 + (int)(i*x50));
            if (grau) {
                g.setColor(Color.gray);
                grau = false;
            } else {
                g.setColor(Color.black);
                grau = true;
            }
            g.drawLine(drawX, y25, drawX, y75);
        }


        for (int i = 0; i <= 10; i++) {
            int drawY = y25 + (int)(i*y50);
            if (grau) {
                g.setColor(Color.gray);
                grau = false;
            } else {
                g.setColor(Color.black);
                grau = true;
            }
            g.drawLine(x25, drawY, x75, drawY);
        }
    }
}
