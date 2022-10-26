package asm;

import entity.Account;

import java.time.LocalDate;

public class Exercise1 {

	public static void main(String[] args) {
		question1();
	}

	static void question1() {
		System.out.println("Khởi tạo mảng Account gồm 5 phần tử sử dụng For");
		// Tạo 1 mảng Account gồm 5 phần tử
		Account[] accounts = new Account[5];
		for (int i = 0; i < accounts.length; i++) {
			int number = i + 1;
			Account account = new Account();
			account.email = "Email " + number;
			account.userName = "User name " + number;
			account.fullName = "Full name " + number;
			account.createDate = LocalDate.now();
			accounts[i] = account;
			System.out.println("Thông tin Account " + number + " Email: " + accounts[i].email + " UserName: " + accounts[i].userName
					                   + " FullName: " + accounts[i].fullName + " CreateDate: " + accounts[i].createDate);
		}
	}

}
