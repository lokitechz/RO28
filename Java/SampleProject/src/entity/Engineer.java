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
		StringBuilder builder = new StringBuilder();
		builder.append("Engineer ")
		       .append("[name = ")
		       .append(super.getName()).append(",")
		       .append("age = ")
		       .append(super.getAge()).append(",")
		       .append("gender = ")
		       .append(super.getGender()).append(",")
		       .append("address = ")
		       .append(super.getAddress()).append(",")
		       .append("specialized = ")
		       .append(specialized).append("]");
		return builder.toString();
	}

}
