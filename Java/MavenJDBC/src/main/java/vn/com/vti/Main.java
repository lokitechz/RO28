package vn.com.vti;

import vn.com.vti.controller.DepartmentController;
import vn.com.vti.entity.Department;
import vn.com.vti.repository.DepartmentRepository;
import vn.com.vti.service.impl.DepartmentServiceImpl;
import vn.com.vti.utils.ScannerUtils;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		DepartmentRepository repository = new DepartmentRepository();
		DepartmentServiceImpl service = new DepartmentServiceImpl(repository);
		DepartmentController controller = new DepartmentController(service);
		boolean exit = false;
		do {
			showMenu();
			// Lưu chữ sự lựa chọn
			int choice = ScannerUtils.inputInt();
			switch (choice) {
				// Hiển thị danh sách nhân viên
				case 1:
					System.out.println("====== Danh sách phòng ban =====");
					List<Department> departments = controller.getListDepartment();
					for (Department department : departments) {
						System.out.println(department);
					}
					break;

				// Thêm mới account
				case 2:
					break;

				// Chỉnh sửa thông tin của account dựa vào ID
				case 3:
					break;

				// Xoá 1 account dựa vào ID
				case 4:
					break;

				case 5:
					// Gán trạng thái của trương chình là thoát
					exit = true;
					break;

				default:
					System.out.println("Bạn đã chọn sai chức năng mời bạn chạy lại chương trình và chọn lại các chức năng từ 1 đến 5");
					break;
			}
		} while (!exit);
	}

	public static void showMenu() {
		System.out.println("+---------------------------------------------------+");
		System.out.println("1.Hiển thị danh sách phòng ban");
		System.out.println("2.Thêm mới phòng ban");
		System.out.println("3.Chỉnh sửa thông tin phòng ban");
		System.out.println("4.Xoá phòng ban");
		System.out.println("+---------------------------------------------------+");
		System.out.print("Hãy nhập vào sự lựa chọn của bạn: ");
	}

}