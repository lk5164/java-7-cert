package com.exam;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Q40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String key = "color";
		ConcurrentMap<String, String> partList = new ConcurrentHashMap<>();
		partList.put(key, "Blue Pants");

		if (!partList.containsKey(key))
			partList.put(key, "Blue Shirt");
		System.out.println(partList.get(key).toString());
	}

}
