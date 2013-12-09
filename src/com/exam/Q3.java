package com.exam;

import java.util.ArrayList;

public class Q3
{

	public static void main(String[] args) throws InterruptedException
	{
		Thread t1 = new Thread(new WorkerThread("t1"));
		Thread t2 = new Thread(new WorkerThread("t2"));
		t1.start();
		t2.start(); // line1
		
		t1.join();
		t2.join();
		System.out.println(WorkPool.list.size());
	}
}

class WorkPool
{
	static ArrayList<Integer> list = new ArrayList<>(); // line2

	public static void addItem()
	{ // line3
		list.add(1); // Line4
	}
}

class WorkerThread implements Runnable
{
	static Object bar = new Object();
	public String name = "default";

	public WorkerThread(String na) {
		this.name = na;
	}
	synchronized public void run()
	{ // line5
		for (int i = 0; i < 5; i++) {
			WorkPool.addItem(); // line6
			System.out.println(this.name+" just added 1.");
		}
//		System.out.println();
	}

}
