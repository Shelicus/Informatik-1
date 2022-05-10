package blatt06.johannes;

import java.util.Arrays;

/** Provides basic arithmetic Operations
 *  like calculateMean, 
 * */
public class ArrayStatistik {
	final static int[] arithmeticArray = { 35, 7, 90, 26, 92, 54, 24, 65, 2, 67,
							  43, 26, 80, 92, 7, 40, 67, 66, 31, 45,
							   7, 100, 96, 93, 12, 20, 57, 22, 62, 51};
	//Nr. 6.3
	final static double[][] twoDimensionalArray = {{0, 74.4}, {350, 18.2}, {1500, 6.1}, {5000, 1.3}};
	
	//TODO: Print Methode und Komments
	public static double calculateExpectedValue(double[][] twoDimArray) {
		double expectedValue = 0.0;
		for(double arrays[] : twoDimArray) {
			expectedValue += arrays[0] * arrays[1];//Sollte man nicht machen!!!
		}
		return expectedValue;
	}
	
	/** calculates the arithmetical Mean
	 * @param array 
	 * 		of type int[] with the given int-Values
	 * @return mean
	 * 		of type int			
	 */
	public static int calculateMean(int[] array) {
		int sum = 0;
		for(int number : array) {
			sum += number;
		}
		return sum / array.length;
	}
	
	/** calculates the minimum
	 * @param array 
	 * 		of type int[] with the given int-Values
	 * @return minimum
	 * 		of type int			
	 */
	public static int calculateMinimum(int[] array){
		int minimum = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] < minimum) {
				minimum = array[i];
			}
		}
		return minimum;
	}
	
	/** calculates the maximum
	 * @param array 
	 * 		of type int[] with the given int-Values
	 * @return maximum
	 * 		of type int			
	 */
	public static int calculateMaximum(int[] array){
		int maximum = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] > maximum) {
				maximum = array[i];
			}
		}
		return maximum;
	}
	
	/** Sorts the given array and calculates the median
	 * @param array 
	 * 		of type int[] with the given int-Values
	 * @return median
	 * 		of type int			
	 */
	public static int calculateMedian(int[] array) {
		Arrays.sort(array);
		int median;
		if/*even number of elements*/(array.length % 2 == 0) {
			//take the two values in the mid of the array
			int elementOne = array[(array.length / 2) - 1];//mid of an Array =length / 2 -1
			int elementTwo = array[array.length / 2];//element mid + 1
			median = (elementOne + elementTwo) / 2;
		} else/*uneven number of elements*/{
			median = array[array.length / 2];
		}
		return median;
	}
	
	/** Prints a given value
	 * @param number 
	 * 		to print		
	 */
	public static void printValue(int number) {
		System.out.printf("%1$d\n", number);
	}
	
	
	
	/**Has no use! 
	 * Sorts the given array and calculates the median
	 * @param array 
	 * 		of type int[] with the given int-Values
	 * @return boolean
	 * 		true if the array is null or has length 0		
	 */
	public static boolean isNullOrEmpty(int[] array) {
		if(array == null || array.length == 0) {
			System.err.println("Array Nullpointerexeption or Empty");
			return true;
		}
		return false;
	}

}
