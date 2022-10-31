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
		return "Employee " +
				"[name = " +
				super.getName() + "," +
				"age = " +
				super.getAge() + "," +
				"gender = " +
				super.getGender() + "," +
				"address = " +
				super.getAddress() + "," +
				"task = " +
				task + "]";
	}

}
