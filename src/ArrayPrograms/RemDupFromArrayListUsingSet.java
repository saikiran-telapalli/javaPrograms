package ArrayPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemDupFromArrayListUsingSet {

	/**
	 * Using Hshset : "If you want insertion order of elements to be maintained even after removing the duplicate elements, 
	 * then this method is not recommended." So use LinkedHshSet to overcome this problem
	 */
	public static void usingHashSet() {

		ArrayList<String> list = new ArrayList<String>();

		list.add("JAVA");   
		list.add("J2EE");
		list.add("JSP");
		list.add("SERVLETS");
		list.add("JAVA");
		list.add("STRUTS");
		list.add("JSP");

		System.out.println("===============>Using HashSet<================");
		System.out.print("ArrayList With Duplicate Elements :");
		System.out.println(list);

		HashSet<String> set = new HashSet<String>(list);

		ArrayList<String> modifiedList = new ArrayList<String>(set);

		System.out.print("ArrayList Without Duplicate Elements :");
		System.out.println(modifiedList);
	}


	/**
	 * Linked HashSet: " Insertion order of elements is maintained even after the duplicate elements are removed from ArrayList."
	 * @param args
	 */

	public static void usongLinkedHshSet() {

		ArrayList<String> list = new ArrayList<String>();

		list.add("JAVA");   
		list.add("J2EE");
		list.add("JSP");
		list.add("SERVLETS");
		list.add("JAVA");
		list.add("STRUTS");
		list.add("JSP");

		System.out.println("===============>Using LinkedHashSet<================");
		System.out.print("ArrayList With Duplicate Elements :");
		System.out.println(list);

		LinkedHashSet<String> set = new LinkedHashSet<String>(list);

		ArrayList<String> modifiedList = new ArrayList<String>(set);

		System.out.print("ArrayList Without Duplicate Elements :");
		System.out.println(modifiedList);
	}
	public static void main(String[] args) {
		usingHashSet();
		usongLinkedHshSet();
	}
}
