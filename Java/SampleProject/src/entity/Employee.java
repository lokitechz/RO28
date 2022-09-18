package entity;

public class Employee extends Staff {

	private String task;

	public Employee(String name, int age, Gender gender, String address, String task) {
		super(name, age, gender, address);
		this.task = task;
	}

	@Override
	public String toString() {
		// Tạo 1 đối tượng StringBuilder để nối chuỗi
		StringBuilder builder = new StringBuilder();
		builder.append("Employee ")
		       .append("[name = ")
		       .append(super.getName()).append(",")
		       .append("age = ")
		       .append(super.getAge()).append(",")
		       .append("gender = ")
		       .append(super.getGender()).append(",")
		       .append("address = ")
		       .append(super.getAddress()).append(",")
		       .append("task = ")
		       .append(task).append("]");
		return builder.toString();
	}

}
