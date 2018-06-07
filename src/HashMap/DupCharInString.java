package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DupCharInString {

	public void findDuplicateChars(String str){
        
        Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
        char[] chrs = str.toCharArray();
        
        for(Character ch:chrs){
            if(dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch)+1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        
        //To Count Occurrences Of Each Character In String
        System.out.println(dupMap);
        
        //To Count Only Repeated Character Occurrences In String
        Set<Character> keys = dupMap.keySet();
        for(Character ch : keys){
            if(dupMap.get(ch) > 1){
                System.out.println(ch+"--->"+dupMap.get(ch));
            }
        }
    }
     
    public static void main(String a[]){
        DupCharInString dcs = new DupCharInString();
        dcs.findDuplicateChars("Java2Novice");
    }
}
