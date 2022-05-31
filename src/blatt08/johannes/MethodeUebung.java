package blatt08.johannes;

public class MethodeUebung {
	
	public double betragEinerZahl(double zahl) {
		return zahl > 0 ? zahl : zahl * -1.0;
	}
	
	public static double zahlAufunden(double zahl) {
		return zahl % 1 == 0 ? zahl : (int) zahl + 1.0;//wird wieder ein double
	}//rest ist 0? darf man eigentlich nicht mit Kommazahlen machen
	
	public static double zahlAbrunden(double zahl) {
		return zahl % 1 == 0 ? zahl : (int) zahl - 1.0;//Zahl wird radikal aufgerundet und wieder ein double
	}
	
	public static boolean restlosTeilbar(int zahl, int andereZahl) {
		return zahl % andereZahl == 0;
	}
	
	public static double euklidischeDistanz(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
	
	public double minVonDreiZahlen(double zahlEins, double zahlZwei, double zahlDrei) {
		return zahlEins < zahlZwei ? zahlEins < zahlDrei ? zahlEins : zahlDrei : zahlZwei < zahlDrei ? zahlZwei : zahlDrei;
	}//Sehr schlechter Programmierstyle
	
	public int minVonDreiZahlen(int zahlEins, int zahlZwei, int zahlDrei) {
		int min = zahlEins;
		if(zahlEins < zahlZwei) {
			if(zahlEins > zahlDrei) {
				min = zahlDrei;
			}
		} else {
			if(zahlZwei < zahlDrei) {
				min = zahlZwei;
			} else {
				min = zahlDrei;
			}
		}
		return min;
	}//Besser?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(zahlAufunden(45.5));
		System.out.println(zahlAbrunden(56.0));
		
	}

}
