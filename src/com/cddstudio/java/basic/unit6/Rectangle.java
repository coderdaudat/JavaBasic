package com.cddstudio.java.basic.unit6;

//Triển khai giao diện Draw với từ khóa implements
public class Rectangle implements DrawBasic{
	
	public Rectangle(){}; //Khởi tạo không tham số

	//Ghi đè phương thức draw
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Rectangle");
		//Trong phương thức draw thoải mái thực hiện các chi tiết
	}

	@Override
	public void draw(boolean isDraw) {
		// TODO Auto-generated method stub
		if(isDraw) System.out.println("Draw Rectangle = " + DEFAULT_NUMBER);
	}
	

}
