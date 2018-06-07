package BasicPrograms;

/**
 * A binary number is a number which contains only 0 or 1. 
 * For example : 101101, 110010110, 10010011 are binary numbers.
 * @author saikiran
 *
 */
public class BinaryOrNot {
	
	public void isBinaryOrNot(int number) {
		boolean isBinary = true;
		
		int copyOfNum = number;
		
		while(copyOfNum!=0) {
			int temp = copyOfNum % 10; // Gives last digit of the number
			
			if(temp >1) {
				isBinary = false;
				break;
			}
			else {
				copyOfNum = copyOfNum/10;
			}
		}
		
		if(isBinary) {
			System.out.println(number+" Number is Binary");
		}
		else {
			System.out.println(number+" Number is not Binary");
		}
	}

	public static void main(String[] args) {
		BinaryOrNot BN = new BinaryOrNot();
		BN.isBinaryOrNot(10010101);
		BN.isBinaryOrNot(13410101);
		
	}

}
