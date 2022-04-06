package blatt02;

import java.util.Scanner;

public class Konto {

    public static void main(String[] args) {
        double guthaben = 0.0;
        double zins = 2.0; //Sparzins  2.0 %
        double erhoehung = 1000.0;//Ende des Jahres Guthaben 1000.0€
        int laufzeit = 30;
        double sparziel = 0;
        int eingabe;
        boolean falscheEingabe;

        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Bitte entscheiden Sie welche der folgenden Berechnung Sie ausführen möchten:\s
                 1) Sparlplan mit Zinseszins
                 2) Sparplan ohne Zinseszins
                 3) Erfolgreiche Dauer eines Sparziels mit Zinseszins""");
        do {
            falscheEingabe = false;
            eingabe = scanner.nextInt();
            if (eingabe < 0 || eingabe > 3) {
                System.out.println("Bitte wählen sie eine der 3 Auswahlmöglichkeiten: ");
                falscheEingabe = true;
            }
        } while (falscheEingabe);

        System.out.println("Bitte geben Sie Ihr Startguthaben ein: ");
        guthaben = scanner.nextDouble();
        System.out.println("Bitte geben Sie die Zinssatz (in %) ein: ");
        zins = scanner.nextDouble();
        if (eingabe == 3) {
            System.out.println("Bitte geben sie Ihr Sparziel ein:");
            sparziel = scanner.nextInt();
        } else {
            System.out.println("Bitte geben Sie die Laufzeit (in Jahren) ein: ");
            laufzeit = scanner.nextInt();
        }

        switch (eingabe) {
            case 1 -> sparplanMitZinseszins(guthaben, zins, laufzeit, erhoehung);
            case 2 -> sparplanOhneZinseszins(guthaben, zins, laufzeit, erhoehung);
            case 3 -> erfolgreicheDauerEinesSparzielsMitZinseszins(guthaben, zins, sparziel, erhoehung);
        }

        scanner.close();
    }

    /**
     * Die Methode berechnet die Anzahl der Jahre, die der Nutzer braucht, bis er das gewünschte Sparziel
     * erreicht hat.
     *
     * @param guthaben  Startkapital in Euro
     * @param zins      Zinssatz
     * @param jahre     Fuer wie viele Jahre, der Sparplan berechnet werden soll.
     * @param erhoehung des Guthabes jedes Jahr
     * @return guthaben Welches guthaben erreicht wurde
     * @author unjo1011
     */
    public static void sparplanMitZinseszins(double guthaben, double zins, int jahre, double erhoehung) {
        //TM1: Sparplan mit Zineszins

        for (int i = 1; i <= jahre; i++) {
            System.out.println("Guthaben nach dem " + i + ". Jahr " + guthaben); // Nachdem das Guthaben Ausgeben wurde, wir es fuer das naechste Jahr berechnet
            guthaben *= (1. + zins / 100.0); //Zinseszins Formel: K_neu = K ( 1 + p / 100)^2
            guthaben += erhoehung;
        }
    }

    /**
     * Die Methode berechnet die Anzahl der Jahre, die der Nutzer braucht, bis er das gewünschte Sparziel
     * erreicht hat.
     *
     * @param guthaben  Startkapital in Euro
     * @param zins      Zinssatz
     * @param jahre     Fuer wie viele Jahre, der Sparplan berechnet werden soll.
     * @param erhoehung des Guthabes jedes Jahr
     * @return guthaben Welches guthaben erreicht wurde
     * @author scda1096
     */
    public static void sparplanOhneZinseszins(double guthaben, double zins, int jahre, double erhoehung) {
        //TM2: Sparplan ohne Zineszins

        double abgehobenerBetrag = 0;

        for (int x = 1; x <= jahre; x++) {
            System.out.println("Guthaben einschließlich des abgehobenen Betrages nach dem " + x + ". Jahre: " + (guthaben + abgehobenerBetrag)); //Berechnung des Guthabens mit ausgegebenen Zinsen
            abgehobenerBetrag += guthaben * zins / 100; //Speicherung des schon abgehobenen Betrages
            guthaben += erhoehung;
        }
    }

    /**
     * Die Methode berechnet die Anzahl der Jahre, die der Nutzer braucht, bis er das gewünschte Sparziel
     * erreicht hat.
     *
     * @param guthaben  Startkapital in €
     * @param zins      Zinssatz in %
     * @param sparziel  Gewünschtes Sparziel, bei dem die Methode terminiert.
     * @param erhoehung Der Betrag, der jedes Jahr zusätzlich eingezahlt wird.
     * @return guthaben Welches guthaben erreicht wurde
     * @author pipa1011
     */
    public static void erfolgreicheDauerEinesSparzielsMitZinseszins(double guthaben, double zins, double sparziel, double erhoehung) {
        int vergangeneJahre = 0;
        while (guthaben < sparziel) {
            guthaben += guthaben * zins / 100 + erhoehung;
            vergangeneJahre++;
        }
        System.out.println("Guthaben nach dem " + vergangeneJahre + ". Jahr: " + guthaben);
    }
}