package StringPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class DupCharInString {

	public static void printDupCha() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string to find duplicate characters");
		String text = in.next();
		
		char[] text_toChar = text.toCharArray();
		int n = text_toChar.length;

		System.out.println("Duplicate characters in the given string are:");
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n;j++) {
				if(text_toChar[i] == text_toChar[j]) {
					System.out.print(text_toChar[i]+" ");
					
				}
			}
		}
		
		/* HashSet<Character> set = new HashSet<Character>();
		for(Character arraychar : text_toChar) {
			if(!set.add(arraychar)) {
				System.out.print(arraychar+" ");
			}
		} */
	}	
	public static void main(String[] args) {
		printDupCha();
	}
}
