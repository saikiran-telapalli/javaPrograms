package BasicPrograms;

import java.util.Scanner;

public class LeapYear {
	
	public static void leapYear(int num) {
		int year = num;
		boolean isLeap = true;
		
		if(year % 4 == 0) {
			
			if(year % 100 == 0) {
				
				if(year % 400 == 0) {
					isLeap = true;
				}
				else {
					isLeap = false;
				}
				
			}
			else {
				isLeap = true;
			}
		}
		else {
			isLeap = false;
		}
		
		if(isLeap) {
			System.out.println(num + " is a leap year");
		}
		else {
			System.out.println(num + " is not a leap year");
		}
	}
	
	public static void printLeapYears(int num) {
		int i = num;
		boolean isLeap = true;
		
		System.out.println("Leap years up "+num);
		for(i=1; i<=num; i++) {
			if(i % 4 ==0) {
				if(i % 100 ==0) {
					if(i % 400 ==0) {
						isLeap = true;
					}
					else {
						isLeap = false;
					}
				}
				else {
					isLeap = true;
				}
			}
			else {
				isLeap = false;
			}
			
			if(isLeap) {
				System.out.print(i+ " ");
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the year");
		int num = in.nextInt();
		
		leapYear(num);
		
		printLeapYears(num);
	}

}
