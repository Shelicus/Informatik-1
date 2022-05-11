package blatt05.patrick;

import blatt05.patrick.Person;

/** Beispiel für Referenzen: Klasse für Mitarbeiter-Raumzuordnung */

public class Raumzuordnung {
	private Raum raum;		// Referenz auf Raum
	private Person nutzer;	// Referenz auf Nutzer/in
	private String zuordnung;
//TODO Grund für Zuordnung (z.B. "Büroraum", "Labor") als Zeichenkette ergänzen.
//		Darf nicht NULL sein und muss mindestens aus 3 Zeichen bestehen.
//		Bitte auch passende Zugriffsmethode und zusätzlichen Konstruktor
//		mit Zuordnungsgrund hinzufügen.

	/** Konstruktor */
	public Raumzuordnung(Raum raum, Person nutzer, String zuordnung) {
		if(raum == null || nutzer == null || zuordnung == null || zuordnung.length() < 2) {
			System.err.println("Fehler");
		}
		else {
			this.raum = raum;
			this.nutzer = nutzer;
			this.zuordnung = zuordnung;
		}
	}

	/**
	 * Konstruktor
	 * @param raum
	 * @param nutzer
	 */
	public Raumzuordnung(Raum raum, Person nutzer) {
		if(raum == null || nutzer == null) {
			System.err.println("Fehler");
		}
		else{
			this.raum = raum;
			this.nutzer = nutzer;
		}
	}

	public void print() {
		this.getNutzer().print();
		System.out.print(" nutzt den Raum: ");
		this.getRaum().print();
		System.out.print(", " + this.getZuordnung());
	}

	Raum getRaum() {
		return this.raum;
	}

	Person getNutzer() {
		return this.nutzer;
	}

	public String getZuordnung() {
		return this.zuordnung;
	}

	public static void main(String[] a) {
		// Bröckl nutzt den Raum E 212a
		Person ub = new Person("Ulrich", "Bröckl");
		Raum e212a = new Raum("e 212a", 5);
		Raumzuordnung ub2e212a = new Raumzuordnung(e212a, ub, "im Büro");
		ub2e212a.print();

		// Bröckl nutzt außerdem den Raum E 201
		Raumzuordnung ub2e201 = new Raumzuordnung(
				new Raum("e 201", 77, true), // keine Zwischenvariable für e201 nötig...
				ub);

		// Den Raum dieser Zuordnung ausgeben:
		System.out.print("\n     Außerdem: ");
		ub2e201.getRaum().print();
		System.out.println("\n");

		// Vogelsang nutzt den Raum E 209
		Raumzuordnung hv2e209 = new Raumzuordnung(
				new Raum("e 209", 3),
				new Person("Holger", "Vogelsang"), "im Büro");
		hv2e209.print();

	}

}