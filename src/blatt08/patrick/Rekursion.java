package blatt08.patrick;

public class Rekursion {


    public static void main(String[] args) {
        //TODO Fehlerüberprüfung
        long n;
        try {
            n = Integer.parseInt(args[0]);
        }
        catch(Exception e){
            System.err.println(args[0] + " is not a number!");
            return;
        }
            prt1234(n);
        System.out.println();
            prtSqr1234(n);
        System.out.println();
            prt2468(n);
        System.out.println();
            xxx(n);
            alternativeXXX(n);
    }

    static void prt1234(long n) {
        if (n == 1)
            System.out.print(n);
        else {
            prt1234(n-1);
            System.out.print(", " + n);
        }

    }

    static void prtSqr1234(long n) {
        if ( n == 1)
            System.out.print(n * n);
        else {
            prtSqr1234(n-1);
            System.out.print(", " + n*n);
        }

    }

    static void prt2468(long n) {
        if (n == 2) {
            System.out.print(n);
        }
        else if (n % 2 == 1)
            prt2468(n-1);
        else{
            prt2468(n-2);
            System.out.print(", " + n);
        }

    }

    static void xxx(long n) {
        if(n > 0L) { //Rekursionsfortsetzung
            System.out.print(n);
            xxx(n-1);
        }
        else {// Rekursionsbasis
            System.out.println();
        }
    }

    static void alternativeXXX(long n) {
        for (;n> 0L; n--){
            System.out.print(n);
        }
    }
}
