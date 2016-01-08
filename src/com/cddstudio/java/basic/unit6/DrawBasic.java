package com.cddstudio.java.basic.unit6;

/*
 * Đặc điểm: 
 * 	- không được khai báo biến 
 *  - tất cả các method đều là public
 *  - không thể thừa kế từ 1 interface khác
 *  - cho phép đa thừa kế (một class có thể implement nhiều interface)
 *  - tên interface thường là tính từ
 */

//Tạo giao diện Draw
public interface DrawBasic {
	//Định nghĩa phương thức draw (không có tham số) và không có phần thân chi tiết của method
	public void draw();
	//Đinh nghĩa phương thức draw (Có tham số isDraw kiểu boolean) 
	//Gọi là nạp chồng
	public void draw(boolean isDraw);
	//Định nghĩa 1 hằng số
	public final int DEFAULT_NUMBER = 5;
}
