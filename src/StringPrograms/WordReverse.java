package StringPrograms;

import java.util.Scanner;

public class WordReverse {

	/**
	 * Reverse word using library functions String Builder and split
	 */
	public static void reverseWithLibFunc() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word to reverse:");
		String word = scan.nextLine();

		StringBuilder sb = new StringBuilder();
		String[] words = word.split(" ");
		for(int i=words.length-1; i>=0; i--) {
			sb.append(words[i]).append(' ');
		}
		System.out.println("Word after reverse: "+sb);
	}


	/**
	 * Reverse the words in a String without reversing each character and not 
	 * using built-in functions like split and substring 
	 */
	public static void reverseWithoutLib() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word to reverse:");
		String word = scan.nextLine();

		char chr[]= word.toCharArray();
		int n = chr.length;
		System.out.println("n: "+n);
		int start=0;

		for(int i=0; i<n; i++) {


			//logic
			if(chr[i] == ' ' && i>0) {
				System.out.println("i: "+i);
				reverseWord(chr,start, i-1);
				start = i+1;
			}
			else if(i == n-1) {
				System.out.println("i@: "+i);
				reverseWord(chr,start, i);
			}

		}

		reverseWord(chr, 0, n-1);

		System.out.println(chr);
	}

	public static void reverseWord(char chr[], int start, int end) {
		while(start < end) {

			char temp = chr[start];
			chr[start] = chr[end];
			chr[end] = temp;

			start++;
			end--;
		}
	}


	public static void main(String[] args) {
		//reverseWithLibFunc();
		reverseWithoutLib();
	}
}
