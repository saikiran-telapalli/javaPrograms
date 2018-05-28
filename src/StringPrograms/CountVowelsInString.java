package StringPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountVowelsInString {
	
	public static void main(String[] args) throws IOException {
		
		int vowels=0, blank=0, consonents=0, digits=0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string:");
		String str = in.readLine();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='A'|| ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || 
					ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
				vowels++;
			}
			else if(Character.isDigit(ch)) {
				digits++;
			}
			else if(Character.isWhitespace(ch)) {
				blank++;	
			}
			else {
				consonents++;
			}
		}
		
		System.out.println("Vowels : " + vowels);
		System.out.println("Digits : " + digits);
		System.out.println("Blanks : " + blank);
		System.out.println("Consonents : " + consonents);
	}

}
