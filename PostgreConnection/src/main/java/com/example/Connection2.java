package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection2 {
	
	    private static final String URLNAME = "jdbc:postgresql://localhost:5433/emp";
		private static final String DRIVERCLASS = "org.postgresql.Driver";
		private static final String USERNAME = "postgres";
		private static final String PASSWORD = "root";
		
		
		public static Connection appConnection() {
			Connection cn = null;
			try {
				Class.forName(DRIVERCLASS);
				
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
				
			}
			try {
				cn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return cn;
		}
		public static void main(String[] args) {
			Connection cn= appConnection();
			if(cn!=null) {
				System.out.println("database found");
			}else {
				System.out.println("database not found");
			}
		}
}
