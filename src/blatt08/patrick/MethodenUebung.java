package blatt08.patrick;

class MethodenUebung {
    public static void main(String[] args) {
        System.out.println(berechneBetrag(-2));
        System.out.println(rundeHoch(2.1));
        System.out.println(rundeAb(2.9));
        System.out.println(DurchZahlRestlosTeilbar(9,3));
        System.out.println(berechneEuklidscheDistanz(new double[]{0, 0},new double[]{2,2}));
        System.out.println(kleinsteZahl(new double[]{10,5,100}));
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

    /**
     * @param punkt1 Array mit zwei Werten {x,y}
     * @param punkt2 Array mit zwei Werten {x,y}
     * @return Abstand zwischen zwei Punkten in double
     */
    static double berechneEuklidscheDistanz(double[] punkt1, double[] punkt2) {
        return punkt2[0] - punkt1[0] / punkt2[1] - punkt1[1];
    }

    static double kleinsteZahl(double[] zahlen){
        double superior = zahlen[0];
        for(int i = 1; i < zahlen.length; i++)
            if(superior > zahlen[i])
                superior = zahlen[i];
        return superior;
    }

}
