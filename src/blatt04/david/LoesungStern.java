package blatt04.david;

import java.awt.*;
import javax.swing.JFrame;
import static java.lang.Math.*;

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
        int x50 = this.getWidth()/2;
        int y50 = this.getHeight()/2;
        double radius = 100;

        for(int x = 1; x < 49; x+=1){
            if (x % 2  == 0) {
                g.setColor(Color.BLUE);
                g.drawLine(x50, y50, x50 + (int) (cos(x * (1.0 * Math.PI) / 24) * radius), y50 + (int) ((sin(x * (1.0 * Math.PI) / 24) * radius)));
            }
            else {
                g.setColor(Color.MAGENTA);
                g.drawLine(x50, y50, x50 + (int) (cos(x * (1.0 * Math.PI) / 24) * (radius/2)),  y50 + (int) (sin(x * (1.0 * Math.PI) / 24) * (radius/2)));
            }

        }
    }

}