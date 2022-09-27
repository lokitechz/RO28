package backend;

import entity.Person;
import entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Excercise {

	// Biến lưu trữ đối tượng scanner để quét dữ liệu từ bàn phím
	private final Scanner sc;

	// Biến lưu trữ danh sách học sinh
	private final List<Student> students;

	public Excercise() {
		this.sc = new Scanner(System.in);
		this.students = new ArrayList<>();
	}

	public void loadMenu() {
		while (true) {
			System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng===================");
			System.out.println("1. Thêm mới student.");
			System.out.println("2. Hiển thị student.");
			System.out.println("3. Exit.");
			System.out.println("=======================================================================");
			System.out.print("Hãy nhập vào sự lựa chọn của bạn: ");
			try {
				// Trong trường hợp giá trị nhập vào không phải là số
				int menuChoose = Integer.parseInt(sc.nextLine());
				switch (menuChoose) {
					case 1:
						System.out.print("Mời bạn nhập vào số sinh viên muốn thêm: ");
						int number = Integer.parseInt(sc.nextLine());
						for (int i = 0; i < number; i++) {
							addStudent(i + 1);
						}
						break;

					case 2:
						showInformation();
						break;

					case 3:
						System.exit(0);
						return;

					default:
						System.out.println("Bạn đã chọn sai chức năng mời bạn chạy lại chương trình và chọn lại các chức năng từ 1 đến 3");
						break;
				}
			} catch (Exception e) {
				// In ra nguyên nhân lỗi
				System.out.println("Nguyên nhân lỗi là: " + e.getMessage());
				// In ra thông báo nếu sự lựa chọn không phải là số
				System.out.println("Lựa chọn bạn vừa nhập không phải là số vui lòng nhập lại");
			}
		}
	}

	// Phương thức nhập thông tin sinh viên
	public void addStudent(int i) {
		try {
			// Thực hiện cho phép người dùng nhập vào thông tin của sinh viên
			System.out.println("Hãy nhập thông tin học sinh thứ " + i);
			System.out.println("Nhập vào họ và tên:");
			String fullName = sc.nextLine();
			System.out.println("Nhập vào tuổi:");
			int age = Integer.parseInt(sc.nextLine());
			System.out.println("Nhập vào giới tính 1.Male, 2.Female, 3.Unknown");
			int flagGender = Integer.parseInt(sc.nextLine());
			Person.Gender gender;
			switch (flagGender) {
				case 1:
					gender = Person.Gender.MALE;
					break;
				case 2:
					gender = Person.Gender.FEMALE;
					break;
				default:
					gender = Person.Gender.UNKNOWN;
					break;
			}
			System.out.println("Nhập vào địa chỉ:");
			String address = sc.nextLine();
			System.out.println("Nhập vào chuyên nghành học:");
			String major = sc.nextLine();
			Student student = new Student(fullName, age, gender, address, major);
			students.add(student);
		} catch (Exception e) {
			System.out.println("Nguyên nhân lỗi là : " + e.getMessage());
			// Nếu xảy ra lỗi thì hiển thị thông báo
			System.out.println("Bạn đã nhập sai thông tin mời bạn nhập lại");
		}
	}

	// Phương thức hiển thị thông tin
	public void showInformation() {
		for (Student student : students) {
			if (student.getAddress().contains("Hà Nội")
					|| student.getAddress().contains("Nhật Bản")) {
				System.out.println(student);
			}
		}
	}

}
