package blatt05.johannes;

/** Klasse Huhn
 * 
 */
public class Huhn {
	private String name;
	private Boolean hungrig = true;
	
	/**	Erstellt ein Huhn mit Namen
	 * @param pName
	 * 		Name des Huhns
	 */
	Huhn(String pName){
		this.name = pName;
		//this.hungrig = true;
	}
	
	/** Setzt den die Instanzvariable hungrig auf false
	 * 
	 */
	public void setHungrig(){
		this.hungrig = false;
	}
	
	/** Gibt den Namen als String von der Instanz zurueck
	 * @return name
	 * 		Als String der Name der Instanz
	 */
	public String getName() {
		return this.name;
	}
	

}
