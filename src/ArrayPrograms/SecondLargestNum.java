package ArrayPrograms;

import java.util.Arrays;

public class SecondLargestNum {
	
/**
 * We can find the second largest number in an array in java by sorting the array 
 * and returning the 2nd largest number.
 * @param arr
 * @param n
 * @return
 */
	public static int secondLargestNum(int[] arr, int n) {
		int temp;
		for(int i=0; i<n;i++) {
			
			for(int j=i+1; j<n;j++) {
				
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}  
		//or we can use Arrays.sort(arr);
		int[] modified = Arrays.copyOf(arr, n);
		System.out.println(Arrays.toString(modified));
		return arr[n-2];
		
	}
	
	public static void main(String[] args) {
		int arr[]={1,2,6,1,3,2};
		int n= arr.length;
		System.out.println("Given  array is");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		int largestNumber = secondLargestNum(arr,n);
		System.out.println("\nSecond larget number in an array is: "+largestNumber);
	}
}
