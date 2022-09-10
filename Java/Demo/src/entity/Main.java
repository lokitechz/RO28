package entity;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Question 8: Viết chương trình thực hiện theo flow");
		Scanner sc = new Scanner(System.in); // Khởi tạo 1 đối tượng cho phép lấy dữ liệu người dùng nhập vào
		// Giá trị lưu chữ sự lựa chọn từ người đùng
		int inputFromUser;
		while (true) {
			System.out.println("Mời bạn chọn chức năng:" + "\n"
					                   + "1. Tạo Account."
					                   + "\n" + "2. Tạo Department");
			// Quyết
			inputFromUser = sc.nextInt();
			if (inputFromUser == 1 || inputFromUser == 2) {
				switch (inputFromUser) {
					case 1:
						createAccount();
						break;
					case 2:
						createDepartment();
						break;
				}
				return;
			} else {
				System.out.println("Số bạn vừa chọn không đúng: ");
			}
		}
	}

	// Phương thức không trả về dữ liệu
	public static void createAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào thông tin account cân tạo");
		Account acc = new Account();
		System.out.println("Nhập ID: ");
		acc.id = sc.nextInt();
		System.out.println("Nhập email: ");
		acc.email = sc.next();
		System.out.println("Nhập userName: ");
		acc.userName = sc.next();
		System.out.println("Nhập fullName: ");
		acc.fullName = sc.next();
		System.out.println("Nhập position (Nhập các số từ 1 đến 4 tương ứng với:1.Dev, 2. Test, 3. Scrum_Master, 4. PM):");
		int posNum = sc.nextInt();

		switch (posNum) {
			case 1:
				Position pos1 = new Position();
				pos1.name = Position.PositionName.Dev;
				acc.position = pos1;
				break;
			case 2:
				Position pos2 = new Position();
				pos2.name = Position.PositionName.Test;
				acc.position = pos2;
				break;
			case 3:
				Position pos3 = new Position();
				pos3.name = Position.PositionName.Scrum_Master;
				acc.position = pos3;
				break;
			case 4:
				Position pos4 = new Position();
				pos4.name = Position.PositionName.PM;
				acc.position = pos4;
				break;
		}
		System.out.println(acc);
	}

	private static void createDepartment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào thông tin Department cân tạo");
		Department department = new Department();
		System.out.print("Nhập ID: ");
		department.id = sc.nextInt();
		System.out.print("Nhập Name: ");
		department.name = sc.next();
		System.out.println(department);
	}

}
