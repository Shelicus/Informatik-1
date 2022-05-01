package blatt05.johannes;

/** Beispiel für Referenzen: Klasse für Mitarbeiter-Raumzuordnung */
public class Raumzuordnung {
	private Raum raum;		// Referenz auf Raum
	private Person nutzer;	// Referenz auf Nutzer/in
	private String grundZuordnung;
	// TODO Grund für Zuordnung (z.B. "Büroraum", "Labor") als Zeichenkette ergänzen. 
	//		Darf nicht NULL sein und muss mindestens aus 3 Zeichen bestehen. 
	//		Bitte auch passende Zugriffsmethode und zusätzlichen Konstruktor 
	//		mit Zuordnungsgrund hinzufügen.
	
	/** Gettermethode*/
	public String getGrundZuordnung() {
		return this.grundZuordnung;
	}
	
	/** Konstruktor2 */
	public Raumzuordnung(Raum raum, Person nutzer, String grundZuordnung) {
		this(raum, nutzer);
		final int MINIMALE_ANZAHL_ZEICHEN = 3;
		if(grundZuordnung == null || grundZuordnung.length() < MINIMALE_ANZAHL_ZEICHEN) {
				System.err.println("Nullpointerexception: Zuordnungsgrund ist null oder < 3 Zeichen");
		} else {
			this.grundZuordnung = grundZuordnung;
		}
	}
		
	/** Konstruktor */
	public Raumzuordnung(Raum raum, Person nutzer) {
		// TODO: prüfen, dass jeweils nicht null
		if(raum == null | nutzer == null) {
			System.err.println("Nullpointerexception: Raum oder Nutzer ist null");
		} else {
			this.raum = raum; this.nutzer = nutzer;	
			}
		} 

	public void print() {
		this.getNutzer().print();
		System.out.print(" nutzt den Raum: ");
		this.getRaum().print();
		if(this.getGrundZuordnung() != null) {
			System.out.print(" " + this.getGrundZuordnung());
		}
	}
	
	Raum getRaum() {
		return this.raum;
	}
	
	Person getNutzer() {
		return this.nutzer;
	}
	
	public static void main(String[] a) { 
		// Bröckl nutzt den Raum E 212a
		Person ub = new Person("Ulrich", "Bröckl");
		Raum e212a = new Raum("e 212a", 2);
		String gZ = new String("als Büro");
		Raumzuordnung ub2e212a = new Raumzuordnung(e212a, ub, gZ);
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
				new Person("Holger", "Vogelsang"),
				new String("als Büro"));
		hv2e209.print();
	}

}