import entity.Account;
import entity.Department;
import entity.Position;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Khởi tạo 1 đối tượng cho phép lấy dữ liệu người dùng nhập vào
		Scanner sc = new Scanner(System.in);
		int choiceNumber;
		boolean exit = false;
		do {
			showMenu();
			choiceNumber = sc.nextInt();
			switch (choiceNumber) {
				case 1:
					createAccount();
					break;

				case 2:
					createDepartment();
					break;

				case 3:
					exit = true;
					break;

				default:
					System.out.println("Bạn đã chọn sai chức năng mời bạn chạy lại chương trình và chọn lại các chức năng 1/2/3");
					break;
			}
		} while (!exit);
	}

	private static void showMenu() {
		System.out.println("+---------------------------------------------------+");
		System.out.println("1.Tạo account");
		System.out.println("2.Tạo phòng ban");
		System.out.println("3.Kết thúc");
		System.out.println("+---------------------------------------------------+");
		System.out.print("Hãy nhập vào sự lựa chọn của bạn: ");
	}

	private static void createAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào thông tin account cần tạo");
		Account acc = new Account();
		System.out.println("Nhập id: ");
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
		// Add account vaof 1 danhs
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