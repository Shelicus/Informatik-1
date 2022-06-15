package blatt10.patrick;

/**
 * Enthält einen Integer-Wert. Dieser wird nicht mehr verändert und ist
 * deshalb private.
 */
public class IntegerValueObject {

    private int i;

    /**
     * Konstruktor der Klasse IntegerValueObject
     * @param i
     */
    public IntegerValueObject(int i) {
        this.i = i;
    }

    /**
     * Werte zusammenzählen
     *
     * @param j zweiter Summand
     * @return this.i + j als neues Value-Object
     */
    public IntegerValueObject add(int j) {
        return new IntegerValueObject(i + j);
    }

    /**
     * Werte ausmultiplizieren
     *
     * @param j zweiter Faktor
     * @return this.i * j als neues Value-Object
     */
    public IntegerValueObject mul(int j) {
        return new IntegerValueObject(i * j);
    }
    @Override
    public String toString() {
        return Integer.toString(i);
    }
}

