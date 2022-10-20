public class SampleFor {

	public static void main(String[] args) {
		// Biết trước số lần lặp
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}

		// Có thể không thực hiện lần nào
		int i = 6;
		while (i < 5) {
			System.out.println(i);
			i++;
		}

		// Chắc chắn sẽ thực hiện 1 lần
		do {
			System.out.println(i);
		} while (i < 5);

	}

}
