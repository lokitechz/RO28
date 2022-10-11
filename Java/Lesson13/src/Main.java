import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
//		Double doubleValue = 111123456.123;
//		System.out.println("Số chưa format: " + doubleValue);
//		NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
//		System.out.println("Số sau khi format: " + numberFormat.format(doubleValue));
//		System.out.println("======================================================");
//		Date date = new Date();
//		System.out.println("Ngày tháng hiện tại: " + date);
//		DateFormat dateFormat = DateFormat.getDateInstance(0, Locale.CHINA);
//		System.out.println("Ngày tháng đã format: " + dateFormat.format(date));
		Shape shape = new Shape();
		Shape.Coordinates coordinates = shape.new Coordinates(10,10);
		shape.coordinates = coordinates;
		System.out.println(shape.coordinates);
	}

}