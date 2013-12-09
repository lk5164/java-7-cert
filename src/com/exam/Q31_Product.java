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
		if (this ==obj)
			return true;
		if (obj instanceof Q31_Product)
			return (this.id == ((Q31_Product)obj).id) ? true : super.equals(obj);
		return false;
	}

}
