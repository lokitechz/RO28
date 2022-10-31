package frontend;

import entity.Account;
import entity.Department;
import entity.Position;
import entity.PositionName;

public class Program1 {

	public static void main(String[] args) {
		// Khởi tạo đối tượng không có tham số truyền vào
		Department department = new Department();
		System.out.println("Department constructor no param: " + department);
		// Khởi tạo đối tượng có tham số truyền vào
		Department department1 = new Department("Phòng ban số 0");
		System.out.println("Department constructor with param: " + department1);
		Position pos1 = new Position();
		pos1.setId(1);
		pos1.setName(PositionName.DEV);
		System.out.println("Tên của vị trí 1 là: " + pos1.getName());
		Account account = new Account();
		System.out.println("Account with no param: " + account);
		Account account1 = new Account(1, "giangdh.os@mbbank.com.vn", "giangdh.os", "Giang", "Dương");
		System.out.println("Account with 5 param: " + account1);
	}

}
