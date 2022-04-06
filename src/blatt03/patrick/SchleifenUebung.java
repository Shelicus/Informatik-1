package blatt03.patrick;

public class SchleifenUebung {

    public static void main(String[] args) {
        float startwert = -4f;
        float endwert = 4f;
        float schrittweite = 0.5f;
        //quadratzahlen(startwert,endwert,schrittweite);
        trigonomie(startwert, endwert, schrittweite);

    }

    public static void quadratzahlen(float startwert, float endwert, float schrittweite) {
        System.out.println("Alle Quadratzahlen von -4 ... 4 in 0.5er-Schritten:");
        for(float i = startwert; i <= endwert; i+= schrittweite){
            System.out.println("x, x^2: " + i + ", " + (i*i));
        }
    }

    public static void trigonomie(float startwert, float endwert, float schrittweite) {
        System.out.println("Alle Sinus, Cosinus von -4 ... 4 in 0.5er-Schritten:");
        for(float i = startwert; i <= endwert; i+= schrittweite) {

        }


    }
}
