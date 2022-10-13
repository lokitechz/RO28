package org.example.repository;

import org.example.entity.Account;
import org.example.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Class chứa tương tác đến database
 */
public class AccountRepository {

	public Account createAccount(Account request) throws SQLException {
		String sql = "INSERT INTO `Account` (Email,Username,FullName,DepartmentID,PositionID,CreateDate) " +
				"VALUES (?,?,?,?,?,?)";
		Connection con = JDBCUtils.getDatabaseConnection();
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
