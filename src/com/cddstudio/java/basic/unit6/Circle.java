package com.cddstudio.java.basic.unit6;

public class Circle implements DrawBasic{
	
	public Circle(){}; //Khởi tạo không tham số

	//Ghi đè phương thức draw
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Circle");
		//Trong phương thức draw thoải mái thực hiện các chi tiết
	}

	@Override
	public void draw(boolean isDraw) {
		// TODO Auto-generated method stub
		if(isDraw) System.out.println("Draw Circle = " + DEFAULT_NUMBER);
	}
}
