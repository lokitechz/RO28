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
				case 1:
					System.out.println("========== Danh sách phòng ban ==========");
					List<Department> departments = controller.getListDepartment();
					for (Department department : departments) {
						System.out.println(department);
					}
					break;

				case 2:
					System.out.print("Mời bạn nhập vào tên phòng bạn: ");
					Department requestCreate = new Department();
					String departmentName = ScannerUtils.inputString();
					requestCreate.setDepartmentName(departmentName);
					controller.creteDepartment(requestCreate);
					break;

				case 3:
					System.out.print("Mời bạn nhập vào ID phòng ban muốn chỉnh sửa: ");
					int idUpdate = ScannerUtils.inputInt();
					System.out.print("Mời bạn nhập vào tên mới của phòng ban: ");
					String newDepartmentName = ScannerUtils.inputString();
					Department requestUpdate = new Department();
					requestUpdate.setDepartmentId(idUpdate);
					requestUpdate.setDepartmentName(newDepartmentName);
					controller.updateDepartment(requestUpdate);
					break;

				case 4:
					System.out.print("Mời bạn nhập vào ID phòng ban muốn chỉnh sửa: ");
					int idDelete = ScannerUtils.inputInt();
					Department requestDelete = new Department();
					requestDelete.setDepartmentId(idDelete);
					controller.deleteDepartment(requestDelete);
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