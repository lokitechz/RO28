package entity;

public class Worker extends Staff {

	private int rank;

	public Worker(String name, int age, Gender gender, String address, int rank) {
		super(name, age, gender, address);
		this.rank = rank;
	}

	@Override
	public String toString() {
		// Tạo 1 đối tượng StringBuilder để nối chuỗi
		return "Worker " +
				"[name = " +
				super.getName() + "," +
				"age = " +
				super.getAge() + "," +
				"gender = " +
				super.getGender() + "," +
				"address = " +
				super.getAddress() + "," +
				"rank = " +
				rank + "]";
	}

}
