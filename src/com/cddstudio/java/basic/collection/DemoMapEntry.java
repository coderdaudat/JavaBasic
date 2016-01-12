package com.cddstudio.java.basic.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMapEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("01000005", "Tom");
		map.put("01000002", "Jerry");
		map.put("01000003", "Tom");
		map.put("01000004", "Donald");

		// Lấy ra tập hợp các entry.
		// Các entry này có thể không sắp xếp theo key.
		Set<Entry<String, String>> entries = map.entrySet();

		for (Entry<String, String> entry : entries) {
			System.out.println("Phone: " + entry.getKey() + " : "
					+ entry.getValue());
		}

	}

}
