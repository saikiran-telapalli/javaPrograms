package SortingPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	/**
	 * 1.The selection sort algorithm sorts an array by repeatedly finding the minimum element
	 * (considering ascending order) from unsorted part and putting it at the beginning.
	 * 
	 * 2.The algorithm maintains two subarrays in a given array.

		1) The subarray which is already sorted.
		2) Remaining subarray which is unsorted.

	 * 3.In every iteration of selection sort, the minimum element (considering ascending order)
		from the unsorted subarray is picked and moved to the sorted subarray.

	 * 4.Time Complexity: O(n2) as there are two nested loops.
	 * @param arr
	 * @param n
	 */

	public void selectionSort(int arr[], int n) {


		// One by one move boundary of unsorted sub array
		for(int i=0; i<n-1; i++) {
			// Find the minimum element in unsorted array
			
			int min_idx = i;
			for(int j=i+1; j<n; j++) {
	
				if (arr[j] < arr[min_idx])
					min_idx = j;
				
			}
				// Swap the found minimum element with the first element
				int temp = arr[min_idx];
				arr[min_idx] = arr[i];
				arr[i] = temp;

			
			int[] sortArray = Arrays.copyOf(arr, n);
			System.out.println(Arrays.toString(sortArray));

		}
		System.out.println("\n Sorted array");

		//*************(or)*****************//
		for(int i=0; i<n; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println(Arrays.toString(arr));
	}

	/**
	 * The good thing about selection sort is it never makes more than O(n) 
	 * swaps and can be useful when memory write is a costly operation.
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n = scan.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter elements in an array");
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));

		SelectionSort ss= new SelectionSort();
		ss.selectionSort(arr, n);
	}
}
