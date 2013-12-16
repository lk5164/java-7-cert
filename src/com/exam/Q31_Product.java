package com.exam;

public class Q31_Product {

	private int id;

	public Q31_Product(int id) {
		this.id = id;
	}

	public int hashCode() {
		return id + 42;
	}

	public boolean equals(Object obj) {
		return (this == obj) ? true : super.equals(obj);
	}

}
