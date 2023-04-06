package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private static final String URLNAME = "jdbc:sqlserver://localhost:50646;DatabaseName=PRACTICE_DATABASE;trustServerCertificate=true";
	private static final String DRIVERCLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String USERNAME = "sa";
	private static final String PASSWORD = "root";
	
	
	public static Connection getConnection() {
		Connection cn = null;
		try {
			Class.forName(DRIVERCLASS);
			
		}catch(ClassNotFoundException e) {
			System.out.println(e);
			System.out.println("driver class not found");
			
		}
		try {
			cn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cn;
	}
	
//	public static void main(String[] args) {
//		Connection cn= getConnection();
//		if(cn!=null) {
//			System.out.println("database found");
//		}else {
//			System.out.println("database not found");
//		}
//	}
}
