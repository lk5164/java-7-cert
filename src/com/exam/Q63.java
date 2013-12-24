package com.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q63 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		
		nameList.add("Jonh Adams");
		nameList.add("George Washington");
		nameList.add("Thomas Jefferson");
		
		Collections.sort(nameList);
		for(String name:nameList){
			System.out.println(name);
		}

	}

}
