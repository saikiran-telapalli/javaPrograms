package Duplicates;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateFromStringUsingLibraryMethods {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String to remove duplicates: ");
		String str = scanner.nextLine();
		//System.out.println(removeDuplicatesWithLibraryfunc(str));
		removeDuplicatesWithLibraryfunc(str);
	}
	
	public static void removeDuplicatesWithLibraryfunc(String str) {
		Set<Character> set = new HashSet<>();
		//StringBuffer sf = new StringBuffer();
		char[] charArray = str.toCharArray();
		
//		for(int i=0; i<str.length(); i++) {
//			char c = str.charAt(i);
//			if(set.add(c)) {
//				set.add(c);
//				sf.append(c);
//			} 
//		}
		
		for(Character cc : charArray) {
			if(set.add(cc)){
				System.out.print(""+cc);
			}
		}
		//return sf.toString();
		
	}
}
