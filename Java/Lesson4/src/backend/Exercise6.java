package backend;

import entity.VietnamesePhone;

import java.util.Scanner;

public class Exercise6 {
	private final Scanner sc;

	public Exercise6() {
		sc = new Scanner(System.in);
	}

	public void question1() {
		loadmenuAbstract();
	}

	private void loadmenuAbstract() {
		VietnamesePhone vnPhone = new VietnamesePhone();
		while (true) {
			System.out.println("====================");
			System.out.println("Lựa chọn chức năng bạn muốn sử dụng");
			System.out.println("1. Insert Contact");
			System.out.println("2. Remove Contact");
			System.out.println("3. Update Contact");
			System.out.println("4. Search Contact");
			System.out.println("5. Show Contact");
			System.out.println("6. Exit");
			System.out.println("====================");
			System.out.print("Hãy nhập vào sự lựa chọn của bạn: ");

			int menuChoose = sc.nextInt();
			switch (menuChoose) {
				case 1:
					System.out.print("Nhập vào tên tên: ");
					String name = sc.next();
					System.out.print("Nhập vào tên số điện thoại: ");
					String phone = sc.next();
					vnPhone.insertContact(name, phone);
					break;

				case 2:
					System.out.print("Nhập vào tên Contact cần remove: ");
					String removeName = sc.next();
					vnPhone.removeContact(removeName);
					break;

				case 3:
					System.out.print("Nhập tên cần Update: ");
					String name1 = sc.next();
					System.out.print("Nhập số Phone mới: ");
					String newPhone = sc.next();
					vnPhone.updateContact(name1, newPhone);
					System.out.print("Kết quả: ");
					vnPhone.searchContact(name1);
					break;

				case 4:
					System.out.print("Nhập vào tên Contact cần tìm kiếm: ");
					String searchName = sc.next();
					vnPhone.searchContact(searchName);
					break;

				case 5:
					System.out.println("Danh sách Contact");
					vnPhone.showContact();
					break;

				case 6:
					System.exit(0);
					return;

				default:
					System.out.println("Alarm: Lựa chọn đúng số trên menu");
					break;
			}
		}
	}

}
