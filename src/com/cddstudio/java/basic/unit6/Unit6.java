package com.cddstudio.java.basic.unit6;

/*
 * Ở bài test này, ta tạo 1 giao diện Draw định nghĩa trong nó các phương thức draw (vẽ)
 * Các class Rectangle (hình chữ nhật) và Circle (Hình vuông) sẽ triển khai giao diện Draw
 * ở class Rectangle và Circle sẽ nói rõ draw như thế nào
 * 
 * Qua bài test này có thể thấy interface không cho phép tạo instance (thể hiện) và đều hỗ trợ tính đa hình
 *  (Tính đa hình cho phép một phương thức có cách thể hiện khác nhau trên nhiều loại đối tượng khác nhau)
 *  
 * Đều với mục đích là vẽ các hình, ta có hai phương pháp giải quyết khác nhau:
 * 	1 là dùng interface DrawBasic tạo method chung là draw sau đó triển khai nó
 *  2 là dùng lớp abstract Shape tạo method chung là draw sau đó mở rộng nó
 * 
 * Như vậy ta che dấu được cách tạo hình khối chi tiết như thế nào
 * 
 * Tùy vào từng bài toán mà ta sử dụng abstract hay interface sao cho hợp lý
 * */

public class Unit6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		rectangle.draw();
		rectangle.draw(true);
		
		Circle circle = new Circle();
		circle.draw();
		circle.draw(true);
		
		Square square = new Square();
		square.draw(); 
		
		Trapezoid trapezoid = new Trapezoid();
		trapezoid.draw();
	}
	
}
