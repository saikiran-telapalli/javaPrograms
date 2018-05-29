package ArrayPrograms;

import java.util.HashSet;

public class FindDuplicateNumInArray {
	
	public static void findDuplicateNum(int[] arr, int n) {
		
		System.out.println("Duplicate elements in an array are:");
		for(int i=0; i<n-1;i++) {
			for(int j=i+1; j<n;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
	
	public static void findDupUsingHshSet() {
		String[] strarray = {"abc", "cdf", "xyz", "yzx", "cdf", "cba","xyz"};
		HashSet<String> set = new HashSet<String>();
		System.out.println("Duplicate elements in a given array are:");
		for(String arrayElements : strarray) {
			if(  !set.add(arrayElements  )) {  // !set prints duplicate and without "!" it prints removing dup
				System.out.print(arrayElements+ " ");
			}
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 4, 3, 5, 6, 2, 3};
		int n = arr.length;
		findDuplicateNum(arr, n);
		//findDupUsingHshSet();
	}

}
