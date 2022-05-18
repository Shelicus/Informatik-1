package blatt07.david;

public class TernarySalutation {
	/**
	 * Alle möglichen Grußformeln ausgeben 
	 */
	private static void testSalutation() {
		boolean bools[] = {true, false};
		for(boolean firstNameBase : bools) {
			for(boolean signature : bools) {
				System.out.println("\n..........<Mail-Text>..........\n"); // Platzhalter  
				System.out.println(salutation(firstNameBase, signature, "Kim", "May", "Raum E502\nTel.: 01234/567890"));
				System.out.println("\n"); // Abstand zur uebersichtlichen Ausgabe 
			}
		}
	}
	
	/**
	 * Grußformeln abhängig vom Bekanntheitsgrad und wahlweise mit oder ohne Signatur ausgeben
	 * @return Grußformeln
	 * @param onFirstNameBase Per-Du?
	 * @param signature Signatur anfügen?
	 * @param given	Vorname
	 * @param name Nachname
	 * @param signatureText Signatur
	 */
	static String salutation2(boolean onFirstNameBase, boolean signature, String given, String name, String signatureText)
	{
		if(onFirstNameBase && signature) return "Mit freundlichen Grüßen\n"+ given + " " + name + "\n-------------\n" + signatureText;
		else if(onFirstNameBase && !signature) return "Mit freundlichen Grüßen\n" + given + " "  + name;
		else if(!onFirstNameBase && signature) return "Viele Grüße\n" + given;
		else if(!onFirstNameBase && !signature) return "Viele Grüße\n" + given + "\n-------------\n" + signatureText;
		return null;
	}

	static String salutation(boolean onFirstNameBase, boolean signature, String given, String name, String signatureText)
	{
		String re, re2;
		re = (!onFirstNameBase) ?  "Mit freundlichen Grüßen\n"+ given + " " + name + "\n": "Viele Grüße\n" + given + "\n";
		re2 = (signature) ? "-------------\n"+ signatureText : "";
		return re + re2;
	}
	
	public static void main(String[] args) {
		testSalutation();							
	}
}
