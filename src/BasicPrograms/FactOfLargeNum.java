package BasicPrograms;

import java.math.BigInteger;
import java.util.Scanner;

public class FactOfLargeNum {

	/**
	 * factorial(n)
	1) Create an array ‘res[]’ of MAX size where MAX is number of maximum digits in output.
	2) Initialize value stored in ‘res[]’ as 1 and initialize ‘res_size’ (size of ‘res[]’) as 1.
	3) Do following for all numbers from x = 2 to n.
	……a) Multiply x with res[] and update res[] and res_size to store the multiplication result.

	How to multiply a number ‘x’ with the number stored in res[]?
	The idea is to use simple school mathematics. We one by one multiply x with every digit of res[]. 
	The important point to note here is digits are multiplied from rightmost digit to leftmost digit. 
	If we store digits in same order in res[], then it becomes difficult to update res[] without extra space. 
	That is why res[] is maintained in reverse way, i.e., digits from right to left are stored.

	multiply(res[], x)
	1) Initialize carry as 0.
	2) Do following for i = 0 to res_size – 1
	….a) Find value of res[i] * x + carry. Let this value be prod.
	….b) Update res[i] by storing last digit of prod in it.
	….c) Update carry by storing remaining digits in carry.
	3) Put all digits of carry in res[] and increase res_size by number of digits in carry.
	 * @param n
	 */

	static void factorial(int n) {
		int res_arr[] = new int[500];

		// Initialize result
		res_arr[0] = 1;
		int res_size = 1;

		// Apply simple factorial formula 
		// n! = 1 * 2 * 3 * 4...*n
		for (int x = 2; x <= n; x++) {
			System.out.println("\nloop started");
			System.out.println("x: "+x);
			res_size = multiply(x, res_arr, res_size);
		}
		System.out.println("\nFactorial of given number is ");
		for (int i = res_size - 1; i >= 0; i--) {

			System.out.print(res_arr[i]);
		}
	}


	static int multiply(int x, int res_arr[], int res_size) {
		int carry = 0; // Initialize carry

		// One by one multiply n with individual  
		// digits of res[]
		for (int i = 0; i < res_size; i++) {
			int prod = res_arr[i] * x + carry;
			System.out.println("prod:"+prod);
			res_arr[i] = prod % 10; // Store last digit of 
			// 'prod' in res[]
			System.out.println("res_arr[i]: i="+i+ " & " +prod%10);

			carry = prod/10; // Put rest in carry

			System.out.println("carry: "+carry);
		}

		// Put carry in res and increase result size
		while (carry!=0) {
			System.out.println("\nIn to while loop");
			System.out.println("res_size after loop:"+res_size);
			res_arr[res_size] = carry % 10;
			carry = carry / 10;
			res_size++;
			System.out.println("res_size++: "+res_size);
		}
		//System.out.println("res_sizeret:"+res_size);
		return res_size;

	}

/**'
 * Using predefined function BigInteger
 */
	public static void uisngBigInt(){
		BigInteger fac = new BigInteger("1");

		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter a number:");
		int n=sc.nextInt();

		for(int i=2;i<=n;++i){
			fac=fac.multiply(BigInteger.valueOf(i));
		}

		System.out.println(fac);
	}

	// Driver program
	public static void main(String args[]) {
		factorial(50);
		uisngBigInt();
	}
}
