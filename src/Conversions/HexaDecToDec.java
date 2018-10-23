package Conversions;

public class HexaDecToDec {
	
	public static int hexaDecimalToDecimal(String hexaVal) {
		int len = hexaVal.length();
		int base = 1;
		int dec_Val =0;
		
		for(int i=len-1; i>=0; i--) {
			if(hexaVal.charAt(i) >='0' && hexaVal.charAt(i) <='9') {
				dec_Val += (hexaVal.charAt(i) - 48)*base;
				base = base*16;
			}
			else if(hexaVal.charAt(i) >='A' && hexaVal.charAt(i) <='F') {
				dec_Val += (hexaVal.charAt(i) - 55)*base;
				base = base*16;
			}
		}
		return dec_Val;
	}

	public static void main(String[] args) {
		int decimal_Value = hexaDecimalToDecimal("A1");
		System.out.println(decimal_Value);
	}
}
