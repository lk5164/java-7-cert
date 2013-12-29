package com.exam;

import java.util.Arrays;

public class Q101 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object[] array1 = new Object[3];
		array1[0] = "foo";
		array1[1] = 1;
		array1[2] = 'a';
		int index = Arrays.binarySearch(array1, "bar");
		System.out.println(index);
	}

}
