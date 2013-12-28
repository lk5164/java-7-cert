package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Q71 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// url points to jdbc protocol : mysql subprotocol; localhost is the
		// addres
		// of the server where we installed our DBMS (i.e. on local machine) and
		// 3306 is the port on which we need to contact our DBMS
		String url = "jdbc:oracle:thin:@localhost:1521:coldfusion";
		// we are connecting to the addressBook database we created earlier
		// String database = "coldfusi";
		// we login as "root" user with password "mysql123"
		String userName = "scott";
		String password = "system";
		try (Connection conn = DriverManager.getConnection(url, userName,
				password);) {
			String query = "SELECT * FROM employees";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData(); // Line 14
			int colCount = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= colCount; i++) {
					System.out.print(rs.getObject(i) + " "); // Line 17
				}
				System.out.println();
			}
		} catch (SQLException se) {
			System.out.println("Error");
		}

	}

}
