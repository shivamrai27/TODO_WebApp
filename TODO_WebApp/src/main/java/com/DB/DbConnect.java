package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
	private	static Connection conn = null;
	 public static Connection getConnection() {
		try {
			if(conn==null) {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/todO","root","root");
			return conn;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
