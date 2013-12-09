package com.inheritance;

public class Rectangle extends Shape {

	private int length, height;
	@Override
	public double area() {
		return length*height;
	}
	public static void main(String[] args){
		Shape shape = new Rectangle();
		shape.setParentShape(null);
	}

}
