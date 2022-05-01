package blatt05.johannes;

/** Klasse Huhn
 * 
 */
public class Huhn {
	private String name;
	private Boolean hungrig = true;
	private static int anzahlHuehner;//automatisch 0
	
	/**	Erstellt ein Huhn mit Namen
	 * @param pName
	 * 		Name des Huhns
	 */
	Huhn(String pName){
		this.name = pName;
		//this.hungrig = true;
		Huhn.anzahlHuehner++;
	}
	
	/** Setzt den die Instanzvariable hungrig auf false
	 * 
	 */
	public void setHungrig(){
		this.hungrig = false;
	}
	
	/**Checkt ob das Huhn hungrig ist
	 * @return 
	 * 		boolean hungrig
	 */
	public boolean isHungrig() {
		return this.hungrig;
	}
	
	/** Gibt den Namen als String von der Instanz zurueck
	 * @return name
	 * 		Als String der Name der Instanz
	 */
	public String getName() {
		return this.name;
	}
	
	/** Gibt die Anzahl Huehner zurueck
	 * @return Huhn.anzahlHuehner
	 * 		Anzahl der erstellten Huehner
	 * 	 */
	public static int getAnzahlHuehner() {
		return Huhn.anzahlHuehner;
	}
	

}
