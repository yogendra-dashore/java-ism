package com.util;
import java.sql.*;
public class DbConnection {

		private static final String URLNAME = "jdbc:mysql://localhost:3306/employee";
		private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
		private static final String USERNAME = "root";
		private static final String PASSWORD = "";
		
		
		public static Connection appConnection() {
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
		
		public static void main(String[] args) {
			Connection cn= appConnection();
			if(cn!=null) {
				System.out.println("database found");
			}else {
				System.out.println("database not found");
			}
		}
	}
