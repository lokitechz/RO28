package backend;

import entity.Student;

public class Exercise1 {

	// Giải câu hỏi 1
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

}
