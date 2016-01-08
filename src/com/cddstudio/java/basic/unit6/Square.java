package com.cddstudio.java.basic.unit6;

//Lớp Square (Hình vuông) kế thừa lớp trừu tượng Shape
public class Square extends Shape{

	//Ghi đè lớp draw
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		edge = 4;
		System.out.println("DRAW SQUARE HAVE " + edge + " EDGE");
	}

}
