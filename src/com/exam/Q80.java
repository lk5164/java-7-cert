package com.exam;

public class Q80 extends Thread {

	public void run(String name) {
		System.out.print("Thread");
	}

	public void run(Runnable r) {
		r = new Runnable() {
			public void run() {
				System.out.print("Runnable");
			}
		};
	}

	public static void main(String[] args) {
		Thread t = new Q80();
		t.start();

	}

}
