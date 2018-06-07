package BasicPrograms;

import java.util.Scanner;

public class ReverseNumber {

	/**
	 * Reverse a number using while Loop
	 */
	public static void reverseNumberWhile(){

		int num;
		String reverse = "";

		System.out.println("Enter a number to reverse");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		//logic
		while(num != 0){
			//reverse = reverse * 10;
			reverse = reverse + num%10;
			num = num/10;    
		}
		System.out.println("Reverse of the number is " + reverse);

	}

	/**
	 * Reverse a number using for Loop
	 */
	public static void forLoopReverseDemo() {

		int num, reverse = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to reverse:");
		num = scan.nextInt();

		for( ;num!=0; ) {
			reverse = reverse *10;
			reverse = reverse + num %10;
			num = num/10;
		}
		System.out.println("Reverse of the number is " + reverse);
	}


	static String reverse ="";
	static String numlt ="";

	/**
	 * Reverse a number using recursion
	 */
	public static void recursiveDemoInput() {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to reverse:");
		num = scan.nextInt();
		recursiveDemo(num);
		String reverseNumSeries = reverse+numlt;
		System.out.println("Reverse of the number is " + reverseNumSeries);
	}

	public static void recursiveDemo(int num) {

		if(num < 10) {
			numlt = numlt +num+ "";
			return;
		}
		else {
			reverse = reverse + num%10;
			recursiveDemo(num/10);
		}

	}

	public static void main(String[] args) {
		reverseNumberWhile();
		forLoopReverseDemo();
		recursiveDemoInput();
	}
}
