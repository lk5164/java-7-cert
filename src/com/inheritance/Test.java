package com.inheritance;

public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Base b = new Derived();
		b.foo(b);

	}
}
