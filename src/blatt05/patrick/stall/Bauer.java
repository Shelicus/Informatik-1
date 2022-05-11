package blatt05.patrick.stall;

/**
 * Klasse, die einen Bauern modelliert
 * @author pipa1011
 * @version 1.0
 */
public class Bauer {
    private final String name;
    private static int anzahlGefuetterterHuehner;

    /**
     * Konstruktor
     * @param name
     */
    public Bauer(String name) {

        this.name = name;
    }

    /**
     *Füttert das Huhn, wenn es hungrig ist
     * @param huhn
     */
    public void fuettern(Huhn huhn) {
        if (huhn.getHungrig()) {
            Bauer.anzahlGefuetterterHuehner++;
            huhn.setHungrig(false);
        }
    }

    /**
     * Gibt den Namen des Huhns aus
     * @param huhn
     */
    public void rufeHuhn(Huhn huhn) {
        System.out.println(huhn.getName());
    }

    /**
     * Berechnet, ob es noch Hühner gibt, die hungrig sind
     * @return Anzahl der hungrigen Hühner
     */
    public static int berechneAnzahlHungrigerHuehner() {
        return Huhn.getAnzahlHuehner() - Bauer.anzahlGefuetterterHuehner;

    }
}
