package HashMap;

import java.util.HashMap;

public class FirstRepeatedCharInString {

	static void firstRepeating(String str) {
		char[] strArray = str.toCharArray();

		//Creating a HashMap containing char as a key and occurrences as a value
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for(char ch : strArray) {
			if(map.containsKey(ch)) {

				//If char is present in charCountMap, incrementing it's count by 1
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}

		//checking for first repeated character
		for(char ch: strArray) {
			if(map.get(ch) >1) {
				System.out.println("First Repeated Character In " +str+ " is: "+ch);
				break;
			}
		}

		//checking for first non-repeated character
		for(char ch: strArray) {
			if(map.get(ch) ==1) {
				System.out.println("First Non-Repeated Character In "+str+ " is: "+ch);
				break;
			}
		}

	}


	public static void main (String[] args){
		String str = "geeksforgeeks";  
		firstRepeating(str);
	}
}

