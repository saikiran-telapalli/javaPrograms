package StringPrograms;

public class PrintNumFromString {
	
	public static void main(String[] args) {
		
		String text = "inbox2000";
		char[] ch = text.toCharArray();
		
		//System.out.println(ch.length);
		char[] res = new char[2000];
		int i=0;
		for(;i<ch.length;i++) {
			if(Character.isDigit(ch[i])) {
				res[i]= ch[i];
			}
		}
		
		for(int j=0; j<i;j++) {
			System.out.print(res[j]);
		}
	}

}
