package com.cddstudio.java.basic.collection;

import java.util.Vector;

public class DemoVector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Khởi tạo một đối tượng Vector
		// Sức chứa ban đầu 10.
		// Tự động tăng sức chứa thêm 5 nếu số phần tử vượt qua sức chứa hiện
		// tại.

		Vector<Integer> v = new Vector<Integer>(10, 5);

		v.add(123);
		v.add(245);
		v.add(new Integer(345));
		v.add(null);
		// In ra so phan tu co trong Vector (Khong phai la dung luong)
		System.out.println("Size:" + v.size());// =4

		// Lấy ra phần tử tại chỉ số 1.
		// Giống với method get(int)
		Integer i = v.elementAt(1);
		System.out.println("v.elementAt(1)=" + i);// 245

		// Sét đặt lại phần tử tại chỉ số 1
		// Method này trả về phần tử cũ.
		v.setElementAt(1, 1000);
		//
		System.out.println("New value:" + v.get(1));// =1000 .

	}

}
