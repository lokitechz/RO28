package backend;

import entity.Student2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1_ASM8 {

	private static Scanner scanner = new Scanner(System.in);
	private List<Student2> students;

	public Exercise1_ASM8() {
		// Danh sách sinh viên rỗng
		students = new ArrayList<>();
		System.out.print("Nhập số lượng sinh viên muốn thêm: ");
		int num = scanner.nextInt();
		// Sử dụng vòng for thêm số lượng sinh viên đã nhập vào
		for (int i = 0; i < num; i++) {
			Student2 student = new Student2("Student " + (i + 1));
			// Thêm sinh viên vào trong danh sách sinh viên
			students.add(student);
		}
		// In ra kết quả
		System.out.println("Thành công thêm " + num + " vào danh sách");
	}

	public void question1() {
		Scanner sc = new Scanner(System.in);
		// Thực hiện vòng lặp với từng lựa chọn từ người dùng
		while (true) {
			loadMenu();
			System.out.print("Hãy nhập vào sự lựa chọn của bạn: ");
			int chose = sc.nextInt();
			switch (chose) {
				case 1:
					System.out.println("Tổng số các sinh viên là: " + students.size());
					break;

				case 2:
					System.out.println("Phần tử thứ 4 là: " + students.get(3));
					break;

				case 3:
					System.out.println("Phần tử đầu là: " + students.get(0));
					System.out.println("Phần tử cuối là: " + students.get(students.size() - 1));
					break;

				case 4:
					int choseCase4 = choseSubMenu4();
					switch (choseCase4) {
						// Thêm vào vị trí đầu của danh sách
						case 1:
							students.add(0, new Student2("Thêm vào đầu"));
							break;
						// Thêm vào vị trí cuối của danh sách
						case 2:
							students.add(new Student2("Thêm vào cuối"));
							break;
					}
					break;

//				case 5:
//					System.out.println("Nhập tên của sinh viên cần
//
//					                   thêm");
//
//					                   String name5 = ScannerUltis.inputString();
//					listStudent.add(new Student(name5));
//					printStudent();
//					break;
//				case 6:
//					Collections.reverse(listStudent);
//					System.out.println("Đã đảo ngược vị trí ");
//					printStudent();
//					break;
//				case 7:
//					System.out.println("Nhập vào ID cần tìm kiếm:");
//					int id7 = ScannerUltis.inputIntPositive();
//					for (Student student : listStudent) {
//						if (student.getId() == id7) {
//							System.out.println(student);
//						}
//					}
//					break;
//				case 8:
//					System.out.println("Nhập vào name cần tìm kiếm:");
//					String name8 = ScannerUltis.inputString();
//					for (Student student : listStudent) {
//						if (student.getName().equals(name8)) {
//							System.out.println(student);
//						}
//					}
//					break;
//				case 9:
//					System.out.println("Các sinh viên trùng tên: ");
//					for (int i = 0; i < listStudent.size(); i++) {
//						for (int j = i + 1; j < listStudent.size();
//
//						     j++) {
//
//							if
//
//							(listStudent.get(i).getName().equals(listStudent.get(j).getName())) {
//								System.out.println(listStudent.get(i).toString());
//
//							}
//						}
//					}
//					break;
//				case 10:
//					System.out.println("Nhập vào ID cần xóa tên:");
//					int id10 = ScannerUltis.inputIntPositive();
//					for (Student student : listStudent) {
//						if (student.getId() == id10) {
//							student.setName(null);
//						}
//
//					}
//					printStudent();
//					break;
//				case 11:
//					System.out.println("Nhập vào ID của student cần
//
//					                   xóa:");
//
//					int id11 = ScannerUltis.inputIntPositive();
//					listStudent.removeIf(student -> student.getId() ==
//
//							id11);
//
//					printStudent();
//					break;
//				case 12:
//					System.out.println("Tạo mới ArrayCopy:");
//					List<Student> arrayCopy = new ArrayList<Student>();
//					arrayCopy.addAll(listStudent);
//					System.out.println("In phần tử trong ArrayCopy: ");
//					for (Student student : arrayCopy) {
//						System.out.println(student);
//					}
//					break;
//				case 13:
//					return;

				default:
					System.out.println("Hãy chọn đúng menu");
					break;
			}
		}
	}

	private void loadMenu() {
		System.out.println("---------- MENU ----------");
		System.out.println("--- 1.In ra tổng số phần tử của students ---");
		System.out.println("--- 2.Lấy phần tử thứ 4 của students ---");
		System.out.println("--- 3.In ra phần tử đầu và phần tử cuối của students ---");
		System.out.println("--- 4.Thêm 1 phần tử vào vị trí đầu hoặc cuối của students ---");
		System.out.println("--- 5.Thêm 1 phần tử vào vị trí cuối của students ---");
		System.out.println("--- 6.Đảo ngược vị trí của students ---");
		System.out.println("--- 7.Tạo 1 method tìm kiếm student theo id ---");
		System.out.println("--- 8.Tạo 1 method tìm kiếm student theo name ---");
		System.out.println("--- 9.Tạo 1 method để in ra các student có trùng tên ---");
		System.out.println("--- 10.Xóa name của student có id = 2---");
		System.out.println("--- 11.Delete student có id = 5 ---");
		System.out.println("--- 12.Tạo 1 ArrayList tên là studentCopies và add tất cả students vào studentCopies ---");
		System.out.println("--- 13.Exit ---");
		System.out.println("------------ END MENU ----------");
	}

	private int choseSubMenu4() {
		System.out.print("Chọn 1.Thêm vào đầu, 2.Thêm vào cuối");
		while (true) {
			int chose = scanner.nextInt();
			switch (chose) {
				case 1:
				case 2:
					return chose;

				default:
					System.out.println("Chọn lại: ");
			}
		}
	}

}
