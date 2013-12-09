package com.concurrent.lock;

public class BlockerQueueTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final BlockerQueue blockerQueue = new BlockerQueue(2);
		new Thread() {
			public void run() {
				System.out
						.println("Thread1: attempting to remove an item from the queue ");
				Object o = blockerQueue.remove();
			}
		}.start();

		new Thread() {
			public void run() {
				System.out
						.println("Thread2: attempting to insert an item to the queue");
				blockerQueue.insert("one");
			}
		}.start();

	}

}
