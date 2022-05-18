package com.ty.keystore.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static com.ty.keystore.util.AppConstants.*;


public class ConnectionObject {
	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		try {
			
			return DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
	}
}
