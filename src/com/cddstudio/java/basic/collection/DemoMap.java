package com.cddstudio.java.basic.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("01000005", "Tom");
		map.put("01000002", "Jerry");
		map.put("01000003", "Tom");
		map.put("01000004", "Donald");

		// Lấy ra tập hợp các key.
		// Tập hợp này không được sắp xếp
		Set<String> phones = map.keySet();

		for (String phone : phones) {
			System.out.println("Phone: " + phone + " : " + map.get(phone));
		}

	}

}
