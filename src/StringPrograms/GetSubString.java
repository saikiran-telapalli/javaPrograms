package StringPrograms;

public class GetSubString {

	static String text = "management";
	static String exptext = "age";
	static char[] textArray = text.toCharArray();
	static char[] exptextArray = exptext.toCharArray();
	boolean substring;

	public boolean isPresent(char[] text, char[] exptext) {

		for (int i = 0; i < text.length; i++) {

			for (int j = 0; j < exptext.length; j++) {
				if (text[i + j] == exptext[j]) {
					if (j == exptext.length - 1) {
						return true;
					}
				}
				else {
					break;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		GetSubString sbs = new GetSubString();
		
		
		if(sbs.isPresent(textArray, exptextArray)) {
			System.out.println(exptext+" is a substring of "+text);
		}
		else {
			System.out.println(exptext+" is not a substring of "+text);
		}
	}

}
