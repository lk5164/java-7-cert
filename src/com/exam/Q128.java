package com.exam;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Q128 extends Q128_Base {

	// public void process() throws FileNotFoundException, IOException {
	// super.process();
	// while ((record = br.readLine()) != null) {
	// System.out.println(record);
	// }
	// }

	// public void process () throws IOException {
	// super.process ();
	// while ((record = br.readLine()) != null) {
	// System.out.println(record);
	// }
	// }

	// public void process() throws Exception {
	// super.process();
	// while ((record = br.readLine()) != null) {
	// System.out.println(record);
	// }
	// }

	// public void process() {
	// try {
	// super.process();
	// while ((record = br.readLine()) != null) {
	// System.out.println(record);
	// }
	// } catch (IOException | FileNotFoundException e) {
	// }
	// }

	public void process() {
		try {
			super.process();
			while ((record = br.readLine()) != null) {
				System.out.println(record);
			}
		} catch (IOException e) {
		}
	}

	public static void main(String[] args) {
		try {
			new Q128().process();
		} catch (Exception e) {
		}
	}

}
