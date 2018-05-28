package Patterns;

import java.util.Scanner;

public class DiamondStar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no. of rows:");
		int rows = in.nextInt();

		int stars =1;
		int spaces = rows-1;

		/* Iterate through rows */
		for(int i=1; i<2*rows; i++) {
			/* Print spaces */
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			/* Print stars */
			for(int j=1; j<2*stars; j++) {
				System.out.print("*");
			}
			System.out.println("");
			if(i<rows) {
				stars++;
				spaces--;
			}
			else {
				stars--;
				spaces++;
			}
		}
	}
}
