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
		StringBuilder builder = new StringBuilder();
		builder.append("Worker ")
		       .append("[name = ")
		       .append(super.getName()).append(",")
		       .append("age = ")
		       .append(super.getAge()).append(",")
		       .append("gender = ")
		       .append(super.getGender()).append(",")
		       .append("address = ")
		       .append(super.getAddress()).append(",")
		       .append("rank = ")
		       .append(rank).append("]");
		return builder.toString();
	}

}
