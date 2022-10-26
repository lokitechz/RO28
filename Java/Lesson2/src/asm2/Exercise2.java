package asm2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Exercise2 {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
		question4();
		question5();
	}

	static void question1() {
		System.out.println("========== Question 1 ==========");
		int i = 5;
		System.out.printf("%d%n", i);
	}

	static void question2() {
		System.out.println("========== Question 2 ==========");
		int number = 100000000;
		System.out.printf(Locale.US, "%,d%n", number);
	}

	static void question3() {
		System.out.println("========== Question 3 ==========");
		float number = 5.567098f;
		System.out.printf("%5.4f%n", number);
	}

	static void question4() {
		System.out.println("========== Question 4 ==========");
		String fullName = "Nguyễn Văn A";
		System.out.println("Tên tôi là " + fullName + " và tôi đang độc thân");
	}

	static void question5() {
		System.out.println("========== Question 5 ==========");
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
	}

}
