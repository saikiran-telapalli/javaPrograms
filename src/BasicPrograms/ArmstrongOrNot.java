package BasicPrograms;

import java.util.Scanner;

public class ArmstrongOrNot {

	/**
	 * A number is called Armstrong number if the following equation holds true for that number:
		xy..z = xn + yn+.....+ zn
		For example this is a 3 digit Armstrong number

		370 = 33 + 73 + o3
	     = 27 + 343 + 0
	     = 370

	 */

	public void isArmstrongOrNot(int number) {
		int total = 0;
		int num = number;

		while(num !=0) {
			int temp = num % 10;
			total = total + temp*temp*temp;
			num /= 10;
		}

//		  Using for loop
		   /* for( ; num!=0; num /= 10){
    			int temp = num % 10;
    			total = total + temp*temp*temp;
			}
			*/
		 
		if(total == number) {
			System.out.println(number+" Number is a Armstrong");
		}
		else {
			System.out.println(number+" Number is not a Armstrong");
		}

	}

	public void printArmstrong() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Amstrong No to:");
		int N = in.nextInt();
		int total = 0;

		System.out.println("Armstrong numbers from 1 to N:");
		for(int i=1; i<=N; i++) {

			int num = i;
			while(num != 0) {
				int rem = num % 10;
				total = total + rem * rem * rem;
				num /= 10;
			}
			if(total == i) {
				System.out.print(i + " ");
			}
			total = 0;
		}
	}

	public static void main(String[] args) {
		ArmstrongOrNot An = new ArmstrongOrNot();
		An.isArmstrongOrNot(370);
		An.printArmstrong();
	}
}

//Java Program to Reverse a String using Recursion
//Java Program to Make a Calculator using Switch Case
//Java Programs – Java Programming Examples with Output
//Java Program to find largest of three Numbers
//Java program to display prime numbers from 1 to 100 and 1 to n
//Java Program to Add two Numbers


//Java program to check the given number is Armstrong or not
//Java program to print upto N Armstrong numbers
//Java program to print given number in words
//Java program to check the given number is Palindrome or not
//Java program to print palindrome number upto N numbers
//Java program to print N prime numbers and find sum and average
