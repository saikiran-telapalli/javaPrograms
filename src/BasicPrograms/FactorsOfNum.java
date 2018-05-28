package BasicPrograms;

import java.util.Scanner;

public class FactorsOfNum {

	/**
	 * Algorithm to find all factors of an integer
		Let N be the given number. Check with every number from 1 to N, 
		whether it divides N completely or not. Let, i be any number between 1 to N.
		If(N % i == 0), then i is a factor of N.
		If(N % i != 0), then i is not a factor of N.
	 * @param num
	 */
	public static void printFactors(int num) {
		int number = num;

		System.out.println("Factors for the "+num + " are");
		for(int i=1; i<=number; i++) {
			if(number % i ==0) {
				System.out.print(i+ " ");
			}
		}
	}
	static int number = 1;
	public static void recursiveFunc(int num) {
		if(number <= num) {
			if(num % number ==0) {
				System.out.print(number+" ");
			}
			number++;
			recursiveFunc(num);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number to get Factors of it");
		int num = in.nextInt();

		//printFactors(num);
		System.out.println("Factors for the "+num + " are");
		recursiveFunc(num);
	}

}
