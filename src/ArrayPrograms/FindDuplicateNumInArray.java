package ArrayPrograms;

public class FindDuplicateNumInArray {
	
	public static void findDuplicateNum(int[] arr, int n) {
		
		System.out.println("Duplicate elements in an array are:");
		for(int i=0; i<n;i++) {
			for(int j=i+1; j<n;j++) {
				if(arr[i]==arr[j] && (i!=j)) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 4, 3, 5, 6, 2, 3};
		int n = arr.length;
		findDuplicateNum(arr, n);
	}

}
