package com.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q85 {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("res/com/exam/myfile.txt"))){
			String record;
			while((record = br.readLine())!=null){
				System.out.println(record);
			}
			br.close();
//			br=new BufferedReader(new FileReader("myfile.txt"));
//			while((record = br.readLine())!=null){
//				System.out.println(record);
//			}
		
		} catch (IOException e) {
			System.err.print(e.getClass());
		}

	}

}
