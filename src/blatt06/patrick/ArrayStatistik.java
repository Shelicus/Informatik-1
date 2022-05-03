package blatt06.patrick;

/**
 * Klasse zur Bearbeitung der Aufgaben vom Übungsblatt
 */
public class ArrayStatistik {
    static final int[] UNSER_ARRAY = {35, 7, 90, 26, 92, 54, 24, 65, 2, 67, 43, 26, 80, 92, 7, 40, 67,
            66, 31, 45, 7, 100, 96, 93, 12, 20, 57, 22, 62, 51};
    static final int[] RANDFALL_NEGATIV = {-5, -10, -15};
    static final int[] RANDFALL_SORTIERT = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    static final int[] RANDFALL_GLEICHE = {1, 1, 1, 1, 1, 1, 1};
    static final double[][] KFZ = new double[4][2];

    /**
     * Main Methode der Klasse ArrayStatistik
     * @param args
     */
    public static void main(String[] args) {
        berechneArithmetischesMittel(UNSER_ARRAY);
        berechneArithmetischesMittel(RANDFALL_NEGATIV);
        berechneArithmetischesMittel(RANDFALL_SORTIERT);
        berechneArithmetischesMittel(RANDFALL_GLEICHE);
        sucheMinimumMaximum(UNSER_ARRAY);
        bildeMedian(UNSER_ARRAY);
        berechneErwartungswert(KFZ);
    }

    /**
     * Berechnet den Erwartungswert des Schadens bei einer Versicherungsgesellschaft
     * @param KFZ
     */
    private static void berechneErwartungswert(double[][] KFZ) {
        KFZ[0] = new double[]{0.0, 74.4};
        KFZ[1] = new double[]{350.0, 18.2};
        KFZ[2] = new double[]{1500.0, 6.1};
        KFZ[3] = new double[]{5000.0, 1.3};
        double erwartungswert = 0;
        for (double[] werte : KFZ) {
            erwartungswert += werte[0] * werte[1];
        }
        System.out.println("Der Erwartungswert des Schadens liegt bei: " + erwartungswert);
    }

    /**
     * Berechnet das arithmetische Mittel einer beliebigen Menge an int-Zahlen
     * @param numbers
     */
    public static void berechneArithmetischesMittel(int[] numbers) {
        int summe = 0;
        for (int number : numbers) {
            summe += number;
        }
        int ergebnis = summe / numbers.length;
        System.out.println("Das arithmetische Mittel ist: " + ergebnis);
    }

    /**
     * Gibt das Minimum und das Maximum einer beliebigen Menge an int-Zahlen aus
     * @param numbers
     */
    public static void sucheMinimumMaximum(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        for (int number : numbers) {
            if (min > number)
                min = number;
            if (max < number)
                max = number;
        }
        System.out.println("Der minimale Wert ist: " + min);
        System.out.println("Der maximale Wert ist: " + max);
    }

    /**
     * Bildet den Median einer beliebigen Menge an int-Zahlen
     * @param numbers
     */
    public static void bildeMedian(int[] numbers) {
        double median;
        //TODO Sortiere das Array
        //numbers.sort() ??? Warum funktioniert das nicht
        if(numbers.length % 2 != 0) {
            median = numbers[(numbers.length / 2)];
        }
        else {
            median = numbers[numbers.length/2] + numbers[(numbers.length/2) - 1];
            median /= 2.0;
        }
        System.out.println("Der Median ist: " + median);
    }
}
