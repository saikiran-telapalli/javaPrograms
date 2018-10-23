package Patterns;

import java.util.Scanner;

public class HallowSquare {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no. of rows:");
		int rows = in.nextInt();
		
		int i,j;
		
		for(i=1; i<=rows; i++) {
			
			for(j=1; j<=rows; j++) {
				
				if(i==1 || i==rows) {
					System.out.print("*"+" ");
				}
				else if(j==1 || j==rows) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println("");
		}
	}

}
