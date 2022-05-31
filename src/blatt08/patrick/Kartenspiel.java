package blatt08.patrick;

enum KartenFarbe {
    KARO, HERZ, PIK, KREUZ
}
class KartenSpiel {
    public static void main(String[] args) {
        System.out.println(farbenWert(KartenFarbe.KREUZ));
    }

    static int farbenWert(KartenFarbe farbe) {
        int farbenWert = 0;
        switch (farbe) {
            case KARO:
                farbenWert = 9;
                break;

            case HERZ:
                farbenWert = 10;
                break;

            case PIK:
                farbenWert = 11;
                break;

            case KREUZ:
                farbenWert = 12;
                break;
        }
        return farbenWert;
    }
}
