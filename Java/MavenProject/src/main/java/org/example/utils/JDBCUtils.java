package org.example.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Class chứa các hàm hỗ trợ liên quan đến database
 */
public class JDBCUtils {

	private static Connection con = null;

	public static Connection getDatabaseConnection() {
		try {
			Properties properties = new Properties();
			// Đọc những thông tin trong properties file
			properties.load(Files.newInputStream(Paths.get("src/main/resources/database.properties")));
			String databaseUrl = properties.getProperty("databaseUrl");
			String userName = properties.getProperty("username");
			String password = properties.getProperty("password");
			Class.forName("com.mysql.jdbc.Driver");
			if (con == null) {
				con = DriverManager.getConnection(databaseUrl, userName, password);
			} else {
				return con;
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void closeDatabaseConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
