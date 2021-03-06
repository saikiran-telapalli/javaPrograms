package Conversions;

import java.util.Scanner;

public class StringToASCII {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = input.next();
		int len = str.length();
		int ascii_Total=0;
		
		for(int i=0;i<len;i++) {
			char ch = str.charAt(i);
			int ascii = (int)ch;
			System.out.println(ch+" = "+ascii);
		}
		
		for(Character ch : str.toCharArray()) {
			ascii_Total += (int)ch;
		}
		System.out.println("Total ascii value of given string: "+ascii_Total);
	}

}
