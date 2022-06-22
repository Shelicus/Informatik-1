package blatt11.david;

public class ExampleForDivByZeroException {

    /**
     * Zwei Werte dividieren
     * @param z, Zahl die dividiert wird (Zähler)
     * @param n, Zahl durch die dividiert wird (Nenner)
     * @return z / n
     */
    public static int div(int z, int n) {
        try {
            return z / n;
        }catch (ArithmeticException exception){
            System.err.printf("Es ist ein Fehler Aufgedrehten %s \n",exception);
            return Integer.MAX_VALUE;
        }
    }


    public static void main(String[] args) {
        System.out.println(div(5,0));
    }
}
