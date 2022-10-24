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
		boolean resultValidate = Utils.validateDepartment("update", request);
		if (resultValidate) {
			int result = departmentRepository.updateDepartment(request);
			if (result > 0) {
				System.out.println("Chỉnh sửa dữ liệu thành công");
			} else {
				throw new RuntimeException("Không tìm thấy thông tin phòng ban với ID vừa nhập");
			}
		} else {
			throw new RuntimeException("Dữ liệu nhập vào không đúng vui lòng kiểm tra lại");
		}
	}

	@Override
	public void deleteDepartment(Department request) throws SQLException {
		boolean resultValidate = Utils.validateDepartment("delete", request);
		if (resultValidate) {
			int result = departmentRepository.deleteDepartment(request);
			if (result > 0) {
				System.out.println("Xoá dữ liệu thành công");
			} else {
				throw new RuntimeException("Không tìm thấy thông tin phòng ban với ID vừa nhập");
			}
		} else {
			throw new RuntimeException("Dữ liệu nhập vào không đúng vui lòng kiểm tra lại");
		}
	}

}