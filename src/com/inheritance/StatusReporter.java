package com.inheritance;

class StatusReporter {
	// important to note that the argument "color" is declared final
	// otherwise, the local inner class DescriptiveColor will not be able to use
	// it!!
	static Shape.Color2 getDesciptiveColor(final Shape.Color2 color) {
		// local class DescriptiveColor that extends Shape.Color class
		class DescriptiveColor extends Shape.Color2 {
			public String toString() {
				return "You selected a color with RGB values " + color;
			}
		}
		return new DescriptiveColor();
	}

	public static void main(String[] args) {
		Shape.Color2 descriptiveColor = StatusReporter
				.getDesciptiveColor(new Shape.Color2(0, 0, 0));
		System.out.println(descriptiveColor);
	}
}
