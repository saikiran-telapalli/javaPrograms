package BasicPrograms;

import java.util.Scanner;

public class perfectNumber {

	/**
	 * A perfect number is a positive integer that is equal to the sum
of its proper positive divisors, that is, the sum of its positive
divisors excluding the number itself.
				1 + 2 + 4 + 7 + 14 = 28
	 */

	public static void perfectNum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to check Perfect or not:");
		int num = scan.nextInt();
		int sum = 0;

		for(int i=1; i<=num/2; i++) {
			if(num%i ==0) {
				sum = sum +i;
			}
		}

		if(sum == num) {
			System.out.println(num+ " is a perfect number");
		}
		else {
			System.out.println(num+ " is not a perfect number");
		}
	}

	
	public static void main(String[] args) {
		perfectNum();
	}
}
