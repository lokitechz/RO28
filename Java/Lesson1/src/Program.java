import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		// Tạo Department
		Department dep1 = new Department();
		dep1.departmentId = 1;
		dep1.departmentName = "Marketing";

		Department dep2 = new Department();
		dep2.departmentId = 2;
		dep2.departmentName = "Sale";

		Department dep3 = new Department();
		dep3.departmentId = 3;
		dep3.departmentName = "BOD";

		System.out.println("========== Thông tin các phòng ban ==========");
		System.out.println(dep1);
		System.out.println(dep2);
		System.out.println(dep3);

		// Tạo position
		Position pos1 = new Position();
		pos1.id = 1;
		pos1.name = PositionName.DEV;

		Position pos2 = new Position();
		pos2.id = 2;
		pos2.name = PositionName.TEST;

		Position pos3 = new Position();
		pos3.id = 3;
		pos3.name = PositionName.SCRUM_MASTER;

		Position pos4 = new Position();
		pos4.id = 4;
		pos4.name = PositionName.PM;

		System.out.println("========== Thông tin các vị trí công việc ==========");
		System.out.println(pos1);
		System.out.println(pos2);
		System.out.println(pos3);
		System.out.println(pos4);

		// Tạo Group
		Group group2 = new Group();
		group2.id = 1;
		group2.name = "Developer";

		Group group1 = new Group();
		group1.id = 2;
		group1.name = "Test";

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Sale";

		// Tạo Account
		Account acc1 = new Account();
		acc1.id = 1;
		acc1.email = "giangdh1";
		acc1.userName = "giangdh1";
		acc1.fullName = "Dương Hoàng Giang 1";
		acc1.department = dep1;
		acc1.position = pos1;
		acc1.createDate = LocalDate.now();
		acc1.groups = new Group[]{group1, group2};

		Account acc2 = new Account();
		acc2.id = 2;
		acc2.email = "giangdh2";
		acc2.userName = "giangdh2";
		acc2.fullName = "Dương Hoàng Giang 2";
		acc2.department = dep2;
		acc2.position = pos2;
		acc2.createDate = LocalDate.now();
		acc2.groups = new Group[]{group2, group3};

		Account acc3 = new Account();
		acc3.id = 3;
		acc3.email = "giangdh3";
		acc3.userName = "giangdh3";
		acc3.fullName = "Dương Hoàng Giang 3";
		acc3.department = dep3;
		acc3.position = pos3;
		acc3.createDate = LocalDate.now();
		acc3.groups = new Group[]{group1, group3};

		System.out.println("========== Thông tin các tài khoản ==========");
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
	}

}
