package entity;

public class Department {

	public int departmentId;

	public String departmentName;

	public Department() {
	}

	public Department(int departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department{" +
				"departmentId=" + departmentId +
				", departmentName='" + departmentName + '\'' +
				'}';
	}

}
