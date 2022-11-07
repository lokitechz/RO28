public class Student {

	private static int COUNT;

	private Integer id;

	private String name;

	public Student() {
	}

	public Student(String name) {
		COUNT++;
		this.id = COUNT;
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

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}

}
