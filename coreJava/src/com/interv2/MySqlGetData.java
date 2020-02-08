package com.interv2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.RandomAccess;

public class MySqlGetData {
	public static void main(String[] args) {
		final String DB_URL = "jdbc:mysql://localhost:3306/userdb";
		// Database credentials
		final String username = "root";
		final String password = "Root@1234";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// JDBC driver name and database URL
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			// STEP 3: Open a connection
			conn = DriverManager.getConnection(DB_URL, username, password);
			// STEP 4: Execute a query
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM userdb.student");
			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name or position
				System.out.println(
						rs.getInt(1) + ", " + rs.getString(2) + " , " + "" + rs.getString(3) + " , " + rs.getString(4));
			}
			rs.close();

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null) {
					conn.close();
				}
			} catch (SQLException se) {
				// do nothing
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
	}
}

