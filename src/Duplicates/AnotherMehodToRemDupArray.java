package Duplicates;

import java.util.Arrays;
import java.util.Scanner;

public class AnotherMehodToRemDupArray {


	public static void main(String[] args) {
		String arrayElements = " ";
		String arrayAfterDup = " ";
		int n,i,j,x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n for a size of an Array: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Array Elemnets: ");

		for(i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			arrayElements = arrayElements + arr[i] + " ";
		}
		System.out.println("Given array elements:"+arrayElements);

		for(i=0; i<n; i++) {
			for(j=i+1; j<n;j++) {
				if(arr[i]==arr[j]) {
					for(x=j;x<n-1; x++) {
						arr[x]=arr[x+1];//Last array will be null
					}
					n--;
					j=i;
				}
				
			}
		}
		
		for(i=0; i<n; i++) {
			arrayAfterDup = arrayAfterDup + arr[i] + " ";
		}
		System.out.println("Array of elements after removal of duplicates: "+arrayAfterDup);
	}
	
}
