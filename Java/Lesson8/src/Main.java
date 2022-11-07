import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
//		for (int i = 1; i < 10; i++) {
//			Student student = new Student("Giang " + i, );
//			students.add(student);
//		}
//		System.out.println("Danh sách sinh viên là: " + students);
//		System.out.println("Sinh viên ở vị trí thứ 4 là: " + students.get(3));
//		System.out.println("Sinh viên ở vị trí cuối là: " + students.get(students.size() - 1));
//		students.add(0, new Student("Giang d"));
//		System.out.println("Danh sách sinh viên sau khi thêm vào vị trí đầu: " + students);
		students.add(new Student("Giang 1", 9.0f));
		students.add(new Student("Giang 2", 4.0f));
		students.add(new Student("Giang 3", 7.0f));
		students.add(new Student("Giang 4", 1.0f));
		Collections.sort(students);
		System.out.println(students);
	}

}