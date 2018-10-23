package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElementsInArrays {

	public static void commonElementsForTwoArrays() {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int n1= in.nextInt();
		int[] arr1 = new int[n1];

		System.out.println("Enter the elements in first array");
		for(int i=0; i<n1; i++) {
			arr1[i] = in.nextInt();
		}

		System.out.println("Enter the size of second array");
		int n2= in.nextInt();
		int arr2[] = new int[n2];

		System.out.println("Enter the elements in second array");
		for(int j=0; j<n2; j++) {
			arr2[j] = in.nextInt();
		}

		System.out.println("Common elements in an array are:");
		for(int i=0; i<n1; i++) {
			for(int j=0; j<n2; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.print(arr1[i]+" ");
				}
			}
		}
	}
	
	public static void moreThan2Arrays() {
		int arr1[]= {23, 45, 67, 78};
		int arr2[]= {45, 12, 34, 87, 67};
		int arr3[]= {67, 89, 23, 45, 56, 34, 67};
		//First sort the arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("Common elements in an array are:");
		int i=0, j=0, k =0;
		while(i<arr1.length && j<arr2.length && k<arr3.length) {
			if(arr1[i]==arr2[j] && arr2[j]==arr3[k]) {
				System.out.print(arr1[i]+ " ");
				i++;
				j++;
				k++;
			}
			else if(arr1[i] < arr2[j]) {
				i++;
				
			}
			else if(arr2[j] < arr3[k]) {
				j++;
				
			}
			else {
				k++;
				
			}
			
		}
	}

	public static void main(String[] args) {
		//commonElementsForTwoArrays();
		moreThan2Arrays();
	}
}
