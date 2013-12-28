package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;

public class Q33 {
	public static void main(String args[]) {
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
				password); Statement stmt = conn.createStatement();) {
			stmt.executeUpdate("delete from employees");
			conn.setAutoCommit(false);
			stmt.executeUpdate("insert into employees values(1,'Sam')");
			Savepoint save1 = conn.setSavepoint("point1");
			stmt.executeUpdate("insert into employees values(2,'Jane')");
			conn.rollback();
			stmt.executeUpdate("insert into employees values(3,'John')");
			conn.setAutoCommit(true);
			stmt.executeUpdate("insert into employees values(4,'Jack')");
			ResultSet rs = stmt.executeQuery("select * from employees");
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2));
			}
		} catch (Exception e) {
			System.out.println("Database connection: Failed");
			e.printStackTrace();
		}
	}
}
