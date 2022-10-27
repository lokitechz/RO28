package entity;

public class Student extends Person {

	private String studentClass;

	private Integer scrore;

	public Student(String name, Integer age, String studentClass, Integer scrore) {
		super(name, age);
		this.studentClass = studentClass;
		this.scrore = scrore;
	}

	@Override
	public String toString() {
		return super.toString() + "," + "class = " + studentClass + ",scrore = " + scrore;
	}
}
