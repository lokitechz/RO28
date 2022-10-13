package entity;

public class Student2 {
	public static int count = 0;
	private int id;
	private String name;

	public Student2(String name) {
		super();
		this.id = ++count;
		this.name = name;
	}

	@Deprecated
	public int getId() {
		return id;
	}

	public void setId(int id) {
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
		return "Student2{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
