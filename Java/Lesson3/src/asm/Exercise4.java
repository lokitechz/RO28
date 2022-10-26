package asm;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
//		question4();
		question6();
	}

	static void question4() {
		Scanner scanner = new Scanner(System.in);
		String name;
		System.out.print("Nhập vào tên của bạn: ");
		name = scanner.nextLine();
		name = name.toUpperCase();
		for (int i = 0; i < name.length(); i++) {
			System.out.println("Ký tự thứ " + (i + 1) + " là: " + name.charAt(i));
		}
		scanner.close();
	}

	static void question6() {
		Scanner scanner = new Scanner(System.in);
		String fullName;
		String lastName = "";
		String middleName = "";
		String firstName = "";
		System.out.print("Nhập họ tên đầy đủ: ");
		fullName = scanner.nextLine();
		// Chuẩn hoá
		fullName = fullName.trim();
		String[] words = fullName.split(" ");
		lastName = words[0];
		firstName = words[words.length - 1];
		for (int i = 1; i <= words.length - 2; i++) {
			middleName += words[i] + " ";
		}
		System.out.println("Họ là: " + lastName);
		System.out.println("Tên đệm là: " + middleName);
		System.out.println("Tên là: " + firstName);
		scanner.close();
	}

}
