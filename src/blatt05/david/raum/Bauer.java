package blatt05.david.raum;

public class Bauer {
    private String name;
    private static int anzahlGefuetterterHuehner;

    /**
     * Konstruktor
     *
     * @param name Name von Bauer
     */
    Bauer(String name){this.name = name;}

    /**
     * Füttern vom Hühnern
     * @param huhn welches Huhn
     */
    public void fuettern(Huhn huhn){
        if(huhn.isHungrig()) {
            huhn.setHungrig();
            Bauer.anzahlGefuetterterHuehner++; //Wieso muss anzahl Gefütterter Huehner Static
        }
    }

    /**
     * Rufen vom Huhn
     * @param huhn welches Huhn
     */
    public static void rufeHuhn(Huhn huhn){System.out.println(huhn.getName());}

    /**
     * Berechnung von anzahl hungrigen Hühnern
     */
    public static void berechneAnzahlHungrigerHuehner() {System.out.println("Anzahl Huehner " + (Huhn.getAnzahlHuehner() - Bauer.anzahlGefuetterterHuehner));}
    public static void main(String[] args) {
        Bauer bauerEins = new Bauer("Walter");
        Bauer bauerZwei = new Bauer("Heinz");
        Huhn huhn1 = new Huhn("Heidrun");
        Huhn huhn2 = new Huhn("Heike");
        Huhn huhn3 = new Huhn("Hannelore");

        rufeHuhn(huhn1);
        bauerEins.fuettern(huhn1);
        bauerZwei.fuettern(huhn1);
        rufeHuhn(huhn2);
        bauerEins.fuettern(huhn2);
        rufeHuhn(huhn3);
        bauerEins.fuettern(huhn3);
    }
}
