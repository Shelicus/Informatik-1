package blatt06.johannes;

public class ArrayStatistikTest {
public static void main(String[] args) {
	int[] testArray1 = {4, 2, 5, 6, 1, 3, 7, 8};
	ArrayStatistik.printValue(ArrayStatistik.calculateMaximum(testArray1));
	ArrayStatistik.printValue(ArrayStatistik.calculateMinimum(testArray1));
	ArrayStatistik.printValue(ArrayStatistik.calculateMean(testArray1));
	ArrayStatistik.printValue(ArrayStatistik.calculateMedian(testArray1));
	
	//BorderlineCases:
	//Only one Element
	int[] testArray2 = {7};
	ArrayStatistik.printValue(ArrayStatistik.calculateMaximum(testArray2));
	ArrayStatistik.printValue(ArrayStatistik.calculateMinimum(testArray2));
	ArrayStatistik.printValue(ArrayStatistik.calculateMean(testArray2));
	ArrayStatistik.printValue(ArrayStatistik.calculateMedian(testArray2));
	
	//Only Elements with the same value:
	int[] testArray3 = {7, 7, 7, 7, 7, 7, 7,};
	ArrayStatistik.printValue(ArrayStatistik.calculateMaximum(testArray3));
	ArrayStatistik.printValue(ArrayStatistik.calculateMinimum(testArray3));
	ArrayStatistik.printValue(ArrayStatistik.calculateMean(testArray3));
	ArrayStatistik.printValue(ArrayStatistik.calculateMedian(testArray3));
	
	//Doesn't work if array is null or empty!
//		int[] testArray4 = {};
//		ArrayStatistik.printValue(ArrayStatistik.calculateMaximum(testArray4));
//		ArrayStatistik.printValue(ArrayStatistik.calculateMinimum(testArray4));
//		ArrayStatistik.printValue(ArrayStatistik.calculateMean(testArray4));
//		ArrayStatistik.printValue(ArrayStatistik.calculateMedian(testArray4));
	
	//Only negative or one negative value!
	int[] testArray5 = {-5, -20, 7, -8};
	ArrayStatistik.printValue(ArrayStatistik.calculateMaximum(testArray5));
	ArrayStatistik.printValue(ArrayStatistik.calculateMinimum(testArray5));
	ArrayStatistik.printValue(ArrayStatistik.calculateMean(testArray5));
	ArrayStatistik.printValue(ArrayStatistik.calculateMedian(testArray5));
	
	//Sorted Array
	int[] testArray6 = {1, 2, 3, 4};
	ArrayStatistik.printValue(ArrayStatistik.calculateMaximum(testArray6));
	ArrayStatistik.printValue(ArrayStatistik.calculateMinimum(testArray6));
	ArrayStatistik.printValue(ArrayStatistik.calculateMean(testArray6));
	ArrayStatistik.printValue(ArrayStatistik.calculateMedian(testArray6));
	}
}
