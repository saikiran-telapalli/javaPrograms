package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramOrNot {
	
	/**
	 * Two strings are called anagrams if they contain same set of characters but in different order.
	 * Remove Spaces
	 * Method 1 (Use Sorting)
		1) Sort both strings
		2) Compare the sorted strings
		EX: "keep - peek", "Mother In Law - Hitler Woman".
	 * @param str1
	 * @param str2
	 */
	public static void isAnagramOrNot(String str1, String str2) {
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		boolean isAnagram = true;
		
		if(s1.length() != s2.length()) {
			isAnagram = false;
		}
		
		else {
			char[] arrS1 = s1.toCharArray();
			char[] arrS2 = s2.toCharArray();
			
			Arrays.sort(arrS1);
			Arrays.sort(arrS2);
			
			isAnagram = Arrays.equals(arrS1, arrS2);
		}
		if(isAnagram) {
			System.out.println(str1 +" and "+ str2 + " are Anagrams");
		}
		else {
			System.out.println(str1 +" and "+ str2 + " are not Anagrams");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1= in.next();
		System.out.println("Enter the second string");
		String str2= in.next();
		
		isAnagramOrNot(str1, str2);
	}

}
