package entity;

public class StudentLesson8 implements Comparable<StudentLesson8> {

	// Khởi tạo biến id ban đầu
	public static int count = 0;
	private Integer id;
	private String name;

	private float gpa;

	public StudentLesson8(String name, float gpa) {
		count++;
		this.id = count;
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

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	@Override
	public int compareTo(StudentLesson8 student) {
		if (student.getGpa() > gpa) {
			return 1;
		} else if (student.getGpa() < gpa) {
			return -1;
		}
		return 0;
	}
	@Override
	public String toString() {
		return "StudentLesson8{" +
				"id=" + id +
				", name='" + name + '\'' +
				", gpa=" + gpa +
				'}';
	}
}
