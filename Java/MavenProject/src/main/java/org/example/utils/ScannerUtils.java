package org.example.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Class chưa các hàm hỗ trợ liên quan đến nhập dữ liệu từ bàn phím
 */
public class ScannerUtils {

	private static Scanner sc = new Scanner(System.in);

	// Trả về giá trị số khi người dùng nhập vào
	public static int inputInt() {
		while (true) {
			try {
				return Integer.parseInt(sc.next().trim());
			} catch (Exception e) {
				System.err.println("Dữ liệu ban nhập vào không đúng mời nhập lại:");
			}
		}
	}

	public static int inputIntPositive() {
		while (true) {
			try {
				int intPositive = Integer.parseInt(sc.next());
				if (intPositive >= 0) {
					return intPositive;
				} else {
					System.err.println("Dữ liệu ban nhập vào không đúng mời nhập lại:");
				}
			} catch (Exception e) {
				System.err.println("Dữ liệu ban nhập vào không đúng mời nhập lại:");
			}
		}
	}

	public static Float inputFloat() {
		while (true) {
			try {
				return Float.parseFloat(sc.next());
			} catch (Exception e) {
				System.err.println("Dữ liệu ban nhập vào không đúng mời nhập lại:");
			}
		}
	}

	public static Double inputDouble() {
		while (true) {
			try {
				return Double.parseDouble(sc.next());
			} catch (Exception e) {
				System.err.println("Dữ liệu ban nhập vào không đúng mời nhập lại:");
			}
		}
	}

	public static String inputString() {
		while (true) {
			String string = sc.nextLine().trim();
			if (!string.isEmpty()) {
				return string;
			} else {
				System.err.println("Dữ liệu ban nhập vào không đúng mời nhập lại:");
			}
		}
	}

	public static LocalDate inputLocalDate() {
		System.out.println("Nhập theo định dạng yyyy-MM-dd");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		while (true) {
			String localdate = sc.next().trim();
			try {
				if (format.parse(localdate) != null) {
					return LocalDate.parse(localdate);
				}
			} catch (Exception e) {
				System.err.println("Nhập lại:");
			}
		}
	}

}
