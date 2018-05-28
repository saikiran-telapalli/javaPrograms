package BasicPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {
	 
	/** 
	 * Swapping using temporary or third variable
	 */
	public void swapNumbers() {
		int x, y, temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of x and y");
		x = scan.nextInt();
		y = scan.nextInt();
		//logic
		temp = x;
		x= y;
		y =temp;
		
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
	}
	
	/**
	 * Swapping without temporary variable
	 */
	public void swapNumbersWithoutTemp() {
		int x, y;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of x and y");
		x = scan.nextInt();
		y = scan.nextInt();
		
		System.out.println("Before swapping value of \nx: " +x+ "\ny: "+y);
		//logic
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping value of \nx: " +x+ "\ny: "+y);
	}
	
	
	public static void main(String[] args) {
		SwapTwoNumbers swap = new SwapTwoNumbers();
		swap.swapNumbers();
		swap.swapNumbersWithoutTemp();
	}
}
