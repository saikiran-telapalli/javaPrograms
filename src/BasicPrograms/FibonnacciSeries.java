package BasicPrograms;


public class FibonnacciSeries {

	/**
	 * The Fibonacci sequence is a series of numbers where a number is 
	 * found by adding up the two numbers before it. Starting with 0 and 1
	 */
	
	/**
	 * Fibonacci Series in Java without using recursion
	 * 
	 */
	public void withoutRecurFBseries(int number) {
		int n1=0, n2=1,i,n3,count = number;
		String fibonacciSeries = " ";
		
		//logic
		String defaultSeries = (n1+" "+n2);
		for(i=2; i<count; i++) {
			n3 = n1+n2;
			fibonacciSeries = fibonacciSeries + n3 + " ";
			n1 = n2;
			n2 = n3;

		}

		fibonacciSeries = defaultSeries + fibonacciSeries;
		System.out.println("fibonacciSeries: "+fibonacciSeries);
	}

	//**************** Initialising variables *****************//
	int n1=0, n2=1, n3;
	String defaultSeries = " ";
	String fibonacciSeries =" ";

	/**
	 * Fibonacci Series in Java using recursion
	 * 
	 */
	public void recursiveFBSeries(int number) {
		
		defaultSeries = (n1+ " "+n2);
		printFibonacci(number-2);
		fibonacciSeries = defaultSeries + fibonacciSeries;
		System.out.println("fibonacciSeries: "+ fibonacciSeries);
	}

	public  void printFibonacci(int count) {

		//logic
		if(count>0) {
			n3 = n1+n2;
			fibonacciSeries = fibonacciSeries+ n3 +" ";
			n1= n2;
			n2= n3;
			printFibonacci(count-1);
		}

	}
	
	public static void main(String[] args) {
		
		FibonnacciSeries fs = new FibonnacciSeries();
		
		fs.withoutRecurFBseries(10);
		fs.recursiveFBSeries(7);
		
	}
}

