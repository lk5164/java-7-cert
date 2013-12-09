package com.inheritance;

public class Color {
	
	int red, green, blue;
	 
	private Color() {
		this(10, 10, 10);
	}
	

	Color(int r, int g, int b) {
	red = r;
	green = g;
	blue = b;
	}
	 
	public String toString() {
		return "red: " + red + " green: " + green + " blue: " + blue;
	}
	 
	public static void main(String [] args) {
		Color color = new Color();
		ColorInterface color2 = new Shape.Color2();
		System.out.println(color);
		System.out.println(color2);
	}

}
