package org.example.repository;

import org.example.entity.Account;
import org.example.utils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Tầng repository chứa tương tác đến database
 */
public class AccountRepository {

	// Khai báo đối tượng Connection để kết nối đến CSDL
	private final Connection con = JDBCUtils.getDatabaseConnection();

	public List<Account> getAccounts() throws SQLException {
		List<Account> accounts = new ArrayList<>();
		// Khai báo câu lệnh SQL muốn thực thi
		String sql = "SELECT * FROM `Account`";
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
			accounts.add(account);
		}
		return accounts;
	}

	public Account createAccount(Account request) throws SQLException {
		String sql = "INSERT INTO `Account` (Email,Username,FullName,DepartmentID,PositionID,CreateDate) " +
				"VALUES (?,?,?,?,?,?)";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, request.getEmail());
		ps.setString(2, request.getUserName());
		ps.setString(3, request.getFullName());
		ps.setInt(4, request.getDepartmentId());
		ps.setInt(5, request.getPositionId());
		ps.setDate(6, request.getCreateDate());
		int result = ps.executeUpdate();
		System.out.println("Thêm mới thành công " + result + " bản ghi");
		return request;
	}


}
