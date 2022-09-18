package backend;

import entity.Employee;
import entity.Engineer;
import entity.Staff;
import entity.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Nơi chữa toàn bộ xử lý cho bài tập số 5
public class Exercise5 {

	// Biến lưu trữ danh sách nhân viên
	private static final List<Staff> staffs = new ArrayList<>();

	private static final Scanner sc = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("+---------------------------------------------------+");
		System.out.println("1.Thêm mới nhân viên");
		System.out.println("2.Tìm kiếm nhân viên theo họ tên");
		System.out.println("3.Hiển thị danh sách nhân viên");
		System.out.println("4.Xoá nhân viên theo tên nhập vào");
		System.out.println("5.Thoát chương trình");
		System.out.println("+---------------------------------------------------+");
		System.out.print("Hãy nhập vào sự lựa chọn của bạn: ");
	}

	// Hàm thêm mới nhân viên
	public static void addStaff() {
		System.out.println("+------- Lựa chọn chức năng bạn muốn sử dụng -------+");
		System.out.println("1.Thêm Worker");
		System.out.println("2.Thêm Engineer");
		System.out.println("3.Thêm Employee");
		System.out.print("Hãy nhập vào sự lựa chọn của bạn: ");
		// Biến lưu trữ sự lựa chọn từ người dùng
		int choice = Integer.parseInt(sc.nextLine());
		// Nhập các thông tin chung của nhân viên bao gồm name, age, gender, address
		System.out.println("Nhập vào tên: ");
		String name = sc.nextLine();
		System.out.println("Nhập vào tuổi: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập vào giới tính Worker 1.Male, 2.Female, 3.Unknown");
		int flagGender = Integer.parseInt(sc.nextLine());
		Staff.Gender gender;
		switch (flagGender) {
			case 1:
				gender = Staff.Gender.MALE;
				break;
			case 2:
				gender = Staff.Gender.FEMALE;
				break;

			default:
				gender = Staff.Gender.UNKNOWN;
				break;
		}
		System.out.println("Nhập vào địa chỉ: ");
		String addressWorker = sc.nextLine();
		// Tuỳ biến vào sự lựa chọn của người dùng
		switch (choice) {
			// Tạo Worker nếu chọn 1
			case 1:
				System.out.println("Nhập vào bậc: ");
				int rank = Integer.parseInt(sc.nextLine());
				Staff worker = new Worker(name, age, gender, addressWorker, rank);
				staffs.add(worker);
				break;
			// Tạo Engineer nếu chọn 2
			case 2:
				System.out.println("Nhập vào chuyên nghành: ");
				String specialized = sc.next();
				Staff engineer = new Engineer(name, age, gender, addressWorker, specialized);
				staffs.add(engineer);
				break;
			// Tạo Engineer nếu chọn 3
			case 3:
				System.out.println("Nhập vào nhiệm vụ: ");
				String task = sc.next();
				Staff employee = new Employee(name, age, gender, addressWorker, task);
				staffs.add(employee);
				break;

			default:
				System.out.println("Bạn đã chọn sai chức năng mời bạn chạy lại chương trình và chọn lại các chức năng từ 1 đến 3");
				break;
		}
	}

	// Hàm tìm kiếm nhân viên theo tên
	public static void searchByName() {
		System.out.println("Nhập vào tên bạn muốn tìm kiêm");
		String name = sc.nextLine();
		for (Staff staff : staffs) {
			if (name.equalsIgnoreCase(staff.getName())) {
				System.out.println(staff);
				return;
			} else {
				System.out.println("Không tìm thấy thông tin nhân viên với tên này");
			}
		}
	}

	// Hàm hiển thị danh sách nhân viên
	public static void showListStaff() {
		System.out.println("+------- Danh sách nhân viên -------+");
		for (Staff staff : staffs) {
			System.out.println(staff);
		}
	}

	public static void deleteByName() {
		System.out.println("Nhập vào tên bạn muốn tìm kiêm");
		String name = sc.nextLine();
		for (Staff staff : staffs) {
			if (name.equalsIgnoreCase(staff.getName())) {
				staffs.remove(staff);
			} else {
				System.out.println("Không tìm thấy thông tin nhân viên với tên này");
			}
		}
	}

}
