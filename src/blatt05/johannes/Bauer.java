package blatt05.johannes;

/** Klasse Bauer
 * 
 */
public class Bauer {
	String name;
	//private int anzahlGefuetterterHuehner; => static
	private static int anzahlGefuetterterHuehner;

	/** Erstellt einen Bauer mit Namen
	 * @param pName 
	 * 		Name des Bauers
	 */
	Bauer(String pName){
		this.name = pName;
	}
	
	/** Fuettert das Huhn
	 * @param huhn
	 * 		Das Huhn das gefuetter werden soll
	 */
	void fuettern(Huhn huhn){
		if(huhn.isHungrig()) {
			huhn.setHungrig();
			Bauer.anzahlGefuetterterHuehner++;
			}
		}
	
	/** Ruft das Huhn
	 * @param huhn
	 *		Huhn dessen Name angezeigt werden soll
	 */
	void rufeHuhn(Huhn huhn) {
		System.out.println(huhn.getName());
	}
	
	/** => static
	 * @return
	 * 		Anzahl der noch hunrigen Huehner
	 */
	public static void berechneAnzahlHungrigerHuehner() {
		System.out.println("Anzahl Huehner " + (Huhn.getAnzahlHuehner() - Bauer.anzahlGefuetterterHuehner));		
	}
	
	
	
	public static void main(String[] args) {
		Bauer b1 = new Bauer("Walter");
		Huhn h1 = new Huhn("Heidrun");
		Huhn h2 = new Huhn("Heike");
		Huhn h3 = new Huhn("Hannelore");
		//fuettern
		//b1.fuettern(h1);
		Bauer.berechneAnzahlHungrigerHuehner();
		b1.fuettern(h2);
		Bauer.berechneAnzahlHungrigerHuehner();
		b1.fuettern(h3);
		//b1.berechneAnzahlHungrigerHuehner();
		
		//rufen
		b1.rufeHuhn(h1);
		b1.rufeHuhn(h2);
		b1.rufeHuhn(h3);
		
		Bauer b2 = new Bauer("Walter2");
		b1.fuettern(h1);
		Bauer.berechneAnzahlHungrigerHuehner();
	}
	
}
