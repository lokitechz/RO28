import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DemoDate {

	public static void main(String[] args) {
		Date date = new Date();
		LocalDate localDate = LocalDate.of(2014, 9, 11);
		System.out.println("Giá trị date nguyên bản: " + date);
		System.out.println("Gi trị localDate: " + localDate);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String stringDate = dateFormat.format(date);
		System.out.println("Giá trị date sau khi biến thành format theo định dang: " + stringDate);
	}

}
