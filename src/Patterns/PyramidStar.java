package Patterns;

import java.util.Scanner;

public class PyramidStar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no. of rows:");
		int rows = in.nextInt();
		
		for(int i=1; i<=rows; i++) {
			
			/* Print leading spaces */
			for(int j=i; j<rows; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=(2*i -1); j++) {
				System.out.print("*");
			}
			
			System.out.println("\n");
		}
	}
}
