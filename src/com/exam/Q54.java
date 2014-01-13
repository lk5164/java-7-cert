package com.exam;

public class Q54 {

	String title;

	static class Counter {
		int counter = 0;

		void increment() {
			counter++;
		}
	}

	public static void main(String[] args) {
		//new Q54().new Counter().increment();
		//new Q54().Counter().increment();
		new Q54.Counter().increment();
		//Q54.Counter().increment();
		//Q54.Counter.increment(); 
	}

}
