package com.exam;
public class Q31 {

	public static void main(String[] args) {
		Q31_Product p1 = new Q31_Product(10);
		Q31_Product p2 = new Q31_Product(10);
		Q31_Product p3 = new Q31_Product(20);
		System.out.print(p1.equals(p2) + " ");
		System.out.print(p1.equals(p3) );
		}

}
