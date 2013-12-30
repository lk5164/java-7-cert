package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.Predicate;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class Q124 implements Predicate {

	private float low;
	private float high;
	public Q124(float low, float high){
		this.low = low;
		this.high = high;
	}
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

		try {
			Q124 myPriceFilter = new Q124(5.5f, 9.5f);
			RowSetFactory myRowSetFactory = RowSetProvider.newFactory();
			FilteredRowSet frs = myRowSetFactory.createFilteredRowSet();
			frs.setCommand("SELECT * FROM INVENTORY");
			frs.setUsername(userName);
			frs.setPassword(password);
			frs.setUrl(url);
			frs.execute();
			frs.setFilter(myPriceFilter);
			while (frs.next()) {
				System.out.println(frs.getInt(1) + " " + frs.getString(2) + " " + frs.getFloat(3) + " " + frs.getInt(4));
			}
		} catch (Exception e) {
			System.out.println("Database connection: Failed");
			e.printStackTrace();
		}

	}
	public boolean evaluate(RowSet rs){
		CachedRowSet crs = (CachedRowSet) rs;
		try{
			float columnValue = crs.getFloat(3);
			if((columnValue >= this.low) && (columnValue <= this.high)){
				return true;
			}
		}catch(Exception e){
			System.out.println("Exception caught in filter");
			e.printStackTrace();
			return false;
		}
		return false;
	}
	@Override
	public boolean evaluate(Object value, int column) throws SQLException {
		return false;
	}
	@Override
	public boolean evaluate(Object value, String columnName)
			throws SQLException {
		return false;
	}

}
