package ArrayPrograms;

public class ArrangeAlternate {

	// Utility function to right rotate all elements 
	// between [outofplace, cur]
	void rightrotate(int arr[], int n, int outofplace, int cur) {
		int tmp = arr[cur];
		System.out.println("temp with curr: "+tmp);
		for (int i = cur; i > outofplace; i--) {
			arr[i] = arr[i - 1];
		}
		System.out.println("temp: "+tmp);
		arr[outofplace] = tmp;
	}

	void rearrange(int arr[], int n) {
		int outofplace = -1;

		for (int index = 0; index < n; index++) {
			System.out.println("indexlp: "+index);
			if (outofplace >= 0) {
				System.out.println("outofplace: "+outofplace);
			
				if (((arr[index] >= 0) && (arr[outofplace] < 0))
						|| ((arr[index] < 0) && (arr[outofplace] >= 0))) {
					System.out.println("IF condition passed with in if");
					System.out.println("index: "+index);
					System.out.println("outofplace: "+outofplace);
					rightrotate(arr, n, outofplace, index);

					// the new out-of-place entry is now 2 steps ahead
					if (index - outofplace > 2) {
						System.out.println("000000000");
						System.out.println("outofplace: "+outofplace);
						outofplace = outofplace + 2;
						System.out.println("outofplace: "+outofplace);
					}
					else {
						System.out.println("*********");
						outofplace = -1;
						System.out.println("outofplace: "+outofplace);
					}
				}
				else {
					System.out.println("IF condition failed with in if");
				}
				
			}
			printArray(arr, n);
			// if no entry has been flagged out-of-place
			if (outofplace == -1) {
				System.out.println("outofplace: "+outofplace);
				System.out.println("indexout: "+index);
				// check if current entry is out-of-place
				
				if (((arr[index] >= 0) && ((index & 0x01)==0))
						|| ((arr[index] < 0) && (index & 0x01)==1)) {
					System.out.println("If passed with in for loop");
					outofplace = index;
					System.out.println("outofplace: "+outofplace);
				}
				else {
				System.out.println("If failed with in for loop");
				}
			}
			
		}
	}
	


	// A utility function to print an array 'arr[]' of size 'n'
	void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}

	public static void main(String[] args) {
		ArrangeAlternate rearrange = new ArrangeAlternate();
		
		int arr[] = {5, -2, -5, 2, 4, 7, 1, 8, 0, -8, 10, -4};
		int n = arr.length;

		System.out.println("Given array is ");
		rearrange.printArray(arr, n);

		rearrange.rearrange(arr, n);

		System.out.println("RearrangeD array is ");
		rearrange.printArray(arr, n);
	}

}
