package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {

		try {
			Properties properties = new Properties();
			// Đọc những thông tin trong properties file
			properties.load(Files.newInputStream(Paths.get("src/main/resources/database.properties")));
			String databaseUrl = properties.getProperty("databaseUrl");
			String userName = properties.getProperty("username");
			String password = properties.getProperty("password");
			// Đăng kí tên Driver dùng để kết nối cơ sở dữ liệu
			Class.forName("com.mysql.cj.jdbc.Driver");
			// B1: Tạo đối tượng Connection và sử dụng hàm getConnection để tạo kết nối đến CSDL
			// Hàm getConnection cần cung cấp 3 thông tin
			// 1. Địa chỉ của máy chủ database và tên database
			// 2. username tài khoản dùng để kết nối
			// 3. password mật khẩu của tài khoản
			Connection con = DriverManager.getConnection(databaseUrl, userName, password);
			// Nếu kết nối không thành công thì sẽ trả về null
			// Gọi hàm thêm mới 1 account
			System.out.println("Connect database success!");
		} catch (ClassNotFoundException | SQLException | IOException e) {
			System.out.println("Connect database faile because: " + e.getMessage());
			throw new RuntimeException(e);
		}

	}

}