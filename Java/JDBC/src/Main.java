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
			// Gọi hàm thêm mới 1 account
			createAccount(con);
			System.out.println("Danh sách account sau khi thêm");
			// Gọi hàm lấy danh sách sau khi thêm
			getListAccount(con);
			// Gọi hàm sửa dữ liệu
			updateAccount(con);
			System.out.println("Danh sách account sau khi cập nhật");
			// Gọi hàm lấy danh sách sau khi thêm
			getListAccount(con);
			// Gọi hàm xoá dữ liệu
			deleteAccount(con);
			System.out.println("Danh sách account sau khi bị xoá");
			// Gọi hàm lấy danh sách sau khi thêm
			getListAccount(con);
			System.out.println("Connect database success!");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Connect database faile because: " + e.getMessage());
			throw new RuntimeException(e);
		}
	}

	// Hàm tạo mới account
	private static void createAccount(Connection con) {
		String sql = "INSERT INTO `Account` (Email,Username,FullName,DepartmentID,PositionID,CreateDate) " +
				"VALUES (?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "giang4@gmail.com");
			ps.setString(2, "giang4");
			ps.setString(3, "Dương Hoàng Giang");
			ps.setInt(4, 3);
			ps.setInt(5, 2);
			ps.setDate(6, new Date(2022, 12, 10));
			int result = ps.executeUpdate();
			System.out.println("Thêm mới thành công " + result + " bản ghi");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// Hàm update account
	private static void updateAccount(Connection con) {
		String sql = "UPDATE `Account` " +
				"SET Username  = ? " +
				"WHERE AccountID = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "giangggg");
			ps.setInt(2, 13);
			int result = ps.executeUpdate();
			System.out.println("Cập nhật thành công " + result + " bản ghi");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// Hàm delete account
	private static void deleteAccount(Connection con) {
		String sql = "DELETE FROM `Account` WHERE AccountID = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, 13);
			int result = ps.executeUpdate();
			System.out.println("Xoá thành công " + result + " bản ghi");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// Hàm lấy danh sách account
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
		}
		return accounts;
	}

}