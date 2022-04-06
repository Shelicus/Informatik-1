// Datei Fahrenheit4.java
	package blatt02;
	public class Fahrenheit4 {
		/**
		 * Geg.: Temperaturbereich in °F <br/>
		 * Ges.: Temperaturliste in °C
		 *
		 * @param args unused
		 */
		public static void main(String[] args) {

			final int UPPER = 250; // obere Grenze
			final int LOWER = 0; // untere Grenze
			final int STEP = 25; // Schrittweite
			final int NUM_PER_ROW = 5; //Schrittweite der Ausgabe


			//Aufgabenteil A

			for (int fahrenheit = LOWER; fahrenheit <= UPPER; fahrenheit += STEP) {
				//Berechnung
				int celsius = 5 * (fahrenheit - 32) / 9;

				//erste funktionierende Loesung
				if (fahrenheit == 0) {
					System.out.print(fahrenheit + " °F = " + celsius + "°C\t");
				} else if (fahrenheit % 125 == 0) {
					System.out.print("\n" + fahrenheit + " °F = " + celsius + "°C\t");
				} else {
					System.out.print(fahrenheit + " °F = " + celsius + "°C\t");
				}

			}

			//Leer zwischen den Teilaufgaben
			System.out.print("\n\n");


			//Aufgabenteil B

			for (int fahrenheit = LOWER; fahrenheit <= UPPER; fahrenheit = fahrenheit + STEP) {
				//Berechnung
				int celsius = 5 * (fahrenheit - 32) / 9;

				// Zusatzaufgabe
				if (fahrenheit == 0) {
					System.out.print(fahrenheit + " °F = " + celsius + "°C\t");
				} else if (fahrenheit % (NUM_PER_ROW * STEP) == 0) {
					System.out.print("\n" + fahrenheit + " °F = " + celsius + "°C\t");
				} else {
					System.out.print(fahrenheit + " °F = " + celsius + "°C\t");
				}
			}
		}
	}