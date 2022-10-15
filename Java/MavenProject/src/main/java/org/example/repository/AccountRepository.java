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

	/**
	 * Tương tác với database trả về danh sách Account
	 *
	 * @return List<Account> - Danh sách Account
	 * @throws SQLException - Lỗi
	 */
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

	/**
	 * Tương tác với database trả về thông tin của 1 Account dựa vào accountId
	 *
	 * @param accountId - ID của Account
	 * @return Account - Thông tin của Account đó
	 * @throws SQLException - Lỗi
	 */
	public Account getAccountByID(int accountId) throws SQLException {
		Account account = new Account();
		String sql = "SELECT * FROM `Account` WHERE AccountID = " + accountId;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			account.setAccountId(rs.getInt("AccountID"));
			account.setEmail(rs.getString("Email"));
			account.setUserName(rs.getString("Username"));
			account.setFullName(rs.getString("FullName"));
			account.setDepartmentId(rs.getInt("DepartmentID"));
			account.setPositionId(rs.getInt("PositionID"));
			account.setCreateDate(rs.getDate("CreateDate"));
		}
		return account;
	}

	public void createAccount(Account request) throws SQLException {
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
		if (result != 0) {
			System.out.println("Thêm mới thành công " + result + " bản ghi");
		}
	}

	public void updateAccount(Account request) throws SQLException {
		String sql = "UPDATE `Account` " +
				"SET Email = ?, Username = ?, FullName = ?, DepartmentID = ?, PositionID = ? " +
				"WHERE AccountID = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, request.getEmail());
		ps.setString(2, request.getUserName());
		ps.setString(3, request.getFullName());
		ps.setInt(4, request.getDepartmentId());
		ps.setInt(5, request.getPositionId());
		ps.setInt(6, request.getAccountId());
		ps.executeUpdate();
	}

	public void deleteAccount(int accountId) throws SQLException {
		String sql = "DELETE FROM `Account` WHERE AccountID = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, accountId);
		ps.executeUpdate();
	}
}
