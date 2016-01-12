package com.cddstudio.java.basic.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DemoSortedMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<String, String>();

		map.put("01000005", "Tom");
		map.put("01000002", "Jerry");
		map.put("01000003", "Tom");
		map.put("01000004", "Donald");

		// Tập hợp này đã sắp xếp tăng dần
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println("Phone: " + key);
		}

		System.out.println("-----");

		// Tập hợp này cũng đã được sắp xếp theo key.
		Set<Map.Entry<String, String>> entries = map.entrySet();
		for (Map.Entry<String, String> entry : entries) {
			System.out.println("Phone: " + entry.getKey());
		}

	}

}
