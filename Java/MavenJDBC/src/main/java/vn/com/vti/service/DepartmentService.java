package vn.com.vti.service;

import vn.com.vti.entity.Department;

import java.sql.SQLException;
import java.util.List;

public interface DepartmentService {

	List<Department> getListDepartment() throws SQLException;

}
