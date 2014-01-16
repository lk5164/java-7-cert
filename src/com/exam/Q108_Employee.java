package com.exam;

import java.io.Serializable;

public class Q108_Employee /*implements Serializable*/{
	//private static final long serialVersionUID = 3646245231797644868L;
	/**
	 * 
	 */
	public Q108_Employee() {

	}

	public String toString() {
		return "US President name is " + name + ", company is " + companyName;
	}

	public Q108_Employee(String name, String companyName) {
		this.name = name;
		this.companyName = companyName;
	}

	String name;
	transient String companyName;
}
