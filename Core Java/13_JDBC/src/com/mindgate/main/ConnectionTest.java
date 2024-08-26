package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "mindgatemumbai";
		String password = "mindgatemumbai";
		String driverName = "oracle.jdbc.driver.OracleDriver";

		Connection connection = null;

		try {
			// Class.forName(driverName);
			connection = DriverManager.getConnection(url, userName, password);
			if (connection != null)
				System.out.println("Connection successfull");
			else
				System.out.println("Connection failed");
		} catch (SQLException e) {
			System.out.println("Connection Failed");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Exception while closing connection");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

	}
}
