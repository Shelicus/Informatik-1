package blatt08.patrick;

class MethodenUebung {
    public static void main(String[] args) {
        System.out.println(berechneBetrag(-2));
        System.out.println(rundeHoch(2.1));
    }

    static int berechneBetrag(int zahl) {
        return Math.abs(zahl);
    }

    static int rundeHoch(double zahl) {
        return (int) (Math.floor(zahl) + 1);
    }

    static int rundeAb(double zahl) {
        return (int) Math.floor(zahl);
    }

    static boolean DurchZahlRestlosTeilbar(double zahl, double divisor) {
        return zahl % divisor == 0;
    }



}
