package com.exam;

public class Q51 extends ArrayIndexOutOfBoundsException {
	public class Test {
		public void verify(int[] arr) throws ArrayIndexOutOfBoundsException {
			for (int i = 1; i <= 3; i++) {
				if (arr[i] > 100)
					throw new Q51();
				System.out.println(arr[i]);
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 105, 78, 56 };
		try {
			new Q51().new Test().verify(arr);
		} catch (/*ArrayIndexOutOfBoundsException | */Q51 e) {
			System.out.print(e.getClass());
		}
	}
}
