package Matrix;

import java.util.Scanner;

public class AdditionOfMatrix {

	public static void addMatrixArray() {

		int r,c,i,j;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		r = scan.nextInt();
		c = scan.nextInt();

		int first [][]= new int[r][c];
		int second [][] = new int[r][c];
		int sum[][] = new int[r][c];


		System.out.println("Enter the elements of first matrix");
		for(i=0; i<r; i++) {
			for(j=0; j<c; j++) {
				first[i][j] = scan.nextInt();
				//System.out.print(" " + first[i][j]);
			}
			//System.out.println();
		}

		System.out.println("Enter the elements of second matrix");
		for(i=0; i<r; i++) {
			for(j=0; j<c; j++) {
				second[i][j]= scan.nextInt();
				//System.out.print(" " + second[i][j]);
			}
			//System.out.println();
		}

		System.out.println("Sum of entered matrices:-");
		for(i=0; i<r; i++) {
			for(j=0; j<c; j++) {
				sum[i][j]= first[i][j] + second[i][j];
				//replace "+" with "-" for Sub and "/" for Div and "%" for Remainder
			}
		}

		for(i=0; i<r; i++) {
			for(j=0; j<c; j++) {
				System.out.print(" "+sum[i][j]);
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		addMatrixArray();
	}
}
