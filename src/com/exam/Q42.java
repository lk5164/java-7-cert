package com.exam;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q42 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deque<String> myDeque = new ArrayDeque<>();
		myDeque.add("one");
		myDeque.add("two");
		myDeque.add("three");
		System.out.println(myDeque.remove());

	}

}
