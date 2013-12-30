package com.exam;

public class Q121{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Q121_Counter obj1 = new Q121_Counter();
		final Q121_Counter obj2 = new Q121_Counter();
		new Thread(new Runnable(){
			public void run(){
				System.out.println("Thread 1 start");
				obj1.display(obj2);
			}
		}).start();
		new Thread(new Runnable(){
			public void run(){
				System.out.println("Thread 2 start");
				obj2.display(obj1);
			}
		}).start();

	}

}
