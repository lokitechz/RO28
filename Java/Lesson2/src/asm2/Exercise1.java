package asm2;

import entity.Account;
import entity.Department;
import entity.Group;
import entity.Position;
import entity.PositionName;

import java.time.LocalDate;

public class Exercise1 {

	public static void main(String[] args) {
		// Tạo Department
		Department dep1 = new Department();
		dep1.departmentId = 1;
		dep1.departmentName = "Marketing";

		Department dep2 = new Department();
		dep2.departmentId = 2;
		dep2.departmentName = "Sale";

		Department dep3 = new Department();
		dep3.departmentId = 3;
		dep3.departmentName = "BOD";

		// Tạo position
		Position pos1 = new Position();
		pos1.id = 1;
		pos1.name = PositionName.DEV;

		Position pos2 = new Position();
		pos2.id = 2;
		pos2.name = PositionName.TEST;

		Position pos3 = new Position();
		pos3.id = 3;
		pos3.name = PositionName.SCRUM_MASTER;

		Position pos4 = new Position();
		pos4.id = 4;
		pos4.name = PositionName.PM;

		// Tạo Group
		Group group2 = new Group();
		group2.id = 1;
		group2.name = "Developer";

		Group group1 = new Group();
		group1.id = 2;
		group1.name = "Test";

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Sale";

		// Tạo Account
		Account acc1 = new Account();
		acc1.id = 1;
		acc1.email = "giangdh1";
		acc1.userName = "giangdh1";
		acc1.fullName = "Dương Hoàng Giang 1";
		acc1.department = dep1;
		acc1.position = pos1;
		acc1.createDate = LocalDate.now();
		acc1.groups = new Group[]{group1, group2};

		Account acc2 = new Account();
		acc2.id = 2;
		acc2.email = "giangdh2";
		acc2.userName = "giangdh2";
		acc2.fullName = "Dương Hoàng Giang 2";
		acc2.department = dep2;
		acc2.position = pos2;
		acc2.createDate = LocalDate.now();
		acc2.groups = new Group[]{group2, group3};

		Account acc3 = new Account();
		acc3.id = 3;
		acc3.email = "giangdh3";
		acc3.userName = "giangdh3";
		acc3.fullName = "Dương Hoàng Giang 3";
		acc3.department = dep3;
		acc3.position = pos3;
		acc3.createDate = LocalDate.now();
		acc3.groups = new Group[]{group1, group3};

		System.out.println("========== ASM1 - Exercise 1 ==========");
		System.out.println("========== Bài tập về IF ==========");
		question1(acc2);
		System.out.println("========== Bài tập về SWITCH - CASE ==========");
		group1.accounts = new Account[]{acc1, acc2};
		question5(group1);
		System.out.println("========== Bài tập về FOREACH ==========");
		Account[] accounts = {acc1, acc2, acc3};
		question8(accounts);
		System.out.println("========== Bài tập về FOR =========");
		question10(accounts);
		System.out.println("========== Bài tập về WHILE =========");
		question11(accounts);
		System.out.println("========== Bài tập về DO-WHILE =========");
		question12(accounts);
	}

	static void question1(Account account) {
		if (account.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban ");
		} else {
			System.out.println("Phòng ban của nhân viên này là " + account.department.departmentName);
		}
	}

	static void question5(Group group) {
		switch (group.accounts.length) {
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

	static void question8(Account[] accounts) {
		for (Account account : accounts) {
			System.out.println(account);
		}
	}

	static void question10(Account[] accounts) {
		for (int i = 0; i < accounts.length; i++) {
			int number = i + 1;
			System.out.println("Thông tin account thứ " + number + " là");
			System.out.println("Email : " + accounts[i].email);
			System.out.println("Fullname : " + accounts[i].fullName);
			System.out.println("Phòng ban : " + accounts[i].department.departmentName);
		}
	}

	static void question11(Account[] accounts) {
		System.out.println("Số account là: " + accounts.length);
		int i = 0;
		while (i < accounts.length) {
			int number = i + 1;
			System.out.println("Thông tin account thứ " + number + " là");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Full name: " + accounts[i].fullName);
			System.out.println("Phòng ban: " + accounts[i].department.departmentName);
			i++;
		}
	}

	static void question12(Account[] accounts) {
		int i = 0;
		do {
			int number = i + 1;
			System.out.println("Thông tin account thứ " + number + " là:");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Full name: " + accounts[i].fullName);
			System.out.println("Phòng ban: " + accounts[i].department.departmentName);
			i++;
		} while (i < accounts.length);
	}

}
