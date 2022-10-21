import entity.Position;
import entity.PositionName;

public class DemoIfElse {

	public static void main(String[] args) {
		int x = 20;
		int y = 10;

		if (x > y) {
			System.out.println("X là số lớn hơn");
		} else if (y > x) {
			System.out.println("Y là số lớn hơn");
		} else {
			System.out.println("X bằng Y");
		}

		// Ternary (toán tử 3 ngôi)
		Position pos1 = new Position();
		pos1.id = 1;
		pos1.name = PositionName.DEV;
		System.out.println(x > y
		                   ? "Tên phòng ban là " + pos1.name
		                   : "Tên phòng ban đang bị bỏ trống");

	}

}