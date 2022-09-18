import entity.Account;
import entity.Department;
import entity.Group;
import entity.Position;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// Tạo Department
		Department dep1 = new Department();
		dep1.setId(1);
		dep1.setName("Marketing");

		Department dep2 = new Department();
//		dep2.id = 2;
//		dep2.name = "Sale";

		Department dep3 = new Department();
//		dep3.id = 3;
//		dep3.name = "BOD";

		// Tạo Position
		Position pos1 = new Position();
		pos1.id = 1;
		pos1.name = Position.PositionName.Dev;

		Position pos2 = new Position();
		pos2.id = 2;
		pos2.name = Position.PositionName.PM;

		Position pos3 = new Position();
		pos3.id = 3;
		pos3.name = Position.PositionName.Scrum_Master;

		// Tạo Group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Testing System";
		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Development";
		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Sale";

		// Tạo Account
		Account acc1 = new Account();
//		acc1.id = 1;
		acc1.email = "daonq1";
		acc1.userName = "daonq1";
		acc1.fullName = "Dao Nguyen 1";
		acc1.department = dep1;
		acc1.position = pos1;
		acc1.createDate = LocalDate.now();
		acc1.groups = new Group[]{group1, group2};

		Account acc2 = new Account();
//		acc2.id = 2;
		acc2.email = "daonq2";
		acc2.userName = "daonq2";
		acc2.fullName = "Dao Nguyen 2";
		acc2.department = dep2;
		acc2.position = pos2;
		acc2.createDate = LocalDate.of(2021, 03, 17);
		acc2.groups = new Group[]{group2, group3};

		Account acc3 = new Account();
//		acc3.id = 3;
		acc3.email = "daonq3";
		acc3.userName = "daonq3";
		acc3.fullName = "Dao Nguyen 3";
		acc3.department = dep3;
		acc3.position = pos3;
		acc3.createDate = LocalDate.now();
		acc2.groups = new Group[]{group1, group3};

		System.out.println("---------- Question 1 ----------");
		if (acc2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là " + acc2.department.getName());
		}
		System.out.print("\n");
		System.out.println("---------- Question 2 ----------");
		if (acc2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else {
			int countGroup = acc2.groups.length; // Đếm số lượng group mà nhân viên 2 đang tham gia
			if (countGroup == 1 || countGroup == 2) {
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			}
			if (countGroup == 3) {
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			}
			if (countGroup >= 4) {
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			}
		}
		System.out.print("\n");
		System.out.println("---------- Question 3 ----------");
		System.out.println(acc2.department == null
		                   ? "Nhân viên này chưa có phòng ban."
		                   : "Phòng của nhân viên này là: " + acc2.department.getName());
		System.out.print("\n");
		System.out.println("---------- Question 4 ----------");
		System.out.println(acc1.position.name.toString().equalsIgnoreCase("Dev")
		                   ? "Đây là Developer"
		                   : "Người này không phải là Developer");
		System.out.print("\n");
		System.out.println("---------- Question 5 ----------");
		if (group1.accounts == null) {
			System.out.println("Group chưa có thành viên nào tham gia");
		} else {
			// Số lượng account trong 1 group
			int countAccount = group1.accounts.length;
			switch (countAccount) {
				case 1:
					System.out.println("Nhóm có một thành viên");
					break;
				case 2:
					System.out.println("Nhóm có hai thành viên");
					break;
				case 3:
					System.out.println("Nhóm có ba thành viên");
					break;
				default:
					System.out.println("Nhóm có nhiều thành viên");
					break;
			}
		}

		// Khởi tạo danh sách account và thêm 3 acc vào trong danh sách
		List<Account> accounts = new ArrayList<>();
		accounts.add(acc1);
		accounts.add(acc2);
		accounts.add(acc3);
		System.out.println("Sử dụng for each");
		// Sử dụng for-each
		for (Account account : accounts) {
			System.out.println(account.toString());
		}
		System.out.println("Sử dụng for index");
		// Sử dụng fori (for index)
		for (int i = 0; i < accounts.size(); i++) {
			System.out.println(accounts.get(i).toString());
		}
		// Sử dụng do while
		System.out.println("Sử dụng for do while");
		int i = 0;
		do {
			System.out.println("Thông tin account thứ " + (i + 1) + " là:");
			System.out.println("Email: " + accounts.get(i).email);
			System.out.println("Full name: " + accounts.get(i).fullName);
			System.out.println("Phòng ban: " + accounts.get(i).department.getName());
			i++;
		} while (i < accounts.size());

		List<Department> departments = new ArrayList<>();
		departments.add(dep1);
		departments.add(dep2);
		departments.add(dep3);

		for (Department department : departments) {
			System.out.println(department.toString());
		}


	}

}