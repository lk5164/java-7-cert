package com.exam;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deque <String> myDeque = new ArrayDeque<String>();
		myDeque.push("one");
		myDeque.push("two");
		myDeque.push("three");
		System.out.println(myDeque.pop());

	}

}
