package HashMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortMapByKey {

	public static void ascendingOrderByKey() {

		Map<String, String> unsortMap = new HashMap<String, String>();
		unsortMap.put("Z", "z");
		unsortMap.put("B", "b");
		unsortMap.put("A", "a");
		unsortMap.put("C", "c");
		unsortMap.put("D", "d");
		unsortMap.put("E", "e");
		unsortMap.put("Y", "y");
		unsortMap.put("N", "n");
		unsortMap.put("J", "j");
		unsortMap.put("M", "m");
		unsortMap.put("F", "f");
		
		System.out.println("\nUnSorted Map......");
		printmap(unsortMap);
		
		//System.out.println(unsortMap);

		
		//logic
		System.out.println("\nSorted Map......By Key");
		Map<String, String> treemap = new TreeMap<String, String>(unsortMap);
		printmap(treemap);
	}

	public static <K, V> void printmap(Map<K, V> test) {
		for(Entry<K, V>entry : test.entrySet()) {
			System.out.println("Key: " +entry.getKey() +"\t value: "+entry.getValue());
		}
	}
	
	public static void descendingByKey() {
		
		Map<Integer, String> unsort = new HashMap<Integer, String>();
		unsort.put(5, "sai");
		unsort.put(7, "kiran");
		unsort.put(1, "telapalli");
		unsort.put(8, "software");
		
		System.out.println("\nUnSorted Map......");
		printmap(unsort);
		
		//logic
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>(
				new Comparator<Integer>() {
					
					@Override
					public int compare(Integer o1, Integer o2) {
						return o2.compareTo(o1);
				}
				});
		treemap.putAll(unsort);
		System.out.println("\nSorted Map......By Key");
		printmap(treemap);
		
	}
	
	public static void main(String[] args) {
		ascendingOrderByKey();
		//descendingByKey();
	}
}
