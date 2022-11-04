import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		devide(10, 0);
	}

	private static void devide(int value1, int value2) {
		try {
			System.out.println(value1 / value2);
		} catch (Exception e) {
		}
	}


}