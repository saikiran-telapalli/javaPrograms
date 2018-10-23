package StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateStringsInWord {

	public static void main(String[] args) {
		
		String word= "Hi sai this is sai kiran sai this";
		
		String words[]= word.split(" ");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String str : words) {
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}
			else {
				map.put(str, 1);
			}
		}
		
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		for(String str : keys) {
			if(map.get(str)>1) {
				System.out.println(str+" ---->"+map.get(str));
			}
		}
	}
}
