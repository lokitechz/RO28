package backend;

import entity.MyMath;
import entity.Student;

import java.util.Scanner;

public class Exercise1 {

	// Đáp án câu 1
	public void question1() {
		Student[] students = new Student[3];
		System.out.println("Khởi tạo 3 sinh viên");
		for (int i = 0; i < 3; i++) {
			Student student = new Student();
			if (i == 0) {
				student.setId(i + 1);
				student.setName("Nguyễn Văn A");
			}
			if (i == 1) {
				student.setId(i + 1);
				student.setName("Nguyễn Văn B");
			}
			if (i == 2) {
				student.setId(i + 1);
				student.setName("Nguyễn Văn C");
			}
			students[i] = student;
		}
		System.out.println("In thông tin của sinh viên");
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}

	// Đáp án câu 2
	public void question2() {
		Student[] students = new Student[3];
		System.out.println("Khởi tạo 3 sinh viện");
		for (int i = 0; i < 3; i++) {
			Student student = new Student();
			student.setId(i + 1);
			student.setName("Sinh viên " + (i + 1 + ":"));
			students[i] = student;
		}
		System.out.println("Các sinh viên nộp quỹ, mỗi bạn 100K.");
		System.out.println("Tổng quỹ: " + (Student.moneyGroup += 300));
		System.out.println("Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan");
		System.out.println("Tổng quỹ: " + (Student.moneyGroup -= 50));
		System.out.println("Student thứ 2 lấy 20k đi mua bánh mì");
		System.out.println("Tổng quỹ: " + (Student.moneyGroup -= 20));
		System.out.println("Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm");
		System.out.println("Tổng quỹ: " + (Student.moneyGroup -= 150));
		System.out.println("Cả nhóm mỗi người lại đóng quỹ mỗi người 50k");
		System.out.println("Tổng quỹ: " + (Student.moneyGroup += 150));
		System.out.println("Sử dụng deprecate: " + students[0].getId());
	}

	public void question3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số int 1:");
		int a = sc.nextInt();
		System.out.println("Nhập vào số int 2:");
		int b = sc.nextInt();
		System.out.println("Max a và b: " + MyMath.max(a, b));
		System.out.println("Min a và b: " + MyMath.min(a, b));
		System.out.println("Sum a và b: " + MyMath.sum(a, b));
	}

	public void question4() {
		System.out.println("Demo Get Set Collect: ");
		Student student = new Student();
		System.out.println("College ban đầu là: " + student.getCollege());
		System.out.println("Thay đổi sang Đại học Hà Nội");
		student.setCollege("Đại học Hà Nội");
		System.out.println("College sau khi thay đổi là: " + student.getCollege());
	}

	public void question5() {
		System.out.println("Sử dụng For để tạo sinh viên: ");
		for (int i = 0; i < 5; i++) {
			System.out.println("Sinh viên " + (i + 1) + ":");
			Student st = new Student();
		}
		System.out.println("Số sinh viên được tạo ra trên hệ thống là: " + Student.count);
	}

}
