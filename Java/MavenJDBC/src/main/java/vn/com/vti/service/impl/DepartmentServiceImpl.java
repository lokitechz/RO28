package vn.com.vti.service.impl;

import vn.com.vti.entity.Department;
import vn.com.vti.repository.DepartmentRepository;
import vn.com.vti.service.DepartmentService;

import java.sql.SQLException;
import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {

	private final DepartmentRepository departmentRepository;

	public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}

	@Override
	public List<Department> getListDepartment() throws SQLException {
		return departmentRepository.getListDepartment();
	}

	@Override
	public void creteDepartment(Department request) throws SQLException {
		int result = departmentRepository.creteDepartment(request);
		if (result > 0) {
			System.out.println("Thêm mới dữ liệu thành công");
		} else {
			System.out.println("Thêm mới thất bại");
		}
	}

}
