package SortingPrograms;

import java.util.Scanner;

public class InsertionSort {
	
	/**
	 * 1.Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
	 * 
	 * 2.Algorithmic Paradigm: Incremental Approach
	 * 
	 * 3.Uses: Insertion sort is used when number of elements is small. It can also be useful 
	 * when input array is almost sorted, only few elements are misplaced in complete big array.
	 * @param arr
	 * @param n
	 */

	/*Function to sort array using insertion sort*/
	void sort(int arr[], int n) {
		
		for (int i=1; i<n; ++i) {
			
			int key = arr[i];
			int j = i-1;
			
			/* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
			while (j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			
			arr[j+1] = key;
			
		}
	}

	/* A utility function to print array of size n*/
	static void printArray(int arr[], int n) {
		
		for (int i=0; i<n; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Driver method
	public static void main(String args[]) {    
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the size of an array");
//		int n = in.nextInt();
//		int arr[] = new int[n];
//		System.out.println("Enter the elements in  an array:");
//		for(int i=0; i<n; i++) {
//			arr[i] =in.nextInt();	
//			
//		} 
//		System.out.println("Given Array");
//		printArray(arr,n);
		
		int arr[] = {12, 11, 13, 5,-1, 6};
		int n = arr.length;
		
		InsertionSort ob = new InsertionSort();        
		ob.sort(arr,n);
		System.out.println("Sorted Array");
		printArray(arr,n);
	}
}
