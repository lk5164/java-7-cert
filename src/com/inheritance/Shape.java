package com.inheritance;

public abstract class Shape {

	private Shape parentShape;
	public Shape getParentShape() {
		return parentShape;
	}
	public void setParentShape(Shape parentShape) {
		this.parentShape = parentShape;
	}
	
//	public final void girth();
	public abstract double area();
	
	protected static class Color2 implements ColorInterface{
		int m_red, m_green, m_blue;
		public String painter;
		public Color2(){
			this(0,0,0);
			
		}
		public Color2(int red, int green, int blue){
			m_red = red;
			m_green = green;
			m_blue = blue;
		}
		public String toString() {
			return "red: " + m_red + " green: " + m_green + " blue: " + m_blue;
		}
		@Override
		public void setPainter(String name) {
			this.painter = name;
			
		}
		public static void main(String[] args){
			System.out.println(new Shape.Color2(1,1,1));
		}
	}
}
