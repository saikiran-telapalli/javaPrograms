package Patterns;

import java.util.Scanner;

public class InvertedPyramidStar {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no. of rows:");
		int rows = in.nextInt();
		
		for(int i=1; i<=rows; i++) {
			
			/* Print leading spaces */
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			/* Print stars */
			for(int j=0; j< 2*rows- (2*i-1); j++) {
				System.out.print("*");
			}
			/* Move to next line */
			System.out.println("");
		}
	}
}
