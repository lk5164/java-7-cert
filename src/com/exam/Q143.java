package com.exam;

public class Q143 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Q143_Rideable r1 = new Q143_Icelandic();
		Q143_Rideable r2 = new Q143_Horse();
		Q143_Horse h1 = new Q143_Icelandic();
		System.out.println(r1.ride() + r2.ride() + h1.ride());
	}

}
