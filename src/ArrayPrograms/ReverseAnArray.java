package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {

	public void inputForNumArray() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int arraySize = scan.nextInt();

		int arr[] = new int[arraySize];

		System.out.println("Enter the Numbers in an array:");
		for(int i=0; i<arraySize; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));

		//logic is below line (Swap of two with temp variable)
		rvereseNumArray(arr, 0, arraySize-1);

		System.out.println("Reversed array is ");
		System.out.println(Arrays.toString(arr));

	}


	public static void rvereseNumArray(int arr[], int start, int end){

		int temp;
		if (start >= end) {
			return;
		}
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		rvereseNumArray(arr, start+1, end-1);
	}


	public void inputForStringArray() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int arraySize = scan.nextInt();

		String string[] = new String[arraySize];

		System.out.println("Enter the Strings in an array:");
		for(int i=0; i<arraySize; i++) {
			string[i] = scan.next();
		}

		System.out.println(Arrays.toString(string));

		//logic is below line (Swap of two with temp variable)
		rvereseStringArray(string, 0, arraySize-1);

		System.out.println("Reversed array is ");
		System.out.println(Arrays.toString(string));

	}

	public static void rvereseStringArray(String string[], int start, int end){

		String temp;
		if (start >= end) {
			return;
		}
		temp = string[start];
		string[start] = string[end];
		string[end] = temp;
		rvereseStringArray(string, start+1, end-1);
	}
	
	
	public static void main(String[] args) {
		ReverseAnArray ra = new ReverseAnArray();
		ra.inputForNumArray();
		ra.inputForStringArray();
	}
}

