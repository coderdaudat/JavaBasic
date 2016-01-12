package com.cddstudio.java.basic.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class DemoCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo một đối tượng Collection không phần tử
		// Một tập hợp chỉ chứa các String.
		Collection<String> coll = (Collection<String>) new Vector<String>();
		coll.add("Collection");
		coll.add("Queue");
		coll.add("List");
		coll.add("Map");

		// In ra số phần tử của tập hợp.
		System.out.println("Size:" + coll.size());

		// Lấy ra bộ lặp Iterator để truy cập các phần tử của tập hợp
		// Rõ ràng bộ lặp này chỉ chứa các String.
		Iterator<String> ite = coll.iterator();

		// Kiểm tra xem Iteractor còn phẩn tử không.
		while (ite.hasNext()) {
			// Lấy ra phần tử tại vị trí con trỏ đang đứng
			// Đồng thời con trỏ nhẩy vị trí thêm 1 bước.
			String s = ite.next();
			System.out.println("Element:" + s);
		}
	}
	/*
	 * //Class này có sẵn trong gói java.util Anh chỉ lấy tạm ra đây để cho mọi
	 * người hiểu public interface Collection<E> extends java.lang.Iterable<E> {
	 * 
	 * // // Thêm một phần tử vào Collection trả về true nếu Collection thay đổi
	 * sau // khi gọi method và trả về false nếu Collection này không cho phép
	 * trùng // lặp và E o đã có trong Collection rồi (optional operation). //
	 * boolean add(E o);
	 * 
	 * // // Thêm tập hợp vào Collection ,trả về true nếu thực sự Collection
	 * thay đổi // sau khi gọi method (optional operation). // boolean
	 * addAll(Collection<? extends E> c);
	 * 
	 * // Xóa tất cả các phần tử ra khỏi Collection .(optional operation). void
	 * clear();
	 * 
	 * // Kiểm tra xem Collection có chứa Object o không boolean contains(Object
	 * o);
	 * 
	 * // Kiểm tra xem Collection có chứa tất cả các phần tử trong Collection c
	 * // không. boolean containsAll(Collection<?> c);
	 * 
	 * // So sánh Collection này với Object o boolean equals(Object o);
	 * 
	 * int hashCode();
	 * 
	 * // Trả về true nếu Collection này không chứa phần tử nào boolean
	 * isEmpty();
	 * 
	 * // // Xóa đối tượng o ra khỏi Collection trả về true nếu thực sự có một
	 * phần tử // bị xóa khỏi (optional operation). // boolean remove(Object o);
	 * 
	 * // // Xóa các phần tử trong Collection này giống với các phần tử của
	 * Collection c // boolean removeAll(Collection<?> c);
	 * 
	 * // // Kiểm tra xem Collection này chứa mọi phần tử mà Collection c chứa
	 * // (optional operation). /// boolean retainAll(Collection<?> c);
	 * 
	 * // Trả về số phần tử trong Collection. int size();
	 * 
	 * // Chuyển Collection thành mảng các đối tượng Object[] toArray();
	 * 
	 * <T> T[] toArray(T[] a);
	 * 
	 * // Trả về một bộ lặp để duyệt trên các phần tử của tập hợp. Iterator<E>
	 * iterator(); }
	 */
}
