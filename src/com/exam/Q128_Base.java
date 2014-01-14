package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Q128_Base {

	BufferedReader br;
	String record;

	public void process() throws FileNotFoundException {
		br = new BufferedReader(new FileReader("res\\com\\exam\\myfile.txt"));
	}

}
