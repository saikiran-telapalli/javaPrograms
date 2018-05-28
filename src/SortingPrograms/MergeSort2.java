package SortingPrograms;

import java.util.Scanner;

public class MergeSort2 {
	
/**
 * 1.Like QuickSort, Merge Sort is a Divide and Conquer algorithm. 
 * It divides input array in two halves, calls itself for the two halves 
 * and then merges the two sorted halves.
 * 
 * 2.Algorithmic Paradigm: Divide and Conquer
 * 
 * 3.Time complexity of Merge Sort is (nLogn) in all 3 cases (worst, average and best)
 * @param arr
 * @return
 */
	
	public static int[] merge_Sort(int []arr) {

		if(arr.length<=1) {
			return arr;
		}

		int midpoint = arr.length/2;

		/* Create temp arrays */
		int [] left = new int[midpoint];
		int [] right;

		if(arr.length % 2==0) {
			right = new int[midpoint];
		}
		else {
			right = new int[midpoint+1];
		}

		
		for(int i=0; i<midpoint; i++) {
			left[i] = arr[i] ;
		}

		int x=0;
		for(int j= midpoint; j<arr.length; j++) {
			if(x < right.length) {
				right[x] = arr[j];
				x++;
			}
		}

		//Recurssion
		left = merge_Sort(left);
		right = merge_Sort(right);
		
		int [] result = new int[arr.length];

		result = merge(left, right);
		return result;

	}

	
	public static int[] merge(int [] left, int [] right) {

		int lengthResult = left.length + right.length;
		int [] result = new int[lengthResult];
		int indexL =0;
		int indexR =0;
		int indexRes =0;

		while(indexL < left.length || indexR < right.length) {
			
			if(indexL < left.length && indexR < right.length){

				if(left[indexL] <= right[indexR]) {
					result[indexRes] = left[indexL];
					indexL++;
					indexRes++;
				}
				else {
					result[indexRes] = right[indexR];
					indexR++;
					indexRes++;
				}
			}

			else if(indexL < left.length) {
				result[indexRes] = left[indexL];
				indexL++;
				indexRes++;
			}

			else if(indexR < right.length) {
				result[indexRes] = right[indexR];
				indexR++;
				indexRes++;
			}
		}

		return result;
	}
	
	
	/* A utility function to print array of size n */
	public static void printArray(int arr[], int n) {

		for(int i=0; i<n; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println(" ");
	}

	/* A utility function to populate elements <=100 in array */
	public static int[] populateArray(int arr[], int n) {
		for(int i=0; i<n; i++) {
			arr[i]= (int) (Math.random()*100);
		}
		return arr;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of an array n:");
		int n= in.nextInt();
		int arr[] = new int[n];

		populateArray(arr, n);

		System.out.println("Before Sorting");
		printArray(arr, n);
		
		arr = merge_Sort(arr);

		System.out.println("\nAfter Sorting");
		printArray(arr, n);
	}
}
