//Insertion Sorting Driver Class
//UML and Patterns/ and Exceptions
//Written by Timothy Tu
//November 6 2020
//Language: Java

package InsertionSort;

public class InsertionSortingDriver {
    public static void main(String args[]) {
		double[] array = {2 , 4 ,6 ,8, 5};
		int i = 0;
		int length = array.length;
		
		System.out.println("Current Array Values: ");
		for (i = 0; i < length; i++) {
			System.out.println(array[i] + " ");
		}
		
		System.out.println("Sorting Array Values. ");
		InsertionSorting.sort(array, 0, length - 1);
		
		System.out.println("Sorted Array Values: ");
		for (i = 0; i < length; i++) {
			System.out.println(array[i] + " ");
		}
	}
}
