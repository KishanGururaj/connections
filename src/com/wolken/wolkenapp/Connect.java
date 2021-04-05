package com.wolken.wolkenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	private static Connection connection=null;
	
	
	
	
	public static Connection getConnect() {
		return connection;
	}
	
	
	
static {
	try {
		connection  = DriverManager
				.getConnection("jdbc:mysql://localhost:3306?user=root&password=Password@1234567890");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static void closeConnect() {
	try {
		connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
