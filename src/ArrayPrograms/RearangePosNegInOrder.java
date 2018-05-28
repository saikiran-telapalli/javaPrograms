package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RearangePosNegInOrder {

	static void printArray(int arr[], int n){
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	// Function to Rearrange positive and negative numbers in a array
	static void RearrangePosNeg(int arr[], int n){
		int key, j;
		for(int i = 0; i < n; i++){
			System.out.println("i: "+i);
			key = arr[i];
			System.out.println("key: "+key);

			// if current element is positive
			// do nothing
			if (key > 0) {
				continue;
			}
			/* if current element is negative,
            shift positive elements of arr[0..i-1],
            to one position to their right */
			j = i - 1;
			System.out.println("j: "+j);
			while (j >= 0 && arr[j] > 0){
				arr[j + 1] = arr[j];
				j = j - 1;
				System.out.println("j: "+j);
			}

			// Put negative element at its right position
			System.out.println("key: "+key);
			arr[j + 1] = key;
		}
	}

	// Driver program 
	public static void main (String[] args){
		int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		int n = arr.length;
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter size of the array");
//		int n = in.nextInt();
//		int arr[] = new int[n];
//		System.out.println("Enter elemnets in an array");
//		for(int i=0; i<n; i++) {
//			arr[i] = in.nextInt();
//			System.out.print(arr[i] +" ");
//		}
		printArray(arr, n);
		RearrangePosNeg(arr, n);
		printArray(arr, n);

	}
}
