package backend;

import entity.Account;

import java.time.LocalDate;

public class Exercise2 {

	public static void question1() {
		System.out.println("Khởi tạo mảng Account gồm 5 phần tử sử dụng For");
		// Tạo 1 danh sách lưu những account có 5 phần tử
		Account[] accArray = new Account[5];
		// Vị trí đầu tiên của mảng luôn luôn là 0
		for (int i = 0; i < accArray.length; i++) {
			Account acc = new Account();
			acc.setId(i);
			acc.setEmail("Email " + i);
			acc.setUserName("Username " + i);
			acc.setFullName("Fullname " + i);
			acc.setCreateDate(LocalDate.now());
			accArray[i] = acc;
			System.out.println("Thông tin account " + i + " là " + acc);
		}
	}

}
