package com.cddstudio.java.basic.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Với hàng đợi PriorityQueue phần tử sẽ được sắp xếp vị trí
		// theo trật tự tự nhiên của chúng.
		Queue<String> names = new PriorityQueue<String>();

		// offer(E): Trèn thêm phần tử vào hàng đợi.
		// Trả về true nếu thêm thành công.
		// Trả về false nếu hàng đợi không còn chỗ.
		names.offer("E");
		names.offer("A");
		names.offer("M");

		// add(E): Trèn thêm phần tử vào hàng đợi.
		// Trả về true nếu thêm thành công
		// Ném ra ngoại lệ nếu hàng đợi không còn chỗ.
		names.add("G");
		names.add("B");

		while (true) {
			// poll(): Lấy ra và loại bỏ phần tử đầu tiên ra khỏi hàng đợi.
			// Trả về null nếu không còn phần tử nào trong hàng đợi.
			String name = names.poll();
			if (name == null) {
				break;
			}
			System.out.println("Name=" + name);
		}

	}

}
