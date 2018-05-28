package BasicPrograms;

import java.util.Scanner;

public class FloydsTriangle {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows of floyd's triangle you want ");
		int rows = in.nextInt();
		int num=0;
		
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				num++;
				System.out.print(num+" ");
			}
			System.out.println("");
		}
	}

}
