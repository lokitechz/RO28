import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Hãy nhập vào chiều cao của tam giác: ");
		int height = Integer.parseInt(sc.next());
		System.out.println("Tam giác xuôi");
		for (int i = 1; i <= height; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("Tam giác ngược");
		for (int i = height; i >= 1; --i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}