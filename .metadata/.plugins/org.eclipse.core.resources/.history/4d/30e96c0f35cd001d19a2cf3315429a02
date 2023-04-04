package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connetion3 {
	public static void main(String[] args) {
		Connection cn = appConnection();
		if (cn != null) {
			System.out.println("database found");
		} else {
			System.out.println("database not found");
		}
	}

	// private static final String URLNAME =
	// "jdbc:mssql:\\YOGI_DASHORE\\SQL_SRV_2023:1433/EMPLOYEE_DATABASE";
	private static final String URLNAME = "jdbc:sqlserver://localhost:50646;trustServerCertificate=true;";
	private static final String DRIVERCLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String USERNAME = "sa";
	private static final String PASSWORD = "Admin123$";

	public static Connection appConnection() {
		Connection cn = null;
		try {
			Class.forName(DRIVERCLASS);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
		try {
			cn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cn;
	}

}
