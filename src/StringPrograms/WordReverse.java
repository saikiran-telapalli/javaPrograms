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

		char str[]= word.toCharArray();
		int n = str.length;
		System.out.println("n: "+n);
		int start=0;

		for(int i=0; i<n; i++) {


			//logic
			if(str[i] == ' ' && i>0) {
				reverseWord(str,start, i-1);
				start = i+1;
			}
			else if(i == n-1) {
				reverseWord(str,start, i);
			}

		}

		reverseWord(str, 0, n-1);

		System.out.println(str);
	}

	public static void reverseWord(char str[], int start, int end) {
		while(start < end) {

			char temp = str[start];
			str[start] = str[end];
			str[end] = temp;

			start++;
			end--;

		}
	}



	public static void main(String[] args) {
		//reverseWithLibFunc();
		reverseWithoutLib();
	}
}
