package blatt05.johannes;

/** Klasse Bauer
 * 
 */
public class Bauer {
	String name;
	
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
		huhn.setHungrig();
	}
	
	/** Ruft das Huhn
	 * @param huhn
	 *		Huhn dessen Name angezeigt werden soll
	 */
	void rufeHuhn(Huhn huhn) {
		System.out.println(huhn.getName());
	}
	
	public static void main(String[] args) {
		Bauer b1 = new Bauer("Walter");
		Huhn h1 = new Huhn("Heidrun");
		Huhn h2 = new Huhn("Heike");
		Huhn h3 = new Huhn("Hannelore");
		//fuettern
		b1.fuettern(h1);
		b1.fuettern(h2);
		b1.fuettern(h3);
		//rufen
		b1.rufeHuhn(h1);
		b1.rufeHuhn(h2);
		b1.rufeHuhn(h3);
	}
	
}
