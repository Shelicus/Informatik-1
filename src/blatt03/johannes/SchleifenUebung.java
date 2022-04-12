package blatt03.johannes;

public class SchleifenUebung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double START = -4.0;
		final double END = 4.0;
		final double STEP = 0.5;
		String format = new String("x, x^2: %4.2f %4.2f\n");
		
		for(double d = START; d <= END; d = d + STEP) {
			System.out.printf(format, d, Math.pow(d, 2));
			//System.out.println("x, x^2: " + d + " " + Math.pow(d, 2));
		}
		
		System.out.println("\n**************************************\n");
		
		format = "x, sin(x), cos(x): %5.2f, %5.2f, %5.2f\n";
		for(double d = START; d <= END; d = d + STEP) {
			System.out.printf(format, d, Math.sin(d), Math.cos(d));
			//System.out.println("x, sin(x), cos(x): " + d + ", " + Math.sin(d) + ", " + Math.cos(d));
		}
		
		
	}
}
