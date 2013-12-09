package com.exam;

public class Q32_Yellowstone {
	static Q32 e = new Q32();

	Q32_Yellowstone() {
		new Thread(e, "const").start();
	} // line A

	public static void main(String[] args) {
		new Q32_Yellowstone();
		new Faithful().go();
	}

	static class Faithful {
		void go() {
			new Thread(e, "inner").start();
		} // line B
	}

}
