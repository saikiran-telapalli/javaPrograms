package BasicPrograms;

import java.util.Scanner;

public class PrintNumWithOutLoop {
	
	public static void recurrsiveFun(int num, int toNum) {
		int number = num;
		if(number <= toNum) {
			System.out.print(number+ " ");
			recurrsiveFun(num+1, toNum);
		}	
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the starting number to print from");
		int num = in.nextInt();
		System.out.println("Print up to the number");
		int toNum = in.nextInt();
		
		System.out.println("Printed numbers from "+num + " to "+toNum);
		recurrsiveFun(num, toNum);
	}
}
