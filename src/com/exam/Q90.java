package com.exam;

public class Q90 {

	void verify(int age) throws IllegalArgumentException {
		if (age < 12)
			throw new Q90_InvalidAgeException();
		if (age >= 12 && age <= 60)
			System.out.print("General category");
		else
			System.out.print("Senior citizen category");
	}

	public static void main(String[] args) {
		int age = Integer.parseInt(args[1]);
		try {
			new Q90().verify(age);
		} catch (Exception e) {
			System.out.print(e.getClass());
		}
	}
}
