package com.exam;

public class Q102 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String svar = "sports cars";
		svar.replace(svar, "convertibles");
		System.out.printf("There are %3$s %2$s and %d trucks.", 5, svar, 2 + 7);
	}

}
