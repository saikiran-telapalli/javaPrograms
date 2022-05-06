package Interview;

import java.util.*;

public class PrintNthRepeated {

    //Same for character in a string use HashMap<Character, Integer>

    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

        // Sort the list using lambda expression
        Collections.sort(list, (i1, i2) -> i1.getValue().compareTo(i2.getValue()));

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public static void printThridRep()
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String s1= "My name is sai sai has salary of 28 and salary of sai at home sai salary home";
        for(String s2: s1.split(" ")){
            if(map.containsKey(s2)){
                map.put(s2, map.get(s2)+1);
            }
            else{
                map.put(s2,1);
            }
        }
        Map<String, Integer> hm = sortByValue(map);
        // Set of the entries from the HashMap
        Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();

        ArrayList<Map.Entry<String, Integer> > listOfEntry
                = new ArrayList<>(entrySet);
        int len = listOfEntry.size();
        //Third repeated word in the above string is len-3 and for 1st -> len-1
        System.out.println(listOfEntry.get(len-3).getKey());
    }

    public static void main(String[] args) {
        printThridRep();
    }
}
