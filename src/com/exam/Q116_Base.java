package com.exam;

import java.io.BufferedReader;
import java.io.FileReader;

public class Q116_Base {
	public void process() throws Exception{
		FileReader fr = new FileReader("userguide.txt");
		BufferedReader br = new BufferedReader(fr);
		String record;
		while((record = br.readLine())!=null){
			System.out.println(record);
		}
	}
}
