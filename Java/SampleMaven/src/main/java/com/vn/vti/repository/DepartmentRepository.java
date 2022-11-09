package com.vn.vti.repository;

import com.vn.vti.entity.Department;
import com.vn.vti.util.DatabaseUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Description: Class đảm nhận nhiệm vụ tương tác với bảng Department trong CSDL
 */
public class DepartmentRepository {

	// Khai báo đối tượng Connection để kết nối đến CSDL
	private final Connection con = DatabaseUtil.getInstance().getDatabaseConnection();

	public List<Department> getListDepartment() throws SQLException {
		// Danh sách phòng ban rỗng
		List<Department> departments = new ArrayList<>();
		// Khai báo câu lệnh SQL muốn thực thi
		String sql = "SELECT * FROM `Department` ORDER BY `DepartmentID`";
		// B2: Khai báo đối tượng Statement tạo 1 câu lệnh gửi đến CSDL
		Statement st = con.createStatement();
		// B3: Khai báo đối tượng ResultSet để nhận về kết quả thực thi của câu SQL
		// ResultSet là kết quả từ DB trả về
		ResultSet rs = st.executeQuery(sql);
		// B4: Xử lý kết quả trả về convert sang đối tượng Department để hiển thị
		while (rs.next()) {
			Department department = new Department();
			department.setDepartmentId(rs.getInt(1));
			department.setDepartmentName(rs.getString(2));
			departments.add(department);
		}
		return departments;
	}

}
