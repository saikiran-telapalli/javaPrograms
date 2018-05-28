package SortingPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	
	/**
	 * Bubble Sort is the simplest sorting algorithm that works 
	 * by repeatedly swapping the adjacent elements if they are in wrong order.
	 */

	public void bubblueSort() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n = scan.nextInt();
		int temp;
		
		int arr[] = new int[n];
		System.out.println("Enter elements in an array");
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		for(int j=0; j<n-1; j++) {
			System.out.println("j: "+j);
			for(int k=0; k<n-j-1; k++) {
				System.out.println("k: "+k);
				if(arr[k] > arr[k+1]) {
					temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				
					int[] sortArray = Arrays.copyOf(arr, n);
					System.out.println(Arrays.toString(sortArray));
				}
			}
		}
		
		System.out.println("\n Sorted array");
		int[] sortArray = Arrays.copyOf(arr, n);
		//*************(or)*****************//
//		for(int j=0; j<n; j++) {
//			System.out.println(arr[j] + " ");
//		}
		System.out.println(Arrays.toString(sortArray));
	}
	
	/**
	 * It can be optimized by stopping the algorithm if inner loop didn’t cause any swap.
	 * @param args
	 */
	
	public void bubblueSortBreak() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n = scan.nextInt();
		int temp;
		Boolean swapped;
		
		int arr[] = new int[n];
		System.out.println("Enter elements in an array");
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		for(int j=0; j<n-1; j++) {
			swapped = false;
			System.out.println("j: "+j);
			for(int k=0; k<n-j-1; k++) {
				System.out.println("k: "+k);
				
				if(arr[k] > arr[k+1]) {
					temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
					swapped = true;
					
					int[] sortArray = Arrays.copyOf(arr, n);
					System.out.println(Arrays.toString(sortArray));
				}
			}
			if(swapped == false)
				break;
		}
	}
	
	public static void main(String[] args) {
		BubbleSort BS = new BubbleSort();
		//BS.bubblueSort();
		BS.bubblueSortBreak();
	}
}
