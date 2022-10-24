public class DemoFor {

	public static void main(String[] args) {
		// Biết trước số lần lặp
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}

		// Có thể không thực hiện lần nào
		System.out.println("Demo while");
		int i = 6;
		while (i < 5) {
			System.out.println(i);
			i++;
		}

		// Chắc chắn sẽ thực hiện 1 lần
		System.out.println("Demo do while");
		do {
			System.out.println(i);
		} while (i < 5);

		System.out.println("Demo foreach");
		int[] arri = {1, 2, 3, 4, 5};
		for (int item : arri) {
			System.out.println(item);
		}

	}

}
