package Conversions;

import java.util.Scanner;

public class DecToHexaDec {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the decimal number: ");
		int num = input.nextInt();
		
		char hex[]= {'0', '1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		// array to store binary number
		char[] hexNum = new char [1000];
		
		
		// counter for binary array
		int i = 0;
		while (num > 0) {
			// storing remainder in binary array
			int rem= num % 16;
			//System.out.println(rem);
			hexNum[i] = hex[rem];
			//System.out.println("hexNum[i] :"+hexNum[i]);
			num = num / 16;
			i++;
		}
		
		System.out.print("Hexa decimal of given number is: ");
		for (int j = i - 1; j >= 0; j--) 
			System.out.print(hexNum[j]);	
	}
}
