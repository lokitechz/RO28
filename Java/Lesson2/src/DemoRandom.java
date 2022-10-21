import java.util.Random;

public class DemoRandom {

	public static void main(String[] args) {
		Random random = new Random();
		int maxValue = 50000;
		// Sẽ random từ 0 đến maxValue - 1
		int x = random.nextInt(maxValue);
		System.out.println("Số x random ra là: " + x);
	}

}
