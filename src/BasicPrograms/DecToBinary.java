package BasicPrograms;

import java.util.Scanner;

public class DecToBinary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the decimal number: ");
		int num = input.nextInt();

		// array to store binary number
		int[] binaryNum = new int[1000];

		// counter for binary array
		int i = 0;
		while (num > 0) {
			// storing remainder in binary array
			binaryNum[i] = num % 2;
			System.out.println("binaryNum[i] :"+binaryNum[i]);
			num = num / 2;
			i++;
		}

		for (int j = i - 1; j >= 0; j--) 
			System.out.print(binaryNum[j]);	
	}
}
