package com.cddstudio.java.basic.unit6;

//Lớp Trapezoid kế thừa lớp trừu tượng Shape
public class Trapezoid extends Shape{

	//Khi đè phương thức draw
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		edge = 4;
		System.out.println("DRAW TRAPEZOID HAVE " + edge + "EDGE");
	}

}
