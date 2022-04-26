package blatt05.johannes;

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
	static void printCentered(String text){
		if(text == null) {
			//Error if(text.equals("null"))
			System.err.println("Text is null!");
		} else {
			String[] lines = text.split("\n"); //Method split return an String[]
			int maxChars = DreiChinesen.calculateMaximumCharsOfAllLines(lines);
			
			for(String printLine : lines) {
				if(printLine.length() != maxChars) {
					//calculate how many chars are left
					int leftChars = (maxChars / 2) - (printLine.length() / 2);
					//TODO: Clear String whitespace = " ";
					String leftWhitespaces = "";
					//leftWhitespaces  = whitespace * halfChars
					for/*Creates a string with leftWitespaces*/(int j = 0; j < leftChars; j++) {
						leftWhitespaces += " ";
					}
					System.out.println(leftWhitespaces + printLine);
				} else {
					System.out.println(printLine);	
				}
			}			
		}
	}
	/**
	 * @param lines
	 * 			String already split into each line
	 * @return number of characters of the line with the most characters
	 */
	public static int calculateMaximumCharsOfAllLines(String[] lines) {
		int maxChars = 0;
		//find the maximum characters of All lines
		for (String line : lines) {
			if (maxChars < line.length()) {
				maxChars = line.length();	
			}
		}
		return maxChars;
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
		String changedText = "";
		if(text == null || replacement == null) {
			System.err.println("String or replacement is null! Null Pointer Exception");
		} else { //replaces every character in brackets with the replacement and creats a new String-Object
			changedText = new String(text.replaceAll("[aeiouäöüAEIOUÄÖÜ]", replacement));
		}
		return changedText;
	}

	public static void main(String[] args) {
//		TestCases
		DreiChinesen.printCentered(text);

//		DreiChinesen.printCentered("Hey, hallo wie geht es dir ??? Mir gut");
//		DreiChinesen.printCentered(" sjfjaspoifjoasjofijosadijofjasiodfijoasijfjoadsijfosifjioaijodfjio");
//		DreiChinesen.printCentered("");
//		//null funktioniert nicht! 
//		DreiChinesen.printCentered(null);
		
		DreiChinesen.printCentered(DreiChinesen.changeVowels(text, "i"));
		DreiChinesen.printCentered(DreiChinesen.changeVowels(text, "ü"));
//		DreiChinesen.printCentered(DreiChinesen.changeVowels(text, "?"));
	}

}
