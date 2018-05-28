package BasicPrograms;

import java.util.Scanner;

public class PrimeNumbers {
	
	/**
	 * The number which is only divisible by itself and 1 is known as prime number.
	 */
	
	/**
	 * Print Prime numbers up to given number
	 */
	public void primeNumbers() {
		Scanner scanner = new Scanner(System.in);
		int i, num;
		String  primeNumbers = "";
		System.out.println("Enter the value of k for prime numbers:");
		int k = scanner.nextInt();
		//scanner.close();
		for (i = 1; i <= k; i++){	
			int counter = 0; 	  
			for(num =i; num>=1; num--){
				if(i%num==0){
					counter = counter + 1;
				}
			}
			if(counter ==2){
				//Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}	
		}	
		System.out.println("Prime numbers from 1 to n are :");
		System.out.println(primeNumbers);

	}

	/**
	 * To check given Number is a prime or not
	 */
	public void givenPrime() {
		int temp;
		boolean isPrime=true;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		
		//logic
		for(int i=2;i<=num/2;i++) {

			temp=num%i;
			if(temp==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
	}
 
	public static void main(String[] args) {

		PrimeNumbers pn = new PrimeNumbers();
		pn.primeNumbers();
		pn.givenPrime();
	}
}
