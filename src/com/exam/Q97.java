package com.exam;

public class Q97 {

	public void infected() {
		System.out.print("before ");
		try {
			int i = 1 / 0;
			System.out.print("try ");
		} catch (Exception e) {
			System.out.print("catch ");
			throw e;
		} finally {
			System.out.print("finally ");
		}
		System.out.print("after ");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			new Q97().infected();
		} catch (Exception e) {
			System.out.println(e.getClass());
		}
	}

}
