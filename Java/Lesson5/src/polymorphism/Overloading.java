package polymorphism;

// Overload cùng tên khác tham số truyền vào
public class Overloading {

	public static void main(String[] args) {
		sum(1, 2);
		sum(1, 2, 3);
		sum(1.0f, 2);
	}

	private static void sum(int a, int b) {
		System.out.println("Tổng 2 số là: " + (a + b));
	}

	private static void sum(int a, int b, int c) {
		System.out.println("Tổng 2 số là: " + (a + b + c));
	}

	private static void sum(float a, int b) {
		System.out.println("Tổng 2 số là: " + (a + b));
	}

}
