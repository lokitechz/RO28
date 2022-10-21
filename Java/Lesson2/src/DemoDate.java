import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("Giá trị date nguyên bản: " + date);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String stringDate = dateFormat.format(date);
		System.out.println("Giá trị date sau khi biến thành format theo định dang: " + stringDate);
	}

}
