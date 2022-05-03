package blatt05.patrick;

public class DreiChinesen {
	static final String text =
			"Drei Chinesen mit dem Kontrabass\n"
					+ "saßen auf der Straße und erzählten sich was.\n"
					+ "Da kam ein Mann: Ja was ist denn das?\n"
					+ "Drei Chinesen mit dem Kontrabass.\n\n";

	/**
	 * Einen Text zentriert ausgeben. Es genügt eine Lösung für nichtproportionale
	 * Schriftarten.
	 *
	 * @param text Text mit mehreren Zeilen (durch '\n' abgetrennt)
	 */
	static void printCentered(String text) {
		String[] stringParts = text.split("\n");
		int greatestString = searchGreatestString(stringParts);
		addSpaces(stringParts, greatestString);
		for (String j : stringParts) {
			System.out.println(j);
		}
		System.out.println("");
	}

	/**
	 * Sucht den String, an dem sich die Zentrierung orientiert. Dieser String soll
	 * ohne Leerzeichen ausgegeben werden.
	 * @param stringParts
	 * @return index des String Arrays, das eingegeben wurde
	 */
	public static int searchGreatestString(String[] stringParts) {
		for (int i = 0; i < 5; i++) {
			boolean theGreatest = false;
			for (String j : stringParts) {
				if (stringParts[i].length() >= j.length())
					theGreatest = true;
				else
					theGreatest = false;

			}
			if (theGreatest)
				return i;
		}
		return 0;
	}

	/**
	 * Fügt allen Strings des Arrays die gewünschte Anzahl an Leerzeichen hinzu.
	 * @param stringParts String Array, das bearbeitet werden soll
	 * @param greatestString Index des längsten Strings
	 */
	public static void addSpaces(String[] stringParts, int greatestString) {
		for (int i = 0; i < 4; i++) {
			int SpacesToBeAdded = (stringParts[greatestString].length() - stringParts[i].length()) / 2;
			while (SpacesToBeAdded > 0) {
				stringParts[i] = ' ' + stringParts[i];
				SpacesToBeAdded--;
			}
		}
	}


	/**
	 * Vokale in Text ersetzen.
	 *
	 * @param text        Text mit Vokalen
	 * @param replacement Ersatz für Vokale
	 * @return Text mit geänderten Vokalen
	 */
	static String changeVowels(String text, String replacement) {
		return text.replaceAll("[a,e,i,o,u]", replacement);
	}

	public static void main(String[] args) {
		DreiChinesen.printCentered(text);
		DreiChinesen.printCentered(DreiChinesen.changeVowels(text, "i"));
		DreiChinesen.printCentered(DreiChinesen.changeVowels(text, "ü"));
	}

}
