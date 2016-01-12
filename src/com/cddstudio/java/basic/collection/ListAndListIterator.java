package com.cddstudio.java.basic.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListAndListIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo một đối tượng List (Chỉ chứa các String)
		List<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");

		// Lấy ra đối tượng ListIterator để duyệt danh sách.
		ListIterator<String> listIterator = list.listIterator();

		// Hiện tại con trỏ đang đứng tại ví trí đầu danh sách.
		// Đứng tại chỉ số 0.
		// Lấy ra phần tử đầu tiên trong danh sách, con trỏ tiến một bước.
		String first = listIterator.next();
		System.out.println("first:" + first);// -->"One"

		// Hiện tại con trỏ đang đứng tại vị trí chỉ số 1
		// Lấy ra phần tử tiếp theo.
		String second = listIterator.next();
		System.out.println("second:" + second);// -->"Two"

		// Kiểm tra xem con trỏ có thể nhẩy lùi 1 vị trí không
		if (listIterator.hasPrevious()) {
			// Lùi con trỏ 1 trị trí.
			String value = listIterator.previous();
			System.out.println("value:" + value);// -->"Two"
		}

		System.out.println(" ----- ");

		while (listIterator.hasNext()) {
			String value = listIterator.next();
			System.out.println("value:" + value);
		}

	}

}
