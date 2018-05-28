package StringPrograms;

import java.util.Scanner;

public class ReverseString {

	/**
	 * Reverse the string without predefined libraries
	 */

	public void reverseWithoutLib() {
		String rev = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String to reverse:");
		String str = scan.next();
		int length = str.length();

		//logic
		for(int i=length-1; i>=0; i--) {
			rev= rev+ str.charAt(i);
		}
		System.out.println("String after reverse: "+rev);
	}

	/**
	 * Reverse the string  using StringBuffer
	 */

	public void reverseWithLib() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String to reverse:");
		String str = scan.next();

		//logic
		StringBuffer sb = new StringBuffer(str);
		System.out.println("String after reverse: "+ sb.reverse().toString());
	}
	
	/**
	 * Program to reverse a string using recursive method
	 */
	
	public void recursiveInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String to reverse:");
		String str = scan.next();
		String reversed = recursiveString(str);
		System.out.println("String after reverse: "+ reversed);
	}
	
	public static String recursiveString(String string) {
		
		if(string.isEmpty()) {
			return string;	
		}
		return recursiveString(string.substring(1)) + string.charAt(0);
	}
	

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		rs.reverseWithoutLib();
		rs.reverseWithLib();
		rs.recursiveInput();
	}
}
