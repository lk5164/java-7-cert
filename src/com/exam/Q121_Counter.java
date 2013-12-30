package com.exam;

public class Q121_Counter extends Thread{
	int i=10;
	public synchronized void display(Q121_Counter obj){
		try{
			Thread.sleep(5);
			System.out.println("Thread begin to increase.");
			obj.increment(this);
			System.out.println(i);
		}catch(InterruptedException e){
			System.out.println("interrupted!");
		}
	}
	public synchronized void increment(Q121_Counter obj){
		i++;
		System.out.println(i);
	}
}
