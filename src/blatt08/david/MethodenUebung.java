package blatt08.david;

public class MethodenUebung {

    public static float betragEinerZahl(float zahl){return (zahl > 0) ? zahl: zahl * -1;}
    public static double aufrundenZurGanzenZahl(double zahl){return Math.ceil(zahl);}
    public static double abrundenZurGanzenZahl(double zahl){return Math.floor(zahl);}
    public static boolean restlosTeilbar(float zahl, float teiler){return zahl % teiler == 0;}
    public static float[] berechnungAbstandZweierZahlen(float x1, int y1, int x2, int y2){
        float[] liste = {betragEinerZahl(x2 - x1), betragEinerZahl(y2 - y1)};
        return liste;
    }
    public static float kleinsteZahl(float zahl1, float zahl2, float zahl3){
        float minZahl = Math.min(zahl1, zahl2);
        return Math.min(minZahl, zahl3);
    }

    /**
     *  @description Methoden Test
     * @author David Schell
     */
    public static void methodenTest(){
        System.out.println("Der Betrag einer Zahl:" + betragEinerZahl(-56));
        System.out.println("Aufrunden auf eine ganze Zahl:" + aufrundenZurGanzenZahl(55.3));
        System.out.println("Abrunden auf eine ganze Zahl:" + abrundenZurGanzenZahl(23.99));
        System.out.println("Prüfung auf restlose Teilbarkeit:" + restlosTeilbar(55,6));
        System.out.println("Berechnung des Abstandes zweier Zahlen:" + berechnungAbstandZweierZahlen(5,5,10,10)[0]);
        System.out.println("Berechnung der kleinesten Zahl:" + kleinsteZahl(6,49,-51));

    }

    enum KartenFarbe {
        KARO, HERZ, PIK, KREUZ
    }
    static int farbenWertAlt(KartenFarbe farbe) {
        if (farbe == KartenFarbe.KARO)
            return 9;
        else if (farbe == KartenFarbe.HERZ)
            return 10;
        else if (farbe == KartenFarbe.PIK)
            return 11;
        else
            return 12;
    }

    static int farbenWertNeu(KartenFarbe farbe) {
        return switch (farbe) {
            case KARO -> 9;
            case HERZ -> 10;
            case PIK -> 11;
            default -> 12;
        };
    }

    public static void prt1234(long zahl){
        if(zahl > 0) {
            prt1234(--zahl);
            System.out.print(++zahl + ", ");
        }
    }

    public static void prtSqr1234(long n){
        if (n > 0){
            prtSqr1234(--n);
            System.out.print(++n*n + " ");
        }
    }

    public static void XXX(long n){
        for(long x = n; x > 0; x--){
            System.out.print(x + ", ");
        }
    }



    public static void main(String[] args) {
        methodenTest();
        System.out.println(farbenWertNeu(KartenFarbe.HERZ));
        prt1234(13);
        System.out.println("\n");
        prtSqr1234(4);
        System.out.println("\n");
        XXX(16);
    }

}
