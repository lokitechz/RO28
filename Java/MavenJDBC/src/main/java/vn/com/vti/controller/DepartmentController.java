package vn.com.vti.controller;

import vn.com.vti.entity.Department;
import vn.com.vti.service.DepartmentService;

import java.util.ArrayList;
import java.util.List;

public class DepartmentController {

	private final DepartmentService departmentService;

	public DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	/**
	 * Description -
	 *
	 * @return List<Department> - Danh sách phòng ban
	 * @author - giangdh
	 * @created - 22/10/2022
	 */
	public List<Department> getListDepartment() {
		List<Department> departments = new ArrayList<>();
		try {
			departments = departmentService.getListDepartment();
		} catch (Exception e) {
			System.out.println("Lấy danh sách account không thành công " + e.getMessage());
		}
		return departments;
	}

	public void creteDepartment(Department request) {
		try {
			departmentService.creteDepartment(request);
		} catch (Exception e) {
			System.out.println("Tạo mới phòng ban không thành công! " + e.getMessage());
		}
	}

	public void updateDepartment(Department request) {
		try {
			departmentService.updateDepartment(request);
		} catch (Exception e) {
			System.out.println("Chỉnh sửa phòng không thành công! " + e.getMessage());
		}
	}

	public void deleteDepartment(Department request) {
		try {
			departmentService.deleteDepartment(request);
		} catch (Exception e) {
			System.out.println("Xoá phòng không thành công! " + e.getMessage());
		}
	}

}
