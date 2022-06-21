package blatt10.johannes;

public class IntegerValueObject {
	private final int i;

	/** creates an object
	 * @param pValue is a given value
	 */
	private IntegerValueObject(int pValue){
		this.i = pValue;
	}
	
	
	/**
	 * Werte zusammenzaehlen
	 * @param j zweiter Summand
	 * @return this.i + j als neues Value-Object
	 */
	protected IntegerValueObject add(int j) {
		return new IntegerValueObject(this.i + j);
	}
	
	/** 
	 * Werte ausmultiplizieren
	 * @param j zweiter Faktor
	 * @return this.i * j als neues Value-Object
	 */
	protected IntegerValueObject mul(int j) {
		return new IntegerValueObject(this.i * j);
	}

	/**
	 * Overrides toString method
	 * */
	@Override
	public String toString() {
		return super.toString() + "\ni value is "+ i;
	}
	
	public static void main(String[] args) {
		System.out.println(new IntegerValueObject(2).mul(3).add(4).mul(5));
	}

}
