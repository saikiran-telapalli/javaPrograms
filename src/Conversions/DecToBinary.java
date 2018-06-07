package Conversions;

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
			//System.out.println("binaryNum[i] :"+binaryNum[i]);
			num = num / 2;
			i++;
		}
		
		System.out.print("Binary of given number is: ");
		for (int j = i - 1; j >= 0; j--) 
			System.out.print(binaryNum[j]);	
		
		
		//Decimal to binary number using recursion
		System.out.print("\nBinary of given number using recurssion method: ");
		
		int binaryNumber = recurssion(11);
		System.out.println(binaryNumber);
	}
	
	//Decimal to binary number using recursion
	public static int recurssion(int num) {
		if(num == 0) {
			return 0;
		}
		else {
			return (num % 2 + 10* recurssion(num/2));
		}
		
	}
}
