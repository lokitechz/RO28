package com.vn.vti.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseUtil {

	private static DatabaseUtil dbIsntance;

	// Connection đảm nhận nhiệm vụ tạo kết nối đến cơ sở dữ liệu
	private static Connection con;

	public static DatabaseUtil getInstance() {
		if (dbIsntance == null) {
			dbIsntance = new DatabaseUtil();
		}
		return dbIsntance;
	}

	public static void closeConnection(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getDatabaseConnection() {
		try {
			Properties properties = new Properties();
			// Đọc những thông tin trong properties file
			properties.load(Files.newInputStream(Paths.get("src/main/resources/database.properties")));
			String databaseUrl = properties.getProperty("databaseUrl");
			String userName = properties.getProperty("username");
			String password = properties.getProperty("password");
			Class.forName("com.mysql.cj.jdbc.Driver");
			if (con == null) {
				con = DriverManager.getConnection(databaseUrl, userName, password);
				System.out.println("Connect to database success");
				return con;
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
		return con;
	}

}
