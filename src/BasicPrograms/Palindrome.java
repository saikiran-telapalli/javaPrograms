package BasicPrograms;

import java.util.Scanner;

public class Palindrome {

	//radar
	public static void main(String[] args) {
		
		String rev ="";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string for palindrom: ");
		String str = scanner.nextLine();

		for(int i= str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println(str + " is a palindrome");
		}
		else {
			System.out.println(str + " is  not a palindrome");
		}
	}

}
