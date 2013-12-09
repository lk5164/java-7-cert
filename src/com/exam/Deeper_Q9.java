package com.exam;

public class Deeper_Q9 {

	// protected Integer getDepth() {
	// return 5;
	// }

	public Long getDepth(int d) {
		return 5L;
	}

	public static void main(String[] args) {
		Deeper_Q9 deeper = new Deeper_Q9();
		System.out.println(deeper.getDepth(2));
	}
}
