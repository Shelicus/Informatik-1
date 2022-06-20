package blatt11.patrick;

public class ExampleForDivByZeroException {
    static int output;


    public static void main(String[] args) {

        System.out.println(div(2,0));
    }

    /**
     * Zwei Werte dividieren
     * @param z, Zahl die dividiert wird (Zähler)
     * @param n, Zahl durch die dividiert wird (Nenner)
     * @return z / n
     */
    public static int div(int z, int n) {
        try {
            output = z / n;
        } catch (java.lang.ArithmeticException e) {
            System.err.println("Fehlergrund: \"/ by zero\"\n" +
                    "java.lang.ArithmeticException: / by zero\n" +
                    "at\n" +
                    "blatt11.ExampleForDivByZeroException.div(ExampleForDivByZeroExceptio\n" +
                    "n.java:17)\n" +
                    "at\n" +
                    "blatt11.ExampleForDivByZeroException.main(ExampleForDivByZeroExcepti\n" +
                    "on.java:31)");
            output = Integer.MAX_VALUE;
        }
        return output;
    }
}
