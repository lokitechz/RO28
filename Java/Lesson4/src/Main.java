import entity.Department;
import entity.Student;

public class Main {

	public static void main(String[] args) {
		Student student = new Student("Dương Hoàng Giang", 28, "RO28", 9);
		System.out.println(student);

		Department department = new Department(1,"Demo phòng ban");
		System.out.println(department);
	}

}