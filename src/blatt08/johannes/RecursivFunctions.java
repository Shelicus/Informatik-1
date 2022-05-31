package blatt08.johannes;

public class RecursivFunctions {
	
	
	public static void prt1234(long n) {
		if(n < 1L) {//recursionbase
			System.out.println("base");
		}
		else {
			prt1234(n - 1);
			System.out.print(n);
			}
	}
	
	public static void prtSqr1234(long n) {
		if(n < 1L) {
			System.out.print("base");
		} else {
			prtSqr1234(n-1);
			System.out.print(n*n);
		}
	}
	
	public static void prtSqr2468(long n) {
		if(n < 2L) {
			System.out.print("base ");
		} else {
			if/*n is uneven*/(n % 2 == 1) {
				n--;
			}
			prtSqr2468(n-2);
			System.out.print(n);
		}
	}
	
	public static void xxx(long n){
		if(n > 0L) {
			System.out.print(n);
			xxx(n-1);
		}else {}
	}
	
	public static void xxxIterative(long n) {
		for(; n > 0L; n--) {
			System.out.print(n);
		}
	}
	
	public static void main(String[] args) {
		long zahl = Integer.parseInt(args[0]);
		RecursivFunctions.prt1234(zahl);
		System.out.println();
		RecursivFunctions.prtSqr1234(10);
		System.out.println();
		RecursivFunctions.prtSqr2468(11);
		System.out.println();
		RecursivFunctions.xxx(11);
		System.out.println();
		RecursivFunctions.xxxIterative(11);
	}

}
