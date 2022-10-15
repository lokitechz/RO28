package org.example.utils;

import org.example.entity.Account;

import java.sql.Date;

public class Utils {

	public static Account inputAccountInfo() {
		Account account = new Account();
		System.out.print("Nhập vào email: ");
		account.setEmail(ScannerUtils.inputString());
		System.out.print("Nhập vào username: ");
		account.setUserName(ScannerUtils.inputString());
		System.out.print("Nhập vào fullname: ");
		account.setFullName(ScannerUtils.inputString());
		System.out.print("Nhập vào ID phòng ban: ");
		account.setDepartmentId(ScannerUtils.inputInt());
		System.out.print("Nhập vào ID vị trí: ");
		account.setPositionId(ScannerUtils.inputInt());
		account.setCreateDate(new Date(System.currentTimeMillis()));
		return account;
	}

	public static String validateAccountData(Account account) {
		if (!account.getEmail().contains("@")) {
			return "Email không đúng định dạng";
		}
		return null;
	}

}
