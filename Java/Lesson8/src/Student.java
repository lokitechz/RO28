public class Student implements Comparable<Student> {

	private static int COUNT;

	private Integer id;

	private String name;

	private Float gpa;

	public Student() {
	}

	public Student(String name, Float gpa) {
		COUNT++;
		this.id = COUNT;
		this.name = name;
		this.gpa = gpa;
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

	public Float getGpa() {
		return gpa;
	}

	public void setGpa(Float gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", gpa=" + gpa +
				'}';
	}

	@Override
	public int compareTo(Student student) {
		if (student.id > id) {
			return 1;
		} else if (student.id < id) {
			return -1;
		}
		return 0;
	}

}
