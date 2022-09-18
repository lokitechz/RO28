import entity.Account;

import java.util.Scanner;

public class Lesson4 {

	public static void main(String[] args) {
		float salary1 = 5250.5F;
		float salary2 = 10970.055F;
		// Tạo account 1
		Account account1 = new Account();
		account1.salary = (int) salary1;
		// Tạo account 2
		Account account2 = new Account();
		account2.salary = (int) salary2;
		System.out.println("Lương của nhân viên account 1 là : " + account1.salary);
		System.out.println("Lương của nhân viên account 2 là : " + account2.salary);
		// Khai báo min
		int min = 0;
		// Khai báo max
		int max = 99999;
		int a = (int) (Math.random() * max) + min;
		System.out.println("Math random: " + Math.random() * max);
		while (a < 10000) {
			System.out.println("Nếu số ngẫu nhiên < 10000: " + a);
			a = a * 10;
		}
		System.out.println("Số ngẫu nhiên: " + a);
		// Câu 3
		String strA = String.valueOf(a);
		// "44567"
		// Hàm substring để lấy chuỗi con của 1 chuỗi
		System.out.println("Lấy 2 kí tự cuối của chũ số a: " + strA.substring(3));
		devide();
	}

	public static void devide() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào số a");
		int a = sc.nextInt();
		System.out.println("Mời bạn nhập vào số b");
		int b = sc.nextInt();
		int c1 = a / b; //  làm tròn mất phần thập phân
		float c2 = (float) a / (float) b; // giữ nguyên phần thập phân
		System.out.println("Kiểu dữ liệu int thương của 2 số a và b = " + c1);
		System.out.println("Kiểu dữ liệu float thương của 2 số a và b = " + c2);
	}

}
