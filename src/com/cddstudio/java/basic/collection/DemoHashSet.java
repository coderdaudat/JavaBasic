package com.cddstudio.java.basic.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo một đối tượng Set có sức chứa ban đầu 10 phần tử.
		// Nếu số lượng phần tử thêm vào vượt quá sức chứa hiện tại.
		// Nó sẽ tự tăng sức chứa lên 80%.
		// Đặc điểm của HashSet là phần tử thêm vào sau đứng trước.
		Set<String> set = new HashSet<String>(10, (float) 0.8);

		set.add("One");
		set.add("Two");

		// Trùng lặp xẩy ra.
		// Với HastSet: Nó sẽ ghi phần tử mới vào và remove phần tử cũ.
		set.add("One");
		set.add("Three");

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
