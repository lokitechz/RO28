package vn.com.vti.controller;

import vn.com.vti.entity.Department;
import vn.com.vti.service.DepartmentService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentController {

	private final DepartmentService departmentService;

	public DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public List<Department> getListDepartment() {
		List<Department> departments = new ArrayList<>();
		try {
			departments = departmentService.getListDepartment();
		} catch (RuntimeException | SQLException e) {
			System.out.println("Lấy danh sách account không thành công " + e.getMessage());
		}
		return departments;
	}

}
