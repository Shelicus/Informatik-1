package blatt03.david;

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
        // TODO
        int x25= this.getWidth() / 4;
        int y25 = this.getHeight() / 4;
        int x75 = this.getWidth() * 3 / 4;
        int y75 = this.getHeight() * 3 / 4;


        for(int n = 0; n < 2; n++) {
            for (int x = 0; x < 11; x++) {
                if ((x % 2 == 0)) {
                    g.setColor(Color.BLACK);
                } else {
                    g.setColor(Color.LIGHT_GRAY);
                }
                g.drawLine((n % 2 == 0) ? x25 + (x * 50): x25,(n % 2 == 0) ? y25: y25 + (x * 50), (n % 2 == 0) ? x25 + (x * 50): x75,(n % 2 == 0) ? y75:y25 + (x * 50));
            }

        }
    }
}
