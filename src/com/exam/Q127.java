package com.exam;

public class Q127<T> {

	private T t;
	public void setValue (T t) { this.t=t; }
	public T getValue() {return t; }
	public static void main(String[] args) {
		Q127<Integer> c = new Q127<Integer>(); // Line 1
		c.setValue(100); // Line 2
		System.out.print(c.getValue().intValue() +1); // Line 3
	}

}
