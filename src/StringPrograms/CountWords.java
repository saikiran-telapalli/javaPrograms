package StringPrograms;

import java.util.Scanner;

public class CountWords {
	
	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int count =1;
		
		
		int str_len = str.length();
		System.out.println(str_len);
		
		for(int i=0; i<str_len-1; i++) {
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')) {
				count++;
			}
		}
		
		System.out.println("no. of words in a string: "+count);
		
		
		/*****************   or ********************/
//		char[] ch = str.toCharArray();
//		int str_len = ch.length;
//		System.out.println(str_len);
//		
//		for(int i=0; i<str_len; i++) {
//			if((ch[i]==' ') && (ch[i+1]!=' ')) {
//				count++;
//			}
//		}
//		
//		System.out.println("no. of words in a string: "+count);
	}

}
