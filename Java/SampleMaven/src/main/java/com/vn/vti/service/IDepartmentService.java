package com.vn.vti.service;

import com.vn.vti.entity.Department;

import java.sql.SQLException;
import java.util.List;

public interface IDepartmentService {

	List<Department> getListDepartment() throws SQLException;

}
