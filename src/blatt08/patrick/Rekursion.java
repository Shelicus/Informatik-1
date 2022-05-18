package blatt08.patrick;

public class Rekursion {
    static int zaehler = 1;
    static int zaehlerQuadrat = 1;
    static int zaehlerGerade = 2;

    public static void main(String[] args) {
        //TODO Fehlerüberprüfung
        long n = Integer.parseInt(args[0]);
        prt1234(n);
        prtSqr1234(4);
        prt2468(9);
        xxx(5);
        alternativeXXX(5);
    }

    static void prt1234(long n) {
        if (zaehler >= n)
            System.out.println(zaehler);
        else {
            System.out.print(zaehler + ", ");
            zaehler++;
            prt1234(n);
        }

    }

    static void prtSqr1234(long n) {
        if (zaehlerQuadrat >= n)
            System.out.println(zaehlerQuadrat * zaehlerQuadrat);
        else {
            System.out.print(zaehlerQuadrat * zaehlerQuadrat + ", ");
            zaehlerQuadrat++;
            prtSqr1234(n);
        }

    }

    static void prt2468(long n) {
        if (zaehlerGerade >= n || zaehlerGerade >= n - 1 && n % 2 == 1)
            System.out.println(zaehlerGerade);
        else {
            System.out.print(zaehlerGerade + ", ");
            zaehlerGerade += 2;
            prt2468(n);
        }

    }

    static void xxx(long n) {
        if(n > 0L) { //Rekursionsfortsetzung
            System.out.print(n);
            xxx(n-1);
        }
        else {
            System.out.println();
        } // Rekursionsbasis
    }

    static void alternativeXXX(long n) {
        for (;n> 0L; n--){
            System.out.print(n);
        }
    }
}
