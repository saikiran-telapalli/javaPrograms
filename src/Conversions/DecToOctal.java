package Conversions;

import java.util.Scanner;

public class DecToOctal {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the decimal number:");
		int num = input.nextInt();
		int i=0;
		
		int[] octalArray = new int[1000];
		while(num > 0) {
			octalArray[i] = num % 8;
			num = num / 8;
			i++;
		}
		
		System.out.print("Octal number of given number is: ");
		for(int j=i-1; j>=0; j--) {
			System.out.print(octalArray[j]);
		}
	}

}
