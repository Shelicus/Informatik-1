package blatt05.patrick.stall;

public class Bauer {
    private String name;
    private static int anzahlGefuetterterHuehner;

    public Bauer(String name) {
        this.name = name;
    }

    public void fuettern(Huhn huhn) {
        if (huhn.getHungrig()) {
            Bauer.anzahlGefuetterterHuehner++;
            huhn.setHungrig(false);
        }
    }

    public void rufeHuhn(Huhn huhn) {
        System.out.println(huhn.getName());
    }

    public int berechneAnzahlHungrigerHuehner() {
        return Huhn.getAnzahlHuehner() - Bauer.anzahlGefuetterterHuehner;

    }
}

