package com.cddstudio.java.basic.collection;

import java.util.ArrayList;

public class DemoArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Khai báo một đối tượng ArrayList chứa các phần tử Integer.
		ArrayList<Integer> list = new ArrayList<Integer>(10);

		// Thêm vào 1 phần tử
		list.add(123);
		list.add(245);
		list.add(new Integer(345));
		// ArrayList cho phép add phan tu null .
		// (Đặc tính của List)
		list.add(null);

		// In ra so phan tu trong ArrayList
		System.out.println("Size:" + list.size());// =4
		// Truy cập ngẫu nhiên vào phần tử có chỉ số 1.

		Integer i = list.get(1);
		System.out.println("Element index 1 =" + i);// =245
		Integer newInt = 1000;

		// Sét đặt lại phần tử tại chỉ số 1
		// Method này trả về phần tử cũ.
		Integer old = list.set(1, newInt);
		//
		System.out.println("Old value:" + old);// =245 .
		System.out.println("New value:" + list.get(1));// =1000 .

	}

}
