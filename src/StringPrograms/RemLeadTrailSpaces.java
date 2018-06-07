package StringPrograms;

import java.util.Scanner;

public class RemLeadTrailSpaces {
	
	public static void usingTrim() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string to remove leading and trailing spaces:");
		String str1 = scan.nextLine();
		System.out.println("String after trim: "+str1.trim());
	}

	public static void withoutLibFunc() {
		
		int i, j, k=0;
		String finalString = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string to remove leading and trailing spaces:");
		String str1 = scan.nextLine();
		
		for(i=0; i<str1.length(); i++) {
			char ch = str1.charAt(i);
			if(ch!= ' ') {
				break;
			}
		}
		
		for(j=str1.length()-1; j>=0; j--) {
			char ch = str1.charAt(j);
			if(ch!= ' ') {
				break;
			}
		}
		
		
		for(k=i; k<=j; k++) {
			finalString = finalString+ str1.charAt(k);
		}
		
		System.out.println("String after trim: "+finalString);
	}
	
	
	public static void main(String[] args) {
		//usingTrim();
		withoutLibFunc();
	}
}

