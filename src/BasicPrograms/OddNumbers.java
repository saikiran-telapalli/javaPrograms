package BasicPrograms;

import java.util.Scanner;

public class OddNumbers {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		String oddNumbers ="";
		System.out.println("Enter the value of k for odd numbers:");
		int k = scanner.nextInt();
		
		
		for(i=1; i<=k; i++) {
			if(i%2 != 0) {
				//For even the condition will be (i%2 ==0)
				oddNumbers = oddNumbers + i +" ";
				//System.out.print(i+" ");
			}
		}
		System.out.println("Odd numbers from 1 to n are :");
		System.out.println(oddNumbers);
	}


}
