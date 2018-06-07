package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDupFromArray {

	public static void remDupWithoutAPI(int[] dupArray, int arraySize) {

		for(int i=0; i<arraySize-1; i++) {

			for(int j=i+1; j<arraySize; j++) {

				if(dupArray[i] == dupArray[j]) {
					dupArray[j] = dupArray[arraySize-1];
					arraySize--;
					j--;
				}
			}
		}


		int[] uniqueArray = Arrays.copyOf(dupArray, arraySize);	
		for(int i=0; i<arraySize; i++) {
			System.out.print(uniqueArray[i]+" ");
		}
		System.out.println("\nAfter removing duplicate from array:");
		System.out.println(Arrays.toString(uniqueArray));

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arraySize = input.nextInt();

		int[] dupArray = new int[arraySize];
		System.out.println("Enter the elements in an array:");
		for(int i=0; i<arraySize; i++) {
			dupArray[i] = input.nextInt();
		}
		System.out.println("Elements in array are:" +Arrays.toString(dupArray));
		remDupWithoutAPI(dupArray, arraySize);

	}

}
