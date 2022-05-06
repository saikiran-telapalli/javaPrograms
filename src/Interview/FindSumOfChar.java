package Interview;

import java.util.HashMap;

public class FindSumOfChar {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',1);
        map.put('b',2);
        map.put('c',3);
        map.put('t',20);

        String s1 = "bat", s2 = "cat";
        int sum =0;
        for(Character cha: s1.toCharArray()){
            if(map.containsKey(cha)){
                sum += map.get(cha);
            }
        }
        for(Character cha: s2.toCharArray()){
            if(map.containsKey(cha)){
                sum += map.get(cha);
            }
        }
        System.out.println(sum);
    }
}
