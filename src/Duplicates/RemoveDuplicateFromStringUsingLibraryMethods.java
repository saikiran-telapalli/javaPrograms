package Duplicates;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateFromStringUsingLibraryMethods {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String to remove duplicates: ");
		String str = scanner.nextLine();
		System.out.println(removeDuplicatesWithLibraryfunc(str));
	}
	
	public static String removeDuplicatesWithLibraryfunc(String str) {
		Set<Character> set = new HashSet<>();
		StringBuffer sf = new StringBuffer();
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
				sf.append(c);
			} 
		}
		return sf.toString();
		
	}
}
