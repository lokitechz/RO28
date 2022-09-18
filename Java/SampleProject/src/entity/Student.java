package entity;

public class Student extends Person {

	private String studentId;

	private String className;

	public Student(String name, int age, String studentId, String className) {
		super(name, age);
		this.studentId = studentId;
		this.className = className;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
}
