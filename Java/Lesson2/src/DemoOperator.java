public class DemoOperator {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;

		System.out.println("Các toán tử Arithmetic Operators");
		System.out.println("Toán tử cộng: " + (x + y));
		System.out.println("Toán tử trừ: " + (x - y));
		System.out.println("Toán tử nhân: " + (x * y));
		System.out.println("Toán tử chia: " + (x / y));
		System.out.println("Toán tử lấy phần dư: " + (x % y));

		System.out.println("Các toán tử Relational Operators");
		if (x == y) {
			System.out.println("X bằng Y");
		} else if (x != y) {
			System.out.println("X khác Y");
		} else if (x > y) {
			System.out.println("X > Y");
		} else if (x < y) {
			System.out.println("X < Y");
		} else if (x >= y) {
			System.out.println("X >= Y");
		} else if (x <= y) {
			System.out.println("X <= Y");
		}

		System.out.println("Các toán tử Logic Operators");
		if (x > 5 && y == 10) {
			System.out.println("&& Thoả mãn tất cả điều kiện");
		}

		if (x > 5 || y == 10) {
			System.out.println("|| Thoả mãn 1 trong 2 điều kiện");
		}

		if ((x == 5) ^ (y == 10)) {
			System.out.println("^ Thoả mãn 1 trong 2 điều kiện");
		}

		if (!(x == 5)) {
			System.out.println("! Phủ định của 1 điều kiện");
		}

	}

}
