package com.exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Q108 extends Q108_Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -957093085697524829L;
//	String name;
//	transient String companyName;
	public String my_id;
	public Q108(String str, String str2) {
//		this.name = str;
//		this.companyName = str2;
		super(str, str2);
		this.my_id = "10";
		
	}
	public String toString() {
		return "US President's id is"+this.my_id+", name is " + name + ", company is " + companyName;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Q108 usPresident = new Q108("Barack Obama",
				"US");
		System.out.println(usPresident);
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("res//com//exam//USPresident.data"))) {
			oos.writeObject(usPresident);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"res//com//exam//USPresident.data"))) {
			Object obj = ois.readObject();
			if (obj != null && obj instanceof Q108) {
				Q108 presidentOfUS = (Q108) obj;
				System.out.println(presidentOfUS);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
