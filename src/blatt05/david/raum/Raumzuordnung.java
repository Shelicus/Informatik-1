package blatt05.david.raum;

//import k04_types.Person;

// Beispiel für Referenzen: Klasse für Mitarbeiter-Raumzuordnung
public class Raumzuordnung {
	private Raum raum;		// Referenz auf Raum
	private Person nutzer;	// Referenz auf Nutzer/in

	private String grundZuordnung;

	final static int MINIMALE_LAENGE = 3;

	/**
	 * Konstruktor
	 * @param raum   Raum Nummer
	 * @param nutzer  Nutzer des Raumes
	 * @param grundZuordnung  Zuordnungsgrund
	 *
	 */
	public Raumzuordnung(Raum raum, Person nutzer, String grundZuordnung) {
		if (grundZuordnung != null &&grundZuordnung.length() >= MINIMALE_LAENGE) {
			this.grundZuordnung = grundZuordnung;
		}
		else{System.err.println("\nDie Minimale länge wurde unterschritten ");
		}

		this.raum = raum;
		this.nutzer = nutzer;
	}

	/* Print Methode */
	public void print() {
		if(getNutzer() != null && getNutzer() != null && getRaumzuordnung() != null) {
			this.getNutzer().print();
			System.out.print(" nutzt den Raum: ");
			this.getRaum().print();
			System.out.print(" " + getRaumzuordnung());
		}
		else System.err.print("Die Ausgabe ist gleich Null");
	}

	/* Gettermethode */
	Raum getRaum() {
		return this.raum;
	}

	/* Gettermethode */
	public String getRaumzuordnung(){
		return this.grundZuordnung;
	}

	/* Gettermethode */
	Person getNutzer() {
		return this.nutzer;
	}
	
	public static void main(String[] a) { 
		// Bröckl nutzt den Raum E 212a
		Person ub = new Person("Ulrich", "Bröckl");
		Raum e212a = new Raum("e 212a", 2);
		Raumzuordnung ub2e212a = new Raumzuordnung(e212a, ub, "als Labor");
		ub2e212a.print();	

		// Bröckl nutzt außerdem den Raum E 201
		Raumzuordnung ub2e201 = new Raumzuordnung(
				new Raum("e 201", 77, true), // keine Zwischenvariable für e201 nötig...
				ub,"lab" );
		// Den Raum dieser Zuordnung ausgeben:
		System.out.print("\n     Außerdem: ");
		ub2e201.getRaum().print();
		System.out.println("\n");
		
		// Vogelsang nutzt den Raum E 209
		Raumzuordnung hv2e209 = new Raumzuordnung(
				new Raum("e 209", 3),
				new Person("Holger", "Vogelsang"), "als Büroraum");
		hv2e209.print();
		
	}

}
