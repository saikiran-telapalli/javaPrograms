package Duplicates;

import java.util.Arrays;
import java.util.Scanner;

public class RemDupWordsWOFuncs { 

	public static void removeDuplicatesFromArray(String[] strArray) {

		// Iterating using enhanced for-loop
		System.out.println("\nOriginal Arrays with duplicates:\n");
		for(String str : strArray) {
			System.out.println(str);
		}

		// get size of the Arrays using length property
		int sizeOfArrays = strArray.length;
		
		// remove duplicates, using 2 for-loops

		for(int i = 0; i<sizeOfArrays-1; i++) {
			
			for(int j = i + 1; j<sizeOfArrays; j++) {
			
				// check whether, it already contains this element
				if(strArray[i].equals(strArray[j])){

					// if elements are same, then replace with last item
					strArray[i] = strArray[sizeOfArrays-1];

					// at the same time, decrement size value by 1
					sizeOfArrays--;

					// Inner loop equals to outer loop
					j=i;
				}
			}
		}

		System.out.println("\n\nUnique elements:\n");
		
	/*	// create new String[] to copy unique elements
		//String[] uniqueStrArrays = Arrays.copyOf(strArray, sizeOfArrays);
		
		//Appending all string values in an array
		//System.out.println(Arrays.toString(uniqueStrArrays)); */
		
		//or
		for(int i=0; i<sizeOfArrays; i++) {
			System.out.print(strArray[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n for a size of an Array: ");
		int n= sc.nextInt();
		String strArray[] = new String[n];
		System.out.println("Enter the Array Elemnets: ");
		
		for(int i=0;i<n; i++) {
			strArray[i] = sc.next();
		}
		System.out.println(Arrays.toString(strArray));
		
		// initialize an Arrays with duplicate values
//		String[] strArray = {
//				"Sun", 
//				"Apple", 
//				"JBoss",
//				"Whatsup",
//				"Apple", // duplicate
//				"BEA Weblogic",
//				"JBoss",
//				"JBoss",
//				"Whatsup",
//				"Apple",
//				"BEA Weblogic",
//				"JBoss",
//				"JBoss",
//				"Whatsup" // duplicate
//		};

		
		// invoke removeDuplicatesFromArray() with above initialized Arrays
		removeDuplicatesFromArray(strArray);
	}

	
}
