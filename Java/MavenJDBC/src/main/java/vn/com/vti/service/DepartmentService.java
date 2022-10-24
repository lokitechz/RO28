package vn.com.vti.service;

import vn.com.vti.entity.Department;

import java.sql.SQLException;
import java.util.List;

public interface DepartmentService {

	List<Department> getListDepartment() throws SQLException;

	void creteDepartment(Department request) throws SQLException;

	void updateDepartment(Department request) throws SQLException;

	void deleteDepartment(Department request) throws SQLException;

}
