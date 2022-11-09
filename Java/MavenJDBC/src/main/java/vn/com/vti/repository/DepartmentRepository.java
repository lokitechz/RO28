package vn.com.vti.repository;

import vn.com.vti.entity.Department;
import vn.com.vti.utils.DatabaseUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository {

	// Khai báo đối tượng Connection để kết nối đến CSDL
	private final Connection con = DatabaseUtils.getInstance().getDatabaseConnection();

	/**
	 * Tương tác với database trả về danh sách Account
	 *
	 * @return List<Department> - Danh sách phòng ban
	 * @throws SQLException - Lỗi
	 */
	public List<Department> getListDepartment() throws SQLException {
		List<Department> departments = new ArrayList<>();
		// Khai báo câu lệnh SQL muốn thực thi
		String sql = "SELECT * FROM `Department` ORDER BY `DepartmentID`";
		// B2: Khai báo đối tượng Statement tạo 1 câu lệnh gửi đến CSDL
		Statement st = con.createStatement();
		// B3: Khai báo đối tượng để nhận về kết quả thực thi của câu SQL
		// Và trả về danh sách đối tượng trong
		ResultSet rs = st.executeQuery(sql);
		con.commit();
		// B4: Xử lý kết quả trả về
		while (rs.next()) {
			Department department = new Department();
			department.setDepartmentId(rs.getInt(1));
			department.setDepartmentName(rs.getString(2));
			departments.add(department);
		}
		return departments;
	}

	public int creteDepartment(Department request) throws SQLException {
		String sql = "INSERT INTO `Department`(DepartmentName) VALUES (?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, request.getDepartmentName());
		int result = ps.executeUpdate();
		con.commit();
		return result;
	}

	public int updateDepartment(Department request) throws SQLException {
		String sql = "UPDATE `Department` SET `DepartmentName` = ? WHERE `DepartmentId` = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, request.getDepartmentName());
		ps.setInt(2, request.getDepartmentId());
		int result = ps.executeUpdate();
		con.commit();
		return result;
	}

	public int deleteDepartment(Department request) throws SQLException {
		String sql = "DELETE FROM `Department` WHERE `DepartmentId` = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, request.getDepartmentId());
		int result = ps.executeUpdate();
		con.commit();
		return result;
	}

}
