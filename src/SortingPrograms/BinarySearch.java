package SortingPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	/* Using recursion*/
	public int binaryRecurrsive(int arr[], int left, int right, int find) {
		
		if(right >= left) {
			int mid= left+(right - left)/2;
			if(arr[mid] == find) {
				return mid;
			}
			if(arr[mid] > find) {
				return binaryRecurrsive(arr, left, mid-1, find);
			}
			else {
				return binaryRecurrsive(arr, left+1, right, find);
			}
		}
		else {
			return -1;
		}
	}
	
	/*Using loop condition*/
	public int usingLoop(int arr[], int start, int end, int find) {
		
		while(start <= end) {
			int mid = start+ (end - start)/2;
			if(arr[mid] == find) {
				return mid;
			}
			if(find < arr[mid]) {
				start = mid - 1;
			}
			else {
				start = mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = in.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements in an array");
		for(int i=0; i<n;i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Sorted array");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}

		System.out.println("\nEnter the element to search the position in a given array");
		int find = in.nextInt();
		
		//Using methods to run the program
		//int result = bs.binaryRecurrsive(arr, 0, n, find);
		int result = bs.usingLoop(arr, 0, n, find);
		
		if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
	}
}
