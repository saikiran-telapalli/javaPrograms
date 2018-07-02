package StringPrograms;

import java.util.HashSet;

public class VowelsTest {
	
	static HashSet<Character> vowels;
	public static int countVowles(String word) {
		vowels = new HashSet<>();
		int count=0;
		for(char ch : word.toCharArray()) {
			if(vowels.contains(ch)) {
				count++;
				
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int vowelscount = countVowles("aeious");
		System.out.println("vowelscount: "+vowelscount);
	}
}
