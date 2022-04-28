package blatt05.patrick.stall;

public class Main {
    public static void main(String[] args) {
        Bauer walter = new Bauer("Walter");
        Huhn heidrun = new Huhn("Heidrun");
        Huhn heike = new Huhn("Heike");
        Huhn hannelore = new Huhn("Hannelore");
        walter.rufeHuhn(heidrun);
        walter.fuettern(heidrun);
        walter.rufeHuhn(heike);
        walter.fuettern(heike);
        walter.rufeHuhn(hannelore);
        walter.fuettern(hannelore);
        System.out.println(walter.berechneAnzahlHungrigerHuehner());
    }
}
