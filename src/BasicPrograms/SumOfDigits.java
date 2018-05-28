package BasicPrograms;

import java.util.Scanner;

public class SumOfDigits {
	
	/** 
	 * Using WhileLoop method
	 */
	public void whileLoop() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to get sum of digits:");
		int num = scan.nextInt();
		int sum =0;
		
		while(num!=0) {
			int Number = num%10;
			sum = sum + Number;
			num = num/10;
		}
		System.out.println("Sum of digits using whileLoop: "+sum);
	}
	
	/**
	 * Using forLoop method
	 * @return
	 */
	public long forLoop() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to get sum of digits:");
		long num = scan.nextLong();
		long sum;
		
		for(sum =0; num>0 ; sum+= num%10, num/=10) {
			
		}
		return sum;
	}
	
	
	/**
	 * Using Recurssion method with ternary operator used
	 */
	public void recurssionInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to get sum of digits:");
		long num = scan.nextLong();
		System.out.println("Sum of digits using recurssionMethod: "+recurssionMethod(num));
	}
	
	public long recurssionMethod(long num) {
		//Using ternary operator
		return num == 0 ? 0 : num%10 +
		recurssionMethod(num/10);
	}
	
	
	public static void main(String[] args) {
		SumOfDigits sd = new SumOfDigits();
		sd.whileLoop();
		//using for for loop
		System.out.println("Sum of digits using forLoop: "+sd.forLoop());
		sd.recurssionInput();
	}
}
