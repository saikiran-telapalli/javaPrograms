package BasicPrograms;

import java.util.Scanner;

public class FactorialOfNum {
	
	
	/**
	 * the factorial is the product of all integers less than or equal 
	 * to n but greater than or equal to 1
	 */
	
	/**
	 * Using For Loop
	 */
	public void forLoopFactorial() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to get factoial of it:");
		int n =scan.nextInt();
		//logic
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of given number Using For Loop: "+fact);
	}

	/**
	 * Using Function
	 */

	public void usingFunction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to get factoial of it:");
		long n = scan.nextInt();
		long fact=0;
		//logic
		fact=factCal(n);
		System.out.println("factorial Using Function="+fact);
	}

	public static long factCal(long x) {
		long fact =1;
		for(int i=1; i<=x; i++) {
			fact = fact*i;
		}
		return fact;
	}

	/**
	 * Using Recursion 
	 */
	public void usingRecurssion() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to get factoial of it:");
		long n=scan.nextLong();

		//logic
		long factorial = factCalRec(n);
		System.out.println("Factorial of given number Using Recursion : "+factorial);
	}

	public static long factCalRec(long n) {
		if(n<=0) {
			return 1;
		}
		//System.out.println("n: "+n);
		return factCalRec(n-1)*n;

	}

	public void whileLoop() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to get factoial of it:");
		long n=scan.nextLong();
		long fact=1;

		//logic
		int i=1;
		while(i<=n) {
			fact = fact*i;
			i++;
		}
		System.out.println("Factorial of given number using whileLoop: "+fact);
	}

	/**
	 * Using Do While Loop
	 */

	public void doWhile() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to get factoial of it:");
		long n=scan.nextLong();
		long fact=1;

		//logic
		int i=1;
		do {
			fact = fact*i;
			i++;
		}
		while(i<=n);
		System.out.println("Factorial of given number using do-whileLoop: "+fact);
	}

	public static void main(String[] args) {
		FactorialOfNum fact = new FactorialOfNum();
//		fact.forLoopFactorial();
//		fact.usingFunction();
		fact.usingRecurssion();
//		fact.whileLoop();
//		fact.doWhile();
	}


}
