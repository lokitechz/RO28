package entity;

public class Department {

	public int departmentId;

	public String departmentName;

	@Override
	public String toString() {
		return "Department{" +
				"departmentId=" + departmentId +
				", departmentName='" + departmentName + '\'' +
				'}';
	}

}
