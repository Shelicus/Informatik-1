package blatt05.david;

public class DreiChinesen {
	static final String text = 
			  "Drei Chinesen mit dem Kontrabass\n"
			+ "saßen auf der Straße und erzählten sich was.\n"
			+ "Da kam ein Mann: Ja was ist denn das?\n"
			+ "Drei Chinesen mit dem Kontrabass.\n\n"
			;

	/**
	 * Einen Text zentriert ausgeben. Es genügt eine Lösung für nichtproportionale
	 * Schriftarten.
	 * 
	 * @param text
	 *            Text mit mehreren Zeilen (durch '\n' abgetrennt)
	 */
	static void printCentered(String text) {
		String[] splited_string;
		splited_string = text.split("\n");

		//Ermittlung des längsten Satzes
		int biggestString = splited_string[0].length();
		for(int x = splited_string.length; x > 0; x--){
			if(splited_string[x-1].length() > biggestString){
				biggestString = splited_string[x-1].length();
			}
		}

		//Ausgabe der Sätze mit Leerzeichen
		int spaces;
		for(int x = 0; x < splited_string.length; x++) {
			spaces = (biggestString - splited_string[x].length())/2;
			System.out.println(" ".repeat(spaces)+ text.split("\n")[x]);
		}
		System.out.println("\n\n");

	}

	/**
	 * Vokale in Text ersetzen.
	 * 
	 * @param text
	 *            Text mit Vokalen
	 * @param replacement
	 *            Ersatz für Vokale
	 * @return Text mit geänderten Vokalen
	 */
	static String changeVowels(String text, String replacement) {
		String[] umlaute = new String[] {"a","e","i","o","u"};
		//Ersetzen der einzelnen Umlaute
		for(int x = 0; x < umlaute.length; x++){
			text = text.replace(umlaute[x], replacement);
			}
		return text;
	}

	public static void main(String[] args) {
		DreiChinesen.printCentered(text);
		DreiChinesen.printCentered(DreiChinesen.changeVowels(text, "i"));
		DreiChinesen.printCentered(DreiChinesen.changeVowels(text, "ü"));
	}

}
