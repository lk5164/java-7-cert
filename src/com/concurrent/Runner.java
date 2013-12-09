package com.concurrent;

import java.util.concurrent.CountDownLatch;

public class Runner extends Thread {

	private CountDownLatch timer;
	public Runner(CountDownLatch cdl, String name){
		timer = cdl;
		this.setName(name);
		System.out.println(this.getName()+" ready and waiting for the count down to start");
		start();
	}
	public void run(){
		try{
			timer.await();
		}catch (InterruptedException ie){
			System.err.println("interrupted -- can't start tunning the race");
			
		}
		System.out.println(this.getName()+" started running "+this.getState());
	}

}
