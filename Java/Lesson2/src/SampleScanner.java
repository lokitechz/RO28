import java.util.Scanner;

public class SampleScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Hãy nhập vào 1 số nguyên dương: ");
		int x = Integer.parseInt(sc.next());
		System.out.println("Số bạn vừa nhập là: " + x);
	}

}