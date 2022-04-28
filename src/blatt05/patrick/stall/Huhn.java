package blatt05.patrick.stall;

public class Huhn {
    private String name;
    private boolean hungrig;
    private static int anzahlHuehner;

    public Huhn(String name) {
        this.name = name;
        hungrig = true;
        anzahlHuehner++;

    }

    public String getName() {
        return name;
    }

    public static int getAnzahlHuehner() {
        return anzahlHuehner;
    }

    public boolean getHungrig() {
        return hungrig;
    }

    public void setHungrig(boolean hungrig) {
        this.hungrig = hungrig;
    }
}


