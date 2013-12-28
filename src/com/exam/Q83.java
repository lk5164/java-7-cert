package com.exam;

public class Q83 {
	public static void main(String[] args) {
		String[] arr = { "SE", "ee", "ME" };
		for (String var : arr) {
			try {
				switch (var) {
				case "SE":
					System.out.println("Standard Edition");
					break;
				case "EE":
					System.out.println("Enterprise Edition");
					break;
				default:
					assert false;
				}
			} catch (Exception e) {
				System.out.println(e.getClass());
			}
		}
	}
}
