package blatt08.patrick;

class CallTree{
    public static int f() {System.out.print("f() "); g(); h(); return 1;}
    public static int g() {System.out.print("g() "); return 2;}
    public static void h() {System.out.print("h() "); }
    public static void b() {System.out.print("b() ");f(); h();}
    public static void main(String[] args) { b(); }
}
enum KartenFarbe {
    KARO, HERZ, PIK, KREUZ
}
class KartenSpiel{
    public static void main(String[] args) {

    }
    static int farbenWert(KartenFarbe farbe) {
        int farbenWert;
        if (farbe == KartenFarbe.KARO)
            farbenWert = 9;
        else if (farbe == KartenFarbe.HERZ)
            farbenWert = 10;
        else if (farbe == KartenFarbe.PIK)
            farbenWert = 11;
        else
            farbenWert = 12;
        return farbenWert;
    }
}
