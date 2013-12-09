package com.concurrent;

import java.util.concurrent.CountDownLatch;

public class RunningRaceStarter {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException{
		CountDownLatch counter = new CountDownLatch(5);
		Runner r1 = new Runner(counter, "Carl");
		new Runner(counter, "Joe");
		new Runner(counter, "Jack");
		 
		System.out.println("Starting the countdown ");
		long countVal = counter.getCount();
		while(countVal > 0) {
			Thread.sleep(1000); // 1000 milliseconds = 1 second
			System.out.println(countVal);
			if(countVal == 1) {
				System.out.println("Start");
			}
			counter.countDown(); // count down by 1 for each second
			countVal = counter.getCount();
		}
		System.out.println(r1.getState());

	}

}
