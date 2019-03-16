package com.rebron.loginSession.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.sql.PreparedStatement;
 

public class JDBCUtil {
	private static String url;
	private static String user;
	private static String password;
	static {
		Properties pro = new Properties();
		InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream(
				"jdbc.properties");
		try {
			pro.load(is);
			url = pro.getProperty("URL");
			user = pro.getProperty("USER_NAME");
			password = pro.getProperty("USER_PASS");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 */
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	/**
	 * @param con
	 * @param stmt
	 * @param rs
	 */
	
	public static void closeResource(Connection con, PreparedStatement psment,Statement stmt,
			ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if(psment!=null){
				psment.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (con != null && !con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeResource(Connection con,PreparedStatement psment, Statement stmt) {
		try {
			if(psment!=null){
				psment.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (con != null && !con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
