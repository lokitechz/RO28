public class Lesson3 {

	public static void main(String[] args) {
		String a = "Tôi là Giang";
		String b = "Tôi là GIANG";
		if (a.equals(b)) {
			System.out.println("2 chuỗi giống nhau có phân biệt hoa thường");
		} else {
			System.out.println("2 chuỗi k giống nhau");
		}

		if (a.equalsIgnoreCase(b)) {
			System.out.println("2 chuỗi giống nhau không phân biệt hoa thường");
		}
	}

}