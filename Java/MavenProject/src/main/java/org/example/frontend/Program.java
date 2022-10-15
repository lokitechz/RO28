package org.example.frontend;

import org.example.controller.AccountController;
import org.example.entity.Account;
import org.example.repository.AccountRepository;
import org.example.service.impl.AccountServiceImpl;
import org.example.utils.ScannerUtils;
import org.example.utils.Utils;

import java.util.List;

public class Program {

	public static void main(String[] args) {
		AccountRepository repository = new AccountRepository();
		AccountServiceImpl service = new AccountServiceImpl(repository);
		AccountController controller = new AccountController(service);
		boolean exit = false;
		do {
			showMenu();
			// Lưu chữ sự lựa chọn
			int choice = ScannerUtils.inputInt();
			switch (choice) {
				// Hiển thị danh sách nhân viên
				case 1:
					System.out.println("====== Danh sách account =====");
					List<Account> accounts = controller.getAccounts();
					for (Account account : accounts) {
						System.out.println(account);
					}
					break;

				// Thêm mới account
				case 2:
					Account requestCreate = Utils.inputAccountInfo();
					controller.createAccount(requestCreate);
					break;

				// Chỉnh sửa thông tin của account dựa vào ID
				case 3:
					System.out.print("Mời bạn nhập vào accountId muốn chỉnh sửa: ");
					int accountIdUpdate = ScannerUtils.inputInt();
					controller.updateAccount(accountIdUpdate);
					break;

				// Xoá 1 account dựa vào ID
				case 4:
					System.out.print("Mời bạn nhập vào accountId muốn xoá: ");
					int accountIdDelete = ScannerUtils.inputInt();
					controller.deleteAccount(accountIdDelete);
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
		System.out.println("1.Hiển thị danh sách nhân viên");
		System.out.println("2.Thêm mới nhân viên");
		System.out.println("3.Sửa thông tin nhân viên");
		System.out.println("4.Xoá thông tin nhân viên");
		System.out.println("+---------------------------------------------------+");
		System.out.print("Hãy nhập vào sự lựa chọn của bạn: ");
	}


}
