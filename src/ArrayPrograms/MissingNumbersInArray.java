package ArrayPrograms;

import java.util.Arrays;

public class MissingNumbersInArray {

	public static void missingNumbers(int arr[]) {

		Arrays.sort(arr);

		int n = arr.length;
		System.out.println("Array after sorting:");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}

		//System.out.println("arr[n-1]:"+arr[n-1]); //Finding last element in array to loop upto
		//int num =0;
		int j=0;
		System.out.println("\nMissing elements in an array are:");
		
		for(int i=arr[0]; i<= arr[n-1]; i++) {
			
			if(j<arr[n-1] && i==arr[j]) {
				j++;
			}
			else {
				System.out.print(i+ " ");
			}

		}
	}

	public static void main(String[] args) {
		int arr[] = {3, 6, 9, 2, 50, 25};
		missingNumbers(arr);
	}
}
