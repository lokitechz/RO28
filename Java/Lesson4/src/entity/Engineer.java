package entity;

public class Engineer extends Staff {

	private String specialized;

	public Engineer(String name, int age, Gender gender, String address, String specialized) {
		super(name, age, gender, address);
		this.specialized = specialized;
	}

	@Override
	public String toString() {
		// Tạo 1 đối tượng StringBuilder để nối chuỗi
		return "Engineer " +
				"[name = " +
				super.getName() + "," +
				"age = " +
				super.getAge() + "," +
				"gender = " +
				super.getGender() + "," +
				"address = " +
				super.getAddress() + "," +
				"specialized = " +
				specialized + "]";
	}

}
