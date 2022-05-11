package blatt05.patrick.stall;

/**
 * Klasse, die ein Huhn beschreibt
 * @author pipa1011
 * @version 1.0
 */
public class Huhn {
    private final String name;
    private boolean hungrig = true;
    private static int anzahlHuehner;


    /**
     * Public-Konstruktor für die Klasse Huhn
     * @param name
     */
    public Huhn(String name) {
        this.name = name;
        anzahlHuehner++;

    }

    /**
     * Getter Methode für die Variable name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter-Methode für die Variable anzahlHuehner
     * @return anzahlHuehner
     */
    public static int getAnzahlHuehner() {
        return anzahlHuehner;
    }

    /**
     * Getter-Methode für die Variable hungrig
     * @return hungrig
     */
    public boolean getHungrig() {
        return hungrig;
    }

    /**
     * Setter-Methode für die Variable hungrig
     * @param hungrig
     */
    public void setHungrig(boolean hungrig) {
        this.hungrig = hungrig;
    }

}
