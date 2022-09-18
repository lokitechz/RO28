package backend;

import java.util.Scanner;

public class Exercise4 {

	public static void question1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào 1 chuỗi:");
		String s = scanner.nextLine();
		// Tạo ra 1 mảng để lưu tru các kí tự của chuỗi đó
		// VD abcde
		// Hàm split có tác dụng phân cách các kĩ tự trong chuỗi bằng 1 kí tự mình mong muôn
		String[] words = s.split(" ");
		System.out.println("Số kí tự: " + words.length);
	}

	public static void question2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi 1:");
		String s1 = scanner.nextLine();
		System.out.println("Nhập vào chuỗi 2:");
		String s2 = scanner.nextLine();
		System.out.println("Kết quả cộng chuỗi là : " + s1 + " " + s2);
	}

	public static void question4() {
		String name;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		name = scanner.nextLine();
		for (int i = 0; i < name.length(); i++) {
			// charAt lấy kí ự ở 1 vị trí nào đó trong chuỗi
			System.out.println("Ký tự thứ " + i + " là: " + name.charAt(i));
		}
	}

}
