package asm2;

import entity.Exam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise3 {

	public static void main(String[] args) {
		question1();
	}

	static void question1() {
		Exam exam = new Exam();
		exam.code = "SM";
		exam.createDate = LocalDate.of(2022, 12, 21);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedString = exam.createDate.format(formatter);
		System.out.println(formattedString);
	}

}
