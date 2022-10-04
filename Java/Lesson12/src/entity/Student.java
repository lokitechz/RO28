package entity;

public class Student {

	public static String college = "Đại học bách khoa";

	public static Integer moneyGroup = 0;

	public static int count = 0;
	private Integer id;
	private String name;

	public Student() {
		count++;
	}

	public Student(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return Student.college;
	}

	public void setCollege(String college) {
		Student.college = college;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", college='" + college +
				'}';
	}

}
