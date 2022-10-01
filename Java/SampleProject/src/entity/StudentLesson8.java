package entity;

public class StudentLesson8 {

	// Khởi tạo biến id ban đầu
	public static int count = 0;
	private Integer id;
	private String name;

	public StudentLesson8(String name) {
		count++;
		this.id = count;
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
		return "StudentLesson8{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
