package backend;

import entity.Employee;
import entity.Engineer;
import entity.Staff;
import entity.Worker;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lesson6 {

	public static void main(String[] args) throws IOException {
		// Tạo danh sách nhân viên
		List<Staff> employees = new ArrayList<>();
		employees.add(new Worker("Giang 1", 28, Staff.Gender.MALE, "Giang Văn Minh", 1));
		employees.add(new Engineer("Giang 2", 28, Staff.Gender.FEMALE, "Giang Văn Minh", "Engineer"));
		employees.add(new Employee("Giang 3", 28, Staff.Gender.UNKNOWN, "Giang Văn Minh", "Task 1"));
		// Tạo file và mở luồng ghi dữ liệu tới file đó
		FileOutputStream fos = new FileOutputStream("/Users/jacksmacbookpro/Desktop/demo.txt");
		// Lặp từng nhân viên trong  danh sách nhân viên
		for (Staff staff : employees) {
			// Ghi từng thông tin của từng nhân viên ra file
			fos.write(staff.toString().getBytes());
			// Ghi kí tự xuống dòng
			fos.write("\n".getBytes());
		}
		// Đóng luồng ghi dữ liệu
		fos.close();
		// Đọc lại dữ liệu từ file
		FileInputStream fileInputStream = new FileInputStream("/Users/jacksmacbookpro/Desktop/demo.txt");
		int ch;
		// Holds true till there is data inside file
		while ((ch = fileInputStream.read()) != -1) System.out.print((char) ch);
		fileInputStream.close();
	}

}
