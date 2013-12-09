package com.concurrent;

import java.util.concurrent.Semaphore;

public class ATMRoom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Semaphore machines = new Semaphore(1);
		 
		new Person(machines, "Mickey");
		new Person(machines, "Donald");
		new Person(machines, "Tom");
		new Person(machines, "Jerry");
		new Person(machines, "Casper");


	}

}
