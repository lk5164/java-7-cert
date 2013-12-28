package com.exam;

import java.util.concurrent.atomic.AtomicInteger;

public class Q79 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AtomicInteger[] var = new AtomicInteger[5];
		for (int i = 0; i < 5; i++) {
			var[i] = new AtomicInteger();
		}
		for (int i = 0; i < var.length; i++) {
			var[i].incrementAndGet();
			if (i == 2)
				var[i].compareAndSet(2, 4);
			System.out.print(var[i] + " ");
		}
	}

}
