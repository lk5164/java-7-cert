package com.exam;

import java.util.TreeSet;

public class Q66 {
	public class MyComparator<String> implements java.util.Comparator<String>{

		@Override
		public int compare(String s1, String s2) {
			return ((Integer)s1.toString().length()).compareTo((Integer)s2.toString().length());
		}


		
	}
	public static void main(String[] args){
		MyComparator<String> a= new Q66().new MyComparator<String>();
		TreeSet<String> set1 = new TreeSet<String>(a);
		set1.add("peach");
		set1.add("orange");
		set1.add("apple");
		for (String s:set1){
			System.out.println(s);
		}
	}
}
