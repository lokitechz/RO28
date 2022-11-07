public class Main3 {

	public static void main(String[] args) {
		MyMap<Integer, String> student = new MyMap<>(1, "Student");
		System.out.println(student.getKey());
		System.out.println(student.getValue());

		MyMap<Integer, Student> studentInfo = new MyMap<>();
		Student student1 = new Student("Giang", 9.0f);
		studentInfo.setKey(1);
		studentInfo.setValue(student1);
		System.out.println(studentInfo);
	}

}
