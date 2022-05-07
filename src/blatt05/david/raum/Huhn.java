package blatt05.david.raum;

public class Huhn {
    private Boolean hungrig = true;
    private String name;
    private static int anzahlHuehner;

    /**
     * Konstruktor
     *
     * @param name Name vom huhn
     */
    Huhn(String name){
        this.name = name;
        Huhn.anzahlHuehner++;
    }

    /**
     * Gettermethode
     * @return name Gibt namen vom Huhn zurück
     */
    public String getName(){ return this.name;}

    /**
     * Gettermethode
     * @return anzahlHuehner Gibt die anzahl der Hühner zurück
     */
    public static int getAnzahlHuehner(){ return Huhn.anzahlHuehner;}

    /**
     * Settermethode
     * Setzt Huhn auf nicht hungrig
     */
    public void setHungrig(){
        this.hungrig = false;
    }

    /**
     * Methode
     * @return hungrig Gibt zustand von Huhn zurück
     */
    public boolean isHungrig(){
        return this.hungrig;
    }
}
