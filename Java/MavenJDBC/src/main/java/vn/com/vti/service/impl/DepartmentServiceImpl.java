package vn.com.vti.service.impl;

import vn.com.vti.entity.Department;
import vn.com.vti.repository.DepartmentRepository;
import vn.com.vti.service.DepartmentService;
import vn.com.vti.utils.Utils;

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

	@Override
	public void updateDepartment(Department request) throws SQLException {
		String resultValidate = Utils.validateDepartment("update", request);
		if (resultValidate.isEmpty()) {
			int result = departmentRepository.updateDepartment(request);
			if (result > 0) {
				System.out.println("Thêm mới dữ liệu thành công");
			} else {
				System.err.println("Không tìm thấy thông tin bản ghi bạn muốn chỉnh sửa");
			}
		} else {
			throw new RuntimeException(resultValidate);
		}
	}

}
