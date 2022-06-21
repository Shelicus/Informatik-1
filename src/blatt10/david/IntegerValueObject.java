package blatt10.david;

/**
 *  Ein Integer Wert der nicht geändert wird und es wird immer ein neues Objekt erstellt
 */
public class IntegerValueObject {
    private int i;

    /**
     * Konstruktor der Klasse IntegerValueObject
     * @param i
     * @description Zu Privat, weil es nur von dieser Klasse aufgerufen wird
     */
    private IntegerValueObject(int i) { this.i = i;}

    /**
     * Werte zusammenzählen
     * @param j zweiter Summand
     * @return this.i + j als neues Value-Object
     * @description Zu Public, weil es auch ausserhalb der Klasse aufgerufen werden soll
     */
    public IntegerValueObject addMethode(int j){return new IntegerValueObject(this.i + j);}

    /**
     * Werte ausmultiplizieren
     * @param j zweiter Faktor
     * @return this.i * j als neues Value-Object
     * @description Zu Public, weil es auch ausserhalb der Klasse aufgerufen werden soll
     */
    public IntegerValueObject mulMethode(int j){return new IntegerValueObject(this.i * j);}

    /**
     * toString-Methode implementieren
     * @description Zu Public, weil es auch ausserhalb der Klasse aufgerufen werden soll
     */
    @Override
    public String toString(){return Integer.toString(i);}


    public static void main(String[] args) {
        System.out.println(new IntegerValueObject(2).mulMethode(3).addMethode(4).mulMethode(5) );

    }
}
