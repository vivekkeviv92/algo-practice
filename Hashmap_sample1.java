/**
 * 
 */
package test;

import java.util.*;

public class Hashmap_sample1 {
	public Hashmap_sample1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(100, "Amit");
		hm1.put(101, "Vijay");
		hm1.put(102, "Rahul");
		for (Map.Entry m : hm1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
