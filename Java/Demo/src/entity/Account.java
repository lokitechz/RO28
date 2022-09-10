package entity;

import java.time.LocalDate;

public class Account {

	public int id;

	public String email;

	public String userName;

	public String fullName;

	public Department department; // Đối tượng Department

	public Position position; // Đối tượng Position

	public LocalDate createDate; // Ngày giờ hiện tại trên máy tính đang chạy đoạn code này

	public Group[] groups; // 1 mảng group (tức là 1 account có thể nằm trong nhiều group khác nhau)

	@Override
	public String toString() {
		return "Account{" +
				"id=" + id +
				", email='" + email + '\'' +
				", userName='" + userName + '\'' +
				", fullName='" + fullName + '\'' +
				", department=" + department +
				'}';
	}

}
