package com.vn.vti.controller;

import com.vn.vti.entity.Department;
import com.vn.vti.service.IDepartmentService;

import java.util.ArrayList;
import java.util.List;

public class DepartmentController {

	private final IDepartmentService departmentService;

	public DepartmentController(IDepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public List<Department> getListDepartment() {
		List<Department> departments = new ArrayList<>();
		try {
			departments = departmentService.getListDepartment();
		} catch (Exception e) {
			System.out.println("Lấy danh sách phòng ban không thành công " + e.getMessage());
		}
		return departments;
	}

}
