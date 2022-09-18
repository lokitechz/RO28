package backend;

public class Exercise3 {

	// Void chỉ thực hiện và không trả về giá trị
	public static void question1() {
		System.out.println("---------- Question 1 ----------");
		Integer salary = 5000;
		// %2.2f = lấy 2 số đăng sau dấu thập phân
		System.out.printf("%2.2f", (float) salary);
		System.out.print("\n");
	}

	public static void question2() {
		System.out.println("---------- Question 2 ----------");
		String s = "1234567"; // chuỗi số khac vs số
		// Hàm parseInt để chuyển đổi 1 chuỗi thành 1 số nguyên nếu là chuỗi số
		int i = Integer.parseInt(s);
		System.out.println(i);
	}

	public static void question3() {
		System.out.println("---------- Question 3 ----------");
		Integer i = 1234567;
		int i1 = i.intValue();
		System.out.println(i1);
	}

}
