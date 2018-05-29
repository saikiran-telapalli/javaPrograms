package ArrayPrograms;

public class MissingNumInArray {

	/**
	 * Solution:
	1.Find the sum of n number using formula n=n*(n+1)/2
	2.Find the sum of elements present in given array.
	3.Substract (sum of n numbers – sum of elements present in the array).
	 * @param arr
	 */
	public static  void missingNum(int[] arr) {

		int n = arr.length+1;
		int sum = n*(n+1)/2;
		System.out.println(sum);
		int sumofElements=0;
		for(int i=0; i<n-1; i++) {
			sumofElements += arr[i]; 
		}
		System.out.println(sumofElements);
		int missingElement = sum - sumofElements;
		System.out.println("Missing element in an array is: "+missingElement);
	}

	public static void main(String[] args) {
		int arr[] = {5,1,2,3,4,7};
		missingNum(arr);

	}
}
