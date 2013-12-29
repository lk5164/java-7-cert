package com.exam;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Q107 extends Thread {
	static List<Integer> myList = new CopyOnWriteArrayList<Integer>();

	public static void main(String[] args) {
		myList.add(11);
		myList.add(22);
		myList.add(33);
		myList.add(44);
		new Q107().start();
		for (Integer i : myList) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.print("e1 ");
			}
			System.out.print(" " + i);
		}
	}

	public void run() {
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.print("e2 ");
		}
		myList.add(77);
		System.out.print("size: " + myList.size() + ", elements:");
	}
}
