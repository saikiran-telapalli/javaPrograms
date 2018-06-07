package Conversions;

public class BinaryToDec {

	public static int binaryToDec(String bin_Val) {
		int len = bin_Val.length();
		int base =1;
		int dec_Val =0;
		
		for(int i=len-1; i>=0; i--) {
			if(bin_Val.charAt(i) == '1') {
				dec_Val += base;
			}
			base = base*2;
		}
		return dec_Val;
	}
	
	public static void main(String[] args) {
		String bin_Val = "1001";
		System.out.println(binaryToDec(bin_Val));
	}
}
