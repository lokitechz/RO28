import entity.Account;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		try {
			// Đăng kí tên Driver dùng để kết nối cơ sở dữ liệu
			Class.forName("com.mysql.cj.jdbc.Driver");
			// B1: Tạo đối tượng Connection và sử dụng hàm getConnection để tạo kết nối đến CSDL
			// Hàm getConnection cần cung cấp 3 thông tin
			// 1. Địa chỉ của máy chủ database và tên database
			// 2. username tài khoản dùng để kết nối
			// 3. password mật khẩu của tài khoản
			Connection con = DriverManager.getConnection(Constant.databaseUrl, Constant.userName, Constant.password);
			// Nếu kết nối không thành công thì sẽ trả về null
			getListAccount(con);
			System.out.println("Connect database success!");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Connect database faile because: " + e.getMessage());
			throw new RuntimeException(e);
		}
	}

	private static List<Account> getListAccount(Connection con) {
		List<Account> accounts = new ArrayList<>();
		// Khai báo câu lệnh SQL muốn thực thi
		String sql = "SELECT * FROM `Account`";
		try {
			// B2: Khai báo đối tượng Statement tạo 1 câu lệnh gửi đến CSDL
			Statement st = con.createStatement();
			// B3: Khai báo đối tượng để nhận về kết quả thực thi của câu SQL
			ResultSet rs = st.executeQuery(sql);
			// B4: Xử lý kết quả trả về
			while (rs.next()) {
				Account account = new Account();
				account.setAccountId(rs.getInt("AccountID"));
				account.setEmail(rs.getString("Email"));
				account.setUserName(rs.getString("Username"));
				account.setFullName(rs.getString("FullName"));
				account.setDepartmentId(rs.getInt("DepartmentID"));
				account.setPositionId(rs.getInt("PositionID"));
				account.setCreateDate(rs.getDate("CreateDate"));
				System.out.println(account);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				// B5: Đóng kết nối đến CSDL
				con.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return accounts;
	}

}