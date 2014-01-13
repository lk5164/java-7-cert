package com.exam;

public class Q59 {

	Integer x; // line 2

	public static void main(String[] args) {
		new Q59().go(5);
	}

	void go(Integer i) { // line 6
		System.out.print(x + ++i); // line 7
	}

}
