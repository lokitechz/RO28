import java.text.NumberFormat;
import java.util.Locale;

public class Internationalization {

	// Hỗ trợ ngôn ngữ, số, đơn vị tiền tệ
	// Dựa vào Locale
	public static void main(String[] args) {
		Double number = 12345.6789;
		NumberFormat nf = NumberFormat.getNumberInstance(Locale.CHINA);
		System.out.println(nf.format(number));
	}

}