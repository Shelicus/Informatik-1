package blatt03.david;
import static java.lang.Math.*;

/**
 *Aufgaben Blatt 3
 *
 * @author scda1096
 * @version 1.0
 */


public class SchleifenUmgebung {
    public static void main(String[] args){
        final double STARTWERT = -4.0;
        final double ENDWERT = 4.0;
        final double SCHRITTWEITE = 0.5;

        System.out.print("Eine Schleife, die für die Zahlen von -4 bis4 in 0.5er-Schritten " +
                "die Quadratzahlen ausgibt:\n");
        for(double x = STARTWERT; x <= ENDWERT; x += SCHRITTWEITE){
            System.out.printf("\nx, x^2:  %.1f, %.2f", x, pow(x, 2.0));
        }

        System.out.print("\n\n\n\nEine Schleife, die für die Zahlen von -4 bis 4 in 0.5er-Schritten " +
                "die Sinus- und Cosinus-Werte ausgibt \n\n");
        for(double x = STARTWERT; x <= ENDWERT; x += SCHRITTWEITE){
            System.out.printf("\nx, sin(x), cos(x):  %f, %f, %f", x, sin(x), cos(x));
        }
    }
}
