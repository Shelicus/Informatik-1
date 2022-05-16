package blatt08.patrick;

public class Rekursion {
    static int zaehler = 1;

    public static void main(String[] args) {

        prt1234(4);
        zaehler = 1;
        System.out.println();
        prtSqr1234(4);
    }

    static void prt1234(long n) {
        System.out.print(zaehler + ", ");
        if (zaehler < n) {
            zaehler++;
            prt1234(n);
        }

    }

    static void prtSqr1234(long n) {
        int printout = zaehler * zaehler;
        System.out.print(printout + ", ");
        if (zaehler < n) {
            zaehler++;
            prtSqr1234(n);
        }

    }
}
