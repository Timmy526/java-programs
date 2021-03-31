//Insertion Sorting Class
//UML and Patterns/ and Exceptions
//Written by Timothy Tu
//November 6 2020
//Language: Java

package InsertionSort;

public class InsertionSorting {
    public static void sort (double [] array, int start, int end) {
		if ((end - start) >= 1) {
			int splitting = split(array, start, end);
			sort(array, start, end);
			sort(array, splitting + 1, end);
			join(array, start, splitting, end);
		}
	}
	
	public static int split(double[] array, int start, int end) {
		return (end - 1);
	}
	
	public static void join(double[] array, int start, int splitting, int end) {
		boolean stop = false;
		int i = 0;
		while (i < end && !stop) {
			if (array[end] < array[i]) {
				 double temp = array[end];
				 for(int j = end; j > i; j--) {
					 array[j] = array[j-1];
				 }
				 array[i] = temp;
				 stop = true;
			}
			else {
				i++;
			}
		}
	}
}
