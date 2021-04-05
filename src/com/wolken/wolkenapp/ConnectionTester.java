package com.wolken.wolkenapp;

import java.sql.Connection;

public class ConnectionTester {

	public static void main(String[] args) {
		Connection connection = Connect.getConnect();
		System.out.println(connection);
		Connect.closeConnect();
		Connection connection1 = Connect.getConnect();
		System.out.println(connection1);
		Connect.closeConnect();
		Connection connection2 = Connect.getConnect();
		System.out.println(connection2);
		Connect.closeConnect();
	}
}
