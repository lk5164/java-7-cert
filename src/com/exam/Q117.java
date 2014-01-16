package com.exam;

public class Q117 {
	public static int getCount(String[] arr) {
		int count = 0;
		for (String var : arr) {
			if (var != null)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String[] arr = new String[4];
		arr[1] = "C";
		arr[2] = "";
		arr[3] = "Java";
		assert (getCount(arr) < arr.length);
		System.out.print(getCount(arr));
	}
}
