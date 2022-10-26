package entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Account {

	public int id;

	public String email;

	public String userName;

	public String fullName;

	public Department department;

	public Position position;

	public LocalDate createDate;

	public Group[] groups;

	public Account() {
	}

	public Account(int id, String email, String userName, String fullName, Department department, Position position, LocalDate createDate,
	               Group[] groups) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.department = department;
		this.position = position;
		this.createDate = createDate;
		this.groups = groups;
	}

	@Override
	public String toString() {
		return "Account{" +
				"id=" + id +
				", email='" + email + '\'' +
				", userName='" + userName + '\'' +
				", fullName='" + fullName + '\'' +
				", department=" + department +
				", position=" + position +
				", createDate=" + createDate +
				", groups=" + Arrays.toString(groups) +
				'}';
	}

}
