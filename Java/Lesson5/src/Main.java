public class Main {

	public static void main(String[] args) {
//		MyNew application = new MyNew();
//		application.question1();
		int index = 3;
		try {
			int value = printArrayValue(index);
			System.out.println(value);
		} catch (RuntimeException e) {
			System.out.println("Giá trị của bạn k tồn tại");
		}
	}

	private static int printArrayValue(int index) throws RuntimeException {
		int[] numbers = {1, 2, 3};
		return numbers[index];
	}

}