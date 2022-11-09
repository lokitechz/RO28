package com.vn.vti.service;

import com.vn.vti.entity.Department;
import com.vn.vti.repository.DepartmentRepository;

import java.sql.SQLException;
import java.util.List;

/**
 * Description: Class đảm nhận nhiệm vụ triển khai logic của phần mềm
 */
public class DepartmentServiceImpl implements IDepartmentService {

	private final DepartmentRepository departmentRepository;

	public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}

	@Override
	public List<Department> getListDepartment() throws SQLException {
		List<Department> departments = departmentRepository.getListDepartment();
		departments.removeIf(department -> department.getDepartmentName().equalsIgnoreCase("Phòng ban test"));
		return departments;
	}

}
